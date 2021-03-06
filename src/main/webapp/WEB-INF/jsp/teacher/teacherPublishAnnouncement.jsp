<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>发布公告</title>
<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<jsp:include page="_teacher.jsp" />
	</div>
	
	<div class="right_col" role="main" style="height:800px">
		<div class="row">
			<div class="col-md-8">
				<!-- <h4>发布公告</h4> -->
				<ul class="list-inline">
					<li>公告管理</li>
					<li>/</li>
					<li>发布公告</li>
				</ul>
				<form role="form" class="form-horizontal" action="${pageContext.request.contextPath}/teacher/publishAnnouncement" method="post">
					<div class="form-group">
						<textarea class="form-control" placeholder="公告内容" id="announcement" name="announcement" placeholder="公告内容..."></textarea>
					</div>
					
					<div class="form-group">
						<div class="row">

							<div class="col-sm-5"></div>
							<button type="submit" class="btn btn-primary col-sm-2">发布</button>
						</div>
					</div>
				</form>
				
			</div>
		</div>
	</div>
</body>
</html>