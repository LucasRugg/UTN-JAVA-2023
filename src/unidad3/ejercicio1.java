package unidad3;

public class ejercicio1 {

    public static void main(String[] args) {
        //Dado un String y una letra contar la cantidad de apariciones de la letra
        int cantidadLetra = 0;
        char letraABuscar = 'l';
        char letra;
        String cadena = "Curso de java de la universidad tecnologica nacional";

        for (int i = 0; i < cadena.length(); i++) {
            letra = cadena.charAt(i);
            if (letra == letraABuscar) {
                cantidadLetra++;
            }
        }
        System.out.println("La cantidad de veces que aparece la letra " + letraABuscar + " es " + cantidadLetra);
    }

}
