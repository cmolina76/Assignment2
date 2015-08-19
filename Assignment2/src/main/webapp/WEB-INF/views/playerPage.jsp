<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>

<%@ page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title><spring:message code="player.info"/></title>
  <link rel="stylesheet" type="text/css"
        href="<c:url value="/resources/styles.css" />">
</head>
<body>
<h1><spring:message code="player.info"/></h1>

<div id="content">
  <table>
    <tr>
      <td>
        <spring:message code="first.name"/>
      </td>
      <td><c:out value="${playerForm.firstName}"/></td>
    </tr>

    <tr>
      <td>
        <spring:message code="last.name"/>
      </td>
      <td><c:out value="${playerForm.lastName}"/></td>
    </tr>

    <tr>
      <td>
        <spring:message code="age"/>
      </td>
      <td><c:out value="${playerForm.age}"/></td>
    </tr>

    <tr>
      <td>
        <spring:message code="country"/>
      </td>
      <td><c:out value="${playerForm.country}"/></td>
    </tr>

    <tr>
      <td>
        <spring:message code="position"/>
      </td>
      <td><c:out value="${playerForm.position}"/></td>
    </tr>

    <tr>
      <td>
        <spring:message code="salary"/>
      </td>
      <td>
        <fmt:formatNumber type="number" value="${playerForm.salary}"/>
        <c:out value="${playerForm.currency}"/></td>
    </tr>

    <tr>
      <td>
        <spring:message code="stats"/>
      </td>
      <td><c:out value="${playerForm.goals}"/> goals <c:out value="${playerForm.bookings}"/> bookings</td>
    </tr>

  </table>
  <a href="<c:url value="/" />">Home</a>
</div>
</body>
</html>
