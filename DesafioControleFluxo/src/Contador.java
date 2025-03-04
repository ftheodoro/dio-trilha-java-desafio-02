import java.util.InputMismatchException;
import java.util.Scanner;

import exceptions.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();

            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();

            try {
                contar(parametroUm, parametroDois);

            } catch (ParametrosInvalidosException exception) {
                System.out.println("Error: O segundo parâmetro deve ser maior que o primeiro");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Somente Numeros Inteiros");
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroDois < parametroUm) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número " + (i + 1));
        }
    }
}