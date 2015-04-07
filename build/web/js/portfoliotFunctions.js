/* 
 * Functions for Create Portfolio(s)
 */

//Datepicker

$(function () {
    $(".datepicker").datepicker();
});


//Adds an additional form to allow the user to input multiple Portfolio entries

$(document).ready(function () {
    $('#btnAddPortfolio').click(function () {
        $('#additionalPortfolio').append($('<div>').load('portForm.html'));
        return false;
    });

    //Loads the Project Form
    $("#portForm").load("portForm.html");
});

//Submits all forms on page

function post_form_data(data) {
    $.ajax({
        type: 'POST',
        url: '../process/processPortfolio',
        data: data,
        async: false
                //success: ,
                //error:
    });
}//end of post_form_data


//When Next button is clicked, all forms on page are submitted for processing
function submitPort() {
    //$('btnSubmit').on('click', function () {
    $('form').each(function () {
        post_form_data($(this).serialize());
    });
    window.location.href = '../pages/Project.jsp';

}
;








