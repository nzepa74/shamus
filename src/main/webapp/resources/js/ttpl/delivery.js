delivery = (function () {
    "use strict";
    var form = $('#deliveryFormId');
    var isSubmitted = false;


    function _baseURL() {
        return 'delivery/';
    }

    function cal() {
        $('#deliveryCalculate').on('click', function () {
            var itemRate = 40;
            var transportRate = 20;

            var itemWeight = $('#itemWeight').val();
            var distance = $('#distance').val();
            var total = (itemWeight * itemRate) + (distance * transportRate);
            $('#display1').text(total);
        });
    }

    function saveDelivery() {
        $('#btnSaveDelivery').on('click', function () {
            form.validate({
                submitHandler: function (form) {
                    var url = _baseURL() + 'saveDelivery';
                    var data = $(form).serializeArray();
                    if (isSubmitted) {
                        errorMsg('Your request is processing. Please wait...');
                        return;
                    }
                    isSubmitted = true;
                    $('#btnSaveDelivery').attr('disabled', true);
                    $.ajax({
                        url: url,
                        type: 'post',
                        data: data,
                        processData: true,
                        success: function (res) {
                            if (res.responseStatus == 1) {
                                successMsg(res.responseText);
                            } else {
                                warningMsg(res.responseText);
                            }
                        }, complete: function () {
                            isSubmitted = false;
                            $('#btnSaveDelivery').attr('disabled', false);
                        }
                    });
                }
            });
        });
    }

    return {
        saveDelivery: saveDelivery,
        cal: cal
    }
})
();
$(document).ready(
    function () {
        delivery.saveDelivery();
        delivery.cal();
    });
