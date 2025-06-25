### Proyecto Final POO
# Software para la gestión de mantenimiento de equipos médicos
## INTRODUCCIÓN
En los últimos años, el área de ingeniería ha venido tomando un papel más activo dentro de las instituciones hospitalarias, especialmente en lo relacionado con los procesos médicos que se apoyan en equipos tecnológicos. Estos equipos permiten hacer seguimiento al estado de los pacientes y apoyar el diagnóstico clínico. Sin embargo, como cualquier otro equipo de uso industrial, requieren cuidados específicos y, en algunos casos, reparaciones y ajustes.

Para minimizar los riesgos asociados a fallas, especialmente en equipos que cumplen funciones de soporte vital, muchas instituciones han optado por implementar protocolos de mantenimiento preventivo y correctivo. Esto no solo ayuda a garantizar el buen funcionamiento de los equipos, sino que también permite reducir el impacto negativo que una falla podría generar en los procesos hospitalarios.

Por esta razón, el presente proyecto propone el desarrollo de un software de gestión de mantenimiento de equipos médicos, aplicando los principios de la programación orientada a objetos. La idea es crear una herramienta que permita llevar un mejor control sobre las actividades de mantenimiento, optimizando tiempos y recursos dentro del entorno hospitalario.

## PROBLEMA 
__El Departamento de Ingeniería Hospitalaria del Hospital Universitario de Caldas necesita contar con un sistema que permita generar y gestionar cronogramas de mantenimiento preventivo y correctivo para todos los equipos médicos de la institución.__ Actualmente, este proceso se realiza de forma manual o con herramientas básicas que no permiten llevar un control eficiente del estado de cada equipo.

La falta de un sistema especializado dificulta el seguimiento oportuno a los mantenimientos, lo que puede aumentar el riesgo de fallas inesperadas, especialmente en equipos críticos para la atención de los pacientes. Por eso, se hace necesario implementar una herramienta que facilite la planificación, el registro y el control de todas las tareas de mantenimiento técnico.

Este sistema debe responder a las necesidades específicas del entorno hospitalario, permitiendo organizar la información de cada equipo, programar sus mantenimientos, registrar las intervenciones realizadas y generar reportes que sirvan de apoyo para la toma de decisiones.

El sistema tiene los siguientes requerimientos:

*	El ingeniero tiene la capacidad de ingresar nuevos equipos al sistema y actualizar la fecha de mantenimiento de los equipos, así como el estado actual del equipo, cada ingeniero técnico de mantenimiento tendrá un nombre, un cargo, cedula, un identificador único dentro del sistema o Nickname, una fecha de inicio y fin de contrato.
  
*	Habrá un ingeniero líder el cual podrá habilitar o deshabilitar los permisos para que los ingenieros y técnicos entren a modificar el estado de los equipos, además de tener la función de contratar a los nuevos ingenieros.
  
*	El sistema le debe permitir a un ingeniero ingresar a su perfil para utilizar las funcionalidades del sistema validando su nickname y su cedula.
  
* Cada equipo debe tener una hoja de vida en la que se registre, el nombre del equipo, la marca, y la placa del equipo que es un numero único de identificación dentro del sistema, la función que realiza el equipo (medición de múltiples parámetros en el caso de un monitor de signos vitales o soporte ventilatorio en el caso de un ventilador), el estado del equipo (en funcionamiento, con averías, desajustado, fuera de servicio, dado de baja). 
*	Las funciones a las que tendrá acceso el administrador son:
    - Visualizar sus datos de usuario 
    -	Registrar usuario 
    -	Visualizar los datos personales de un usuario conociendo la cedula del usuario 
    -	Modificar permisos de usuario ingresando la cedula del usuario 
    -	Registrar equipo 
    -	Visualizar datos del equipo 
    -	Modificar estado del equipo conociendo la placa del equipo 
    -	Asignar fecha de mantenimiento al equipo 
*	Las funciones a las que tendrá acceso un ingeniero con permisos dados por el administrados son: 
    -	Visualizar sus datos de usuario 
    -	Registrar equipo 
    -	Visualizar datos del equipo 
    -	Modificar estado del equipo conociendo la placa del equipo 
    -	Asignar fecha de mantenimiento al equipo 
*	Las funciones a las que tendrá acceso un ingeniero sin permisos dados por el administrados son: 
    -	Visualizar sus datos de usuario 
## TAREAS 
*	Realizar diagrama de clases del sistema planteado.
*	Dar solución mediante Java a los requerimientos dados por el departamento de ingeniería hospitalaria del Hospital Universitario de Caldas.
## CONSIDERACIONES 
*	Diseño modular del software, es decir, uso de estructuras de clases.
*	Documentar el código, agregar comentarios para facilitar la interpretación del código.
## REQUERIMIENTOS
Se entiende por requerimientos al conjunto de características que el sistema debe cumplir o satisfacer para que sea aceptado por el cliente.
A continuación, se representa como quedaron definidos los requerimientos:
### Requerimientos Funcionales
* RF1. El sistema debe permitir acceder a los usuarios registrados, mediante el ingreso de su documento y nickname
* RF2. El sistema debe permitir registrar nuevos usuarios, la información que se debe almacenar del usuario es la siguiente: nombre, documento, nickname, cargo (ingeniero tecnico, Administrador), una fecha de inicio y fin de contrato para ingeniero técnico.
* RF3. El sistema debe permitir modificar información de los usuarios únicamente al administrador, la información que se podrá modificar será: habilitar o deshabilitar los permisos para que los ingenieros y técnicos entren a modificar el estado de los equipos.
* El sistema deberá permitir buscar un usuario por el campo documento.
* ----------
* --------- falta completar Requerimientos
* ---------
  

  
  - Nombre del equipo.
  - Marca del equipo.
  - Placa del equipo.
  - Función del equipo.
  - Estado del equipo. 

### Requerimientos No funcionales 
## DIAGRAMA DE CLASES 
### Primer diagrama
![Diagrama de clases](https://github.com/user-attachments/assets/c0f902ec-7cb3-4fb3-a908-4bf349709022)
### Segundo diagrama - Ampliado
![Diagrama de clases - Ampliado](https://github.com/user-attachments/assets/41a45030-7129-4533-a6a9-a0eb7e5eaf5c)

## GRUPO 
* Antonio Cardona
* Jeisson Guarin
* Leda van Grieken
* Omar Mendez
  

