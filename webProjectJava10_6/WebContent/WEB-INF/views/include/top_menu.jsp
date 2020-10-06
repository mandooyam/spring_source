<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath }/" />

<!-- ��� �޴� �κ� -->
<nav class="navbar navbar-expand-md bg-dark navbar-dark fixed-top shadow-lg">
	<a class="navbar-brand" href="${root }main">KMOVE1</a>
<button class="navbar-toggler" type="button" data-toggle="collapse"
        data-target="#navMenu">
	<span class="navbar-toggler-icon"></span>        
</button>
	<ul class="navbar-nav ml-auto">
		<c:choose>
			<c:when test="${loginUserBean.userLogin == true }">
				<li class="nav-item">
					<a href="${root }user/modify" class="nav-link">��������</a>
				</li>
				<li class="nav-item">
					<a href="${root }user/logout" class="nav-link">�α׾ƿ�</a>
				</li>
			</c:when>
			<c:otherwise>
				<li class="nav-item">
					<a href="${root }user/login" class="nav-link">�α���</a>
				</li>
				<li class="nav-item">
					<a href="${root }user/join" class="nav-link">ȸ������</a>
				</li>
			</c:otherwise>
		</c:choose>
			
			
		</ul>
	</div>
</nav>