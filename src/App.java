//Crie uma função que vai ler um número e dizer se é positivo, negativo ou zero.

import java.util.Scanner;
public class App {
    
    public static String leitorDeNumero(int numero, String resultado) {
    
    String dizer = "O número " + numero + " " + resultado;
    return dizer;
            
    }
    
    public static void main(String[] args) throws Exception {

        System.out.println("Digite o seu número para saber se é positivo ou negativo");
        Scanner ler = new Scanner(System.in);
        int numeroDeclarado = ler.nextInt();


        if (numeroDeclarado > 0) {
        String numeroPositivo = leitorDeNumero(numeroDeclarado, "é positivo");
            System.out.println(numeroPositivo);
        }
        else if (numeroDeclarado < 0) {
            String numeroNegativo = leitorDeNumero(numeroDeclarado, "é negativo");
            System.out.println(numeroNegativo);
        }
        else {
            String numeroNeutro = leitorDeNumero(numeroDeclarado, "é neutro, pois é zero.");
            System.out.println(numeroNeutro);
        }

    }
}
