//CREAREMOS CALENDARIO CON CALENDARFX (LANDER ES OTRA OPCION PERO NO VI MUCHA COMUNIDAD) LIBRERIA ABIERTA PARA 
//CALENDARIOS Y AGENDAS QUE USA JAVAFX (MEJOR QUE SWING QUE ES MAS ANTIGUA Y LA USA JCALENDAR)
//CREO QUE SE PODRÍA VINCULAR CALENCARIO CON API DEL DE GOOGLE, NO SE
//AQUI HACE CALENDARIOS ANGULAR https://programacion.net/articulo/calendario_de_eventos_con_angularjs_1216

//
package com.metas.marketing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MetasMarketingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MetasMarketingApplication.class, args);
	}
      
}

//En general, es más común generar la parte gráfica de un calendario en el frontend de la aplicación, ya que esto permite 
//una mayor flexibilidad y facilita la actualización y el mantenimiento del calendario. Además, si generas la 
//parte gráfica del calendario en el frontend, puedes utilizar herramientas y librerías especializadas para crear 
//una interfaz de usuario atractiva y fácil de usar.
//Sin embargo, si prefieres generar la parte gráfica del calendario en el backend de la aplicación, eso también es 
//posible. En este caso, podrías utilizar una librería de Java para generar el código HTML del calendario y 
//enviarlo al frontend para su visualización. Esta opción puede ser adecuada si quieres tener un mayor control 
//sobre el diseño del calendario o si necesitas integrarlo de alguna manera con el resto del backend de la aplicación

//librerias angular para mostrar calendarios. Angular Calendar: Angular Calendar es una librería de código abierto que te 
//permite mostrar un calendario en tu aplicación web de Angular. Ofrece una amplia variedad de opciones de personalización 
//y es muy fácil de usar.
//FullCalendar: FullCalendar es una librería de código abierto que te permite mostrar un calendario en tu aplicación 
//web de Angular. Es muy popular y ofrece una amplia variedad de opciones de personalización.
//PrimeNG: PrimeNG es un conjunto de componentes de Angular que incluye un componente de calendario. Es muy completo 
//y ofrece una amplia variedad de opciones de personalización.
//Kendo UI: Kendo UI es un conjunto de componentes de Angular que incluye un componente de calendario. Es comercial, 
//pero ofrece una versión gratuita para uso no comercial.


//Angular para crear aplicaciones web SPA (aplicaciones de una pagina, significa que no se carga cada pagina nueva desde 
//el servidor, sino con js según lo que el cliente va pidiendo, se va actulizando esa página que es única, al estilo app
//pero se pueden tener vistas, por ej un boton que se le pone la ruta url hacia otro componente angular,

//Angular es un marco de desarrollo de frontend que se utiliza para crear aplicaciones web. Se ejecuta en el navegador 
//del usuario y se conecta con un backend a través de llamadas a APIs.
//Para utilizar Angular en una aplicación web, debes crear una aplicación de Angular y luego publicarla en un servidor web. 
//Esta aplicación de Angular actúa como el frontend de la aplicación y se encarga de mostrar la interfaz de usuario al 
//usuario y de manejar las interacciones del usuario.
//El backend de la aplicación, por otro lado, se encarga de procesar las solicitudes del usuario y de generar los datos 
//que se muestran en la interfaz de usuario. El backend puede estar escrito en cualquier lenguaje y puede ejecutarse en 
//cualquier servidor web.
//Por lo tanto, en tu caso, si tienes un backend Java corriendo en Tomcat, puedes publicar tu aplicación de Angular en 
//cualquier servidor web y conectarte con él a través de llamadas a APIs. No es necesario publicar la aplicación de 
//Angular en Tomcat. De hecho, es muy común utilizar servidores web diferentes para el frontend y el backend de una 
//aplicación web

// La aplicación de Angular incluye código HTML, CSS y JavaScript, y se ejecuta en el navegador del usuario.
//Cuando el usuario interactúa con la aplicación, Angular actualiza la interfaz de usuario en el navegador sin tener que 
//volver a cargar la página desde el servidor. Esto se logra mediante el uso de JavaScript y el DOM

//Angular se debe publicar en un servidor web (tomcat, Apache HTTP Server (abierto), Nginx (abierto), Microsoft IIS, Google 
//Cloud Platform y en general en cualquier servidor que soporte HTML, CSS y JavaScript).

//A diferencia de Angular y React, que son marcos de desarrollo de frontend que se ejecutan en el navegador del usuario, 
//Thymeleaf se ejecuta en el servidor y se utiliza para generar páginas HTML estáticas o dinámicas.

// Cuando un usuario accede a una aplicación de Angular a través de su navegador, el navegador envía una solicitud al 
//servidor donde se encuentra la aplicación de Angular. El servidor envía entonces la aplicación de Angular al navegador, 
//que la ejecuta y muestra la interfaz de usuario al usuario.
//La aplicación de Angular se ejecuta en el lado del cliente, es decir, en el navegador del usuario. Esto significa 
//que la mayor parte del procesamiento se realiza en el lado del cliente, lo que hace que la aplicación sea más rápida y 
//más sensible.





//Thymeleaf, por otro lado, es un motor de plantillas que se utiliza a menudo para crear aplicaciones web basadas 
//en Java. Es muy popular y fácil de usar, y se integra bien con frameworks de Java como Spring MVC. 
//Una de las principales ventajas de Thymeleaf es que es muy fácil de aprender y tiene una curva de aprendizaje muy suave.
