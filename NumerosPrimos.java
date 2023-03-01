
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
static boolean esPrimo(int numero){
        int contador = 0;
        
        int[] numeros = new int[numero];
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = i+1;
        }
        
        for(int i : numeros){
            
            if (i == 1 || i == numero){
                continue;
            }
            
            if(numero % i == 0){
                contador++;
            }
        }
        
        return contador == 0;
    }
    }