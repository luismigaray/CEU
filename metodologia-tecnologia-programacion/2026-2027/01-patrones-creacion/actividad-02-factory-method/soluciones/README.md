# Soluciones

Esta solución implementa Factory Method para crear campos de texto adaptados a móvil y escritorio.

## Archivos

- `CampoTexto.java`: producto común definido mediante una interfaz.
- `CampoTextoMovil.java` y `CampoTextoEscritorio.java`: productos concretos.
- `Formulario.java`: creador abstracto que declara el Factory Method y utiliza el producto.
- `FormularioMovil.java` y `FormularioEscritorio.java`: creadores concretos que deciden qué producto instanciar.
- `Main.java`: prueba ambos formularios sin crear directamente productos concretos.

## Elementos del patrón

El método `Formulario.mostrar()` trabaja únicamente con el tipo común `CampoTexto`. No necesita saber si el objeto recibido es móvil o de escritorio.

Cada subclase de `Formulario` redefine `crearCampoTexto()` y concentra la decisión sobre qué clase concreta crear. Por eso `Main` utiliza formularios, pero no contiene `new CampoTextoMovil()` ni `new CampoTextoEscritorio()`.

## Compilación y ejecución

Desde esta carpeta:

```text
javac -encoding UTF-8 CampoTexto.java CampoTextoMovil.java CampoTextoEscritorio.java Formulario.java FormularioMovil.java FormularioEscritorio.java Main.java
java Main
```

## Salida esperada

```text
Formulario móvil:
Dibujando campo de texto para MÓVIL
Formulario de escritorio:
Dibujando campo de texto para ESCRITORIO
```

La salida confirma que la lógica común de `Formulario` utiliza productos distintos según el creador concreto.
