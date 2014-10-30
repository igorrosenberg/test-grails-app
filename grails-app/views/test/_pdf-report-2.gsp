<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
 "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
<head>
<style  type="text/css">
  @page {
    size: 210mm 297mm;
  }
div {margin-left: 50px;}
</style>
</head>
<body>
<div>
<H1>
	TITLE 1
</H1>

<div>
	XML first node is : ${xml.name()}
</div>
MORE : 
<div>
	<g:each in="${xml.depthFirst()}" var="xmlNode">
		<p>
			<b> (name) ${xmlNode.name()}</b>
			<g:if test="${xmlNode.children().isEmpty()}">
				<i> (text) ${xmlNode.text()}</i>
			</g:if>

		</p>
	</g:each>
</div>

</div>
 

</body>
</html>

