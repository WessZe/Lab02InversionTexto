package labs02;

import java.util.Arrays;
import java.util.Scanner;

public class Labs02 {

    public static void main(String[] args) {
        Scanner token = new Scanner(System.in);
        System.out.print("Ingrese el texto que desea invertir: ");
        String texto = token.nextLine();

        System.out.println(invertir(texto));

    }

    public static String invertir(String entradaTexto) {

        char textoArray[] = entradaTexto.toCharArray();
        char textoResultado[] = entradaTexto.toCharArray();
        int cont = 0;

//System.out.println(textoArray.length);
        for (int x = 0; x < textoArray.length / 2; x++) {
            if (textoArray[x] >= 65 && textoArray[x] <= 90 || textoArray[x] >= 97 && textoArray[x] <= 122) {
//System.out.println(textoArray[x]);
                for (int y = cont; y < textoArray.length / 2; y++) {
                    int posInv = textoArray.length - y - 1;
//System.out.println(textoArray[posInv]); 
                    if (textoArray[posInv] >= 65 && textoArray[posInv] <= 90 || textoArray[posInv] >= 97 && textoArray[posInv] <= 122) {
//System.out.println(textoArray[y]); 
                        char letraTemp = textoArray[posInv];
                        textoResultado[posInv] = textoArray[x];
                        textoResultado[x] = letraTemp;
//System.out.println(letraTemp);
                        cont++;

                        break;
                    }
                }
            }
        }
        System.out.print("Texto Invertido: ");
        System.out.println(textoResultado);
        //resultado = Arrays.toString(textoResultado);
        return "";
    }
}
