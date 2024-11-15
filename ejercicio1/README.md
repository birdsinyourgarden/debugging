## Ejercicio 1

# Ejercicio de Depuración: Identificación de Números Pares e Impares

## Objetivo:
El objetivo de este ejercicio es que identifiques y soluciones errores en el código Java que imprime los números **pares** e **impares** en un rango definido por el usuario. Utilizarás la funcionalidad de depuración (breakpoints) para analizar el flujo de ejecución del programa y corregir los errores lógicos.

## Enunciado:
Se te proporciona un código que tiene como tarea identificar y mostrar los números **pares** e **impares** entre dos valores: `start` (valor inicial) y `end` (valor final). Sin embargo, el código tiene varios errores que impiden que funcione correctamente. Tu tarea será depurar el código paso a paso y corregir los errores que encuentres.

## Instrucciones:

1. **Cargar el Código**: Abre el archivo Java en el entorno de desarrollo de tu elección (Visual Studio Code, Eclipse, etc.).
2. **Analizar el Código**: Examina el código que se te proporciona a continuación. Identifica los errores que están causando que el programa no funcione como debería.
3. **Agregar Breakpoints**: Utiliza la funcionalidad de depuración (breakpoints) para detener la ejecución del código en puntos estratégicos. Inspecciona las variables (`start`, `end`, `i`) para comprender el flujo del programa.
4. **Corregir los Errores**:
   - **Ciclo de Números Pares**: El ciclo no está cubriendo correctamente todo el rango de números. Además, la condición para verificar si un número es par está equivocada.
   - **Ciclo de Números Impares**: La condición para identificar números impares también está incorrecta.
5. **Realizar los Cambios**:
   - Corrige el ciclo de números pares para que incluya el número final (`end`).
   - Corrige la condición para que el programa identifique correctamente los números pares e impares.
6. **Ejecutar y Verificar**: Una vez que hayas corregido los errores, ejecuta el programa nuevamente y verifica que ahora muestre correctamente los números pares e impares entre los valores `start` y `end`.

## Código Inicial Incorrecto:

```java
public class Main {
    public static void main(String[] args) {
        int start = 1;
        int end = 10;
        
        System.out.println("Números pares entre " + start + " y " + end + ":");
        for (int i = start; i < end; i++) {
            if (i % 2 == 1) {  
                System.out.println(i);
            }
        }
        
        System.out.println("Números impares entre " + start + " y " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {  
                System.out.println(i);
            }
        }
    }
}
```

## Resultado Esperado:

Cuando el programa esté corregido, la salida debería ser algo como esto:
Números pares entre 1 y 10: 2 4 6 8 10
Números impares entre 1 y 10: 1 3 5 7 9

