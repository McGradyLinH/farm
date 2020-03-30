$(function () {
    $("#qwe").attr("value","adsdasdsadasd");

    $("#qwe").bind('input propertychange',function () {
        var a = $("#qwe").val();
        $("#asd").html(a);
    })

    $.ajax({
        url : 'http://222.210.104.125:8998/yiliaojiance/base/newproject!doNotNeedSecurity_findTransfers.sy',
        success:function(data){
            console.log(data);
        }
    })
})