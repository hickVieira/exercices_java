// 2.	Elaborar um programa em Java para ler somente a parte numérica da placa de um carro e apresentar o dia do rodízio (em SP) para o mesmo (digitar apenas um número com 4 dígitos).

import java.util.Scanner;

class Lista2_Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva os 4 numeros da placa.");

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

                if (userInput.length() != 4) {
                    System.out.println("Erro: placa errada.");
                    continue;
                }

                int lastNum = Character.getNumericValue(userInput.charAt(3));

                switch (lastNum) {
                    case 1:
                    case 2:
                        System.out.println("Segunda");
                        break;
                    case 3:
                    case 4:
                        System.out.println("Terça");
                        break;
                    case 5:
                    case 6:
                        System.out.println("Quarta");
                        break;
                    case 7:
                    case 8:
                        System.out.println("Quinta");
                        break;
                    case 9:
                    case 0:
                        System.out.println("Sexta");
                        break;
                }

                // if (lastNum == 1 || lastNum == 2)
                // System.out.println("Segunda");
                // else if (lastNum == 3 || lastNum == 4)
                // System.out.println("Terça");
                // else if (lastNum == 5 || lastNum == 6)
                // System.out.println("Quarta");
                // else if (lastNum == 7 || lastNum == 8)
                // System.out.println("Quinta");
                // else if (lastNum == 9 || lastNum == 0)
                // System.out.println("Sexta");
            }
        }
    }
}