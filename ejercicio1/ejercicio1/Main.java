public class Main {
    public static void main(String[] args) {
        int start = 1;
        int end = 10;
        
        System.out.println("Números pares entre " + start + " y " + end + ":");
        for (int i = start; i < end; i++) {
            if (i % 2 == 0) {  
                System.out.println(i);
            }
        }
// Depurando podemos ver que los bucles for no están bien definidos, los colocamos correctamente y el programa funciona.
        System.out.println("Números impares entre " + start + " y " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 1) {  
                System.out.println(i);
            }
        }
    }
}
