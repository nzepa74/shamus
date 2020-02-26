searchDelivery = (function () {
    "use strict";
    var form = $('#searchDeliveryFormId');
    var isSubmitted = false;


    function _baseURL() {
        return 'searchDelivery/';
    }

    function getSenderInfo() {
        $('#btnSearchDelivery').on('click', function () {
            var url = _baseURL() + "getSenderInfo";
            var cidNumber = $('#cidNumber').val();
            $.ajax({
                url: url,
                type: 'GET',
                data: {cidNumber: cidNumber},
                success: function (res) {
                    if (res.responseStatus === 1) {
                        populate(res.responseDTO);
                        //$('#senderNameDisplay').text(res.responseDTO.senderName);
                        //$('#receiverNameDisplay').text(res.responseDTO.receiverName);
                    } else {
                        warningMsg(res.responseText);
                    }
                }
            });
        });
    }


    return {
        getSenderInfo: getSenderInfo
    }
})
();
$(document).ready(
    function () {
        searchDelivery.getSenderInfo();
    });
/**
 * Created by nzepa on 2/25/2020.
 */
