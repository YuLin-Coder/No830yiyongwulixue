<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="zh-cn">

<head>
    <%@ include file="../../static/head.jsp" %>
    <link href="http://www.bootcss.com/p/bootstrap-datetimepicker/bootstrap-datetimepicker/css/datetimepicker.css"
          rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap-select.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
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
    .error {
        color: red;
    }
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
                    <ul id="navUl" class="navbar-nav mr-auto">

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
                        <li class="breadcrumb-item active">编辑实验预习</li>
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
                            <!-- 级联表的字段 -->
                                    <div class="form-group col-md-6">
                                        <label>实验排课</label>
                                        <div>
                                            <select id="shiyanpaikeSelect" name="shiyanpaikeSelect"
                                                    class="selectpicker form-control"  data-live-search="true"
                                                    title="请选择" data-header="请选择" data-size="5">
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group col-md-6">
                                        <label>课程名称</label>
                                        <input id="shiyanpaikeName" name="shiyanpaikeName" class="form-control"
                                               placeholder="课程名称" readonly>
                                    </div>
                                    <div class="form-group col-md-6">
                                        <label>课程类型</label>
                                        <input id="shiyanpaikeValue" name="shiyanpaikeValue" class="form-control"
                                               placeholder="课程类型" readonly>
                                    </div>
                                    <div class="form-group col-md-6">
                                        <label>上课时间</label>
                                        <input id="shiyanpaikeTime" name="shiyanpaikeTime" class="form-control"
                                               placeholder="上课时间" readonly>
                                    </div>
                                    <div class="form-group col-md-6">
                                        <label>上课教师</label>
                                        <input id="jiaoshiId" name="jiaoshiId" class="form-control"
                                               placeholder="上课教师" readonly>
                                    </div>
                                    <div class="form-group col-md-6">
                                        <label>上课班级</label>
                                        <input id="banjiValue" name="banjiValue" class="form-control"
                                               placeholder="上课班级" readonly>
                                    </div>
                                    <div class="form-group col-md-6">
                                        <label>分组</label>
                                        <input id="shiyanpaikeFenzu" name="shiyanpaikeFenzu" class="form-control"
                                               placeholder="分组" readonly>
                                    </div>
                            <!-- 当前表的字段 -->
                                    <input id="updateId" name="id" type="hidden">
                                <input id="shiyanpaikeId" name="shiyanpaikeId" type="hidden">
                                    <div class="form-group col-md-6">
                                        <label>实验目的</label>
                                        <input id="shiyanyuxiMudi" name="shiyanyuxiMudi" class="form-control"
                                               placeholder="实验目的">
                                    </div>
                                    <div class="form-group col-md-6">
                                        <label>实验要求</label>
                                        <input id="shiyanyuxiYiqiu" name="shiyanyuxiYiqiu" class="form-control"
                                               placeholder="实验要求">
                                    </div>
                                    <div class="form-group col-md-6">
                                        <label>熟悉仪器</label>
                                        <input id="shiyanyuxiShuxi" name="shiyanyuxiShuxi" class="form-control"
                                               placeholder="熟悉仪器">
                                    </div>
                                    <div class="form-group col-md-12 mb-3">
                                        <button id="submitBtn" type="button" class="btn btn-primary btn-lg">提交</button>
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
<script src="${pageContext.request.contextPath}/resources/js/jquery.fileupload.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/jquery.form.js"></script>
<script type="text/javascript" charset="utf-8"
        src="${pageContext.request.contextPath}/resources/js/validate/jquery.validate.min.js"></script>
<script type="text/javascript" charset="utf-8"
        src="${pageContext.request.contextPath}/resources/js/validate/messages_zh.js"></script>
<script type="text/javascript" charset="utf-8"
        src="${pageContext.request.contextPath}/resources/js/validate/card.js"></script>
<script type="text/javascript" charset="utf-8"
        src="${pageContext.request.contextPath}/resources/js/datetimepicker/bootstrap-datetimepicker.min.js"></script>
</script>
<script type="text/javascript" charset="utf-8"
                 src="${pageContext.request.contextPath}/resources/js/bootstrap-select.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/laydate.js"></script>
<script>
    <%@ include file="../../utils/menu.jsp"%>
    <%@ include file="../../static/setMenu.js"%>
    <%@ include file="../../utils/baseUrl.jsp"%>

    var tableName = "shiyanyuxi";
    var pageType = "add-or-update";
    var updateId = "";
    var crossTableId = -1;
    var crossTableName = '';
    var ruleForm = {};
    var crossRuleForm = {};


    // 下拉框数组
        <!-- 当前表的下拉框数组 -->
        <!-- 级联表的下拉框数组 -->
    var shiyanpaikeOptions = [];

    var ruleForm = {};


    // 文件上传
    function upload() {

        <!-- 当前表的文件上传 -->

    }

    // 表单提交
    function submit() {
        if (validform() == true && compare() == true) {
            let data = {};
            getContent();
           if($("#shiyanpaikeId") !=null){
               var shiyanpaikeId = $("#shiyanpaikeId").val();
               if(shiyanpaikeId == null || shiyanpaikeId =='' || shiyanpaikeId == 'null'){
                   alert("预习课程不能为空");
                   return;
               }
           }
            let value = $('#addOrUpdateForm').serializeArray();
            $.each(value, function (index, item) {
                data[item.name] = item.value;
            });
            let json = JSON.stringify(data);
            var urlParam;
            var successMes = '';
            if (updateId != null && updateId != "null" && updateId != '') {
                urlParam = 'update';
                successMes = '修改成功';
            } else {
                urlParam = 'save';
                    successMes = '添加成功';
            }
            httpJson("shiyanyuxi/" + urlParam, "POST", data, (res) => {
                if(res.code == 0){
                    window.sessionStorage.removeItem('addshiyanyuxi');
                    window.sessionStorage.removeItem('updateId');
                    let flag = true;
                    if (flag) {
                        alert(successMes);
                    }
                    if (window.sessionStorage.getItem('onlyme') != null && window.sessionStorage.getItem('onlyme') == "true") {
                        window.sessionStorage.removeItem('onlyme');
                        window.sessionStorage.setItem("reload","reload");
                        window.parent.location.href = "${pageContext.request.contextPath}/index.jsp";
                    } else {
                        window.location.href = "list.jsp";
                    }
                }
            });
        } else {
            alert("表单未填完整或有错误");
        }
    }

    // 查询列表
        <!-- 查询当前表的所有列表 -->
        <!-- 查询级联表的所有列表 -->
        function shiyanpaikeSelect() {
            //填充下拉框选项
            http("shiyanpaike/page?page=1&limit=100&sort=&order=", "GET", {}, (res) => {
                if(res.code == 0){
                    shiyanpaikeOptions = res.data.list;
                }
            });
        }

        function shiyanpaikeSelectOne(id) {
            http("shiyanpaike/info/"+id, "GET", {}, (res) => {
                if(res.code == 0){
                ruleForm = res.data;
                shiyanpaikeShowImg();
                shiyanpaikeShowVideo();
                shiyanpaikeDataBind();
            }
        });
        }



    // 初始化下拉框
    <!-- 初始化当前表的下拉框 -->

        function initializationshiyanpaikeSelect() {
            var shiyanpaikeSelect = document.getElementById('shiyanpaikeSelect');
            if(shiyanpaikeSelect != null && shiyanpaikeOptions != null  && shiyanpaikeOptions.length > 0 ) {
                for (var i = 0; i < shiyanpaikeOptions.length; i++) {
                        shiyanpaikeSelect.add(new Option(shiyanpaikeOptions[i].shiyanpaikeName, shiyanpaikeOptions[i].id));
                }

                $("#shiyanpaikeSelect").change(function(e) {
                        shiyanpaikeSelectOne(e.target.value);
                });
            }

        }



    // 下拉框选项回显
    function setSelectOption() {

        <!-- 当前表的下拉框回显 -->
        <!--  级联表的下拉框回显  -->
            var shiyanpaikeSelect = document.getElementById("shiyanpaikeSelect");
            if(shiyanpaikeSelect != null && shiyanpaikeOptions != null  && shiyanpaikeOptions.length > 0 ) {
                for (var i = 0; i < shiyanpaikeOptions.length; i++) {
                    if (shiyanpaikeOptions[i].id == ruleForm.shiyanpaikeId) {//下拉框value对比,如果一致就赋值汉字
                        shiyanpaikeSelect.options[i+1].selected = true;
                        $("#shiyanpaikeSelect" ).selectpicker('refresh');
                    }
                }
            }
    }


    // 填充富文本框
    function setContent() {

        <!-- 当前表的填充富文本框 -->
    }
    // 获取富文本框内容
    function getContent() {

        <!-- 获取当前表的富文本框内容 -->
    }
    //数字检查
        <!-- 当前表的数字检查 -->

    function exit() {
        window.sessionStorage.removeItem("updateId");
        window.sessionStorage.removeItem('addshiyanyuxi');
        window.location.href = "list.jsp";
    }
    // 表单校验
    function validform() {
        return $("#addOrUpdateForm").validate({
            rules: {
                shiyanpaikeId: "required",
                shiyanyuxiMudi: "required",
                shiyanyuxiYiqiu: "required",
                shiyanyuxiShuxi: "required",
            },
            messages: {
                shiyanpaikeId: "预习课程不能为空",
                shiyanyuxiMudi: "实验目的不能为空",
                shiyanyuxiYiqiu: "实验要求不能为空",
                shiyanyuxiShuxi: "熟悉仪器不能为空",
            }
        }).form();
    }

    // 获取当前详情
    function getDetails() {
        var addshiyanyuxi = window.sessionStorage.getItem("addshiyanyuxi");
        if (addshiyanyuxi != null && addshiyanyuxi != "" && addshiyanyuxi != "null") {
            window.sessionStorage.removeItem('addshiyanyuxi');
            //注册表单验证
            $(validform());
            $('#submitBtn').text('新增');

        } else {
            $('#submitBtn').text('修改');
            var userId = window.sessionStorage.getItem('userId');
            updateId = userId;//先赋值登录用户id
            var uId  = window.sessionStorage.getItem('updateId');//获取修改传过来的id
            if (uId != null && uId != "" && uId != "null") {
                //如果修改id不为空就赋值修改id
                updateId = uId;
            }
            window.sessionStorage.removeItem('updateId');
            http("shiyanyuxi/info/" + updateId, "GET", {}, (res) => {
                if(res.code == 0)
                {
                    ruleForm = res.data
                    // 是/否下拉框回显
                    setSelectOption();
                    // 设置图片src
                    showImg();
                    // 设置视频src
                    showVideo();
                    // 数据填充
                    dataBind();
                    // 富文本框回显
                    setContent();
                    //注册表单验证
                    $(validform());
                }

            });
        }
    }

    // 清除可能会重复渲染的selection
    function clear(className) {
        var elements = document.getElementsByClassName(className);
        for (var i = elements.length - 1; i >= 0; i--) {
            elements[i].parentNode.removeChild(elements[i]);
        }
    }

    function dateTimePick() {
    }


    function dataBind() {


    <!--  级联表的数据回显  -->
        shiyanpaikeDataBind();


    <!--  当前表的数据回显  -->
        $("#updateId").val(ruleForm.id);
        $("#shiyanpaikeId").val(ruleForm.shiyanpaikeId);
        $("#shiyanyuxiMudi").val(ruleForm.shiyanyuxiMudi);
        $("#shiyanyuxiYiqiu").val(ruleForm.shiyanyuxiYiqiu);
        $("#shiyanyuxiShuxi").val(ruleForm.shiyanyuxiShuxi);

    }
    <!--  级联表的数据回显  -->
    function shiyanpaikeDataBind(){

                    <!-- 把id赋值给当前表的id-->
        $("#shiyanpaikeId").val(ruleForm.id);

        $("#shiyanpaikeName").val(ruleForm.shiyanpaikeName);
        $("#shiyanpaikeValue").val(ruleForm.shiyanpaikeValue);
        $("#shiyanpaikeTime").val(ruleForm.shiyanpaikeTime);//把时间戳转换为日期带时分秒格式
        $("#jiaoshiId").val(ruleForm.jiaoshiId);
        $("#banjiValue").val(ruleForm.banjiValue);
        $("#shiyanpaikeFenzu").val(ruleForm.shiyanpaikeFenzu);
    }


    //图片显示
    function showImg() {
        <!--  当前表的图片  -->

        <!--  级联表的图片  -->
        shiyanpaikeShowImg();
    }


    <!--  级联表的图片  -->

    function shiyanpaikeShowImg() {
    }



    //视频回显
    function showVideo() {
    <!--  当前表的视频  -->

    <!--  级联表的视频  -->
        shiyanpaikeShowVideo();
    }


    <!--  级联表的视频  -->

    function shiyanpaikeShowVideo() {
    }



    $(document).ready(function () {
        //设置右上角用户名
        $('.dropdown-menu h5').html(window.sessionStorage.getItem('username'))
        //设置项目名
        $('.sidebar-header h3 a').html(projectName)
        //设置导航栏菜单
        setMenu();
        $('#exitBtn').on('click', function (e) {
            e.preventDefault();
            exit();
        });
        //初始化时间插件
        dateTimePick();
        //查询所有下拉框
            <!--  当前表的下拉框  -->
            <!-- 查询级联表的下拉框(用id做option,用名字及其他参数做名字级联修改) -->
            shiyanpaikeSelect();



        // 初始化下拉框
            <!--  初始化当前表的下拉框  -->
            <!--  初始化级联表的下拉框  -->
            initializationshiyanpaikeSelect();

        $(".selectpicker" ).selectpicker('refresh');
        getDetails();
        //初始化上传按钮
        upload();
    <%@ include file="../../static/myInfo.js"%>
                $('#submitBtn').on('click', function (e) {
                    e.preventDefault();
                    //console.log("点击了...提交按钮");
                    submit();
                });
        readonly();
    });

    function readonly() {
        if (window.sessionStorage.getItem('role') != '管理员') {
            //$('#jifen').attr('readonly', 'readonly');
            //$('#role').attr('style', 'pointer-events: none;');
        }
    }

    //比较大小
    function compare() {
        var largerVal = null;
        var smallerVal = null;
        if (largerVal != null && smallerVal != null) {
            if (largerVal <= smallerVal) {
                alert(smallerName + '不能大于等于' + largerName);
                return false;
            }
        }
        return true;
    }


    // 用户登出
    <%@ include file="../../static/logout.jsp"%>
</script>
</body>

</html>