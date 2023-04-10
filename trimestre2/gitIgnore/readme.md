# Git ignore
Para configurar los archivos que no quiero que se suban al GitHub como
por ejemplo cuando hago un `git add .` y subo sin querer archivos que no 
me interesan hacer el seguimiento



## Como se hace 
### Creo el _.gitignore_
1. Creo un fichero en el mismo nivel de la _src_ con el nombre _.gititnore_.
Esta carpeta es donde iré añadiendo los ficheros y repositorios que no
quiera hacer seguimiento.

### Añado archivos en  _.gitignore_
1. click derecho en _claseMiercoles_01.02_  
2. Git
3. Seleccciono _Add to gitignore..._
4. Selecciono _.gitignore_
5. Ahora si hago un `git add .` ese archivo que hemos metido en el fichero
_.gitignore_ no debería subirse en gh.

### Archivos basicos para poner en _.gitignore_ 
Ficheros/repos basicos para meter en el gitignore: 
_.iml_, _.idea_ y _out_
Si pongo: _*.iml_ va a borrar todos aquellos ficheros que acaben con esa
extensión.

## Conclusiones
A partir de ahora deberáimos de subir todos los proyectos con su 
_.gitignore_ correspondiente.