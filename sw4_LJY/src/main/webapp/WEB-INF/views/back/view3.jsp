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
 <form action = "#{id}" method = "post">
    <h3>생산관리 조회 & 수정 화면</h3>
    <fieldset>
        <legend>생산관리 조회 화면</legend>
        <ul>
            <li>제품코드    <input type ="text" autofocus required  name = "code" ></li>
            <li>제품이름    <input type ="text" autofocus name = "pname" ></li>
            <li>제품원가    <input type ="text" autofocus name = "cost" ></li>
            <li>목표수량    <input type ="text" autofocus name = "pnum" ></li>
            <li>재고수량    <input type ="text" autofocus name = "jnum" ></li>
            <li>출고가     <input type ="text" autofocus name = "sale" ></li>
            <li>그룹이름    <select name="gcode">
                <option value="A" selected>컴퓨터 </option>
                <option value="B" selected>냉장고</option>
                <option value="C" selected>냉장소모품</option>
            </select></li>
        </ul>
        <button class="my_btn" type="submit" id = "check" >조 회</button>
        <button class="my_btn" type="submit" id = "change" >수 정</button>
        <button class="my_btn" type="submit" id = "delete" >삭 제</button>
        <button class="my_btn" onClick="history.back();">메인화면</button >
    </fieldset>
</form>

</body>
</html>