# Actividad 03 - Builder

Construcción paso a paso de pantallas de perfil y ajustes mediante el patrón Builder.

## Enunciado

- [Consultar la guía y el enunciado completo](enunciado.pdf)
- El ejercicio propuesto aparece en el apartado **8. Constructor de pantallas de usuario**.

## Trabajo solicitado

Debes crear el producto `Pantalla`, la interfaz `PantallaBuilder`, los constructores concretos `PerfilBuilder` y `AjustesBuilder`, y la clase `DirectorPantalla`.

El programa principal debe construir y mostrar una pantalla de perfil y otra de ajustes. `Main` no asignará directamente los atributos internos de `Pantalla`: la configuración concreta permanecerá en cada `ConcreteBuilder` y el orden de construcción será responsabilidad del `Director`.

También debes responder brevemente por qué Builder resulta preferible a un constructor que reciba todos los atributos de la pantalla.

## Entrega

Esta actividad se entrega de forma independiente en la fecha indicada en clase.

La solución se publicará una vez finalizado el plazo de entrega.
