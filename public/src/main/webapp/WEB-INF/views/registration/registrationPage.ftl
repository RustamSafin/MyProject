<#assign form=JspTaglibs["http://www.springframework.org/tags/form"]>
<#include "../template/template.ftl">
<@mainTemplate title="Регистрация" />
<#macro m_body>
<div class="login_sec">
    <div class="container">
        <ol class="breadcrumb">
            <li><a href="/">Home</a></li>
            <li class="active">Registration</li>
        </ol>
        <div class="col-md-6 log">
        <@form.form commandName="regForm" action="/reg" acceptCharset="UTF-8" method="post">
            <div class="register-top-grid">
                <h2>PERSONAL INFORMATION</h2>
                <#--<@form.errors path="*" cssStyle="color: red;" />-->
                <div>
                    <span>FIO<label>*</label></span>
                    <@form.input path="fio" />
                    <@form.errors path="fio" cssStyle="color: red;" />
                </div>
                <div>
                    <span>Login<label>*</label></span>
                    <@form.input path="login" />
                    <@form.errors path="login" cssStyle="color: red;" />
                </div>
                <div class="clearfix"> </div>
            </div>
            <div class="register-bottom-grid">
                <h2>LOGIN INFORMATION</h2>
                <div>
                    <span>Password<label>*</label></span>
                    <@form.password path="password" />
                    <@form.errors path="password" cssStyle="color: red;" />
                </div>
                <div>
                    <span>Confirm Password<label>*</label></span>
                    <@form.password path="confirmPassword" />
                    <@form.errors path="confirmPassword" cssStyle="color: red;" />
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