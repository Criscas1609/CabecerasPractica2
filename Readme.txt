9. Investigue la diferencia del sendRedirect y el getRequestDispatcher

getRequestDispatcher().forward() es adecuado para situaciones en las que necesita conservar la información del usuario
(como parámetros de solicitud, sesiones, etc.) y desea convertir sin que el usuario se dé cuenta, mientras que sendRedirect() es mejor
para los casos en los que Redirecciones externas donde no se puede acceder a los datos de la solicitud original.

10. Investigue los códigos de estados de respuesta HTTP:

Respuestas de información: estas respuestas se utilizan para informar al cliente que se ha recibido una solicitud y que el servidor la
está procesando.  Algunos ejemplos de códigos incluyen 100 (Continuo), 101 (Protocolo de conmutación) y 102 (Procesamiento).
Respuestas de éxito: estas respuestas indican que la solicitud del cliente se completó con éxito. Algunos ejemplos de códigos incluyen 200
(normal), 201 (creado) y 204 (sin contenido).
Respuestas de redirección: estas respuestas se usan para decirle al cliente que la solicitud debe redirigirse a otra ubicación para cumplir
con la solicitud. Algunos ejemplos de códigos 3xx incluyen 301 (Movido permanentemente), 302 (Encontrado) y 304 (No modificado).
Respuestas de error del cliente: estas respuestas indican que la solicitud de un cliente no se pudo completar debido a un error en la solicitud.
Algunos ejemplos de códigos 4xx incluyen 400 (Solicitud incorrecta), 401 (No autorizado) y 404 (No encontrado).
Respuestas de error del servidor: estas respuestas indican que la solicitud del cliente no se pudo completar debido a un error del servidor.
Algunos ejemplos de códigos 5xx incluyen 500 (Error interno del servidor), 502 (Puerta de enlace incorrecta) y 503 (Servicio no disponible).

16. Investigue que son las sesiones y cuáles son sus diferentes con las cookies, liste y describa las diferencias.

Las sesiones, estas representan una serie de solicitudes web realizadas por el usuario en un sitio web en particular. Durante la sesión, el servidor
crea un objeto de sesión para el usuario y le asigna un ID de sesión único. Este ID de sesión se almacena en una cookie en el navegador del usuario,
aunque también se puede utilizar una URL con parámetros de sesión. El objeto de sesión permite almacenar información específica del usuario, como su
nombre de usuario, historial de compras y configuración de idioma. Estos datos se pueden acceder y modificar durante toda la sesión, lo que resulta
en una experiencia personalizada para el usuario.

En comparación, las cookies son archivos de texto pequeños que se almacenan en el navegador del usuario. Las cookies se utilizan para mantener el estado
de la sesión del usuario en el lado del cliente. Cuando un usuario visita un sitio web, el servidor puede enviar una o más cookies al navegador del
usuario para almacenar información como su nombre de usuario, historial de compras y preferencias de idioma. El navegador del usuario guarda estas cookies
y las envía de vuelta al servidor en cada solicitud, permitiendo al servidor mantener un seguimiento del estado de la sesión.

En cuanto a sus ventajas, las sesiones se almacenan en el servidor, lo que las hace más seguras que las cookies, ya que no se pueden leer ni modificar desde
el lado del cliente. Además, las sesiones no tienen límite de tamaño, lo que las hace adecuadas para almacenar grandes cantidades de datos. Por su parte,
las cookies son más fáciles de implementar y requieren menos recursos del servidor que las sesiones. También pueden tener una duración específica, lo que
les permite mantener el estado de la sesión del usuario durante un período de tiempo determinado, incluso después de que el usuario cierre el navegador.