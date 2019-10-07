# language: es
Característica: Yo como usuario de la pagina wong,
  Quiero acceder al portal web
  Para agregar un producto al carrito de compras

  Escenario: Agregar un producto al carrito de compras y validar que ha sido agregado exitosamente
    Dado que estoy en la pagina de compras
    Y he realizado la busqueda de "freidor"
    Cuando carguen la lista deberia poder agregar al carrito "Imaco Freidora de Aire 2.6 Lt 1400 W Negro"
    Entonces al revisar el carrito de compras deberia poder ver mi producto "Imaco Freidora de Aire 2.6 Lt 1400 W Negro" agregado exitosamente