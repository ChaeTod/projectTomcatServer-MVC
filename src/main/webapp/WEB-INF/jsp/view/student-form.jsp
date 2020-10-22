<!DOCTYPE html>
<%@page import="home.*"%>
<html>
    <head>
        <title>Student Registration Form</title>
    </head>
    <body>
        <form action="processFrom.html" modelAttribute="student" method="GET" >

            First name: <input type="text" name="firstName" placeholder="First Name" />

            <br><br>

            Last name: <input type="text" name="lastName" placeholder="Last Name" />

            <br><br>

            Country:

            <form:form method="post">

                <form:select path="country">
                    <form:options items="${student.countryOptions}" />
                </form:select>

            </form:form>

        </form>
    </body>
</html>

