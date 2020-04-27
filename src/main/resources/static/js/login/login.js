//
// $(document).ready(function() {
//     $("#entry_btn").on("click", function () {
//         // debugger;
//         var usersNo = $("#usersNo").val();    // 获取id为username的<input>框数据
//         var password = $("#password").val();    // 获取id为password的<input>框数据
//
//         // Ajax提交数据
//         $.ajax({
//             url: "/login",    // 提交到controller的url路径
//             type: "post",    // 提交方式
//             data: {"usersNo": usersNo, "password": password},  // data为String类型，必须为 Key/Value 格式。
//             dataType: "json",    // 服务器端返回的数据类型
//             success: function (data) {
//                 // 请求成功后的回调函数，其中的参数data为controller返回的map,也就是说,@ResponseBody将返回的map转化为JSON格式的数据，然后通过data这个参数取JSON数据中的值
//             },
//         });
//     });
// }) ;