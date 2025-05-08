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

Cree una nueva carpeta, copie la direccion y peguela (en este caso PowerShell)
**Ejemplo**  
cd C:\Users\Acer\Desktop\Patrones  

**Luego**  

ya estando en la carpeta desde consola copie  

git clone https://github.com/Vicalex21/GeneradorCredenciales.git 

**Despues**  

cd GeneradorCredenciales 


**2. Compilar Archivos .java**   

**Copie**  
javac -d . ./ProyectoPatrones0705/src/proyectopatrones0705/*.java

**3. Ejecutar el Programa**  

**Copie**  
java proyectopatrones0705.Main

# 🧬Patrón Prototype – Aplicación

La clase credencial evento implementa el patron de diseño Prototype mediante la interfaz Cloneable. Esto permite crear nuevas credenciales a partir de una plantilla base de forma eficiente, sin necesidad de instanciar objetos desde cero.  

**Ejemplo de uso**  

![4](https://github.com/user-attachments/assets/e3b8d033-8ad9-4445-8d73-add7f9624af4)


**Salida esperada**  

Nombre: Vicente, Cargo: Organizador, RUT: 22.222.222-2

# 🔒Patrón Singleton – Aplicación  

La clase ConfiguracionEvento aplica el patron Singleton, garantizando una unica instancia con el nombre del evento

**Ejemplo de uso**  

![5](https://github.com/user-attachments/assets/25b29c0c-05e2-41e4-8528-1570211f8cef)


Esto asegura que la configuración del evento sea única y accesible desde cualquier parte del sistema.


# 🖥️Menú por consola

Ingrese el nombre del evento: (ejemplo)

MENU PRINCIPAL
-------------------------------------------
1. Agregar Credencial
2. Ver Credenciales
3. Salir
-------------------------------------------
Seleccione una opcion: 

Ingrese el nombre del evento: Ingrese el nombre del evento: 


# 📊Diagrama de Clases (UML)
![WhatsApp Image 2025-05-07 at 3 43 48 PM](https://github.com/user-attachments/assets/9c36f860-58e7-4f7f-aaa2-da931fafeffb)



# 📸 Captura del sistema funcionando

**1. Registrar nombre del evento**  
![6](https://github.com/user-attachments/assets/502f6f8b-2239-4b60-90e2-f0f8d50dbf62)


**2. Agregar Credenciales**  
![7](https://github.com/user-attachments/assets/a2e5766f-53b0-47e6-893c-86ff2334c40b)


**3. Ver Credenciales**  
![8](https://github.com/user-attachments/assets/6a69da01-8c3f-4fa7-8f10-7a488e2a1300)



