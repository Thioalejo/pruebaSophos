# pruebaSophos

Se realizo las pruebas con serenity BDD usando cucumber (gherkin) lo cual permite escribir en lenguaje
natural o de usuario lo requerido y este por debajo tiene el codigo para cumplir con esta necesidad.

La cual cuenta con un patron Page object, se le implemento 2 carpetas extra que no pertencen al patron las cuales incluyen Constantes para poner alli la URL base para acceder a la pagina. Se incluye carpeta util, para acciones definidas y que se pueden reutilizar para evitar duplicacion de metodos y usar estos en lugar de repetirlo por pagina.
La estructura cuenta con definicion de objetos pagina, definiciones del feature y pasos a realizar con las paginas creadas.
Por tanto el .Feature tiene los datos de entrada y el resultado esperando, los cuales son enviados por parametro y el codigo realiza la busqueda y validacion del producto buscado.