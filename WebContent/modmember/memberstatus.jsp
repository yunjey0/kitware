<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../container/header.jsp" %>
<script>
	var className = 'modmember';
	$('div#menutab li.'+className).addClass('active');
	console.log($('div#menutab li.'+className));
	$('ul#side-menu').find('li.' + className).show();
	
	
</script>    
<body>
<form action="addmember.jsp">
<button class="addmember">사원추가</button>
</form>
<form action="modmember.jsp">
<button class="modmember">사원정보수정</button>
</form>
    
   
    
    
</body>
    
    
    
    
<%@include file="../container/footer.jsp" %>