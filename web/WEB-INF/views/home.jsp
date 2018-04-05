<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="/BookBlog/styles/styles.css">
    </head>
    <body>
        <p>Books:</p>
        <ul>
            <c:forEach var="book" items="${books}">
                <li>
                    
                    <div class ="f"><c:out value = "${book.title}"/></div>
                    <div class="a"><c:out value = "${book.review}"/></div>
                    <br>
                </li>
            </c:forEach>
        </ul>
    </body>
</html>
