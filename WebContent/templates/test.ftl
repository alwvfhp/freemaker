Your name is ${user}!
Url : ${latestProduct.url}!
name : ${latestProduct.name}!

<#--
<#assign x=1>

���ǵ�һ����:${x}

<#assign x=x+5>

���ǵڶ�����:${x}

<#if x &gt; 2>
    x is larger than 2
    <#if x &lt; 10>
    	that's greater
    </#if>
    x's value is ${x}
</#if>

<#if user == "alwv" > Welcome our admin

<#else> I'am sorry

</#if>

<#switch user>
	<#case "alwv">your are my adminer 
	<#break>
	<#default> welcome!
	<#break>
</#switch>

<#assign money=["1","2","5","10"]>
<#compress>
<#list money as iter>

	<#if iter_index % 2 == 0>
	ż��:${iter}
	<#else>                  
	����:${iter}
	</#if>
</#list>
</#compress>

<#assign x=4>

<#list 1..x as iter>
	${iter}
</#list>

<#assign x=-3>

<#list 1..x as iter>
	${iter}
</#list>

<#import "data.ftl" as my>

${my.value}
<#include "tail.ftl">

-->
<#compress>
<#escape x as x?html>
	First name : ${firstname}
	Last  name : ${lastname}
	Maidenname : ${maidenname}
</#escape>
</#compress>
