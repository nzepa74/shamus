<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title></title>Payer Registration</title>
</head>
<body>

<form class="card form-horizontal" id="taxPayerRegistrationFormId" action="<c:url value='/taxPayerRegistration'/>"
      method="post">
    <div class="form-group col-md-12"></div>

    <div class="form-group col-md-12">
        <label class="col-md-3 required">Tax Payer Name :</label>

        <div class="col-md-4">
            <input type="text" name="taxPayerName" id="taxPayerName" class="form-control field">
        </div>
    </div>

    <div class="form-group col-md-12">
        <label class="col-md-3 required">CID:</label>

        <div class="col-md-4">
            <input type="text" name="cidNo" id="cidNo" class="form-control field">
        </div>
    </div>

    <div class="form-group col-md-12">
        <label class="col-md-3 required">DOB</label>

        <div class="col-md-4">
            <input type="text" name="dob" id="dob" class="form-control datepicker field">
        </div>
    </div>

    <div class="form-group col-md-12">
        <label class="col-md-3 required">Mobile No</label>

        <div class="col-md-4">
            <input type="text" name="mobileNo" id="mobileNo" class="form-control field">
        </div>
    </div>

    <div class="form-group col-md-12">
        <label class="col-md-3 required">Designation</label>

        <div class="col-md-4">
            <input type="text" name="designation" id="designation" class="form-control field">
        </div>
    </div>

    <div class="form-group col-md-12">
        <label class="col-md-3 required">Working Agency</label>

        <div class="col-md-4">
            <input type="text" name="workingAgency" id="workingAgency" class="form-control field">
        </div>
    </div>


    <div class="form-group col-md-12">
        <div class="col-md-2 col-md-offset-3">
            <input type="submit" class="btn btn-xs btn-info btn-block" value="Save" id="btnSave">
        </div>
        <div class="col-md-2">
            <input type="reset" class="btn btn-xs btn-info btn-block" value="Reset" id="btnReset">
        </div>
    </div>

</form>
</body>
</html>
