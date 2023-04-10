# Singleton

Si ponemos private en el constructor
tenemos que crear un metodo para crear ese objeto.

Singleton es un patron de diseño, es una forma de crear codigo. 
Cuando trabajemos con esto nos vamos a encontrar con el metodo: getInstance
que es la clase quien tiene un objeto dentro que es de su clase

## Firebase RealTime
Los patrones de diseño no solo es para crear diseño si no para utilizarlos.
Trabajaremos con RealTime
FireBase es una herramienta de base de datos (es como funcionan ahora todas
las app) que permite que cuando hay una modificacion en la nube le llega a todos 
los clientes en vez de hacer un cambio en la nube tener que hacer un select o 
descargar datos de la base de datos.

Los datos vienen a las app en vez de las app buscarlas en las bases de datos.
Gracias a esto tenemos datos a tiempo real y mayor disponibilidad.

Si te quedas sin conexión utilizaremos la caché para descargar los datos locales. 

Este en concreto es de google, FireBase.

Como se trabaja con esta base de datos? Se trabajo con el Singleton.
Cada vez que utilizo el getInstance se utiliza para ir a la nube para comprobar
que tengo permisos y el objeto se lo doy al programador, pero siempre le 
doy el mismo que sería el 

Prodríamos crear instancias cada vez que lo necesito pero sería absurdo como 
si estuviera hablando con una persona por tlf y utilizese varios telefonos.

Este objeto database son los metodos(recoger referencia de una ruta, ) y atributod (mi clave mi token mis per
misos)
Cada vez que trabajamos con base de datos trabajamos con Singleton.
