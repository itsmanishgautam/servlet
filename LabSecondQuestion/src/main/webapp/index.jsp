<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Information Form</title>
</head>
<body>
    <h2>User Information Form</h2>
    <form method="post" action="userInfoServlet">
        Name: <input type="text" name="name" required /><br><br>
        Password: <input type="password" name="password" required /><br><br>
        Gender:
        <input type="radio" name="gender" value="male" checked /> Male
        <input type="radio" name="gender" value="female" /> Female<br><br>
        Email: <input type="email" name="email" required /><br><br>
        Phone Number:
        <select name="countryCode">
            <option value="+977">Nepal (+977)</option>
            <option value="+44">United Kingdom (+44)</option>
            <option value="+91">India (+91)</option>
            <!-- Add more options as needed -->
        </select>
        <input type="text" name="phoneNumber" required /><br><br>
        <input type="submit" value="Submit" />
    </form>
</body>
</html>
