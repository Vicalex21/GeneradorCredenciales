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
javac -d . .\ProyectoPatrones0705\src\proyectopatrones0705\*.java


**3. Ejecutar el Programa**  

**Copie**  
java proyectopatrones0705.Main

# 🧬Patrón Prototype – Aplicación

La clase credencial evento implementa el patron de diseño Prototype mediante la interfaz Cloneable. Esto permite crear nuevas credenciales a partir de una plantilla base de forma eficiente, sin necesidad de instanciar objetos desde cero.  

**Ejemplo de uso**  


CredencialEvento plantilla = new CredencialEvento("Vicente", "Organizador", "22.222.222-2");
CredencialEvento clon = plantilla.clone();
System.out.println(clon);

**Salida esperada**  

Nombre: Vicente, Cargo: Organizador, RUT: 22.222.222-2

# 🔒Patrón Singleton – Aplicación  

La clase ConfiguracionEvento aplica el patron Singleton, garantizando una unica instancia con el nombre del evento

**Ejemplo de uso**  

ConfiguracionEvento config = ConfiguracionEvento.getInstance("Nombre del Evento");
System.out.println(config.getNombreEvento());

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

