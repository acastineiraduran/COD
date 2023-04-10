# Practica ramas examen
## Incializo el proyecto y primer commit
1. Creo repos de imagenes y docs
2. Creo fichero readme y gitignore con los archivos que no quiero
3. aplico siguientes comandos
    ````
   git init
   git add .
   git commit -m "A"
    ````
## Segundo commit y nueva rama - **master**
1. inicio y hago commit `git commit -m "B"`. Compruebo que he 
hecho dos correctamente.
2. Creo la segunda rama `git branch colaborador` y
me muevo a ella `git switch colaborador`. Finalmente 
compruebo que estoy en la rama correcta `git branch`

## Rama colaborador - primeros commits -  **colaborador**
1. creo una nueva clase donde ire implementando las nuevas modificaciones
2. Añado y hago commit llamado: "C1"
3. Añado primer metodo a la clase Metodos y hago commit "C2"
4. Modifico el metodo creado anteriormente y hago un nuevo y ultimo 
commit "C3"

## Nueva rama del lider - **lider**
1. Me posiciono en la rama master y creo una nueva rama llamada lider
2. Creo una clase MetodoLider y hago un commit "L1"
3. primer metodo y commit "L2" y despues lo mismo con "L3"
   
## Merge squash
1. Hago el primer commit con el `merge --squash colaborador`
2. Hago el segundo commit con el `merge --squash lider`

## Limpio historial
1. borro las ramas de colaborador y lider con `git branch -d <nombre-rama>`
2. Hago un nuevo commit y lo subo a gh