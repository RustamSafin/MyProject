<#-- @ftlvariable name="Session.cart" type="com.springapp.mvc.common.CartInfo" -->
<#include "../template/template.ftl">
<@mainTemplate title="Корзина" styles=["css/own/catalog.css"]
scripts=["js/own/cart.js"]/>
<#macro m_body>
<script src="/resources/js/jquery-ui.min.js"></script>
<script src="/resources/js/jquery.min.js"></script>
<div class="container">
    <div class="check-sec">
        <div class="col-md-3 cart-total">
            <a class="continue" href="#" onclick="window.history.back()">Continue to basket</a>
            <div class="price-details">
                <h3>Price Details</h3>
                <span>Total</span>
                <span class="total1">6200.00</span>
                <span>Discount</span>
                <span class="total1">No</span>
                <span>Delivery Charges</span>
                <span class="total1">150.00</span>
                <div class="clearfix"></div>
            </div>
            <ul class="total_price">
                <li class="last_price"> <h4>TOTAL</h4></li>
                <li class="last_price"><span>6150.00</span></li>
            </ul>
            <div class="clearfix"></div>
            <div class="clearfix"></div>
            <a class="order" href="/order">Place Order</a>
        </div>
        <div class="col-md-9 cart-items">
            <h1>Товары в корзине:</h1>
            <#if (fCart)?? && (fCart?size!=0)>
                <#list fCart?keys as goodId>
                <div class="cart-header ${goodId}">
                    <div class="close1" data-id="${goodId}"></div>
                    <div class="cart-sec simpleCart_shelfItem">
                        <div class="cart-item cyc">
                            <img src="/resources/${goodsInCart[goodId].imageUrl}" alt="" class="img-responsive">
                        </div>
                        <div class="cart-item-info">
                            <h3><a href="/good/${goodId}">Товар: ${goodsInCart[goodId].name}</a><span>Номер товара: ${goodId}</span></h3>
                            <ul class="qty">
                                <li>Количество:<input type="number" class="js_Change" data-id="${goodId}" value="${fCart[goodId]}" /></li>
                            </ul>
                            <div class="delivery">
                                <p>Price: ${goodsInCart[goodId].price} $</p>
                                <span>Delivered in 2-3 bussiness days</span>
                                <div class="clearfix"></div>
                            </div>
                        </div>
                        <div class="clearfix"></div>
                    </div>
                </div></#list>
            <#else>
                <h4>Ваша корзина пуста!</h4>
            </#if>
            </div>

            <div class="clearfix"> </div>
            </div>
</div>
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
<#--<#if (fCart)??>-->
<#--Товары в корзине:<br>-->
<#--<#list fCart?keys as goodId>-->
    <#--&lt;#&ndash;<button class="js_Change" data-id="${goodId}" data-count="${fCart.goods[goodId]-1}">-</button>&ndash;&gt;-->
    <#--товар: ${goodId}; кол-во: <input type="number" class="js_Change" data-id="${goodId}" value="${fCart[goodId]}" /><br>-->
    <#--&lt;#&ndash;<button class="js_Change" data-id="${goodId}" data-count="${fCart.goods[goodId]+1}">+</button><br>&ndash;&gt;-->
<#--</#list>-->
<#--<#else>-->
    <#--Ваша корзина пуста!-->
<#--</#if>-->
