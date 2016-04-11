<#-- @ftlvariable name="listMenu" type="java.util.List<com.springapp.mvc.common.MenuInfo>" -->
<#assign sec=JspTaglibs["http://www.springframework.org/security/tags"]>
<div class="header-top">
    <div class="header-bottom">
        <div class="logo">
            <h1><a href="/">Lighting</a></h1>
        </div>
        <div class="top-nav">
    <ul class="memenu skyblue">
        <#list listMenu as menu>
        <li><a class="grid" href="${menu.link}">${menu.name}</a>
            <#if menu.listCategory?has_content || menu.trends?has_content>
            <div class="mepanel">
                <div class="row">
                    <#if menu.listCategory?has_content>
                    <div class="col1 me-one">
                        <#list menu.listCategory as category>
                            <#if category_index < 4>
                                    <ul>
                                        <#list category.children as child>
                                            <#if child.id=category.id><h4>${child.name}</h4>
                                            <#else>
                                            <li><a href="/catalog/${child.id}">${child.name}</a></li>
                                            </#if>
                                        </#list>
                                    </ul>

                            </#if>
                        </#list>
                    </div>
                    </#if>
                    <#if menu.trends?has_content>
                        <div class="col1 me-one">
                            <h4>Trands</h4>
                            <ul class="trends">
                                <#list menu.trends as trend>
                                    <li>
                                        <img src="/resources${trend.imageUrl}" class="img-responsive" alt=""/>
                                        <h4><a href="/good/${trend.id}">${trend.name}</a></h4>
                                        <span class="item-cat"><small><a href="/catalog/${trend.category.id}">${trend.category.name}</a></small></span>
                                        <span class="price">${trend.price?number} $</span>
                                        <div class="clearfix"> </div>
                                    </li>
                                </#list>
                            </ul>
                        </div>
                    </#if>
                </div>
            </div>
            </#if>
        </li>
        </#list>
    </ul>
        </div>
        <div class="cart box_1">
            <a href="/cart">
                <img src="/resources/images/shop_cart.gif" class="img-responsive"/>
            </a>
            <div class="clearfix"> </div>
        </div>
        <div class="reg-right">
        <ul class="header_user_info">
        <#-- Если пользователь еще не авторизован, предлагаем ему авторизоваться, либо зарегистрироваться на сайте -->
        <@sec.authorize ifAnyGranted="ROLE_ANONYMOUS">
            <a class="login" href="/login">Login</a> |
            <a class="login" href="/reg">Registration</a>
        </@sec.authorize>
        <#-- Если уже авторизован, то ссылки в личный кабинет и на выход -->
        <@sec.authorize access="isAuthenticated()">
            <a class="login" href="/cabinet">
                <#-- principal - это фактически экземпляр объекта MyUserDetail -->
                        <@sec.authentication property="principal.username" />
                        <#--<@sec.authentication property="principal.userInfo.fio" />-->
            </a> |
            <a class="login" href="/logout">
                Logout
            </a>
        </@sec.authorize>
            <div class="clearfix"></div>
        </ul>
            </div>


    </div>

