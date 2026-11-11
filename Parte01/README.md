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

---

## 💻 Ejercicios Seleccionados

### 1. Salida en consola en múltiples líneas
* **Ejercicio:** Once Upon a Time
* **Concepto:** Verificación del entorno, bloque `main` y llamadas secuenciales al flujo de salida `System.out`.

```java
public class OnceUponATime {

    public static void main(String[] args) {
        System.out.println("Once upon a time");
        System.out.println("there was");
        System.out.println("a program");
    }
}
```

---

### 2. Lectura múltiple de datos y concatenación compleja
* **Ejercicio:** Story
* **Concepto:** Captura sucesiva de entradas de usuario mediante `Scanner`, almacenamiento en diferentes identificadores `String` e integración de variables dentro de una plantilla de texto.

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
