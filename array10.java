public class array10 {
    public static void main(String[] args) {
        System.out.println("Escribe la cantidad de alturas que quieres poner:");
        int N = Integer.parseInt(System.console().readLine());
        double suma= 0;
        double max = 0;
        double min = N;
        double[] alturas = new double[N];
        for(int posicion = 0; posicion < N; posicion++){
            System.out.println("");
            System.out.println("Escribe tu altura (" + (posicion+1) + "/" + N + ")" );
            alturas[posicion]=Double.parseDouble(System.console().readLine());
            suma = alturas[posicion] + suma;
            if (alturas[posicion] > max) {
                max = alturas[posicion];
            } if (alturas[posicion] < min) {
                min = alturas[posicion]; 
            }
        }
        double media = suma/N;
        System.out.println("");
        System.out.println("La altura mínima es:" + min);
        System.out.println("La altura máxima es:" + max);
        System.out.println("La altura media es:" + media);

    }
}
