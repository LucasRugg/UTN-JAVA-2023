package unidad3;

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String abecedario = "abcdefghijklmnñopqrstuvwxyz ";
        System.out.println("Cuanto quiere desplazar?");
        int desplazamiento = leer.nextInt();

        String mensajeOriginal = "hola que tal";
        StringBuilder mensajeCodificado = new StringBuilder();

        for (int i = 0; i < mensajeOriginal.length(); i++) {
            char caracter = mensajeOriginal.charAt(i);
            int indice = (abecedario.indexOf(caracter) + desplazamiento) % abecedario.length();
            if (indice < 0) {
                indice += abecedario.length();
            }
            char nuevoCaracter = abecedario.charAt(indice);
            mensajeCodificado.append(nuevoCaracter);
        }

        System.out.println("Mensaje codificado: " + mensajeCodificado.toString());

        
        StringBuilder mensajeDecodificado = new StringBuilder();
        for (int i = 0; i < mensajeCodificado.length(); i++) {
            char caracter = mensajeCodificado.charAt(i);
            int indice = (abecedario.indexOf(caracter) - desplazamiento) % abecedario.length();
            if (indice < 0) {
                indice += abecedario.length();
            }
            char nuevoCaracter = abecedario.charAt(indice);
            mensajeDecodificado.append(nuevoCaracter);
        }

        System.out.println("Mensaje decodificado: " + mensajeDecodificado.toString());
    }
}
