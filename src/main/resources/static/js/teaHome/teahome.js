$(document).ready(function() {
    $("#login-out").on("click", function () {
        // Ajax提交数据
        console.info("---涛哥的神秘代码---");
        $.ajax({
            type: "post", // 提交方式
            url: "/logout",    // 提交到controller的url路径
            data: {"password": "eee" },  // data为String类型，必须为 Key/Value 格式。
            contentType: "application/json",
            error: function (status, e) {
                console.info(e);
            },// 服务器端返回的数据类型
            success: function (data) {
                console.info(data);
                // 请求成功后的回调函数，其中的参数data为controller返回的map,也就是说,@ResponseBody将返回的map转化为JSON格式的数据，然后通过data这个参数取JSON数据中的值
                window.location.href = "login.html" ;
            },
        });
    });
}) ;
