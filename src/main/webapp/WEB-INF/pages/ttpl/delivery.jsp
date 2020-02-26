<%--
  Created by IntelliJ IDEA.
  User: nzepa
  Date: 2/25/2020
  Time: 2:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Delivery</title>

</head>
<body>
<form class="card form-horizontal" id="deliveryFormId" action="<c:url value='/delivery'/>" method="post">

    <div class="form-group col-md-12"></div>
    <div class="form-group col-md-12">
        <label class="col-md-3 required">Sender CID :</label>

        <div class="col-md-4">
            <input type="text" name="cidNumber" id="cidNumber" class="form-control">
        </div>
    </div>

    <div class="form-group col-md-12">
        <label class="col-md-3 required">Sender Name:</label>

        <div class="col-md-4">
            <input type="text" name="senderName" id="senderName" class="form-control">
        </div>
    </div>

    <div class="form-group col-md-12">
        <label class="col-md-3 required">Sender Mobile Number:</label>

        <div class="col-md-4">
            <input type="text" name="mobileNumber" id="mobileNumber" class="form-control">
        </div>
    </div>

    <div class="form-group col-md-12">
        <label class="col-md-3 required">Item Address:</label>

        <div class="col-md-4">
            <input type="text" name="itemName" id="itemName" class="form-control">
        </div>
    </div>

    <div class="form-group col-md-12">
        <label class="col-md-3 required">From:</label>

        <div class="col-md-4">
            <input type="text" name="placeFrom" id="placeFrom" class="form-control">
        </div>
    </div>

    <div class="form-group col-md-12">
        <label class="col-md-3 required">To:</label>

        <div class="col-md-4">
            <input type="text" name="placeTo" id="placeTo" class="form-control">
        </div>
    </div>
    <div class="form-group col-md-12">
        <label class="col-md-3 required">Distance:</label>

        <div class="col-md-4">
            <input type="text" name="distance" id="distance" class="form-control">
        </div>
    </div>
    <div class="form-group col-md-12">
        <label class="col-md-3 required">Item Weight:</label>

        <div class="col-md-4">
            <input type="text" name="itemWeight" id="itemWeight" class="form-control">
        </div>
    </div>
    <div class="form-group col-md-12">
        <label class="col-md-3 required">Receiver Name:</label>

        <div class="col-md-4">
            <input type="text" name="receiverName" id="receiverName" class="form-control">
        </div>
    </div>
    <div class="form-group col-md-12">
        <label class="col-md-3 required">Receiver Mobile Number:</label>

        <div class="col-md-4">
            <input type="text" name="mobileNumber1" id="mobileNumber1" class="form-control">
        </div>
    </div>
    <div class="form-group col-md-12">
        <label class="col-md-3 required">Receiver Location:</label>

        <div class="col-md-4">
            <input type="text" name="location" id="location" class="form-control">
        </div>
    </div>
    <div class="form-group col-md-12">
        <label class="col-md-3 required">Driver Name</label>

        <div class="col-md-4">
            <input type="text" name="driverName" id="driverName" class="form-control">
        </div>
    </div>
    <div class="form-group col-md-12">
        <label class="col-md-3 required">Vechilce Number</label>

        <div class="col-md-4">
            <input type="text" name="vechileNumber" id="vechileNumber" class="form-control">
        </div>
    </div>
    <div class="form-group col-md-12">
        <div class="col-md-2 col-md-offset-3">
            <input type="button" class="btn btn-xs btn-info btn-block" value="Calculate" id="deliveryCalculate">
        </div>
    </div>

    <div class="form-group col-md-12">
        <div class="col-md-2 col-md-offset-3">
            <span>Total Charge</span>
           <span id="display1"></span>
        </div>
    </div>

    <div class="form-group col-md-12">
        <div class="col-md-2 col-md-offset-3">
            <input type="submit" class="btn btn-xs btn-info btn-block" value="Save" id="btnSaveDelivery">
        </div>
        <div class="col-md-2">
            <input type="reset" class="btn btn-xs btn-info btn-block" value="Reset" id="btnReset">
        </div>
    </div>

</form>
</body>
</html>
