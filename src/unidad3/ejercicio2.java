package unidad3;

public class ejercicio2 {

    public static void main(String[] args) {
        //Dados 3 números y un orden (ascendente o decreciente) que ordene los
        //mismos y los retorne en un vector de 3
        int aux ;
        int[] numeros = new int [3];
        numeros [0] = 4;
        numeros [1] = 1;
        numeros [2] = 2;
        
        
        
        
        for (int i = 0; i < numeros.length-1; i++) {
            for (int j = 0; j < numeros.length-1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    aux = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = aux;
                    
                }
                
            }
            
        }
        
        System.out.println(numeros[0] + "" + numeros[1]+""+numeros[2]);
        

    }

}
