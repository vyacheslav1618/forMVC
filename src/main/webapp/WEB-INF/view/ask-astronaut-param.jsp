<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>
    <body>

        <h3>Hello, stranger! Would you like to become an astronaut? Fill in these fields..</h3>
        <br>

        <form:form action="showAstronautForm" modelAttribute="astronaut">


            Name <form:input path="name"
                        placeholder="Enter your name, hero!"/>
            <br>
            Surname <form:input path="surname"
                        placeholder="Here.. your surname!"/>
            <br>
            Salary <form:input path="salary"/>
            <br>    
            <input type="submit" value="I want to be astronaut!"/>
        </form:form>

    </body>

</html>