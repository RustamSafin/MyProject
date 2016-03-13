<#include "../template/mainTemplate.ftl">
<@mainTemplate title="Главная" styles=["css/style.css"] scripts=["js/script.js"]/>
<#macro m_body>
    <h2>${message}</h2>

    <a href="/test/catalog">Главная страница каталога</a><br><br>

    Catalog page 1 : <a href="/test/catalog/1" class="red_link">link</a><br>
    Catalog page 2 : <a href="/test/catalog/2?page=3&limit=4" class="red_link">link</a><br><br>

    <button onclick="func()">Клик</button><br><br>

    <a href="/test/freemarker">FreeMarker Test</a>
</#macro>