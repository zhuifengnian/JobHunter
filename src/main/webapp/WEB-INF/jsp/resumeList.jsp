<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sys" uri="/WEB-INF/tld/sys.tld"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Amaze UI Admin index Examples</title>
    <meta name="description" content="这是一个 index 页面">
    <meta name="keywords" content="index">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="icon" type="image/png" href="${pageContext.request.contextPath}/resources/assets/i/favicon.png">
    <link rel="apple-touch-icon-precomposed" href="${pageContext.request.contextPath}/resources/assets/i/app-icon72x72@2x.png">
    <meta name="apple-mobile-web-app-title" content="Amaze UI" />
    <script src="${pageContext.request.contextPath}/resources/assets/js/echarts.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/amazeui.min.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/amazeui.datatables.min.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/app.css">
    <script src="${pageContext.request.contextPath}/resources/assets/js/jquery.min.js"></script>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/stone_resume_admin.css"/>

</head>

<body data-type="widgets">
<script src="${pageContext.request.contextPath}/resources/assets/js/theme.js"></script>
<div class="am-g tpl-g">
    <!-- 头部 -->
    <header>
        <!-- logo -->
        <div class="am-fl tpl-header-logo">
            <a href="javascript:;"><img src="${pageContext.request.contextPath}/resources/assets/img/logo.png" alt=""></a>
        </div>
        <!-- 右侧内容 -->
        <div class="tpl-header-fluid">
            <!-- 侧边切换 -->
            <div class="am-fl tpl-header-switch-button am-icon-list">
                    <span>

                </span>
            </div>
            <!-- 搜索 -->
            <div class="am-fl tpl-header-search">
                <form class="tpl-header-search-form" action="javascript:;">
                    <button class="tpl-header-search-btn am-icon-search"></button>
                    <input class="tpl-header-search-box" type="text" placeholder="搜索内容...">
                </form>
            </div>
            <!-- 其它功能-->
            <div class="am-fr tpl-header-navbar">
                <ul>
                    <!-- 欢迎语 -->
                    <li class="am-text-sm tpl-header-navbar-welcome">
                        <a href="javascript:;">欢迎你, <span>Amaze UI</span> </a>
                    </li>

                    <!-- 新邮件 -->
                    <li class="am-dropdown tpl-dropdown" data-am-dropdown>
                        <a href="javascript:;" class="am-dropdown-toggle tpl-dropdown-toggle" data-am-dropdown-toggle>
                            <i class="am-icon-envelope"></i>
                            <span class="am-badge am-badge-success am-round item-feed-badge">4</span>
                        </a>
                        <!-- 弹出列表 -->
                        <ul class="am-dropdown-content tpl-dropdown-content">
                            <li class="tpl-dropdown-menu-messages">
                                <a href="javascript:;" class="tpl-dropdown-menu-messages-item am-cf">
                                    <div class="menu-messages-ico">
                                        <img src="${pageContext.request.contextPath}/resources/assets/img/user04.png" alt="">
                                    </div>
                                    <div class="menu-messages-time">
                                        3小时前
                                    </div>
                                    <div class="menu-messages-content">
                                        <div class="menu-messages-content-title">
                                            <i class="am-icon-circle-o am-text-success"></i>
                                            <span>夕风色</span>
                                        </div>
                                        <div class="am-text-truncate"> Amaze UI 的诞生，依托于 GitHub 及其他技术社区上一些优秀的资源；Amaze UI 的成长，则离不开用户的支持。 </div>
                                        <div class="menu-messages-content-time">2016-09-21 下午 16:40</div>
                                    </div>
                                </a>
                            </li>

                            <li class="tpl-dropdown-menu-messages">
                                <a href="javascript:;" class="tpl-dropdown-menu-messages-item am-cf">
                                    <div class="menu-messages-ico">
                                        <img src="${pageContext.request.contextPath}/resources/assets/img/user02.png" alt="">
                                    </div>
                                    <div class="menu-messages-time">
                                        5天前
                                    </div>
                                    <div class="menu-messages-content">
                                        <div class="menu-messages-content-title">
                                            <i class="am-icon-circle-o am-text-warning"></i>
                                            <span>禁言小张</span>
                                        </div>
                                        <div class="am-text-truncate"> 为了能最准确的传达所描述的问题， 建议你在反馈时附上演示，方便我们理解。 </div>
                                        <div class="menu-messages-content-time">2016-09-16 上午 09:23</div>
                                    </div>
                                </a>
                            </li>
                            <li class="tpl-dropdown-menu-messages">
                                <a href="javascript:;" class="tpl-dropdown-menu-messages-item am-cf">
                                    <i class="am-icon-circle-o"></i> 进入列表…
                                </a>
                            </li>
                        </ul>
                    </li>

                    <!-- 新提示 -->
                    <li class="am-dropdown" data-am-dropdown>
                        <a href="javascript:;" class="am-dropdown-toggle" data-am-dropdown-toggle>
                            <i class="am-icon-bell"></i>
                            <span class="am-badge am-badge-warning am-round item-feed-badge">5</span>
                        </a>

                        <!-- 弹出列表 -->
                        <ul class="am-dropdown-content tpl-dropdown-content">
                            <li class="tpl-dropdown-menu-notifications">
                                <a href="javascript:;" class="tpl-dropdown-menu-notifications-item am-cf">
                                    <div class="tpl-dropdown-menu-notifications-title">
                                        <i class="am-icon-line-chart"></i>
                                        <span> 有6笔新的销售订单</span>
                                    </div>
                                    <div class="tpl-dropdown-menu-notifications-time">
                                        12分钟前
                                    </div>
                                </a>
                            </li>
                            <li class="tpl-dropdown-menu-notifications">
                                <a href="javascript:;" class="tpl-dropdown-menu-notifications-item am-cf">
                                    <div class="tpl-dropdown-menu-notifications-title">
                                        <i class="am-icon-star"></i>
                                        <span> 有3个来自人事部的消息</span>
                                    </div>
                                    <div class="tpl-dropdown-menu-notifications-time">
                                        30分钟前
                                    </div>
                                </a>
                            </li>
                            <li class="tpl-dropdown-menu-notifications">
                                <a href="javascript:;" class="tpl-dropdown-menu-notifications-item am-cf">
                                    <div class="tpl-dropdown-menu-notifications-title">
                                        <i class="am-icon-folder-o"></i>
                                        <span> 上午开会记录存档</span>
                                    </div>
                                    <div class="tpl-dropdown-menu-notifications-time">
                                        1天前
                                    </div>
                                </a>
                            </li>


                            <li class="tpl-dropdown-menu-notifications">
                                <a href="javascript:;" class="tpl-dropdown-menu-notifications-item am-cf">
                                    <i class="am-icon-bell"></i> 进入列表…
                                </a>
                            </li>
                        </ul>
                    </li>

                    <!-- 退出 -->
                    <li class="am-text-sm">
                        <a href="javascript:;">
                            <span class="am-icon-sign-out"></span> 退出
                        </a>
                    </li>
                </ul>
            </div>
        </div>

    </header>
    <!-- 风格切换 -->
    <div class="tpl-skiner">
        <div class="tpl-skiner-toggle am-icon-cog">
        </div>
        <div class="tpl-skiner-content">
            <div class="tpl-skiner-content-title">
                选择主题
            </div>
            <div class="tpl-skiner-content-bar">
                <span class="skiner-color skiner-white" data-color="theme-white"></span>
                <span class="skiner-color skiner-black" data-color="theme-black"></span>
            </div>
        </div>
    </div>
    <!-- 侧边导航栏 -->
    <!-- 侧边导航栏 -->
    <div class="left-sidebar">
        <!-- 用户信息 -->
        <div class="tpl-sidebar-user-panel">
            <div class="tpl-user-panel-slide-toggleable">
                <div class="tpl-user-panel-profile-picture">
                    <img src="${pageContext.request.contextPath}/resources/assets/img/user04.png" alt="">
                </div>
                <span class="user-panel-logged-in-text">
              <i class="am-icon-circle-o am-text-success tpl-user-panel-status-icon"></i>
              禁言小张
          </span>
                <a href="javascript:;" class="tpl-user-panel-action-link"> <span class="am-icon-pencil"></span> 账号设置</a>
            </div>
        </div>

        <!-- 菜单 -->
        <ul class="sidebar-nav">
            <li class="sidebar-nav-heading">Components <span class="sidebar-nav-heading-info"> 附加组件</span></li>
            <li class="sidebar-nav-link">
                <a href="${pageContext.request.contextPath}/sys/index" >
                    <i class="am-icon-home sidebar-nav-link-logo"></i> 首页
                </a>
            </li>
            <li class="sidebar-nav-link">
                <a href="${pageContext.request.contextPath}/sys/resume" class="active">
                    <i class="am-icon-table sidebar-nav-link-logo"></i> 简历管理
                </a>
            </li>
            <li class="sidebar-nav-link">
                <a href="calendar.html">
                    <i class="am-icon-calendar sidebar-nav-link-logo"></i> 企业管理
                </a>
            </li>
            <li class="sidebar-nav-link">
                <a href="form.html">
                    <i class="am-icon-wpforms sidebar-nav-link-logo"></i> 自我评价标签管理

                </a>
            </li>
            <li class="sidebar-nav-link">
                <a href="chart.html">
                    <i class="am-icon-bar-chart sidebar-nav-link-logo"></i> 关于我们管理

                </a>
            </li>
        </ul>
    </div>

    <!-- 内容区域 -->
    <div class="tpl-content-wrapper">
        <div class="row-content am-cf">
            <div class="row">
                <div class="am-u-sm-12 am-u-md-12 am-u-lg-12">
                    <div class="widget am-cf">
                        <div class="widget-head am-cf">
                            <div class="widget-title  am-cf">简历列表</div>
                        </div>
                        <div class="widget-body  am-fr">
                            <form action="${pageContext.request.contextPath}/sys/order/list" method="post">
                            <div class="am-u-sm-12 am-u-md-6 am-u-lg-4">
                                <fieldset class="am-form-group">

                                    <div class="tpl-form-border-form cl-p">
                                        <input type="text" class="am-form-field " placeholder="目标企业">
                                    </div>
                                    <div class="tpl-form-border-form cl-p">
                                        <input type="text" class="am-form-field " placeholder="简历标题">
                                    </div>
                                </fieldset>
                            </div>
                            <div class="am-u-sm-12 am-u-md-6 am-u-lg-2">
                                <fieldset class="am-form-set">
                                    <div class="am-input-group am-datepicker-date" data-am-datepicker="{format: 'yyyy-mm', viewMode: 'years', minViewMode: 'months'}">
                                        <input type="text" class="am-form-field" placeholder="毕业起始年月" readonly>
                                        <span class="am-input-group-btn am-datepicker-add-on">
                                        <button class="am-btn am-btn-primary am-btn-xs" type="button"><span class="am-icon-calendar"></span> </button>
                                        </span>
                                    </div>
                                    <div class="am-input-group am-datepicker-date" data-am-datepicker="{format: 'yyyy-mm', viewMode: 'years', minViewMode: 'months'}">
                                        <input type="text" class="am-form-field" placeholder="毕业结束年月" readonly>
                                        <span class="am-input-group-btn am-datepicker-add-on">
                                        <button class="am-btn am-btn-primary am-btn-xs" type="button"><span class="am-icon-calendar"></span> </button>
                                        </span>
                                    </div>
                                </fieldset>

                            </div>
                            <div class="am-u-sm-12 am-u-md-6 am-u-lg-3">
                                <fieldset class="am-form-set">
                                    <div class="am-form-group tpl-table-list-select">
                                        <select data-am-selected="{btnSize: 'sm'}">
                                            <option value='none' disabled>请选择志愿序列</option>
                                            <option value="0">不限志愿</option>
                                            <option value="1">第一志愿</option>
                                            <option value="2">第二志愿</option>
                                            <option value="3">第三志愿</option>
                                        </select>
                                    </div>
                                    <div class="am-form-group tpl-table-list-select">
                                        <select data-am-selected="{btnSize: 'sm'}">
                                            <option value='none' disabled>请选择学校类型</option>
                                            <option value="0">不限学校</option>
                                            <option value="1">985/211</option>
                                            <option value="2">普通本科</option>
                                            <option value="3">专科</option>
                                            <option value="4">其他</option>
                                        </select>
                                    </div>
                                </fieldset>

                            </div>

                            <div class="am-u-sm-12 am-u-md-6 am-u-lg-3">
                                <fieldset class="am-form-set">
                                    <div class="am-form-group tpl-table-list-select">
                                    <select data-am-selected="{btnSize: 'sm'}">
                                    <option value='none' disabled>请选择自我定位</option>
                                    <option value="0">不限自我定位</option>
                                    <option value="1">学霸型</option>
                                    <option value="2">运动型</option>
                                    <option value="3">社交型</option>
                                    </select>
                                    </div>
                                    <div class="am-input-group am-align-right">
                                        <button class="am-btn am-btn-success am-btn-sm">
                                            <i class="am-icon-search"></i>
                                            搜索
                                        </button>
                                    </div>
                                </fieldset>

                            </div>

                            </form>

                            <div class="am-u-sm-12">
                                <table class="am-table am-table-compact am-table-striped tpl-table-black am-table-centered" width="100%">
                                    <thead>
                                    <tr>
                                        <th>标题</th>
                                        <th>目标企业</th>
                                        <th>作者</th>
                                        <th>头像</th>
                                        <th>性别</th>
                                        <th>手机</th>
                                        <th>志愿序列</th>
                                        <th>学校类型</th>
                                        <th>毕业时间</th>
                                        <th>自我定位</th>
                                        <th>创建时间</th>
                                        <th>操作</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${resumePageInfo.rows}" var="resume">
                                        <tr>
                                            <td class="am-text-middle">${resume.resumeName}</td>
                                            <td class="am-text-middle">${resume.company}</td>
                                            <td class="am-text-middle">${resume.userName}</td>
                                            <td class="am-text-middle"><img class="resume-avatar" src="${resume.userPhoto}" onerror="this.src='${pageContext.request.contextPath}/resources/assets/img/user03.png'"/></td>
                                            <td class="am-text-middle">${sys:judgeGender(resume.userGender)}</td>
                                            <td class="am-text-middle">${resume.userPhone}</td>
                                            <%--将序列转化为对应字符--%>
                                            <td class="am-text-middle">${sys:judgeSequence(resume.sequence)}</td>
                                            <td class="am-text-middle">${sys:judgeSchoolType(resume.schoolType)}</td>
                                            <td class="am-text-middle">${sys:translateDateType2YearAndMonth(resume.finishTime)}</td>
                                            <td class="am-text-middle">${sys:judgeSelfPosition(resume.selfPosition)}</td>
                                            <td class="am-text-middle">${sys:translateDateType2Year(resume.createTime)}</td>
                                            <td class="am-text-middle">
                                                <div class="tpl-table-black-operation">
                                                    <a href="${pageContext.request.contextPath}/sys/resumeEditor">
                                                        <i class="am-icon-pencil"></i> 编辑
                                                    </a>
                                                </div>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                    <tr>
                                        <td class="am-text-middle">法律专业投递</td>
                                        <td class="am-text-middle">京东</td>
                                        <td class="am-text-middle">张鹏飞</td>
                                        <td class="am-text-middle"><img class="resume-avatar" src="https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=3626217888,316039247&fm=27&gp=0.jpg"/></td>
                                        <td class="am-text-middle">男</td>
                                        <td class="am-text-middle">18968271936</td>
                                        <td class="am-text-middle">第一志愿</td>
                                        <td class="am-text-middle">普通本科</td>
                                        <td class="am-text-middle">2016年7月</td>
                                        <td class="am-text-middle">运动型</td>
                                        <td class="am-text-middle">2018-6-29</td>
                                        <td class="am-text-middle">
                                            <div class="tpl-table-black-operation">
                                                <a href="${pageContext.request.contextPath}/sys/resumeEditor">
                                                    <i class="am-icon-pencil"></i> 编辑
                                                </a>
                                            </div>
                                        </td>
                                    </tr>

                                    </tbody>
                                </table>
                            </div>
                            <div class="am-u-lg-12 am-cf">

                                <div class="am-fr">
                                    <ul class="am-pagination tpl-pagination">
                                        <li class="am-disabled"><a href="#">«</a></li>
                                        <li class="am-active"><a href="#">1</a></li>
                                        <li><a href="#">2</a></li>
                                        <li><a href="#">3</a></li>
                                        <li><a href="#">4</a></li>
                                        <li><a href="#">5</a></li>
                                        <li><a href="#">»</a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</div>
<script src="${pageContext.request.contextPath}/resources/assets/js/amazeui.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/assets/js/amazeui.datatables.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/assets/js/dataTables.responsive.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/assets/js/app.js"></script>

</body>

</html>