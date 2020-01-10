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
   <h1>员工信息展示</h1>
   <form action="${path}/list.do" method="post">
      <input type="hidden" name="pageNum" id="pageNum"/>
      员工姓名:<input type="text" name="ename" id="ename" value="${ename}"/>
      出生日期:<input type="text" name="begin" id="begin" value="${begin}" onclick="WdatePicker()"/>
      <input type="text" name="end" id="end" value="${end}" onclick="WdatePicker()"/>
      <input type="submit" value="搜索"/>
   </form>
   <hr>
   <table>
      <tr>
        <th><input type="checkbox" name="checkAll"/></th>
        <th>员工姓名</th>
        <th>性别</th>
        <th>出生日期</th>
        <th>部门名称</th>
        <th><input type="button" value="添加" onclick="addEmp()"/></th>
      </tr>
      <c:forEach items="${page.list}" var="e">
          <tr>
	         <td><input type="checkbox" name="eid" value="${e.eid}"/></td>
	         <td>${e.ename}</td>
	         <td>${e.sex}</td>
	         <td>${e.birthdate}</td>
	         <td>${e.dept.dname}</td>
	         <td>
	           <input type="button" value="修改" onclick="updateEmp(${e.eid})"/>
	           <input type="button" value="删除" onclick="deleteEmp(${e.eid})"/>
	         </td>
          </tr>
      </c:forEach>     
      <tr>
         <td colspan="7">
           当前第${page.pageNum}/${page.pages}页，共${page.total}条记录
           <a href="javascript:fy(${1})"><input type="button" value="首页"/></a>
           <a href="javascript:fy(${page.isFirstPage?page.pageNum:page.prePage})"><input type="button" value="上一页"/></a>
           <a href="javascript:fy(${page.isLastPage?page.pages:page.nextPage})"><input type="button" value="下一页"/></a>
           <a href="javascript:fy(${page.pages})"><input type="button" value="尾页"/></a>
         </td>
      </tr> 
   </table>
</body>
<script type="text/javascript">
//删除员工信息
function deleteEmp(eid){
	if(confirm("你确定要删除吗?")){
		$.post("${path}/deleteEmp.do",{eid:eid},function(obj){
			if(obj){
				alert("删除成功!");
				location.href="${path}/list.do";
			}else{
				alert("删除失败!");			
			}
		},"json");
	}
}

//跳转到修改员工页面
function updateEmp(eid){
	location.href="${path}/toUpdateEmp.do?eid="+eid;
}

//跳转到添加员工页面
function addEmp(){
	location.href="${path}/toAddEmp.do";
}

//实现分页
function fy(pageNum){
    $("#pageNum").val(pageNum);
    $("form").submit();
}
</script>
</html>