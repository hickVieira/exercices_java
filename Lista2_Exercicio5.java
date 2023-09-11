// 5.	Escreva um programa em java que leia o valor de 3 ângulos de um triângulo e escreva se o triângulo é acutângulo, retângulo ou obtusângulo.
// Observação:
// Triângulo retângulo: possui um ângulo reto (90 graus).
// Triângulo obtusângulo: possui um ângulo obtuso (ângulo maior que 90 graus).
// Triângulo acutângulo: possui 3 ângulos agudos (ângulo menor que 90 graus).
// Faça a validação para verificar se a soma dos ângulos é igual a 180;

import java.util.Scanner;

class Lista2_Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Formula = angulo1 angulo2 angulo3");

        while (true) {
            System.out.print(">> ");

            try {
                String userInput = scanner.nextLine();
                String[] strs = userInput.split("\\s+");

                if (strs.length != 3) {
                    System.out.println("Erro: Formula errada.");
                    continue;
                }

                float angulo0 = Math.abs(Float.parseFloat(strs[0]));
                float angulo1 = Math.abs(Float.parseFloat(strs[1]));
                float angulo2 = Math.abs(Float.parseFloat(strs[2]));

                if (!approximate(angulo0 + angulo1 + angulo2, 180.0f, 0.001f)) {
                    System.out.println("Erro: Soma de angulos != 180.");
                    continue;
                }

                if (angulo0 == 90 || angulo1 == 90 || angulo2 == 90)
                    System.out.println("Triangulo retângulo.");
                else if (angulo0 > 90 || angulo1 > 90 || angulo2 > 90)
                    System.out.println("Triangulo obtusângulo.");
                else if (angulo0 < 90 && angulo1 < 90 && angulo2 < 90)
                    System.out.println("Triangulo acutângulo.");

            } catch (Exception e) {
                System.out.println("Erro: " + e.toString());
                continue;
            }
        }
    }

    static boolean approximate(float num, float target, float epsilon) {
        return Math.abs(target - num) < epsilon;
    }
}