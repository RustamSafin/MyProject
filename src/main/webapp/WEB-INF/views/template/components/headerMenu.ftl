<#-- @ftlvariable name="listMenu" type="java.util.List<com.springapp.mvc.common.MenuInfo>" -->
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
                        <#list menu.listCategory as category><#if category_index < 2>
                    <div class="col1 me-one">
                        <h4>Shop</h4>
                        <ul>
                            <#list category.children as child>
                                <li><a href="/catalog/${child.id}">${child.name}</a></li>
                            </#list>
                        </ul>
                    </div>
                        </#if></#list>
                    </#if>
                    <#if menu.trends?has_content>
                    <div class="col1 me-one">
                        <h4>Trands</h4>
                        <ul>
                            <#list menu.trends as trend>
                                <li>
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
        <div class="total">
            <span class="simpleCart_total"></span> (<span id="simpleCart_quantity" class="simpleCart_quantity"></span>)</div>
        <span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span>
    </a>
    <p><a href="javascript:;" class="simpleCart_empty">Empty Cart</a></p>
    <div class="clearfix"> </div>
</div>
    </div>
<div class="clearfix"></div>
</div>

