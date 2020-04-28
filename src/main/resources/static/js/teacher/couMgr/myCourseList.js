$(document).ready(function() {
    $(".btn-success").on("click", function () {
        // Ajax提交数据
        $.alert({
            title: '提示信息：',
            content: '当前角色暂无管理员权限',
            type: 'red'
        });
    });
    $(".btn-info").on("click", function () {
        // Ajax提交数据
        $.alert({
            title: '提示信息：',
            content: '当前角色暂无管理员权限',
            type: 'red'
        });
    });
    $(".btn-danger").on("click", function () {
        // Ajax提交数据
        $.alert({
            title: '提示信息：',
            content: '当前角色暂无管理员权限',
            type: 'red'
        });
    });
}) ;
