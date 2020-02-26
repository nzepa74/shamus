
itemRegistration = (function () {
    "use strict";
    var form = $('#itemRegistrationFormId');
    var isSubmitted = false;


    function _baseURL() {
        return 'itemRegistration/';
    }

    function saveItemRegistration() {
        $('#btnSaveItem').on('click', function () {
            form.validate({
                submitHandler: function (form) {
                    var url = _baseURL() + 'saveItem';
                    var data = $(form).serializeArray();
                    if (isSubmitted) {
                        errorMsg('Your request is processing. Please wait...');
                        return;
                    }
                    isSubmitted = true;
                    $('#btnSaveItem').attr('disabled', true);
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
                            $('#btnSaveItem').attr('disabled', false);
                        }
                    });
                }
            });
        });
    }

    return {
        saveItemRegistration: saveItemRegistration
    }
})
();
$(document).ready(
    function () {
        itemRegistration.saveItemRegistration();
    });
