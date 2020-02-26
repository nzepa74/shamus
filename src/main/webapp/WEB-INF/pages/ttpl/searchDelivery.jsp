<%--
  Created by IntelliJ IDEA.
  User: nzepa
  Date: 2/25/2020
  Time: 4:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search Delivery</title>
</head>
<body>
<div class="form-group col-md-12">

    <div class="col-md-4">
        <input type="text" name="cidNumber" id="cidNumber" class="form-control">
    </div>
</div>
<div class="form-group col-md-12">
    <div class="col-md-2 col-md-offset-3">
        <input type="submit" class="btn btn-xs btn-info btn-block" value="Search" id="btnSearchDelivery">
    </div>
</div>
<div class="form-group col-md-12">
    <label class="col-md-3 required">Sender Name:  </label>

    <div class="col-md-4">
        <input type="text" class="form-control" id="senderNameDisplay" name="senderName">
        <%--<span id="senderNameDisplay"  class="green-color"></span>--%>
    </div>
</div>
<div class="form-group col-md-12">
    <label class="col-md-3 required">Receiver Name:  </label>

    <div class="col-md-4">
        <input type="text" class="form-control" id="receiverNameDisplay" name="receiverName">
        <%--<span id="receiverNameDisplay" name="receiverName" class="green-color"></span>--%>
    </div>
</div>
</body>
</html>
