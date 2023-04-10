# Markdown
## Sintaxis basica
### Estilo de texto
**Titulo en negrita**, __Titulo en negrita__, ***texto muy en negrita***, *en italica*, _italic_, ~~texto tachado~~, x<sub>subiondice</sub>, x<sup>superindice<s/sup>

>cita de texto

### Codigo
El codigo entre comillas simples lo podemos llamar: `git status` pero para darle espacios con 3 comillas:
```
git status -s
```
```ruby
require 'redcarpet'
markdown = Redcarpet.new("Hello World!")
puts markdown.to_html
```

### Links
#### Links dentro del mismo documento?
#### Links en la web
Para crear enlaces o links dentro al clicar las palabras: [Esemtia](https://danielcastelao.esemtia.net/moodle/my/).

#### Links relativos
Es un enlace relativo al archivo actual. De esta forma podemos acceder facilmente a otros ficheros de nuestro repo. Esto nos sirve para por ejemplo hacer una carpeta con [imagenes](./Imagenes/imgagen1.jpg) donde tengamos todas.
  
#### Imagenes![imagen](https://user-images.githubusercontent.com/113776574/215167299-283b4380-1d28-4329-84d0-382dfa3e586d.png)

![Esto es una imgagen](https://images.unsplash.com/photo-1601814933824-fd0b574dd592?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8YmFieSUyMHlvZGF8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60)

* arrastrando directamente la imagen:
![Nuevo-Logo-PcComponentes](https://user-images.githubusercontent.com/113776574/215167051-fa607ba2-f66c-4cbf-9a3a-ba05a2efd055.jpg)

* haciendo cap de pantalla:

![imagen](https://user-images.githubusercontent.com/113776574/215167535-feddeac5-8ef1-4f3f-8681-1a019cbe0358.png)

### Insertar
emojis ✈️
otra opcion --> :warning:
linea horizontal
*********

### Crear pestañas
  <details><summary><h4>Pestaña</h4></summary>
  <p><h8>informacion de la pestaña</8></p>
</details>

Notas de pie [^1].
blablabla
[^1]: esta es la nota de pie

### Para crear listas
  * titulo1
  * titulo2
  1. titulo1
  2. titulo2
  
### Listas de tareas
- [x] Comprar zanahoria
- [ ] Comprar huevos

### Mencionar
Puede mencionar a una persona o equipo en GitHub, Para ello, escriba @ junto con su nombre de usuario o equipo. 
@github/support qe h

### Formatos texto
- Puedes crear un nuevo párrafo al dejar una línea en blanco entre las líneas de texto.

### Crear tablas
| Rank | Languages |
|-----:|-----------|
|     1| Javascript|
|     2| Python    |
|     3| SQL       |
