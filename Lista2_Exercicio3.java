// 3.	Faça um programa em Java que lê um conjunto de 3 valores op, base, altura, onde op é um valor inteiro e positivo e base e altura, são quaisquer valores reais. A seguir: 
// a)	    Se op=1 calcular e imprimir a área de um retângulo Area=base*altura. 
// b)	    Se op=2 calcular e imprimir a área de triângulo Area=(base*altura)/2. 

import java.util.Scanner;

class Lista2_Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Formula = op base altura");
        System.out.println("op: 1 ou 2");
        System.out.println("base: > 0");
        System.out.println("altura: > 0");

        while (true) {
            System.out.print(">> ");
            String userInput = scanner.nextLine();

            try {
                String[] strs = userInput.split("\\s+");

                if (strs.length != 3) {
                    System.out.println("Erro: Formula errada.");
                    continue;
                }

                int op = Integer.parseInt(strs[0]);
                float base = Float.parseFloat(strs[1]);
                float altura = Float.parseFloat(strs[2]);

                switch (op) {
                    case 1:
                        System.out.println("Area = base * altura = " + base * altura);
                        break;
                    case 2:
                        System.out.println("Area = (base * altura) / 2 = " + base * altura / 2);
                        break;
                    default:
                        System.out.println("operação desconhecida.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.toString());
                continue;
            }
        }
    }
}