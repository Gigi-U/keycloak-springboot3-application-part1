<<<<<<< HEAD
# keycloak-springboot3-application-part1 🚀👾

Billing and Security Management Project 🚀👾
Microservices Deployment ⚙️
Environment Configuration:
Docker Desktop: Ensure Docker Desktop is installed for efficient container management.

Config-server: Start the centralized configuration service for consistent configuration management.

Ms-discovery: Deploy the discovery service to maintain microservices availability and scalability.

Ms-bills: Implement the billing microservice designed to efficiently manage customer invoices. Using Spring Boot 3.1.2 and Java 17.

Ms-gateway: Launch the API Gateway to provide a unified and secure interface to microservices.

Security Configuration with Keycloak ⚠️
Users and Roles:
gisela (with the "USER" role) - Privileged access to the list of invoices.
cosme (without a role) - No access to sensitive resources.
Implementation Details:
We begin expanding our e-commerce with a crucial module: invoice management. The development team has created the Bills microservice and an API Gateway to orchestrate operations. Using Spring Boot 3.1.2 and Java 17.

System Diagram:

[Insert diagram here]

To strengthen security, a strategy has been applied in Keycloak:

In KeyCloak 👉🏻
Client Creation: Configuration of a confidential client for the API Gateway, ensuring secure authentication using client-secret.

"USER" Role Creation: Establishment of roles for efficient permission management.

Authorized Users: At least one user has been created and assigned the "USER" role to control access.

In API Gateway 👉🏻
Access Restriction: Limitation of API consumption to authenticated users, providing a secure environment.

Redirect to Keycloak Login: Unauthenticated users are redirected to the Keycloak authentication flow through the configured client.

TokenRelay Filter: Integration of the TokenRelay filter to ensure the secure transmission of tokens to microservices.

In the Bills Microservice 👉🏻
Access Control: Restriction of API consumption only to authenticated users, ensuring the confidentiality of operations.

Custom JWTConverter: Integration of a custom JWTConverter to extract roles and scope from the JWT token, allowing granular authorization.

Role Restrictions: Limitation of the bills/all endpoint only to users with the "USER" role, ensuring controlled access.

This README provides a detailed guide for microservices deployment and the implementation of security measures using Keycloak. The structure and approach reflect best practices for a professional project using Spring Boot 3.1.2 and Java 17. Good luck with the development! 🚀👾

____________________________________________________________________________________________


Proyecto de Gestión de Facturación y Seguridad 🚀👾
Despliegue de Microservicios ⚙️
Configuración del Entorno:
Docker Desktop: Asegúrese de tener Docker Desktop instalado para gestionar contenedores de manera eficiente.

Config-server: Inicie el servicio de configuración centralizada para una administración coherente de las configuraciones.

Ms-discovery: Despliegue el servicio de descubrimiento para mantener la disponibilidad y escalabilidad de microservicios.

Ms-bills: Implemente el microservicio de facturación diseñado para gestionar eficazmente las facturas de los clientes. Utilizando Spring Boot 3.1.2 y Java 17.

Ms-gateway: Ponga en marcha el API Gateway para proporcionar una interfaz unificada y segura a los microservicios.

Configuración de Seguridad con Keycloak ⚠️
Usuarios y Roles:
gisela (con rol "USER") - Acceso privilegiado al listado de facturas.
cosme (sin rol) - Sin acceso a recursos sensibles.
Detalles de Implementación:
Comenzamos la expansión de nuestro e-commerce con un módulo crucial: la gestión de facturas. El equipo de desarrollo ha creado el microservicio Bills y un API Gateway para orquestar las operaciones. Utilizando Spring Boot 3.1.2 y Java 17.

Diagrama del Sistema:

[Insertar diagrama aquí]

Para fortalecer la seguridad, se ha aplicado una estrategia en Keycloak:

En KeyCloak 👉🏻
Creación de Cliente: Configuración de un cliente confidencial para el API Gateway, garantizando una autenticación segura mediante client-secret.

Creación de Rol "USER": Establecimiento de roles para una gestión eficiente de permisos.

Usuarios Autorizados: Se ha creado al menos un usuario y se le ha asignado el rol "USER" para controlar el acceso.

En API Gateway 👉🏻
Restricción de Acceso: Limitación del consumo de APIs a usuarios autenticados, proporcionando un entorno seguro.

Redirección a Login de Keycloak: Usuarios no autenticados son redirigidos al flujo de autenticación de Keycloak a través del cliente configurado.

TokenRelay Filter: Integración del filtro TokenRelay para asegurar la transmisión segura de tokens a los microservicios.

En el Microservicio Bills 👉🏻
Control de Acceso: Restricción del consumo de APIs solo a usuarios autenticados, garantizando la confidencialidad de las operaciones.

JWTConverter Personalizado: Integración de un JWTConverter personalizado para extraer roles y scope del token JWT, permitiendo una autorización granular.

Restricciones por Rol: Limitación del endpoint bills/all solo a usuarios con el rol "USER", asegurando un acceso controlado.

Este README proporciona una guía detallada para el despliegue de microservicios y la implementación de medidas de seguridad mediante Keycloak. La estructura y el enfoque reflejan las mejores prácticas para un proyecto profesional utilizando Spring Boot 3.1.2 y Java 17. ¡Éxito en el desarrollo! 🚀👾