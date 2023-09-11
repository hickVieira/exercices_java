// 1.	Elabore um programa em Java que leia um número (de 3 algarismos, faça a validação para aceitar apenas números menores que 1000) e imprima se ele é ascendente. Um número é ascendente se seus algarismos estão em ordem crescente. Por exemplo, o número 258 é ascendente, pois, 2 < 5 e 5 < 8.

import java.util.Scanner;

class Lista2_Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva 3 numeros menores que 1000 e ascendentes (e.g. 258, 2 < 5 < 8).");

        while (true) {
            System.out.print(">> ");
            String userInput = scanner.nextLine();

            if (userInput != null) {
                try {
                    Integer.parseInt(userInput);
                } catch (Exception e) {
                    System.out.println("Erro: " + e.toString());
                    continue;
                }

                int size = userInput.length();

                if (size > 3) {
                    System.out.println("Erro: Numero possui mais que 3 algarismos.");
                    continue;
                }

                if (size < 3) {
                    System.out.println("Erro: Numero possui menos que 3 algarismos.");
                    continue;
                }

                int n0 = Character.getNumericValue(userInput.charAt(0));
                int n1 = Character.getNumericValue(userInput.charAt(1));
                int n2 = Character.getNumericValue(userInput.charAt(2));

                if (!(n0 < n1 && n1 < n2)) {
                    System.out.println("Erro: Numero não é ascendente.");
                    continue;
                }

                System.out.println("Sucesso: O numero " + userInput + " é < 1000 e é ascendente!");
            }
        }
    }
}