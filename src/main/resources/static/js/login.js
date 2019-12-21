$(function () {
    var rootpath = "http://localhost:10100";
    $(".btn").click(function () {
        var uame = $("#username").val();
        var pwd = $("#password").val();
        $.ajax({
            type: 'POST',
            data: {username: uame, password: pwd},
            // contentType: "application/json;charset=UTF-8",  不能乱写，否则后台接受不到数据
            url: rootpath + '/cxx/login',
            success: function (data) {
                // alert("OK"+data);
                if (data === "/index") {
                    sendRequest(rootpath + data)
                }
                if (data === "用户名不存在！") {
                    $("#uname").html(data);
                    $("#username").val("");
                    $("#password").val("");
                    // sendRequest(rootpath)
                }
                if (data === "密码错误！") {
                    $("#pwd").html(data);
                    $("#uname").html("");
                    $("#password").val("");
                    // sendRequest(rootpath)
                }
            },
            error: function (data) {
                alert("error");
            }
        });

    });
});

function createXMLHttpRequest() {
    if (window.XMLHttpRequest) {
        XMLHttpR = new XMLHttpRequest();
    } else if (window.ActiveXObject) {
        try {
            XMLHttpR = new ActiveXObject("Msxml2.XMLHTTP");
        } catch (e) {
            try {
                XMLHttpR = new ActiveXObject("Microsoft.XMLHTTP");
            } catch (e) {
            }
        }
    }
}

function sendRequest(url) {
    createXMLHttpRequest();
    XMLHttpR.open("GET", url, true);
    XMLHttpR.setRequestHeader("Content-Type", "text/html;charset=gb2312");
    XMLHttpR.onreadystatechange = processResponse;
    XMLHttpR.send(null);
}

function processResponse() {
    if (XMLHttpR.readyState == 4 && XMLHttpR.status == 200) {
        document.write(XMLHttpR.responseText);
    }
}