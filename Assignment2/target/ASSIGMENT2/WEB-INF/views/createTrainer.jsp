<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title><spring:message code="create.trainer"/></title>
  <link rel="stylesheet" type="text/css"
        href="<c:url value="/resources/styles.css" />">
</head>
<body>
<h1><spring:message code="create.trainer"/></h1>

<div id="content">
  <form:form method="POST" commandName="trainerForm">
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
