<#-- @ftlvariable name="topGoods" type="java.util.List<com.springapp.mvc.common.GoodInfo>" -->
<#include "../template/template.ftl">
<@mainTemplate title="Главная" />
<#macro m_body>
<script src="/resources/js/responsiveslides.min.js"></script>
<script>
    $(function () {
        $("#slider").responsiveSlides({
            auto: true,
            nav: true,
            speed: 500,
            namespace: "callbacks",
            pager: false,
        });
    });
</script>
<div class="slider">
    <div class="callbacks_container">
        <ul class="rslides" id="slider">
            <li>
                <div class="banner1">
                    <div class="banner-info">
                        <h3>Morbi lacus hendrerit efficitur.</h3>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. consectetur adipiscing elit. consectetur adipiscing elit.</p>
                    </div>
                </div>
            </li>
            <li>
                <div class="banner2">
                    <div class="banner-info">
                        <h3>Phasellus elementum tincidunt.</h3>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. consectetur adipiscing elit. consectetur adipiscing elit.</p>
                    </div>
                </div>
            </li>
            <li>
                <div class="banner3">
                    <div class="banner-info">
                        <h3>Maecenas interposuere volutpat.</h3>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. consectetur adipiscing elit. consectetur adipiscing elit.</p>
                    </div>
                </div>
            </li>
        </ul>
    </div>
</div>
<script src="/resources/js/bootstrap.js"> </script>
<div class="items">
    <div class="container">
    <div class="items-sec">
    <#list topGoods as topGood>
            <div class="col-md-3 feature-grid">
                <a href="good/${topGood.id}"><img src="/resources/${topGood.imageUrl}" alt=""/>
                    <div class="arrival-info">
                        <h4>${topGood.name}</h4>
                        <p>${topGood.id}</p>
                        <span class="pric1">${topGood.price}$</span>
                        <span class="disc">${topGood.description}</span>
                    </div>
                    <div class="viw">
                        <a href="/good/${topGood.id}"><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>View</a>
                    </div>
                </a>
            </div>

    </#list>
        <div class="clearfix"></div>
    </div>
    </div>
</div>

<div class="offers">
    <div class="container">
        <h3>Most popular</h3>
        <div class="offer-grids">
            <div class="col-md-6 grid-left">
                <a href="/good/${topGoods[3].id}"><div class="offer-grid1">
                    <div class="ofr-pic-info2">
                        <h4>${topGoods[3].name}</h4>
                        <span>${topGoods[3].id}</span>
                        <h5>${topGoods[3].description}</h5>
                        <p href="/good/${topGoods[3].id}">Shop Now</p>
                    </div>
                    <div class="ofr-pic2">
                        <img src="/resources/${topGoods[3].imageUrl}" class="img-responsive" alt=""/>
                    </div>
                    <div class="clearfix"></div>
                </div></a>
            </div>
            <div class="col-md-6 grid-right">
                <a href="/good/${topGoods[2].id}"><div class="offer-grid1">
                    <div class="ofr-pic-info2">
                        <h4>${topGoods[2].name}</h4>
                        <span>${topGoods[2].id}</span>
                        <h5>${topGoods[2].description}</h5>
                        <p href="/good/${topGoods[2].id}">Shop Now</p>
                    </div>
                    <div class="ofr-pic">
                        <img src="/resources/${topGoods[2].imageUrl}" class="img-responsive" alt=""/>
                    </div>
                    <div class="clearfix"></div>
                </div></a>
            </div>
            <div class="clearfix"></div>
        </div>
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