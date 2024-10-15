# Proyecto: Gestión de Notas con Java

Este proyecto consiste en un programa en Java que utiliza la Programación Orientada a Objetos (POO) y vectores para manejar un conjunto de notas ingresadas por el usuario. Se calcula la nota máxima, mínima y el promedio de las notas. El proyecto utiliza una interfaz gráfica sencilla con `JOptionPane` para ingresar las notas.

## Contenido del Proyecto

El proyecto está compuesto por dos clases principales:

1. **Cuenta**: Esta clase gestiona un vector de notas y contiene métodos para crear el vector, establecer y obtener valores en el mismo, y realizar los cálculos de la nota máxima, mínima y el promedio.
2. **Main**: La clase principal que utiliza `Cuenta` para solicitar al usuario que ingrese las notas, las muestra en consola y realiza los cálculos correspondientes.

## Requisitos

- **Java Development Kit (JDK)** 8 o superior.
- Un entorno de desarrollo como **IntelliJ IDEA** o **Eclipse** (opcional).
- Conocimientos básicos de Java, POO, y vectores.

## Descripción del Código

### Clase `Cuenta`

Esta clase administra las notas a través de un vector de enteros y ofrece varios métodos para manipularlas:

- **Atributos**:
  - `vector[]`: almacena las notas.
  - `tamanio`: define el tamaño del vector (10 notas en este caso).

- **Métodos**:
  - `crearVector()`: Inicializa el vector de notas con el tamaño definido.
  - `setVector(int pos, int val)`: Establece el valor de una nota en una posición específica.
  - `getVector(int pos)`: Devuelve la nota en una posición específica.
  - `notaMaxima()`: Calcula y devuelve la nota máxima del vector.
  - `notaMinima()`: Calcula y devuelve la nota mínima del vector.
  - `promedioNotas()`: Calcula y devuelve el promedio de las notas.

### Clase `Main`

Esta clase contiene el método `main()` y otros métodos estáticos para interactuar con el usuario, procesar las notas y mostrar los resultados:

- **Métodos**:
  - `mostrarNotas(Cuenta obj, String cadena)`: Muestra las notas ingresadas en formato de vector.
  - `main()`: Controla el flujo del programa. Solicita las notas al usuario, las almacena en el vector y luego muestra la nota máxima, mínima y el promedio.
