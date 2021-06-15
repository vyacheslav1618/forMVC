<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    
    <body>

        <h2>Hero! Welcome to our team!</h2>
        <br>
        <h4>Chief Commander Johnson say: "Attention! I'd like to introduce you to a new member of our squad!</h4>
        <h4>It is ${astronaut.name} ${astronaut.surname} - one of the first volunteer to fly to Mars.</h4>
        <h4>${astronaut.name} speaks <ul><c:forEach var="lang" items="${astronaut.languages}"><li>${lang}</li></c:forEach></ul></h4>
        <h4>There your ${astronaut.department} section. You should go to them.</h4>
        <h4>${astronaut.ships} will deliver you to Mars and then you will get your ${astronaut.salary}$. Good luck!</h4>
    </body>
</html>

