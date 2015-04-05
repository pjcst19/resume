/* 
 * Functions for Create Portfolio - Project
 */

//Datepicker

$(function () {
    $(".datepicker").datepicker();
});


//Adds an additional form to allow the user to input multiple project entries

$(document).ready(function () {
    $('#btnAddProject').click(function () {
        $('#additionalProject').append($('<div>').load('projForm.html'));
        return false;
    });

    //Loads the Project Form
    $("#projForm").load("projForm.html");
});

//Submits all forms on page

function post_form_data(data) {
    $.ajax({
        type: 'POST',
        url: '../process/processProject',
        data: data,
        async: false
                //success: ,
                //error:
    });
}//end of post_form_data


//When Next button is clicked, all forms on page are submitted for processing
function submitProj() {
    //$('btnSubmit').on('click', function () {
    $('form').each(function () {
        post_form_data($(this).serialize());
    });
    window.location.href = '../pages/research.jsp';

}
;








