<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>

<%@ page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title><spring:message code="trainer.info"/></title>
  <link rel="stylesheet" type="text/css"
        href="<c:url value="/resources/styles.css" />">
</head>
<body>
<div>
  <h1><spring:message code="trainer.info"/></h1>

  <div id="content">
    <table>
      <tr>
        <td>
          <spring:message code="first.name"/>
        </td>
        <td><c:out value="${trainerForm.firstName}"/></td>
      </tr>

      <tr>
        <td>
          <spring:message code="last.name"/>
        </td>
        <td><c:out value="${trainerForm.lastName}"/></td>
      </tr>

      <tr>
        <td>
          <spring:message code="age"/>
        </td>
        <td><c:out value="${trainerForm.age}"/></td>
      </tr>

      <tr>
        <td>
          <spring:message code="salary"/>
        </td>
        <td>
          <fmt:formatNumber type="number" groupingUsed="true" value="${trainerForm.salary}"/>
          <c:out value="${trainerForm.currency}"/>
        </td>
      </tr>

    </table>
    <a href="<c:url value="/" />">Home</a>
  </div>

</div>
</body>
</html>
