# Reporte de cobertura

![image](https://github.com/valvoMartin/ucse-prog2-2023-U2-ValvoMartin/blob/main/Ejemplo/assets/Screenshot%202024-07-28%20211807.png)

# Benchmark
![image](https://github.com/valvoMartin/ucse-prog2-2023-U2-ValvoMartin/blob/main/Ejemplo/assets/Screenshot%202024-07-28%20215856.png)

En las pruebas realizadas se usa el modo "avgt", cantidad de operaciones completadas por milisegundo en promedio.

En este caso, el uso de stream(avg de 6.66 ms) es más eficiente que parallelStream(avg de 10.254 ms) debido a la simplicidad de la tarea y la sobrecarga asociada con el paralelismo. Para tareas más complejas o intensivas en CPU, seguramente el paralelismo proporcionaria un beneficio significativo por sobre Stream.
Una posible explicacion a lo que vemos es que esto se podria deber a la sobrecarga inherente al uso de múltiples hilos y la coordinación de tareas paralelas. Dado que la operación de filtrado es relativamente simple y rápida, la sobrecarga del paralelismo no se justifica en este caso.
