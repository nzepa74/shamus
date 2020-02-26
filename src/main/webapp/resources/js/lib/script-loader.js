$(document).ready(function () {

    if (document.URL.search("chargeAllocation") > 1)
        scriptLoader("/resources/js/ttpl/chargeAllocation.js");

    if (document.URL.search("employee") > 1)
        scriptLoader("/resources/js/ttpl/employee.js");

    if (document.URL.search("leave") > 1)
        scriptLoader("/resources/js/ttpl/leave.js");

    if (document.URL.search("search") > 1)
        scriptLoader("/resources/js/ttpl/search.js");

    if (document.URL.search("itemRegistration") > 1)
        scriptLoader("/resources/js/ttpl/itemRegistration.js");

    if (document.URL.search("delivery") > 1)
        scriptLoader("/resources/js/ttpl/delivery.js");

    if (document.URL.search("searchDelivery") > 1)
        scriptLoader("/resources/js/ttpl/searchDelivery.js");

    if (document.URL.search("taxPayerRegistration") > 1)
        scriptLoader("/resources/js/ttpl/taxPayerRegistration.js");

});

var scriptLoader = function (url) {
    $.ajax(
        {
            type: "GET",
            url: url,
            dataType: "script",
            cache: false
        });
};

