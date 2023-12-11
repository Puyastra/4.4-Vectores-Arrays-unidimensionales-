public class array11 {
    public static void main(String[] args) {
        int[] array1 = new int[100];
        int[] array2 = new int[100];
        for(int posicion = 0; posicion<100; posicion++){
            array1[posicion] = posicion+1;
        }
        for(int posicion = 0; posicion<100;posicion++){
            array2[posicion] = array1[99-posicion];
        }
        for(int posicion = 0;posicion<100;posicion++){
            System.out.println(array1[posicion]);
        }
        for(int posicion = 0; posicion<100;posicion++){
            System.out.println(array2[posicion]);
        }
    }    
}
