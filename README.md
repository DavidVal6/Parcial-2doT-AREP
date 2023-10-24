# PARCIAL SEGUNDO CORTE AREP 2023
Hecho por : David Eduardo Valencia Cardona

## Como ejecutar 
primero se le debe de hacer clone al repositorio: 

 ```bash
 git clone https://github.com/DavidVal6/Parcial-2doT-AREP.git
  ```
Una vez ya se halla hecho el clone al repositorio de debe de entrar al directorio que se generara y hacer un clean install sobre este para que se descargue todas las dependencias asi como se muestra a continuacion.
 ```bash
 cd Parcial-2doT-AREP 
 mvn clean install
  ```

  Una vez hecho esto si se esta ejecutando local se pude hacer el siguiente comando si esta en windows en donde van los ":" cambielo por un ";"
   ```bash
    java -cp "target/classes:target/dependency/*" edu.eci.arep.SparkWebServer   
  ```
  y si Se quiere hacer desde un docker se puede con lo siguiente:
  ```bash
docker pull davidval6/segundoparcial:latest
docker run -d -p 34000:6000 --name <nombrecualquiera> davidval6/segundoparcial:fixed     
```
una vez arranque puede ir a su navegador y con
```bash
localhost:34000/collatzsequence?value=13 
```
aparecera todo lo requerido.

## Como funciona

Este proyecto funciona con un framework llamado spark el cual aprovechalas caracteristicas de una RESTApi para poder generar paginas con acciones en este caso esta api consume una clase la cual fue creada como [CollatzMader](src/main/java/edu/eci/arep/CollatzMader.java) y en la cual se tendra un contructor una accion directa de hacer collatz y un arreglo con los numeros por los que collatz pasará.

Una vez hace todo esto se devolvera a el apiREST y de aqui se construira un json el cual se haga la consulta con el link explicado anteriormente 


## Funcionamiento:

### Pantallazos:
![image](https://github.com/DavidVal6/Parcial-2doT-AREP/assets/98176834/28a94b27-3b9e-4c35-b6ec-4b764a33d114)
![image](https://github.com/DavidVal6/Parcial-2doT-AREP/assets/98176834/67df93d3-4a67-4d17-b3a5-a1f9ed0cf34c)
![image](https://github.com/DavidVal6/Parcial-2doT-AREP/assets/98176834/2e22c0c8-7df5-4d7a-99a5-fc7a47ed565a)

### Video
https://pruebacorreoescuelaingeduco.sharepoint.com/:v:/s/yo818/Eehpqf2nNy5MpXAjxz4b3rMBqk1Bgrp6bYDi9KZ2WSDXvQ?e=wcakn4&nav=eyJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJTdHJlYW1XZWJBcHAiLCJyZWZlcnJhbFZpZXciOiJTaGFyZURpYWxvZyIsInJlZmVycmFsQXBwUGxhdGZvcm0iOiJXZWIiLCJyZWZlcnJhbE1vZGUiOiJ2aWV3In19

