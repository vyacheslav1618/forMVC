<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 

<!DOCTYPE html>

<html>

    <body>

        <h3>Hello, stranger! Would you like to become an astronaut? Fill in these fields..</h3>
        <br>
        <!--form for name and surname-->
        <form:form action="showAstronautForm" modelAttribute="astronaut">

            Name <form:input path="name"
                        placeholder="Enter your name, hero!"/>
            <form:errors path="name"/>
            <br>
            Surname <form:input path="surname"
                        placeholder="Here.. your surname!"/>
            <form:errors path="surname"/>
            <br>
            <!--form fo sex-->
            Sex
            male <form:radiobutton path="sex" value="male"/>
            female <form:radiobutton path="sex" value="female"/>
            alien <form:radiobutton path="sex" value="alien"/>
            <br>
            <!--form for salary-->
            Salary <form:input path="salary"/>
            <form:errors path="salary"/>
            <br>
            <!--form for langeuges-->
            Foreign language(s)
            EN <form:checkbox path="languages" value="English"/>
            DE <form:checkbox path="languages" value="Deutch"/>
            NO <form:checkbox path="languages" value="Norvegian"/>
            <br>
            <!--form for department-->
            <input type="submit" value="I want to be astronaut!"/>
            Preferred department <form:select path="department">
                <form:option value="Soil research" label="SR - Soil research"/>
                <form:option value="Service personnel" label="SP - Service personnel"/>
                <form:option value="Repair personnel" label="RP - Repair personnel"/>
                <form:option value="Engineering personnel" label="EP - Engineering personnel"/>
                <form:option value="Managing personnel" label="MP - Managing personnel"/>
                <br>
                <!--    form for type of transporting           -->
                Type of transport ship <form:options items="${astronaut.ships}"/>
            </form:select>
            <br>

            <input type="submit" value="Accept">
        </form:form>
    </body>


</html>