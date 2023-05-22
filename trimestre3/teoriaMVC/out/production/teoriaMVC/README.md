# Modelo MVC
Diseño que consiste en separar la parte lógica de la visual

## a) Modelo (BBDD)
Gestión acceso a bd

## b) Vista (JSP)
Representacion del modelo (GUI)

## c) Controlador (Servlet)
* Responde a eventos, a acciones que quiera hacer al ususario.
* Invoca esta solicitud al modelo cuando solicita info.
* Tambien puede enviar comandos a la vista.
* Intermediario entre vista y modelo

![Esquema MVC](../imagenes/esquema_mvc.png)

---------

## Ventajas
* Modularizacion
* Favorece depuración errores
* Escalabilidad
