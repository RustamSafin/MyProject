<#--@ftlvariable name="good" type="com.springapp.mvc.common.GoodInfo"-->
<#macro goodItem good itemClass="">
<script src="/resources/js/jquery-ui.min.js"></script>
<script src="/resources/js/jquery.min.js"></script>
<li >
    <a href="/good/${good.id}">
        <div class="product-grid">

            <div class="product-img b-link-stripe b-animate-go  thickbox">
            <#--<img src="/resources/images/p3.jpg" class="img-responsive" alt=""/>-->
                <img src="/resources${good.imageUrl!"/images/p3.jpg"}" alt="" class="img-responsive">
                <div class="b-wrapper">
                    <h4 class="b-animate b-from-left  b-delay03">
                        <button class="info js_goodDetail" data-id="${good.id}"><span class="glyphicon glyphicon-zoom-in" aria-hidden="true"></span>Quick View</button>
                    </h4>
                </div>
            </div>
    </a>
<div class="product-info simpleCart_shelfItem ${itemClass}">
     <div class="product-info-cust prt_name">
         <h4>${good.name!}</h4>
         <p>${(good.category.name)!}</p>
         <span class="price mount item_price">$${good.price?number}.00</span>
         <ul>
         <a class="button item_add cbp-vm-icon cbp-vm-add js_addToCart" data-id="${good.id}" href="/cart">Add to cart</a>
         </ul>
     </div>
</div>

</li>
</#macro>