# Parte 01: Fundamentos y Entrada/Salida Estándar

Notas y ejercicios correspondientes a los primeros bloques de la Parte 1 de la Universidad de Helsinki: configuración del entorno, impresión en terminal y lectura de datos con `Scanner`.

---

## 📌 Conceptos Clave Asimilados

1. **Estructura base de un programa:**
   * Toda aplicación en Java requiere al menos una clase (`public class Nombre`) y el método principal `public static void main(String[] args)`, que actúa como punto de entrada de la ejecución.

2. **Salida por consola:**
   * `System.out.println()` imprime el contenido recibido entre comillas y genera un salto de línea automático al final.

3. **Flujo de lectura interactiva (`Scanner`):**
   * Se requiere importar la utilidad `java.util.Scanner`.
   * Inicialización: `Scanner scanner = new Scanner(System.in);` conecta el lector al flujo de entrada estándar del sistema (teclado).
   * El método `scanner.nextLine()` detiene la ejecución del programa hasta que el usuario escribe en consola y pulsa *Enter*, retornando los caracteres como un tipo de dato `String`.

4. **Concatenación de cadenas:**
   * Uso del operador `+` para unir texto estático entre comillas dobles con los valores dinámicos guardados en variables.
  
5. **Tipos de datos básicos y variables:**
   * Java es un lenguaje de tipado estático y fuertemente tipado: toda variable debe declarar su tipo antes de usarse (`String`, `int`, `double`, `boolean`).
   * `int` para números enteros, `double` para números en coma flotante (decimales), `boolean` para valores de verdad (`true` / `false`) y `String` para cadenas de texto.

6. **Conversión y tipado desde entrada estándar (*Parsing*):**
   * El flujo de entrada con `Scanner.nextLine()` siempre devuelve texto crudo (`String`).
   * Para operar con números o booleanos es obligatorio parsear la cadena usando los métodos de sus clases envoltorio (*wrapper classes*): `Integer.valueOf()`, `Double.valueOf()` y `Boolean.valueOf()`.
   * Particularidad de `Boolean.valueOf()`: evalúa a `true` únicamente si la cadena de texto coincide con `"true"` (sin distinguir mayúsculas de minúsculas); cualquier otra entrada devolverá `false`.

---

## 💻 Ejercicios Seleccionados

### 1. Salida en consola en múltiples líneas
* **Ejercicio:** Once Upon a Time
* **Archivo fuente:** [`OnceUponATime.java`](./OnceUponATime.java)
* **Concepto:** Verificación del flujo estándar `System.out` y saltos de línea automáticos.

```java
public class OnceUponATime {

    public static void main(String[] args) {
        System.out.println("Once upon a time");
        System.out.println("there was");
        System.out.println("a program");
    }
}
```

> **Salida por consola esperada:**
```text
Once upon a time
there was
a program
```

* **Archivo fuente:** [`OnceUponATime.java`](./OnceUponATime.java)

---

### 2. Lectura interactiva y concatenación dinámica
* **Ejercicio:** Story
* **Archivo fuente:** [`Story.java`](./Story.java)
* **Concepto:** Captura sucesiva de cadenas por teclado con `Scanner.nextLine()` y reconstrucción de texto con variables.

```java
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String name = scanner.nextLine();

        System.out.println("What is their job?");
        String job = scanner.nextLine();

        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was " + name + ", who was " + job + ".");
        System.out.println("On the way to work, " + name + " reflected on life.");
        System.out.println("Perhaps " + name + " will not be " + job + " forever.");
    }
}
```

> **Ejemplo de ejecución interactiva:**  
> *(Las líneas que comienzan por `>` representan el texto introducido por el usuario)*

```text
I will tell you a story, but I need some information first.
What is the main character called?
> Luis
What is their job?
> Tools seller
Here is the story:
Once upon a time there was Luis, who was Tools seller.
On the way to work, Luis reflected on life.
Perhaps Luis will not be Tools seller forever.
```

* **Archivo fuente:** [`Story.java`](./Story.java)

---

### 3. Captura y conversión de múltiples tipos de datos
- **Ejercicio:** Different Types of Input
- **Archivo fuente:** [`DifferentTypesOfInput.java`](./DifferentTypesOfInput.java)
- **Concepto:** Lectura secuencial de teclado y conversión explícita desde `String` hacia `int`, `double` y `boolean` mediante clases envoltorio.

```java
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 1. String
        System.out.println("Give a string:");
        String text = scan.nextLine();

        // 2. Integer
        System.out.println("Give an integer:");
        int number = Integer.valueOf(scan.nextLine());

        // 3. Double
        System.out.println("Give a double:");
        double floatingNumber = Double.valueOf(scan.nextLine());

        // 4. Boolean
        System.out.println("Give a boolean:");
        boolean trueOrFalse = Boolean.valueOf(scan.nextLine());

        // 5. Salida de resultados
        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + number);
        System.out.println("You gave the double " + floatingNumber);
        System.out.println("You gave the boolean " + trueOrFalse);
    }
}
```

> **Ejemplo de ejecución interactiva:**  
> *(Las líneas que comienzan por `>` representan el texto introducido por el usuario)*

```text
Give a string:
> Aprendiendo Java
Give an integer:
> 12
Give a double:
> 1010.0101
Give a boolean:
> Va a devolver false
You gave the string Aprendiendo Java
You gave the integer 12
You gave the double 1010.0101
You gave the boolean false
```

- **Archivo fuente:** [`DifferentTypesOfInput.java`](./DifferentTypesOfInput.java)
