<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
   <h1>添加员工信息</h1>
   <hr>
   <form>
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
            <td colspan="2"><input type="button" value="添加" onclick="addEmp()"/></td>
         </tr>         
      </table>
   </form>
</body>
<script type="text/javascript">
//跳转到添加员工页面
function addEmp(){
	location.href="${path}/toAddEmp.do";
}

//部门下拉框
$.post("${path}/getDept.do",{},function(obj){
	for(var i=0;i<obj.length;i++){
		$("#did").append("<option value='"+obj[i].did+"'>"+obj[i].dname+"</option>");
	}
},"json");

//添加员工信息
function addEmp(){
	$.post("${path}/addEmp.do",$("form").serialize(),function(obj){
		if(obj){
			alert("添加成功!");
			location.href="${path}/list.do";
		}else{
			alert("添加失败!");			
		}
	},"json");
}

</script>
</html>