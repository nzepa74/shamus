<%--
  Created by IntelliJ IDEA.
  User: nzepa
  Date: 2/17/2020
  Time: 7:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Item Registration</title>
</head>
<body>
<form class="card form-horizontal" id="itemRegistrationFormId" action="<c:url value='/itemRegistration'/>" method="post">

    <div class="form-group col-md-12"></div>
    <div class="form-group col-md-12">
        <label class="col-md-3 required">Item Code :</label>

        <div class="col-md-4">
            <input type="text" name="itemCode" id="itemCode" class="form-control">
        </div>
    </div>

    <div class="form-group col-md-12">
        <label class="col-md-3 required">Item Name:</label>

        <div class="col-md-4">
            <input type="text" name="itemName" id="itemName" class="form-control" required="true">
        </div>
    </div>

    <div class="form-group col-md-12">
        <label class="col-md-3 required">Brand:</label>

        <div class="col-md-4">
            <input type="text" name="itemBrand" id="itemBrand" class="form-control" required="true">
        </div>
    </div>

    <div class="form-group col-md-12">
        <label class="col-md-3 required">Model</label>

        <div class="col-md-4">
            <input type="text" name="itemModel" id="itemModel" class="form-control"required="true">
        </div>
    </div>

    <div class="form-group col-md-12">
        <label class="col-md-3 required">Mfg Date:</label>

        <div class="col-md-4">
            <input type="text" name="mfgDate" id="mfgDate" class="form-control datepicker">
        </div>
    </div>

    <div class="form-group col-md-12">
        <label class="col-md-3 required">Expiry Date:</label>

        <div class="col-md-4">
            <input type="text" name="expiryDate" id="expiryDate" class="form-control datepicker">
        </div>
    </div>
    <div class="form-group col-md-12">
        <label class="col-md-3 required">Status:</label>

        <div class="col-md-4">
            <input type="radio" name="itemStatus" id="statusActive" value="A" class="form-control">
            <label for="statusActive"> Active</label>
        </div>
        <div class="col-md-4">
            <input type="radio" name="itemStatus" id="statusInActive" value="I" class="form-control">
            <label for="statusInActive"> Inactive</label>
        </div>
    </div>

    <div class="form-group col-md-12">
        <div class="col-md-2 col-md-offset-3">
            <input type="submit" class="btn btn-xs btn-info btn-block" value="Save" id="btnSaveItem">
        </div>
        <div class="col-md-2">
            <input type="reset" class="btn btn-xs btn-info btn-block" value="Reset" id="btnReset">
        </div>
    </div>

</form>
</body>
</html>
