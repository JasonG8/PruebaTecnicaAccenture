#language:es
@PruebaTecnicaAcccenture
Característica: Realizar proceso de registro y compra exitosamente en la pagina Product Store
  Yo como usuario funcional del sitio web demoBlaze.com
  Quiero que se apliquen las acciones necesarias
  Para validar la funcionalidad  carro de compras

  Antecedentes:
    Dado  que ingreso a la pagina ProductStore

  Escenario:
    Cuando realizo un nuevo registro de usuario
    Entonces me registro exitosamente

  Esquema del escenario: Realizar proceso de compra en la pagina Product Store
    Cuando Inicio sesion con mi usuario y clave en la pagina Product Store
    Entonces Inicio sesion exitosamente
    Cuando selecciono la "<Categoria>" y el "<Producto>"
    Y realizo el proceso de compra
    Entonces realizo la compra exitoasmente
    Ejemplos:
      | Categoria | Producto          |
      | Laptops   | Sony vaio i5      |
      | Phones    | Samsung galaxy s6 |
      | Monitors  | Apple monitor 24  |

