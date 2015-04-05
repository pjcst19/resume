/* 
 * Functions for Create Portfolio - Research
 */

//Datepicker for Dates

$(function () {
    $(".datepicker").datepicker();
});


//Adds an additional form to allow the user to input multiple research entries

$(document).ready(function () {
    $('#btnAddResearch').click(function () {
        $('#additionalResearch').append($('<div>').load('resForm.html'));
        return false;
    });

    //Loads the Researh Form
    $("#resForm").load("resForm.html");
});

//Submits all forms on page

function post_form_data(data) {
    $.ajax({
        type: 'POST',
        url: '../process/processResearch',
        data: data,
        async: false
                //success: ,
                //error:
    });
}//end of post_form_data


//When Next button is clicked, all forms on page are submitted for processing
function submitRes() {
    //$('btnSubmit').on('click', function () {
    $('form').each(function () {
        post_form_data($(this).serialize());
    });
    window.location.href = 'menu.jsp';

}
;








