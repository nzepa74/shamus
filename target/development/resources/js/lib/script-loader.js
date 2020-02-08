$(document).ready(function () {

    if (document.URL.search("chargeAllocation") > 1)
        scriptLoader("/resources/js/ttpl/chargeAllocation.js");

    if (document.URL.search("employee") > 1)
        scriptLoader("/resources/js/ttpl/employee.js");

    if (document.URL.search("leave") > 1)
        scriptLoader("/resources/js/ttpl/leave.js");

    if (document.URL.search("search") > 1)
        scriptLoader("/resources/js/ttpl/search.js");

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

