<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link rel="stylesheet" href="<c:url value="/webjars/jquery-ui/1.13.0/jquery-ui.css" />" />
<script type="text/javascript" src="<c:url value="/webjars/jquery/3.6.0/dist/jquery.js" />"></script>
<script type="text/javascript" src="<c:url value="/webjars/jquery-ui/1.13.0/jquery-ui.js" />"></script>
<script type="text/javascript">
$( function() {
    $( "#tags" ).autocomplete({
      source: 'autocomplete_data',
	  minLength : 2,
 	  delay    :500,

	  select : function(event, ui) {
		alert(ui.item.value + '가 리턴됨');
	  }
    });
});
  </script>
</head>
<body>
 
<div class="ui-widget">
  <label for="tags">Tags: </label>
  <input id="tags">
</div>
 
 
</body>
</html>