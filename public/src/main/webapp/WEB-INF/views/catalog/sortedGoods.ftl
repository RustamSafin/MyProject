<#include "components/goodItem.ftl">
<ul id="goodList">
  <#list goods as good>
    <@goodItem good=good itemClass=((good_index+1)%3==0)?string("last", "") />
  </#list>
</ul>