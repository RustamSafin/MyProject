<#macro m_filter catalogFilter>
<#-- @ftlvariable name="catalogFilter" type="com.springapp.mvc.common.catalog.CatalogFilterInfo" -->
<div class="rsidebar span_1_of_left">
    <section  class="sky-form">
        <div class="product_right">

            <div class="tab1">
                <ul class="place">
                    <li class="sort"><h4 class="m_2"><span class="glyphicon glyphicon-minus" aria-hidden="true"></span>Categories</h4></li>
                    <li class="by"><img src="/resources/images/do.png" alt=""></li>
                    <div class="clearfix"> </div>
                </ul>
                <div class="single-bottom">
                    <ul>
                        <#list catalogFilter.categories as category>
                            <li class="cat-item cat-item-${category.id}"><a href="#">${category.name}</a> <span class="count">(${category.count})</span></li>
                        </#list>
                    </ul>
                </div>
            </div>
            <div class="tab2">
                <ul class="place">
                    <li class="sort"><h4 class="m_2"><span class="glyphicon glyphicon-minus" aria-hidden="true"></span>Colors</h4></li>
                    <li class="by"><img src="/resources/images/do.png" alt=""></li>
                    <div class="clearfix"> </div>
                </ul>
                <div class="single-bottom">
                    <ul>
                        <#list catalogFilter.colors as color>
                            <li class="cat-item cat-item-${color.id}"><a href="#">${color.name}</a> <span class="count">(${color.count})</span></li>
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
                           <li class="cat-item cat-item-${size.id}"><a href="#">${size.name}</a> <span class="count">(${size.count})</span></li>
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
                        <#list catalogFilter.prices as price>
                            <li class="cat-item"><a href="#">${price.minPrice}$-${price.maxPrice}$</a> <span class="count">(${price.count})</span></li>
                        </#list>
                    </ul>
                    <ul class="dropdown-menu1">
                        <li><a href="">
                            <div id="slider-range"></div>
                            <input type="text" id="amount" style="border: 0; font-weight: NORMAL;   font-family: 'Dosis-Regular';" />
                        </a></li>
                    </ul>
                </div>
            </div>
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