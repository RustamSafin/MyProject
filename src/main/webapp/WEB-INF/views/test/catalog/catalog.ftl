<#-- @ftlvariable name="goods" type="java.util.List<com.springapp.mvc.common.GoodInfo>" -->
<#include "../template/mainTemplate.ftl">
<@mainTemplate title="Каталог" styles=["css/style.css"] scripts=["js/script.js"]/>

<#macro m_body>
    Page = ${page}
    Limit = ${limit!"null"}

    <#include "components/filters.ftl">
    <#include "components/sort.ftl">

    <#list goods as good>
        <#if !limit?? || good_index < limit>
        <pre>
        ${good_index})
            ID: ${good.id}
            Название товара: ${good.name}
            ID категории: ${good.category.id}
            цена: ${good.price?number}
        </pre>
        </#if>
    </#list>
</#macro>