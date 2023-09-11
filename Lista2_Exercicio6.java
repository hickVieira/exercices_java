// 6.	Desenvolva um programa em Java que solicite ao usuário o ano e imprima se é ano bissexto. Um ano é bissexto se for divisível por 4, mas não por 100. Um ano também é bissexto se for divisível por 400.

import java.util.Scanner;

class Lista2_Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o ano");

        while (true) {
            System.out.print(">> ");

            try {
                String userInput = scanner.nextLine();

                int ano = Math.abs(Integer.parseInt(userInput));

                if (ano % 4 == 0 && ano % 100 != 0)
                    System.out.println("Ano bissexto.");
                else
                    System.out.println("Ano não bissexto.");
            } catch (Exception e) {
                System.out.println("Erro: " + e.toString());
                continue;
            }
        }
    }
}