Страница в работе!
<br><br>
<#if (Session.cart.goods)??>
Товары в корзине:<br>
<#list Session.cart.goods?keys as goodId>
    <#--<button class="js_Change" data-id="${goodId}" data-count="${fCart.goods[goodId]-1}">-</button>-->
    товар: ${goodId}; кол-во: <input type="text" class="js_Change" data-id="${goodId}" data-count="${fCart.goods[goodId]}">
    <#--<button class="js_Change" data-id="${goodId}" data-count="${fCart.goods[goodId]+1}">+</button><br>-->
</#list>
<#else>
    Ваша корзина пуста!
</#if>