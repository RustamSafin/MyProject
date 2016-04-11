<#-- @ftlvariable name="goods" type="java.util.List<com.springapp.mvc.common.GoodInfo>" -->
<#include "../template/template.ftl">
<@mainTemplate title="Каталог товаров" styles=["css/own/catalog.css"]
               scripts=["js/own/catalog.js"] headerBannerClass="men_banner" />
<#macro m_body>
<div class="product-model">
    <div class="container">

        <#include "components/catalogBreamcrub.ftl" />
        <h2>Our Products</h2>
        <div class="sort" align="right">
            <div class="sort-by">
                <label>Sort By</label>
                <button class="js_Sort" data-sort="name">Name</button>
                <button class="js_Sort" data-sort="price">Price</button>
                <button class="js_Sort" data-sort="price Desc">Price DESC</button>
            </div>
        </div>
        <div>
            <#include "components/catalogFilter.ftl" />
            <@m_filter catalogFilter=catalogFilter />
        </div>
        <div class="col-md-9 product-model-sec">
            <#include "components/goodItem.ftl">
            <div class="goods">
                <ul id="goodList">
                    <#list goods as good>
                      <@goodItem good=good itemClass=((good_index+1)%3==0)?string("last", "") />
                    </#list>
                </ul>
            </div>
            <#if limit < goodsCount && !id?has_content>
            <div id="showMore" class="col-md-9 product-model-sec show-more-button" data-page="${page+1}" data-limit="${limit}">
                Показать еще (<span id="limit">${limit}</span>) из <span id="goodsCount">${goodsCount-limit}</span>
            </div>
            </#if>
        </div>
    </div>
            <#--<div id="cbp-vm" class="cbp-vm-switcher cbp-vm-view-grid">-->
                <#--<#include "components/catalogShowType.ftl" />-->
            <#--</div>-->
</div>



</#macro>