# Soluciones

Esta solución muestra una implementación sencilla del patrón Singleton en Java.

## Archivos

- `ConfiguracionInterfaz.java`: clase Singleton que conserva el idioma y el tamaño de fuente.
- `PantallaInicio.java`: consulta la configuración compartida desde la pantalla de inicio.
- `PantallaAjustes.java`: consulta la misma configuración desde la pantalla de ajustes.
- `Main.java`: modifica la configuración, muestra las dos pantallas y comprueba que las referencias apuntan al mismo objeto.

## Elementos del patrón

La clase `ConfiguracionInterfaz` impide crear objetos desde fuera mediante un constructor `private`. La propia clase conserva la única instancia en un atributo `static` y permite recuperarla mediante `getInstancia()`.

Las pantallas no reciben una copia de la configuración ni utilizan `new ConfiguracionInterfaz()`. Ambas llaman a `getInstancia()` y, por tanto, consultan el mismo objeto.

## Compilación y ejecución

Desde esta carpeta:

```text
javac -encoding UTF-8 ConfiguracionInterfaz.java PantallaInicio.java PantallaAjustes.java Main.java
java Main
```

## Salida esperada

```text
Pantalla Inicio - Idioma: EN, tamaño de fuente: 20
Pantalla Ajustes - Idioma: EN, tamaño de fuente: 20
¿Las referencias apuntan al mismo objeto? true
```

El último mensaje demuestra que `getInstancia()` devuelve siempre la misma instancia.
