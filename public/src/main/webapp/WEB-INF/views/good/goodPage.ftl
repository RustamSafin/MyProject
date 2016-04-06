<#-- @ftlvariable name="good" type="com.springapp.mvc.common.GoodInfo" -->
<#include "../template/template.ftl">
<@mainTemplate title="Корзина" styles=["css/own/catalog.css"]
scripts=["js/own/catalog.js"]/>
<#macro m_body>
<div class="product">
    <div class="container">
        <#if good?has_content>
            <div class="product-price1">
                <div class="top-sing">
                    <div class="col-md-7 single-top">
                        <img src="/resources/${good.imageUrl}" data-imagezoom="true" class="img-responsive" alt=""/> </div>
                    <script src="/resources/js/imagezoom.js"></script>
                </div>
                <div class="col-md-5 single-top-in simpleCart_shelfItem">
                    <div class="single-para ">
                        <h4>${good.name}</h4>
                        <h5 class="item_price">${good.price} $</h5>
                        <p class="para">${good.description} </p>
                        <div class="prdt-info-grid">
                            <ul>
                                <li>- Category : ${good.category.id} ${good.category.name} ${(good.category.children![])?size} </li>
                                <li>- Good Id: ${good.id}</li>
                                <li>- Color : Brown</li>
                                <li>- Material : Wood</li>
                            </ul>
                        </div>
                        <a class="button item_add cbp-vm-icon cbp-vm-add js_addToCart" data-id="${good.id}" href="/cart">ADD TO CART</a>
                    </div>
                </div>
                <div class="clearfix"> </div>
            </div>
        </div>
        <#else>
            Извините, но у нас нет товара с id = ${id} :(
        </#if>
    </div>
</div>
<!---->
<div class="subscribe">
    <div class="container">
        <h3>Newsletter</h3>
        <form>
            <input type="text" class="text" value="Email" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Email';}">
            <input type="submit" value="Subscribe">
        </form>
    </div>
</div>
</#macro>


<#--<#if good?has_content>-->
<#--Good id = ${good.id}<br>-->
<#--Good name = ${good.name}<br>-->
<#--Good description = ${good.description}<br>-->
<#--Good category = ${good.category.id} ${good.category.name} ${(good.category.children![])?size}<br>-->
<#--Good imageUrl = ${good.imageUrl}<br>-->
<#--Good price = ${good.price}<br>-->
<#--<#else>-->
<#--Извините, но у нас нет товара с id = ${id} :(-->
<#--</#if>-->