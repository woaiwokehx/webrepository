<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="js/jquery-3.3.1.js"></script>
</head>
<body>
	<select id="opt">
	
	</select>
	
	<script type="text/javascript">
		var dog = {name:"小黄",age:5};//json对象
		var dogs = [
				{name:"小黄1",age:5},
				{name:"小黄2",age:5},
				{name:"小黄3",age:5},
				{name:"小黄4",age:5}
					];
		$(dogs).each(function(i,item) {
			$("#opt").append("<option>"+item.name+"</option>");
		})
	</script>

</body>
</html>