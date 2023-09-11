// 4.	Escreva um programa em Java que leia o valor de 3 lados de um triângulo e escreva se o triângulo é equilátero, isósceles ou escaleno.
// Observação:
// Triângulo equilátero: possui três lados iguais.
// Triângulo isósceles: possui dois lados iguais.
// Triângulo escaleno: possui três lados diferentes.
// Faça a validação para verificar se os valores dos lados formam um triângulo. Todo lado tem que ser menor que a soma dos outros dois.

import java.util.Scanner;

class Lista2_Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Formula = lado1 lado2 lado3");

        while (true) {
            System.out.print(">> ");
            String userInput = scanner.nextLine();

            try {
                String[] strs = userInput.split("\\s+");

                if (strs.length != 3) {
                    System.out.println("Erro: Formula errada.");
                    continue;
                }

                float lado0 = Float.parseFloat(strs[0]);
                float lado1 = Float.parseFloat(strs[1]);
                float lado2 = Float.parseFloat(strs[2]);

                if (lado0 == lado1 && lado1 == lado2)
                    System.out.println("Triangulo equilatero.");
                else if (lado0 == lado1 || lado0 == lado2 || lado1 == lado2)
                    System.out.println("Triangulo isosceles.");
                else
                    System.out.println("Triangulo escaleno.");

            } catch (Exception e) {
                System.out.println("Erro: " + e.toString());
                continue;
            }
        }
    }
}