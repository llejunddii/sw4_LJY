<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="style.css"  rel="stylesheet" type="text/css">
</head>
<body>
    <h3>생산관리 등록화면</h3>
 <form action = "view2" method = "post">
    <fieldset >
        <legend>생산관리 등록화면</legend>
        <ul>
            <li>제품코드    <input type ="text" autofocus required  name = "code" ></li>
            <li>제품이름    <input type ="text" autofocus required  name = "pname" ></li>
            <li>제품원가    <input type ="text" autofocus required  name = "cost" ></li>
            <li>목표수량    <input type ="text" autofocus required  name = "pnum" ></li>
            <li>재고수량    <input type ="text" autofocus required  name = "jnum" ></li>
            <li>출고가      <input type ="text" autofocus required  name = "sale" ></li>
            <li>그룹이름    <select name="gcode">
                <option  value="A" >컴퓨터 </option>
                <option  value="B" >냉장고</option>
                <option  value="C" >냉장소모품</option>
            </select></li>
        </ul>
        <button class="my_btn" type="submit"  >등 록</button>
        <button class="my_btn" onClick="history.back();">메인화면</button >
    </fieldset>
</form>

</body>
</html>