<%--
  Created by IntelliJ IDEA.
  User: fan
  Date: 2018/7/9
  Time: 10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        .doc-ir-demo {
            background: #3bb4f2;
        }

        .doc-ir-demo h1 {
            margin: 0;
            padding: 10px;
        }

        .doc-ir-demo a {
            display: block;
            height: 29px;
            width: 125px;
            background: url(/resources/assets/i/startup-640x1096.png) no-repeat left center;
            -webkit-background-size: 125px 24px;
            background-size: 125px 24px;
        }
        .boxes {
            width: 300px;
        }

        .boxes .box {
            height: 100px;
            color: #eee;
            line-height: 100px;
            text-align: center;
            font-weight: bold;
            transition: all .2s ease;
        }

        .boxes .box:hover {
            font-size: 250%;
            transform: rotate(360deg);
        }

        .box-1 {
            background-color: red;
        }

        .box-2 {
            background-color: orange;
        }

        .box-3 {
            background-color: #0000ff;
        }

        .box-4 {
            background-color: #008000;
        }

        .box-5 {
            background-color: red;
        }

        .box-6 {
            background-color: orange;
        }

        .box-7 {
            background-color: #0000ff;
        }

        .box-8 {
            background-color: #008000;
        }

        .box-9 {
            background-color: red;
        }
    </style>
</head>
<body>
<div class="am-form-group am-form-file">
    <button type="button" class="am-btn am-btn-danger am-btn-sm">
        <i class="am-icon-cloud-upload"></i> 选择要上传的文件</button>
    <input id="doc-form-file" type="file" multiple>
</div>
<div id="file-list"></div>

</body>
</html>
