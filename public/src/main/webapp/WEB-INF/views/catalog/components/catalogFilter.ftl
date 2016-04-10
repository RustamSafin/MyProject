<#macro m_filter catalogFilter>
<#-- @ftlvariable name="catalogFilter" type="com.springapp.mvc.common.catalog.CatalogFilterInfo" -->
<div class="rsidebar span_1_of_left">
    <section  class="sky-form">
        <div class="product_right">
            <form name="search" method="get" action="">
            <div class="tab1">
                <ul class="place">
                    <li class="sort"><h4 class="m_2"><span class="glyphicon glyphicon-minus" aria-hidden="true"></span>Categories</h4></li>
                    <li class="by"><img src="/resources/images/do.png" alt=""></li>
                    <div class="clearfix"> </div>
                </ul>
                <div class="single-bottom">
                    <ul>
                        <#list catalogFilter.categories as category>
                            <#list category.children as child>
                                <#if child.id!=category.id>
                                    <li class="cat-item cat-item-${category.id}"><input type="checkbox" name="category"/> ${child.name}</li>
                                </#if>
                            </#list>
                        </#list>
                    </ul>
                </div>
            </div>
            <div class="tab2">
                <ul class="place">
                    <li class="sort"><h4 class="m_2"><span class="glyphicon glyphicon-minus" aria-hidden="true"></span>Brands</h4></li>
                    <li class="by"><img src="/resources/images/do.png" alt=""></li>
                    <div class="clearfix"> </div>
                </ul>
                <div class="single-bottom">
                    <ul>
                        <#list catalogFilter.brands as brand>
                            <li class="cat-item cat-item-"><input type="checkbox" name="brand"/> ${brand}</li>
                        </#list>
                    </ul>
                </div>
            </div>
            <div class="tab3">
                <ul class="place">
                    <li class="sort"><h4 class="m_2"><span class="glyphicon glyphicon-minus" aria-hidden="true"></span>Size</h4></li>
                    <li class="by"><img src="/resources/images/do.png" alt=""></li>
                    <div class="clearfix"> </div>
                </ul>
                <div class="single-bottom">
                   <ul>
                       <#list catalogFilter.sizes as size>
                           <li class="cat-item cat-item-${size.id}"><input type="checkbox" name="size"/> ${size.name}</li>
                       </#list>
                   </ul>
                </div>
            </div>
            <div class="tab4">
                <ul class="place">
                    <li class="sort"><h4 class="m_2"><span class="glyphicon glyphicon-minus" aria-hidden="true"></span>Price</li>
                    <li class="by"><img src="/resources/images/do.png" alt=""></li>
                    <div class="clearfix"> </div>
                </ul>
                <div class="single-bottom">
                        <ul>
                            <li><input type="number" name="min" value="0">$</li>
                            <li><input type="number" name="max" value="800">$</li>
                        </ul>
                </div>
            </div>
                <input type="submit" class="button" value="Find"/>
            </form>
            <!---->
            <script type="text/javascript" src="/resources/js/jquery-ui.min.js"></script>
            <link rel="stylesheet" type="text/css" href="/resources/css/jquery-ui.css">
            <script type='text/javascript'>//<![CDATA[
            $(window).load(function(){
                $( "#slider-range" ).slider({
                    range: true,
                    min: 0,
                    max: 100000,
                    values: [ 500, 100000 ],
                    slide: function( event, ui ) {  $( "#amount" ).val( "$" + ui.values[ 0 ] + " - $" + ui.values[ 1 ] );
                    }
                });
                $( "#amount" ).val( "$" + $( "#slider-range" ).slider( "values", 0 ) + " - $" + $( "#slider-range" ).slider( "values", 1 ) );

            });//]]>
            </script>
            <!---->

            <!--script-->
            <script>
                $(document).ready(function(){
                    $(".tab1 .single-bottom").hide();
                    $(".tab2 .single-bottom").hide();
                    $(".tab3 .single-bottom").hide();
                    $(".tab4 .single-bottom").hide();
                    $(".tab1 ul").click(function(){
                        $(".tab1 .single-bottom").slideToggle(300);
                    })
                    $(".tab2 ul").click(function(){
                        $(".tab2 .single-bottom").slideToggle(300);
                    })
                    $(".tab3 ul").click(function(){
                        $(".tab3 .single-bottom").slideToggle(300);

                    })
                    $(".tab4 ul").click(function(){
                        $(".tab4 .single-bottom").slideToggle(300);
                    })
                });
            </script>
            <!-- script -->
    </section>
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