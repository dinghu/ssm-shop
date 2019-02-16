$(function () {
    $("#jqGrid").jqGrid({
        url: '../banner/list',
        datatype: "json",
        colModel: [
            {label: 'id', name: 'id', index: 'id', key: true, hidden: true},
            {label: '标题', name: 'title', index: 'title', width: 80},
            {label: '内容', name: 'content', index: 'content', width: 80},
            {label: '链接', name: 'link', index: 'link', width: 80},
            {
                label: '图片', name: 'imageUrl', index: 'imageUrl', width: 80, formatter: function (value) {
                    return transImg(value);
                }
            },
            {
                label: '创建时间', name: 'createTime', index: 'createTime', width: 80, formatter: function (value) {
                    return transDate(value);
                }
            },
            {
                label: '状态', name: 'status', index: 'status', width: 80, formatter: function (value) {
                    return value === 0 ?
                        '<span class="label label-danger">禁用</span>' :
                        '<span class="label label-success">正常</span>';
                }
            }],
        viewrecords: true,
        height: 385,
        rowNum: 7,
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
            //隐藏grid底部滚动条
            $("#jqGrid").closest(".ui-jqgrid-bdiv").css({"overflow-x": "hidden"});
        }
    });
});

var vm = new Vue({
    el: '#rrapp',
    data: {
        showList: true,
        title: null,
        banner: {},
        ruleValidate: {
            title: [
                {required: true, message: '广告名称不能为空', trigger: 'blur'}
            ],
            image_url: [
                {required: true, message: '图片不能为空', trigger: 'blur'}
            ]
        },
        q: {
            title: ''
        }
    },
    methods: {
        query: function () {
            vm.reload();
        },
        add: function () {

        },
        update: function (event) {

        },
        saveOrUpdate: function (event) {

        },
        del: function (event) {

        },
        getInfo: function (id) {

        },
        reload: function (event) {

        },
        handleSuccess: function (res, file) {

        },
        handleFormatError: function (file) {

        },
        handleMaxSize: function (file) {

        },
        handleSubmit: function (name) {

        },
        handleReset: function (name) {

        },
        eyeImage: function () {

        }
    }
});