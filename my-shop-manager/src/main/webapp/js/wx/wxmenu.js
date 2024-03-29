$(function () {
    $("#jqGrid").jqGrid({
        url: '../wxmenu/list',
        datatype: "json",
        colModel: [
			{label: 'id', name: 'id', index: 'id', key: true, hidden: true},
			{label: '父ID', name: 'parentid', index: 'parentId', width: 80},
			{label: '树路径', name: 'path', index: 'path', width: 80},
			{label: '菜单名称', name: 'menuname', index: 'menuName', width: 80},
			{label: '菜单类型', name: 'menutype', index: 'menuType', width: 80},
			{label: '关键词', name: 'menukey', index: 'menuKey', width: 80},
			{label: '网址', name: 'url', index: 'url', width: 80},
			{label: '小程序appid', name: 'appid', index: 'appid', width: 80},
			{label: '小程序入口页', name: 'pagepath', index: 'pagepath', width: 80},
			{label: '排序字段', name: 'location', index: 'location', width: 80},
			{label: '有子节点', name: 'haschildren', index: 'hasChildren', width: 80},
			{label: '微信ID', name: 'wxid', index: 'wxid', width: 80},
			{label: '操作人', name: 'opby', index: 'opBy', width: 80},
			{label: '操作时间', name: 'opat', index: 'opAt', width: 80},
			{label: '删除标记', name: 'delflag', index: 'delFlag', width: 80}],
		viewrecords: true,
        height: 385,
        rowNum: 10,
        rowList: [10, 30, 50],
        rownumbers: true,
        rownumWidth: 25,
        autowidth: true,
        multiselect: true,
        pager: "#jqGridPager",
        jsonReader: {
            root: "page.list",
            page: "page.currPage",
            total: "page.totalPage",
            records: "page.totalCount"
        },
        prmNames: {
            page: "page",
            rows: "limit",
            order: "order"
        },
        gridComplete: function () {
            $("#jqGrid").closest(".ui-jqgrid-bdiv").css({"overflow-x": "hidden"});
        }
    });
});

let vm = new Vue({
	el: '#rrapp',
	data: {
        showList: true,
        title: null,
		wxMenu: {},
		ruleValidate: {
			name: [
				{required: true, message: '名称不能为空', trigger: 'blur'}
			]
		},
		q: {
		    name: ''
		}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function () {
			vm.showList = false;
			vm.title = "新增";
			vm.wxMenu = {};
		},
		update: function (event) {
            let id = getSelectedRow();
			if (id == null) {
				return;
			}
			vm.showList = false;
            vm.title = "修改";

            vm.getInfo(id)
		},
		saveOrUpdate: function (event) {
            let url = vm.wxMenu.id == null ? "../wxmenu/save" : "../wxmenu/update";
			$.ajax({
				type: "POST",
			    url: url,
			    contentType: "application/json",
			    data: JSON.stringify(vm.wxMenu),
                success: function (r) {
                    if (r.code === 0) {
                        alert('操作成功', function (index) {
                            vm.reload();
                        });
                    } else {
                        alert(r.msg);
                    }
                }
			});
		},
		del: function (event) {
            let ids = getSelectedRows();
			if (ids == null){
				return;
			}

			confirm('确定要删除选中的记录？', function () {
				$.ajax({
					type: "POST",
				    url: "../wxmenu/delete",
				    contentType: "application/json",
				    data: JSON.stringify(ids),
				    success: function (r) {
						if (r.code == 200) {
							alert('操作成功', function (index) {
								$("#jqGrid").trigger("reloadGrid");
							});
						} else {
							alert(r.msg);
						}
					}
				});
			});
		},
		getInfo: function(id){
			$.get("../wxmenu/info/"+id, function (r) {
                vm.wxMenu = r.wxMenu;
            });
		},
		reload: function (event) {
			vm.showList = true;
            let page = $("#jqGrid").jqGrid('getGridParam', 'page');
			$("#jqGrid").jqGrid('setGridParam', {
                postData: {'name': vm.q.name},
                page: page
            }).trigger("reloadGrid");
            vm.handleReset('formValidate');
		},
        handleSubmit: function (name) {
            handleSubmitValidate(this, name, function () {
                vm.saveOrUpdate()
            });
        },
        handleReset: function (name) {
            handleResetForm(this, name);
        }
	}
});