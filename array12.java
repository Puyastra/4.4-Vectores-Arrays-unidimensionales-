/**Ejercicio con el objetivo de hacer un menú de array de 10 enteros
 * y luego muestre un menú con opciones a realizar
 * @author Enrique García Herrera
 */
public class array12 {
    public static void main(String[] args) {
        int[] array = new int[10];
        char opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("a. Mostrar valores");
            System.out.println("b. Introducir valor");
            System.out.println("c. Salir");
            System.out.print("Elige una opción: ");
            opcion = System.console().readLine().charAt(0);

            switch (opcion) {
                case 'a':
                    mostrarValores(array);
                    break;
                case 'b':
                    introducirValor(array);
                    break;
                case 'c':
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("Opción no válida. Prueba otra vez.");
                    break;
            }
        } while (opcion != 'c');
    }

    public static void mostrarValores(int[] arr) {
        System.out.println("Valores en el array:");
        for (int valor : arr) {
            System.out.print(valor + " ");
        }
    }

    public static void introducirValor(int[] arr) {
        System.out.print("Introduce el valor a ingresar: ");
        int valor = Integer.parseInt(System.console().readLine());

        System.out.print("Introduce la posición donde insertar (0-9): ");
        int posicion = Integer.parseInt(System.console().readLine());

        if (posicion >= 0 && posicion < arr.length) {
            arr[posicion] = valor;
            System.out.println("Valor insertado en la posición " + posicion );
        } else {
            System.out.println("No sirve. Elige una posición entre 0 y 9 porfa.");
        }
    }
}
