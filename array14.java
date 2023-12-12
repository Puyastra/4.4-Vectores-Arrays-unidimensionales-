/**Ejercicio con el objetivo de Crea un programa que cree un array de enteros
 * @author Enrique García Herrera
 */
public class array14 {
    public static void main(String[] args) {
        int[] array = new int[100]; // Crear un array de tamaño grande

        int index = 0;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                if (index < array.length) {
                    array[index] = i;
                    index++;
                } else {
                    break; // Detener el bucle por si se llena el array
                }
            }
        }

        // Mostrar la secuencia generada
        System.out.println("La secuencia generada es:");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
