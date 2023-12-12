/**Ejercicio con el objetivo de hacer un programa que permita al usuario almacenar una secuencia aritmética en un array y
 * luego mostrarla.
 * @author Enrique García Herrera
 */
public class array13 {
    public static void main(String[] args) {
        int V = Integer.parseInt(System.console().readLine("Ingresa el valor inicial: "));
        int I = Integer.parseInt(System.console().readLine("Ingresa el incremento: "));
        int N = Integer.parseInt(System.console().readLine("Ingresa el número de valores a crear: "));

        int[] secuencia = new int[N];

        for (int i = 0; i < N; i++) {
            secuencia[i] = V + (i * I);
        }

        System.out.println("La secuencia aritmética es:");
        for (int valor : secuencia) {
            System.out.print(valor + ".");
        }
    }
}
