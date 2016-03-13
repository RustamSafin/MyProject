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
            <div class="col-md-3 feature-grid">
                <a href="product.html"><img src="/resources/images/img1.jpg" alt=""/>
                    <div class="arrival-info">
                        <h4>Lighting #1</h4>
                        <p>Rs 12000</p>
                        <span class="pric1"><del>Rs 18000</del></span>
                        <span class="disc">[12% Off]</span>
                    </div>
                    <div class="viw">
                        <a href="product.html"><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>View</a>
                    </div>
                </a>
            </div>
            <div class="col-md-3 feature-grid">
                <a href="product.html"><img src="/resources/images/img2.jpg" alt=""/>
                    <div class="arrival-info">
                        <h4>Lighting #1</h4>
                        <p>Rs 10000</p>
                        <span class="pric1"><del>Rs 14000</del></span>
                        <span class="disc">[14% Off]</span>
                    </div>
                    <div class="viw">
                        <a href="product.html"><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>View</a>
                    </div>
                </a>
            </div>
            <div class="col-md-3 feature-grid">
                <a href="product.html"><img src="/resources/images/img3.jpg" alt=""/>
                    <div class="arrival-info">
                        <h4>Lighting #1</h4>
                        <p>Rs 8500</p>
                        <span class="pric1"><del>Rs 9500</del></span>
                        <span class="disc">[10% Off]</span>
                    </div>
                    <div class="viw">
                        <a href="product.html"><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>View</a>
                    </div>
                </a>
            </div>
            <div class="col-md-3 feature-grid">
                <a href="product.html"><img src="/resources/images/img4.jpg" alt=""/>
                    <div class="arrival-info">
                        <h4>Lighting #1</h4>
                        <p>Rs 12000</p>
                        <span class="pric1"><del>Rs 18000</del></span>
                        <span class="disc">[12% Off]</span>
                    </div>
                    <div class="viw">
                        <a href="product.html"><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>View</a>
                    </div>
                </a>
            </div>
            <div class="clearfix"></div>
        </div>
        <div class="items-sec btm-sec">
            <div class="col-md-3 feature-grid">
                <a href="product.html"><img src="/resources/images/img5.jpg" alt=""/>
                    <div class="arrival-info">
                        <h4>Lighting #1</h4>
                        <p>Rs 500</p>
                        <span class="pric1"><del>Rs 650</del></span>
                        <span class="disc">[8% Off]</span>
                    </div>
                    <div class="viw">
                        <a href="product.html"><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>View</a>
                    </div>
                </a>
            </div>
            <div class="col-md-3 feature-grid">
                <a href="product.html"><img src="/resources/images/img8.jpg" alt=""/>
                    <div class="arrival-info">
                        <h4>Lighting #1</h4>
                        <p>Rs 400</p>
                        <span class="pric1"><del>Rs 750</del></span>
                        <span class="disc">[12% Off]</span>
                    </div>
                    <div class="viw">
                        <a href="product.html"><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>View</a>
                    </div>
                </a>
            </div>
            <div class="col-md-3 feature-grid">
                <a href="product.html"><img src="/resources/images/img7.jpg" alt=""/>
                    <div class="arrival-info">
                        <h4>Lighting #1</h4>
                        <p>Rs 800</p>
                        <span class="pric1"><del>Rs 1200</del></span>
                        <span class="disc">[12% Off]</span>
                    </div>
                    <div class="viw">
                        <a href="product.html"><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>View</a>
                    </div>
                </a>
            </div>
            <div class="col-md-3 feature-grid">
                <a href="product.html"><img src="/resources/images/img6.jpg" alt=""/>
                    <div class="arrival-info">
                        <h4>Lighting #1</h4>
                        <p>Rs 600</p>
                        <span class="pric1"><del>Rs 1200</del></span>
                        <span class="disc">[50% Off]</span>
                    </div>
                    <div class="viw">
                        <a href="product.html"><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>View</a>
                    </div>
                </a>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
</div>
<div class="offers">
    <div class="container">
        <h3>End of Season Sale</h3>
        <div class="offer-grids">
            <div class="col-md-6 grid-left">
                <a href="#"><div class="offer-grid1">
                    <div class="ofr-pic">
                        <img src="/resources/images/ofr2.jpeg" class="img-responsive" alt=""/>
                    </div>
                    <div class="ofr-pic-info">
                        <h4>Emergency Lights <br>& Led Bulds</h4>
                        <span>UP TO 60% OFF</span>
                        <p>Shop Now</p>
                    </div>
                    <div class="clearfix"></div>
                </div></a>
            </div>
            <div class="col-md-6 grid-right">
                <a href="#"><div class="offer-grid2">
                    <div class="ofr-pic-info2">
                        <h4>Flat Discount</h4>
                        <span>UP TO 30% OFF</span>
                        <h5>Outdoor Gate Lights</h5>
                        <p>Shop Now</p>
                    </div>
                    <div class="ofr-pic2">
                        <img src="/resources/images/ofr3.jpg" class="img-responsive" alt=""/>
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