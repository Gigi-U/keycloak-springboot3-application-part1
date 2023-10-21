# urriza_y_spreafichi_gisela_parcial1_eb2 🚀👾
Spring boot 3.1.2  -  keycloak 21.0.1  - java 17
2 microservices - gateway - discovery - config server

 
⚠️LEVANTAR MICROSERVICIOS ⚠️

PASOS:

    1.	Docker Desktop
    2.	Config-server
    3.	Ms-discovery
    4.	Ms-bills
    5.	Ms-gateway

⚠️Keycloak Users ⚠️

   1. gisela (con rol) - acceso a listado
   2. cosme (sin rol) -sin acceso a recursos
      
# Trabajo práctico

Comenzamos a agregar módulos para un e-commerce existente, para esta etapa nos piden un microservicio que se encargue de gestionar las facturas de los clientes y que, entre otras cosas, nos facilite la descarga de facturas. El equipo de desarrollo avanzó creando un API gateway y creando el microservicio Bills, encargado de gestionar las facturas. 
Diagrama del sistema:
 
Queda pendiente agregar seguridad al sistema, por lo tanto, se nos pide:

👉🏻 En KeyCloak

    ✔️    Crear un client para luego configurar en el gateway con el tipo de acceso en confidencial. (client-secret)
    ✔️    Crear el rol “USER”.
    ✔️    Crear al menos un usuario y asignarle el rol “USER”.
    
👉🏻 En API gateway:

    ✔️    Restringir el consumo de las APIs solo a usuarios autenticados.
    ✔️    Si el usuario no está autenticado, deberá ser redirigido al login de Keycloak (usar el client creado en Keycloak).
    ✔️    Agregar el filtro TokenRelay para enviar el token al resto de los microservicios.
    
👉🏻 En el microservicio Bills:

    ✔️    Restringir el consumo de las API solo a usuarios autenticados.
    ✔️    Agregar un JWTConverter personalizado para obtener los roles y el scope del JWT para luego hacer restricciones.
    ✔️    Permitir solo a usuarios con rol “USER” consumir el endpoint bills/all.
    
