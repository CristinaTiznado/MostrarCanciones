<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Detalle Canción</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
    <h1>Detalles de la Canción</h1>
    
    <ul>
        <li><strong>Título:</strong> ${cancion.titulo}</li>
        <li><strong>Artista:</strong> ${cancion.artista}</li>
        <li><strong>Álbum:</strong> ${cancion.album}</li>
        <li><strong>Género:</strong> ${cancion.genero}</li>
        <li><strong>Idioma:</strong> ${cancion.idioma}</li>
    </ul>

    <br>
    <a href="/canciones"> &#8592; Volver a lista de canciones</a>
</body>
</html>