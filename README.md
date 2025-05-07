# GeneradorCredenciales

**Estudiantes:**  
**Fernando Gutierrez** - Patrones de Diseño (Seccion 2)  
**Vicente Muñoz** - Patrones de Diseño (Seccion 1)

            

## 🎯 Objetivo del Proyecto

El objetivo de este sistema es crear una aplicación de consola que permita generar credenciales personalizadas para los asistentes a un evento.
Cada credencial contiene datos como nombre, cargo y RUT del participante. 
Para lograr esto de forma eficiente y organizada, se implementan los patrones de diseño Singleton, para manejar la configuración general del evento y Prototype para clonar una plantilla base de credencial y así evitar crear cada una desde cero.


## Como Ejecutar  
**1. Clonar el repositorio**  


git clone https://github.com/Vicalex21/GeneradorCredenciales.git  
cd GeneradorCredenciales/ProyectoPatrones0705  


**2. Compilar Archivos .java**   


PowerShell    
javac -d . .\src\proyectopatrones0705\*.java


**3. Ejecutar el Programa**  

java proyectopatrones0705.Main

