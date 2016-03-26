<#-- @ftlvariable name="Session.cart" type="com.springapp.mvc.common.CartInfo" -->
<#include "../template/template.ftl">
<@mainTemplate title="Корзина" styles=[]
scripts=["js/own/cart.js"]/>
<#macro m_body>
<script src="/resources/js/jquery-ui.min.js"></script>
<script src="/resources/js/jquery.min.js"></script>
<div class="container">
    <div class="check-sec">
        <div class="col-md-3 cart-total">
            <a class="continue" href="/{">Continue to basket</a>
            <div class="price-details">
                <h3>Price Details</h3>
                <span>Total</span>
                <span class="total1">6200.00</span>
                <span>Discount</span>
                <span class="total1">10%(Festival Offer)</span>
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
            <a class="order" href="#">Place Order</a>
            <div class="total-item">
                <h3>OPTIONS</h3>
                <h4>COUPONS</h4>
                <a class="cpns" href="#">Apply Coupons</a>
            </div>
        </div>
        <div class="col-md-9 cart-items">
            <h1>Товары в корзине:</h1>
            <#if (fCart)?? && (fCart?size!=0)>
                <#list fCart?keys as goodId>
                <div class="cart-header ${goodId}">
                    <div class="close1" data-id="${goodId}"> </div>
                    <div class="cart-sec simpleCart_shelfItem">
                        <div class="cart-item cyc">
                            <img src="/resources/images/p4.jpg" }" alt="" class="img-responsive">
                        </div>
                        <div class="cart-item-info">
                            <h3><a href="single.html">Товар ${goodId}</a><span>Model No: RL-5511S</span></h3>
                            <ul class="qty">
                                <li>Количество:<input type="number" class="js_Change" data-id="${goodId}" value="${fCart[goodId]}" /></li>
                            </ul>
                            <div class="delivery">
                                <p>Service Charges : Rs.100.00</p>
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
