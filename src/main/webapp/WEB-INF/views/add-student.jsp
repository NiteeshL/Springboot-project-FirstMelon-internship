<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add Student</title>
</head>
<body>
    <h1>Add Student</h1>
    <form:form action="add-student" modelAttribute="student" method="post">
        <table>
            <tr>
                <td><label>Name:</label></td>
                <td><form:input path="name" /></td>
            </tr>
            <tr>
                <td><label>Roll Number:</label></td>
                <td><form:input path="rollNumber" /></td>
            </tr>
            <tr>
                <td><label>Email:</label></td>
                <td><form:input path="email" type="email" /></td>
            </tr>
            <tr>
                <td><label>Department:</label></td>
                <td><form:input path="department" /></td>
            </tr>
        </table>
        <button type="submit">Add Student</button>
    </form:form>
</body>
</html>

