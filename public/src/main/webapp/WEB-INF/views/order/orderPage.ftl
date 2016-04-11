<#assign form=JspTaglibs["http://www.springframework.org/tags/form"]>
<#include "../template/template.ftl">
<@mainTemplate title="Заказ" />
<#macro m_body>
<div class="login_sec">
    <div class="container">
        <ol class="breadcrumb">
            <li><a href="/cart">Cart</a></li>
            <li class="active">Order</li>
        </ol>
        <div class="col-md-6 log">
            <@form.form commandName="orderForm" action="/order" acceptCharset="UTF-8" method="post">
                <div class="register-top-grid">
                    <h2>PERSONAL INFORMATION</h2>
                <#--<@form.errors path="*" cssStyle="color: red;" />-->
                    <div>
                        <span>First name<label>*</label></span>
                        <@form.input path="firstName" />
                        <@form.errors path="firstName" cssStyle="color: red;" />
                    </div>
                    <div>
                        <span>Last name<label>*</label></span>
                        <@form.input path="lastName" />
                        <@form.errors path="lastName" cssStyle="color: red;" />
                    </div>
                    <div>
                        <span>Phone<label>*</label></span>
                        <@form.input path="phone" />
                        <@form.errors path="phone" cssStyle="color: red;" />
                    </div>
                    <div>
                        <span>Email<label>*</label></span>
                        <@form.input path="email" />
                        <@form.errors path="email" cssStyle="color: red;" />
                    </div>
                    <div class="clearfix"> </div>
                </div>
                <div class="register-bottom-grid">
                    <h2>ORDER DESTINATION INFORMATION</h2>
                    <div>
                        <span>Address<label>*</label></span>
                        <@form.input path="address" />
                        <@form.errors path="address" cssStyle="color: red;" />
                    </div>
                    <div class="clearfix"> </div>
                </div>
                <div class="clearfix"> </div>
                <div class="register-but">
                    <input type="submit" value="submit" class="btn btn-default">
                    <div class="clearfix"> </div>
                </div>
            </@form.form>
        </div>
    </div>
</div>
</#macro>