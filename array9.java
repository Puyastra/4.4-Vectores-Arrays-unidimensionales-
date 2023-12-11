/**Ejercicio con el objetivo de  Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores
 *enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10)
 * @author Enrique García Herrera
 */
public class array9 {
    public static void main(String[] args) {
        int[] n = new int[100];
        for(int valor = 0; valor < 100;valor++){
            (n[valor]) = (int)(1+Math.random()*10);
        }
        System.out.println("Escribe un número entre 1 y 10:");
        int N = Integer.parseInt(System.console().readLine());
        System.out.println("Tu número aparece en la posición:");
        for(int posicion = 0; posicion < 100;posicion++){
            if (n[posicion] == N) {
                System.out.println(posicion);
            }
        }
    } 
}
