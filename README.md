# Reporte de cobertura

![image](/Ejemplo/assets/Screenshot%202024-07-28%20211807.png)

# Benchmark

![image](/Ejemplo/assets/Screenshot%202024-07-28%20215856.png)

En las pruebas realizadas se usa el modo "avgt", cantidad de operaciones completadas por milisegundo en promedio.

En este caso, el uso de stream(avg de 6.66 ms) es más eficiente que parallelStream(avg de 10.254 ms) debido a la
simplicidad de la tarea y la sobrecarga asociada con el paralelismo. Para tareas más complejas o intensivas en CPU,
seguramente el paralelismo proporcionaria un beneficio significativo por sobre Stream.
Una posible explicacion a lo que vemos es que esto se podria deber a la sobrecarga inherente al uso de múltiples hilos y
la coordinación de tareas paralelas. Dado que la operación de filtrado es relativamente simple y rápida, la sobrecarga
del paralelismo no se justifica en este caso.

# Correcciones - Estado: RE-ENTREGA

## Necesarias para aprobar:

- Las imágenes no se veían en el README.md. No deberían de referenciarlas con la url desde github, sino localmente
  usando rutas relativas.
- En el ejercicio del benchmark, NO utilizan el modo AVGT...
- Ejercicio 1: en los tests no utliza @BeforeEach (solo utiliza en AvionComercialTest), codigo repetido que se pisa ya
  que no se renueva en cada @Test.
- Ejercicio 2: Deben duplicar el codigo anterior, no modificarlo en el mismo archivo. NO utilizar
  optimizaciones del compilador JIT (Just In Time). Para ésto deberían de utilizar el objeto BlackHole, el cual les
  permite tener resultados sin sesgos en cuanto a la optimización del compilador, pueden ver un ejemplo
  acá https://www.baeldung.com/java-microbenchmark-harness#dead-code-elimination
- Ejercicio 3: Hace un .get() por cada tarea, debería de utilizar otro método de CompletableFuture para poder esperar a
  todas las tareas juntas como por ejemplo ".thenRun()".