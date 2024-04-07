<%@page language="java" contentType="text/html; UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags" %>
<template:page title="List">
    <style><%@include file="/WEB-INF/css/list.css"%></style>
    <h1>List of clients</h1>
    <table>
        <thead>
        <tr>
            <td>ID</td>
            <td>Type</td>
            <td>Name</td>
            <td>Address</td>
            <td>Action</td>
        </tr>
        </thead>
        <tbody>
        <jsp:useBean id="clients" scope="request" type="java.util.List"/>
        <c:forEach items="${clients}" var="client">
            <tr>
                <td>
                    <c:out value="${client.id}"/>
                </td>
                <td>
                    <c:out value="${client.getClass().getSimpleName()}"/>
                </td>
                <td>
                    <c:out value="${client.name}"/>
                </td>
                <td>
                    <c:out value="${client.address}"/>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</template:page>