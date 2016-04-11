<#macro m_filter catalogFilter>
<#-- @ftlvariable name="catalogFilter" type="com.springapp.mvc.common.catalog.CatalogFilterInfo" -->
<div class="rsidebar span_1_of_left">
<#--<script src="/resources/js/own/catalog.js"></script>-->
            <form name="search" method="post" action="">
                <section  class="sky-form">
                    <h4><span class="glyphicon glyphicon-minus" aria-hidden="true"></span>Brands</h4>
                    <div class="clearfix"> </div>
                    <div>
                        <div class="col col-4">
                            <ul>
                                <#list catalogFilter.brands as brand>
                                    <input type="checkbox" class="js_Brand" value="${brand}">${brand}</input>
                                </#list>
                            </ul>
                        </div>
                    </div>
                </section>
                <section  class="sky-form">
                    <h4><span class="glyphicon glyphicon-minus" aria-hidden="true"></span>Sizes</h4>
                    <div class="clearfix"> </div>
                    <div>
                        <div class="col col-4">
                            <ul>
                            <#list catalogFilter.sizes as size>
                                <li><input type="checkbox" class="js_Size" value="${size.name}">${size.name}</input></li>
                            </#list>
                            </ul>
                        </div>
                    </div>
                </section>
                <section  class="sky-form">
                    <h4><span class="glyphicon glyphicon-minus" aria-hidden="true"></span>Price</h4>
                    <div class="clearfix"> </div>
                    <div>
                        <div class="col col-4">
                        <ul>
                            <li><input type="number" class="minPrice" value="0">$</li>
                            <li><input type="number" class="maxPrice" value="800">$</li>
                        </ul>
                        </div>
                    </div>
                </section>
                <button class="find" type="submit">Find</button>
            </form>
            <!---->
            <script type="text/javascript" src="/resources/js/jquery-ui.min.js"></script>
            <link rel="stylesheet" type="text/css" href="/resources/css/jquery-ui.css">
</div>

</#macro>
<#--<ul>-->
<#--<#list catalogFilter.prices as price>-->
<#--<li class="cat-item"><a href="#">${price.minPrice}$-${price.maxPrice}$</a> <span class="count">(${price.count})</span></li>-->
<#--</#list>-->
<#--</ul>-->
<#--<ul class="dropdown-menu1">-->
<#--<li><a href="">-->
<#--<div id="slider-range"></div>-->
<#--<input type="text" id="amount" style="border: 0; font-weight: NORMAL;   font-family: 'Dosis-Regular';" />-->
<#--</a></li>-->
<#--</ul>-->