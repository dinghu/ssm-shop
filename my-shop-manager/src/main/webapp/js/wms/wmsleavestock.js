$(function () {
    $("#jqGrid").jqGrid({
        url: '../wmsleavestock/list',
        datatype: "json",
        colModel: [
			{label: 'id', name: 'id', index: 'id', key: true, hidden: true},
			{label: '出库单编号', name: 'leavestockId', index: 'leavestock_id', width: 80},
			{label: '出库时间', name: 'leavedate', index: 'leavedate', width: 80},
			{label: '出库部门', name: 'deptId', index: 'dept_id', width: 80},
			{label: '出仓库', name: 'storehouseId', index: 'storehouse_id', width: 80},
			{label: '入仓库', name: 'tostorehouseId', index: 'tostorehouse_id', width: 80},
			{label: '出库人', name: 'userId', index: 'user_id', width: 80},
			{label: '创建时间', name: 'createdate', index: 'createdate', width: 80},
			{label: '创建者', name: 'createby', index: 'createby', width: 80},
			{label: '更新时间', name: 'updatedate', index: 'updatedate', width: 80},
			{label: '更新者', name: 'updateby', index: 'updateby', width: 80},
			{label: '是否有效', name: 'enable', index: 'enable', width: 80},
			{label: '排序', name: 'sortNo', index: 'sort_no', width: 80}],
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
		wmsLeavestock: {},
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
			vm.wmsLeavestock = {};
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
            let url = vm.wmsLeavestock.id == null ? "../wmsleavestock/save" : "../wmsleavestock/update";
			$.ajax({
				type: "POST",
			    url: url,
			    contentType: "application/json",
			    data: JSON.stringify(vm.wmsLeavestock),
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
				    url: "../wmsleavestock/delete",
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
			$.get("../wmsleavestock/info/"+id, function (r) {
                vm.wmsLeavestock = r.wmsLeavestock;
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