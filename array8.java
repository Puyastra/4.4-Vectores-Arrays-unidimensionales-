/**Ejercicio con el objetivo de hacer Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0,
 *utilizando Math.random(), y luego le pida al usuario un valor real R.
 * @author Enrique Garćia Herrera
 */
public class array8 {
    public static void main(String[]args){
        double[] numerosRandom = new double[100];
        for (int contador = 0; contador <100;contador++){
            numerosRandom[contador] = Math.random();
        }
        System.out.println("Escribe un número entre el 0 y el 1:");
        double R = Double.parseDouble(System.console().readLine());
        int mayorOIgual = 0;
        for(int posicion = 0; posicion < 100; posicion++) {
            if (numerosRandom[posicion] >= R) {
                mayorOIgual++;
            }
        }
        System.out.println("Hay un total de " + mayorOIgual + " números que son mayores o iguales a ." + R);
    }
}
