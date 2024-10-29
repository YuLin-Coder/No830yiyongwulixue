<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <%@ include file="../../static/head.jsp" %>
    <link href="http://www.bootcss.com/p/bootstrap-datetimepicker/bootstrap-datetimepicker/css/datetimepicker.css"
          rel="stylesheet">
    <script type="text/javascript" charset="utf-8">
        window.UEDITOR_HOME_URL = "${pageContext.request.contextPath}/resources/ueditor/"; //UEDITOR_HOME_URL、config、all这三个顺序不能改变
    </script>
    <script type="text/javascript" charset="utf-8"
            src="${pageContext.request.contextPath}/resources/ueditor/ueditor.config.js"></script>
    <script type="text/javascript" charset="utf-8"
            src="${pageContext.request.contextPath}/resources/ueditor/ueditor.all.min.js"></script>
    <script type="text/javascript" charset="utf-8"
            src="${pageContext.request.contextPath}/resources/ueditor/lang/zh-cn/zh-cn.js"></script>
</head>
<style>

</style>
<body>
<!-- Pre Loader -->
<div class="loading">
    <div class="spinner">
        <div class="double-bounce1"></div>
        <div class="double-bounce2"></div>
    </div>
</div>
<!--/Pre Loader -->
<div class="wrapper">
    <!-- Page Content -->
    <div id="content">
        <!-- Top Navigation -->
        <%@ include file="../../static/topNav.jsp" %>
        <!-- Menu -->
        <div class="container menu-nav">
            <nav class="navbar navbar-expand-lg lochana-bg text-white">
                <button class="navbar-toggler" type="button" data-toggle="collapse"
                        data-target="#navbarSupportedContent"
                        aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="ti-menu text-white"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto" id="navUl">

                    </ul>
                </div>
            </nav>
        </div>
        <!-- /Menu -->
        <!-- Breadcrumb -->
        <!-- Page Title -->
        <div class="container mt-0">
            <div class="row breadcrumb-bar">
                <div class="col-md-6">
                    <h3 class="block-title">编辑实验预习</h3>
                </div>
                <div class="col-md-6">
                    <ol class="breadcrumb">
                        <li class="breadcrumb-item">
                            <a href="${pageContext.request.contextPath}/index.jsp">
                                <span class="ti-home"></span>
                            </a>
                        </li>
                        <li class="breadcrumb-item">实验预习管理</li>
                        <li class="breadcrumb-item active">实验预习登记</li>
                    </ol>
                </div>
            </div>
        </div>
        <!-- /Page Title -->

        <!-- /Breadcrumb -->
        <!-- Main Content -->
        <div class="container">

            <div class="row">
                <!-- Widget Item -->
                <div class="col-md-12">
                    <div class="widget-area-2 lochana-box-shadow">
                        <h3 class="widget-title">实验预习信息</h3>
                        <form id="addOrUpdateForm">
                            <div class="form-row">
                            <!-- 级联表所有字段 -->

                                        <div class="form-group col-md-6">
                                            <label>课程名称</label>
                                            <input id="shiyanpaikeName" name="shiyanpaikeName" class="form-control"
                                                   v-model="ruleForm.shiyanpaikeName" readonly>
                                        </div>


                                    <div class="form-group col-md-6">
                                        <label>课程类型</label>
                                        <input id="shiyanpaikeValue" name="shiyanpaikeValue" class="form-control"
                                               v-model="ruleForm.shiyanpaikeValue" readonly>
                                    </div>


                                        <div class="form-group col-md-6">
                                            <label>上课时间</label>
                                            <input id="shiyanpaikeTime" name="shiyanpaikeTime" class="form-control"
                                                   v-model="ruleForm.shiyanpaikeTime" readonly>
                                        </div>


                                        <div class="form-group col-md-6">
                                            <label>上课教师</label>
                                            <input id="jiaoshiId" name="jiaoshiId" class="form-control"
                                                   v-model="ruleForm.jiaoshiId" readonly>
                                        </div>


                                    <div class="form-group col-md-6">
                                        <label>上课班级</label>
                                        <input id="banjiValue" name="banjiValue" class="form-control"
                                               v-model="ruleForm.banjiValue" readonly>
                                    </div>


                                        <div class="form-group col-md-6">
                                            <label>分组</label>
                                            <input id="shiyanpaikeFenzu" name="shiyanpaikeFenzu" class="form-control"
                                                   v-model="ruleForm.shiyanpaikeFenzu" readonly>
                                        </div>

                            <!-- 本表所有字段 -->



                                    <input id="updateId" name="id" type="hidden">
                                <input id="shiyanpaikeId" name="shiyanpaikeId" v-model="ruleForm.shiyanpaikeId" readonly type="hidden">

                                    <div class="form-group col-md-6">
                                        <label>实验目的</label>
                                        <input id="shiyanyuxiMudi" name="shiyanyuxiMudi" class="form-control"
                                               v-model="ruleForm.shiyanyuxiMudi" readonly>
                                    </div>


                                    <div class="form-group col-md-6">
                                        <label>实验要求</label>
                                        <input id="shiyanyuxiYiqiu" name="shiyanyuxiYiqiu" class="form-control"
                                               v-model="ruleForm.shiyanyuxiYiqiu" readonly>
                                    </div>


                                    <div class="form-group col-md-6">
                                        <label>熟悉仪器</label>
                                        <input id="shiyanyuxiShuxi" name="shiyanyuxiShuxi" class="form-control"
                                               v-model="ruleForm.shiyanyuxiShuxi" readonly>
                                    </div>

                                <div class="form-group col-md-12 mb-3">
                                    <button id="exitBtn" type="button" class="btn btn-primary btn-lg">返回</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
                <!-- /Widget Item -->
            </div>
        </div>
        <!-- /Main Content -->
    </div>
    <!-- /Page Content -->
</div>
<!-- Back to Top -->
<a id="back-to-top" href="#" class="back-to-top">
    <span class="ti-angle-up"></span>
</a>
<!-- /Back to Top -->
<%@ include file="../../static/foot.jsp" %>
<script src="${pageContext.request.contextPath}/resources/js/vue.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/jquery.ui.widget.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/jquery.form.js"></script>

<script>
    <%@ include file="../../utils/menu.jsp"%>
            <%@ include file="../../static/setMenu.js"%>
            <%@ include file="../../utils/baseUrl.jsp"%>

    var tableName = "shiyanyuxi";
    var pageType = "add-or-update";
    var updateId = "";


    var ruleForm = {};
    var vm = new Vue({
        el: '#addOrUpdateForm',
        data: {
            ruleForm: {},
        },
        beforeCreate: function () {
            var id = window.sessionStorage.getItem("updateId");
            if (id != null && id != "" && id != "null") {
                $.ajax({
                    type: "GET",
                    url: baseUrl + "shiyanyuxi/info/" + id,
                    beforeSend: function (xhr) {
                        xhr.setRequestHeader("token", window.sessionStorage.getItem('token'));
                    },
                    success: function (res) {
                        if (res.code == 0) {
                            vm.ruleForm = res.data;
                            ruleForm = res.data;
                            showImg();
                            setContent();
                        } else if (res.code == 401) {
                        <%@ include file="../../static/toLogin.jsp"%>
                        } else {
                            alert(res.msg)
                        }
                    },
                });
            }
        },
        methods: {}
    });


    // 填充富文本框
    function setContent() {

    }


    //图片显示
    function showImg() {
    }

    function exit() {
        window.sessionStorage.removeItem("updateId");
        window.sessionStorage.removeItem('addshiyanyuxi');
        window.location.href = "list.jsp";
    }

    // 下载
    function download(fileName) {
        var url = baseUrl+'file/download?fileName='+fileName;
        window.open(url);
    }

    //设置下载
    function setDownloadBtn() {

    }

    $(document).ready(function () {
        //设置右上角用户名
        $('.dropdown-menu h5').html(window.sessionStorage.getItem('username'))
        //设置项目名
        $('.sidebar-header h3 a').html(projectName)
        setMenu();
        $('#exitBtn').on('click', function (e) {
            e.preventDefault();
            exit();
        });


    <%@ include file="../../static/myInfo.js"%>
    });
    // 用户登出
    <%@ include file="../../static/logout.jsp"%>
</script>
</body>

</html>