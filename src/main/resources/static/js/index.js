$(function () {

})

function ground(user) {
    // var path = getRootPath();
    if (null == user || user == undefined || user == "null"){
        window.location.href = "/login.html"
        /*$.ajax({
            url: path+'/login.html',
            dataType:'html',
            success:function (data) {
                $("#loginContent").html(data);
            }
        })*/
    }else {
        window.location.href = "";
    }
}

function seed(user) {
    // var path = getRootPath();
    if (null == user || user == undefined || user == "null"){
        window.location.href = "/login.html"
    }else {
        window.location.href = "";
    }
}

function crop(user) {
    // var path = getRootPath();
    if (null == user || user == undefined || user == "null"){
        window.location.href = "/login.html"
    }else {
        window.location.href = "";
    }
}

function getRootPath() {
    var curWwwPath = window.document.location.href;
    var pathName = window.document.location.pathname;
    var pos = curWwwPath.indexOf(pathName);
    var localhostPath = curWwwPath.substring(0, pos);
    var projectName = pathName.substring(0, pathName.substr(1).indexOf('/') + 1);
    return localhostPath +projectName;
}