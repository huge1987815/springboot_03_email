<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- 写一个变量引入参数值 -->
<c:set var="path" value="${pageContext.request.contextPath}" scope="page"/>
<!-- 引入css样式 -->
<link rel="stylesheet" type="text/css" href="${path}/css/index.css"/>
<!-- 引入jquery插件 -->
<script type="text/javascript" src="${path}/jquery/jquery-3.2.1.js"></script>
<!-- 引入日期插件 -->
<script type="text/javascript" src="${path}/My97DatePicker/WdatePicker.js"></script>
</head>
<body>
   <h1>修改员工信息</h1>
   <hr>
   <form>
      <input type="hidden" name="eid" id="eid" value="${eid}"/>      
      <table>
         <tr>
            <td>员工姓名</td>
            <td><input type="text" name="ename" id="ename"/></td>
         </tr>         
         <tr>
            <td>性别</td>
            <td>
              <input type="radio" name="sex" value="男"/>男
              <input type="radio" name="sex" value="女"/>女
            </td>
         </tr>         
         <tr>
            <td>出生日期</td>
            <td><input type="text" name="birthdate" id="birthdate" onclick="WdatePicker()"/></td>
         </tr>         
         <tr>
            <td>部门</td>
            <td>
              <select name="did" id="did">
                 <option value="-1">请选择部门</option>
              </select>
            </td>
         </tr>         
         <tr>            
            <td colspan="2"><input type="button" value="添加" onclick="updateEmp()"/></td>
         </tr>         
      </table>
   </form>
</body>
<script type="text/javascript">
//部门下拉框
$.post("${path}/getDept.do",{},function(obj){
	for(var i=0;i<obj.length;i++){
		$("#did").append("<option value='"+obj[i].did+"'>"+obj[i].dname+"</option>");
	}
},"json");

//回显员工信息
$.post("${path}/getEmp.do",{eid:$("#eid").val()},function(obj){
	//日期对象
	var date=new Date(obj.birthdate);
	$("#ename").val(obj.ename);
	$("input[value='"+obj.sex+"']").attr({"checked":true});
	$("#birthdate").val(date.getFullYear()+"-"+date.getMonth()+"-"+date.getDate());
	$("#did option[value='"+obj.did+"']").attr({"selected":true});
},"json");

//修改员工信息
function updateEmp(){
	$.post("${path}/updateEmp.do",$("form").serialize(),function(obj){
		if(obj){
			alert("修改成功!");
			location.href="${path}/list.do";
		}else{
			alert("修改失败!");			
		}
	},"json");
}

</script>
</html>