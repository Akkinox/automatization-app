## PARA EMPEZAR

Bienvenido a esta app de prueba de automatización

## DEPENDENCIAS

- Java JDK (Version 15) *funciona de igual manera con la actual 17 
- gradle 
- Descargar chromedriver (De todas manera dejare descargado el archivo en la carpeta).
- Git

## COMANDOS PARA MAC

Instalación de gradle:
 - brew install gradle

Instalación de git:

 - brew install git

## Instalación de gradle en windows

- Descargar Gradle.
- Descomprimir el archivo en C: o donde prefieran (les recomiendo directamente en el C). 
- Renombra La carpeta extraída como gradle.
- Ingresa a panel de control -> Sistema -> Configuración avanzada del sistema -> Variables de entorno
- Otra alternativa es ejecutando el comando ENV al tocar la lupa de Windows van a llegar a donde configuramos las locaciones de JAVA HOME, Gradle entre otros.
- Añadimos C:\gradle\bin a la variable PATH

## Configuración de chromedriver

## En Windows

Toda esta configuración quedará lista, solo debes descomentar la linea de codigo 26 del archivo BasePage.java

En MacOS:

- Ejecutar la Terminal.
- Escribir la siguiente sentencia en nuestra consola "sudo nano /etc/paths".
- Debes ingresar con contraseña al archivo para editar.
- Posicionate en el final del archivo y añade el path del WebDriver en mi caso:
  "/Users/ronal.olate/IdeaProjects/automatization-app/utilidades/Mac/chromedriver".
- Control + x para salir, presionamos 'y' para salvar y enter para confirmar. 
- ejecutamos "echo $PATH" para verificar que quedo bien guardado


## Comando de gradle

Ejecutamos "gradle clean" para eliminar residuos y ejecutamos "gradle build" para generar 
las dependecias para ejecutar nuestro proyecto