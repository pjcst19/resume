<%-- 
    Document   : rivetstest2
    Created on : Nov 26, 2014, 6:29:22 PM
    Author     : Mandy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.0/jquery.min.js"></script>
        <script src="js/rivets.min.js"></script>
        <script src="js/index.js"></script>
        <script src="js/rivetsConf.js"></script>
        <script>
            var soccerTeam = [{"number": 1, "name": "Gianluigi", "surname": "Buffon"},
                {"number": 19, "name": "Gianluca", "surname": "Zambrotta"},
                {"number": 5, "name": "Fabio", "surname": "Cannavaro", "captain": true},
                {"number": 9, "name": "Luca", "surname": "Toni"}];

// get the DOM elements
            var playersList = document.getElementById('playersList');

// pass the data to the DOM element
            rivets.bind(playersList, {players: soccerTeam});
        </script>

    </head>
    <body>
        <ul id="playersList">
            <li rv-each-player="players">
                <dl>
                    <dt>Name:</dt><dd>{ player.name }</dd>
                    <dt>Surname:</dt><dd>{ player.surname }</dd>
                    <dt>Shirt Number:</dt><dd>{ player.number }</dd>
                    <!-- This element will be rendered only if this property will be set -->
                    <dd rv-if="player.captain"><b> Captain! </b></dd>
                </dl>
            </li>
        </ul>
    </body>
</html>
