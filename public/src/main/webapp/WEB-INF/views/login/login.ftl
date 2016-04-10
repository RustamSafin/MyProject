<#include "../template/template.ftl">
<@mainTemplate title="Авторизация" />
<#macro m_body>

<div class="login_sec">
    <div class="container">
        <ol class="breadcrumb">
            <li><a href="/">Home</a></li>
            <li class="active">Login</li>
        </ol>
    <h2>Login</h2>
    <div class="col-md-6 log">
        <#if error?has_content>
            <div style="color: red;">Error! Please, check your email and password!</div>
        </#if>
        <p>Welcome, please enter the folling to continue.</p>
        <form name="authForm" id="authForm" action="/j_spring_security_check" method="post">
            <div>
                <h5>Email*</h5>
                <input type="text" name="j_username" />
            </div>
            <div>
                <h5 class="pass">Password*</h5>
                <input type="password" name="j_password" />
            </div>
            <div>
                <input id="remember_me" name="_spring_security_remember_me" type="checkbox"/>
                <label for="remember_me" class="inline">Remember me</label>
            </div>
            <input type="submit" value="Login" />
            <a href="/reg" style="margin-left: 15px;">Create an account</a>
        </form>
    </div>
    <div class="clearfix"></div>
        </div>
</div>
<!---->
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