### keycloak-springboot3-application-part1 🚀👾

# Integrated Billing and Security System 🔐📊
Microservices Deployment 🚀 - Using Spring Boot 3.1.2 and Java 17.

## Environment Configuration:

      Docker Desktop: Make sure Docker Desktop is installed for efficient container management.
    
      Config-server: Initiate the centralized configuration service for consistent configuration management.
    
      Ms-discovery: Deploy the discovery service to maintain microservices availability and scalability.
    
      Ms-bills: Implement the billing microservice designed to efficiently manage customer invoices.
    
      Ms-gateway: Launch the API Gateway, acting as a Keycloak client.
  
      Ms-users: Another Keycloak client microservice for additional functionalities.

## Security Configuration with Keycloak ⚠️
Users and Roles:

    gisela (with the "USER" role) - Privileged access to the list of invoices.
    cosme (without a role) - No access to the visualization of all invoices.
    provider1 (no role but in the PROVIDERS group)
    provider2 (no role but in the PROVIDERS group)
    
## Key Features:
In this project, we have integrated a highly secure and scalable billing system. Below are some key features:

🔐 Advanced Security:

Authentication and authorization based on Keycloak.
Roles and user groups managed centrally.
🌐 Microservices Architecture:

Efficient deployment and scalability through independent microservices.
Use of Spring Boot 3.1.2 and Java 17 for optimal performance.
🔄 Service Discovery:

## Implementation of a discovery service to maintain availability and facilitate system expansion.

Microservices Development: ✨
Billing Microservice (Ms-bills):
Model-View-Controller (MVC):

    Model:
    Data logic management and database connection for representing invoices.
    View:
    Data presentation through responses to invoice search requests.
    Controller:
    Handling requests for invoice creation and search.

Users Microservice (Ms-users):
Model-View-Controller (MVC):

    Model:
    Interaction with the database and data representation of user and associated invoices.
    View:
    Response to requests serves as the visual representation of the data.
    Controller:
    Definition of controllers for user and invoice search.
    
## Security Configuration in Keycloak:
    Client and Role Management:
    Creation of clients for secure authentication and authorization of the API Gateway and microservices.
    Definition of roles, assignment to users, and groups for controlled access.
    API Gateway (Ms-gateway):
    Routing and Filtering:
    Integration of microservices and request filtering to ensure proper authentication and authorization.
    Addition of routes for access to the user microservice.
    
## Featured ENDPOINTS:
Fetch all invoices - User Role

    http://localhost:8090/api/v1/bills/all
    User: gisela
    Password: password

Create a new invoice - Providers Group

    Postman:
    POST -> http://localhost:8086/bills/create
    BODY ->
    json
    Copy code
    {
        "customerBill": "d94704ec-c9f5-48f2-9f4a-3e6bd57ad0c9",
        "productBill": "courses/Java",
        "totalPrice": 2400.0
    }
    Authorization token needed. Must be provider1 or provider2.

Search invoice by user ID - No Role or Group Needed, Only Authenticated User

    http://localhost:8090/api/v1/bills/find/d94704ec-c9f5-48f2-9f4a-3e6bd57ad0c9
    or
    http://localhost:8090/api/v1/users/find/d94704ec-c9f5-48f2-9f4a-3e6bd57ad0c9
    
    User: cosme
    Password: password

____________________________________________________________________________________________
ESPAÑOL
____________________________________________________________________________________________


## Sistema Integrado de Facturación y Seguridad 🔐📊

Despliegue de Microservicios 🚀
Configuración del Entorno:

    Docker Desktop: Asegúrate de tener Docker Desktop instalado para una gestión eficiente de contenedores.
    
    Config-server: Inicia el servicio de configuración centralizada para una administración coherente de las configuraciones.
    
    Ms-discovery: Despliega el servicio de descubrimiento para mantener la disponibilidad y escalabilidad de microservicios.
    
    Ms-bills: Implementa el microservicio de facturación diseñado para gestionar eficazmente las facturas de los clientes. Utilizando Spring Boot 3.1.2 y Java 17.
    
    Ms-gateway: Lanza el API Gateway, actuando como cliente de Keycloak.
    
    Ms-users: Otro microservicio cliente de Keycloak para funcionalidades adicionales.

Configuración de Seguridad con Keycloak ⚠️
Usuarios y Roles:

    gisela (con el rol "USER") - Acceso privilegiado al listado de facturas.
    cosme (sin rol) - Sin acceso a la visualización de todas las facturas.
    provider1 (sin rol pero en el grupo PROVIDERS)
    provider2 (sin rol pero en el grupo PROVIDERS)
    
## Características Destacadas:
En este proyecto, he integrado un sistema de facturación altamente seguro y escalable. A continuación, se destacan algunas de las características clave:

🔐 Seguridad Avanzada:

    Autenticación y autorización basadas en Keycloak.
    Roles y grupos de usuarios gestionados de manera centralizada.

🌐 Arquitectura de Microservicios:

    Despliegue eficiente y escalabilidad mediante microservicios independientes.
    Utilización de Spring Boot 3.1.2 y Java 17 para un rendimiento óptimo.

🔄 Descubrimiento de Servicios:

    Implementación de un servicio de descubrimiento para mantener la disponibilidad y facilitar la expansión del sistema.

## Desarrollo de Microservicios: ✨

- Microservicio de Facturación (Ms-bills):
  
Modelo Vista Controlador (MVC):

    Modelo (Model):
    Gestión de la lógica de datos y conexión con la base de datos para representar facturas.
    Vista (View):
    Presentación de datos a través de las respuestas a las solicitudes de búsqueda de facturas.
    Controlador (Controller):
    Manejo de solicitudes de creación y búsqueda de facturas.
    
- Microservicio de Usuarios (Ms-users):

Modelo Vista Controlador (MVC):

    Modelo (Model):
    Interacción con la base de datos y representación de datos de usuario y facturas asociadas.
    Vista (View):
    La respuesta a las solicitudes sirve como la representación visual de los datos.
    Controlador (Controller):
    Definición de controladores para la búsqueda de usuarios y sus facturas.
    
## Configuración de Seguridad en Keycloak:
Gestión de Clientes y Roles:

    Creación de clientes para la autenticación y autorización seguras del API Gateway y los microservicios.
    Definición de roles, asignación a usuarios y grupos para un acceso controlado.
    
API Gateway (Ms-gateway)

Ruteo y Filtrado
    Integración de microservicios y filtrado de solicitudes para asegurar la autenticación y autorización adecuadas.
    Adición de rutas para el acceso al microservicio de usuarios.
    
## ENDPOINTS Destacados:
Traer todas las facturas - Rol Usuario

    http://localhost:8090/api/v1/bills/all
    Usuario: gisela
    Contraseña: password
    Crear nueva factura - Grupo Proveedores

Postman:

    POST -> http://localhost:8086/bills/create
    CUERPO ->
    json
    Copy code
    {
        "customerBill": "d94704ec-c9f5-48f2-9f4a-3e6bd57ad0c9",
        "productBill": "courses/Java",
        "totalPrice": 2400.0
    }
    Se necesita un token de autorización. Debe ser provider1 o provider2.
    
Buscar factura por ID de usuario - Sin Rol o Grupo Necesario, Solo Usuario Autenticado

    http://localhost:8090/api/v1/bills/find/d94704ec-c9f5-48f2-9f4a-3e6bd57ad0c9
    o
    
    http://localhost:8090/api/v1/users/find/d94704ec-c9f5-48f2-9f4a-3e6bd57ad0c9
    
    Usuario: cosme
    Contraseña: password
