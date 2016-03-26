<#macro mainTemplate title="Lights an E-Commerce online Shopping Category | Home" styles=[] scripts=[] headerBannerClass="banner" >
<!DOCTYPE HTML>
<html lang="ru">
<head>
    <title>${title}</title>
    <link href="/resources/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
    <!-- Custom Theme files -->
    <!--theme style-->
    <link href="/resources/css/style.css" rel="stylesheet" type="text/css" media="all" />
    <script src="/resources/js/jquery.min.js"></script>

    <!--//theme style-->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="Wedding Store Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <!-- start menu -->
    <script src="/resources/js/simpleCart.min.js"> </script>
    <!-- start menu -->
    <link href="/resources/css/memenu.css" rel="stylesheet" type="text/css" media="all" />
    <link href="/resources/css/form.css" rel="stylesheet" type="text/css" media="all" />
    <script type="text/javascript" src="/resources/js/memenu.js"></script>
    <script>$(document).ready(function(){$(".memenu").memenu();});</script>
    <#list styles as css>
    <link rel="stylesheet" href="/resources/${css}" type="text/css" />
    </#list>
    <#list scripts as js>
        <script src="/resources/${js}" type="text/javascript" defer></script>
    </#list>
</head>
<body>
    <#include "components/header.ftl" />
    <@m_body />
    <#include "components/footer.ftl" />
</body>
</html>
</#macro>