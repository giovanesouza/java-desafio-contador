package edu.giovanesouza;
import edu.giovanesouza.exception.ParametrosInvalidosException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {

            // Chama o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch (Exception ex) {
            // Imprime a mensagem: O segundo parâmetro deve ser maior que o primeiro
            String msg = ex.getMessage();
            System.out.println(msg);
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

        // Se parametroUm > parametroDois -> lança exceção
        if(parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");

        } else {
            int contagem = parametroDois - parametroUm;

            // System.out.println(contagem);

            // Imprime os números com base na variável contagem

            for(int count = 1; count <= contagem; count++) {
                System.out.println("Imprimindo o número " + count);
            }

        }


    }

}
