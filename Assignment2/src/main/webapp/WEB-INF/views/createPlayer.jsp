<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title><spring:message code="create.player"/></title>
  <link rel="stylesheet" type="text/css"
        href="<c:url value="/resources/styles.css" />">
</head>
<body>
<h1><spring:message code="create.player"/></h1>

<div id="content">
  <form:form method="POST" commandName="playerForm">
    <table>
      <tr>
        <td colspan="2"><form:errors path="*" element="div" cssClass="errors"/></td>
      </tr>
      <tr>
        <td>
          <form:label path="firstName" cssErrorClass="error">
            <spring:message code="first.name"/>
          </form:label>
        </td>
        <td><form:input path="firstName" cssErrorClass="error"/></td>
      </tr>

      <tr>
        <td>
          <form:label path="lastName" cssErrorClass="error">
            <spring:message code="last.name"/>
          </form:label>
        </td>
        <td><form:input path="lastName" cssErrorClass="error"/></td>
      </tr>

      <tr>
        <td>
          <form:label path="age" cssErrorClass="error">
            <spring:message code="age"/>
          </form:label>
        </td>
        <td><form:input path="age" cssErrorClass="error"/></td>
      </tr>

      <tr>
        <td>
          <form:label path="country" cssErrorClass="error">
            <spring:message code="country"/>
          </form:label></td>
        <td>
          <form:select path="country" cssErrorClass="error">
            <form:option value="" label="--- Select Country ---"/>
            <form:option value="Canada" label="Canada"/>
            <form:option value="USA" label="USA"/>
          </form:select>
      </tr>
      <tr>
        <td>
          <form:label path="position" cssErrorClass="error">
            <spring:message code="position"/>
          </form:label></td>
        <td>
          <form:select path="position" cssErrorClass="error">
            <form:option value="" label="--- Select Position ---"/>
            <form:option value="GOALKEEPER" label="Goalkeeper"/>
            <form:option value="FORWARD" label="Forward"/>
            <form:option value="MIDFIELD" label="Midfield"/>
            <form:option value="DEFENDER" label="Defender"/>
          </form:select>
        </td>
      </tr>

      <tr>
        <td>
          <form:label path="currency" cssErrorClass="error">
            <spring:message code="currency"/>
          </form:label></td>
        <td>
          <form:select path="currency" cssErrorClass="error">
            <form:option value="" label="--- Select Currency ---"/>
            <form:option value="CAD" label="CAD"/>
            <form:option value="USD" label="USD"/>
            <form:option value="EUR" label="EUR"/>
          </form:select>
        </td>
      </tr>

      <tr>
        <td>
          <form:label path="salary" cssErrorClass="error">
            <spring:message code="salary"/>
          </form:label></td>
        <td><form:input path="salary" cssErrorClass="error"/></td>
      </tr>
      <tr><td>&nbsp</td></tr>
      <tr>
        <td colspan="2">
          <strong><spring:message code="stats"/></strong>
        </td>
      </tr>
      <tr>
        <td>
          <form:label path="goals" cssErrorClass="error">
            <spring:message code="goals"/>
          </form:label></td>
        <td><form:input path="goals" cssErrorClass="error"/></td>
      </tr>

      <tr>
        <td>
          <form:label path="bookings" cssErrorClass="error">
            <spring:message code="bookings"/>
          </form:label></td>
        <td><form:input path="bookings" cssErrorClass="error"/></td>
      </tr>

      <tr>
        <td>
          <input type="submit" value="Create"/>
          <input type="reset" value="Cancel" />
        </td>
      </tr>

    </table>
  </form:form>

  <a href="<c:url value="/" />">Home</a>
</div>
</body>
</html>
