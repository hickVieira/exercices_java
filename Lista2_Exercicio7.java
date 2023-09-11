// 7.	Sejam três números inteiros diferentes digitados pelo usuário, faça um programa em Java que os coloque em ordem crescente. 

import java.util.Scanner;

class Lista2_Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira numeros separados por espaço: num1 num2 num3 ...");

        while (true) {
            System.out.print(">> ");

            try {
                String userInput = scanner.nextLine();
                String[] strs = userInput.split("\\s+");

                int numCount = strs.length;

                // create arrays
                int[] nums = new int[numCount];
                int[] sorted = new int[numCount];

                // populate
                for (int i = 0; i < numCount; i++) {
                    nums[i] = Integer.parseInt(strs[i]);
                    sorted[i] = nums[i];
                }

                // // selection sort
                // for (int i = 0; i < numCount; i++) {
                // int minIndex = i;

                // // find new min
                // for (int j = i; j < numCount; j++) {
                // if (sorted[j] < sorted[i])
                // minIndex = j;
                // }

                // // swap min and i
                // if (minIndex != i) {

                // int temp = sorted[i];
                // sorted[i] = sorted[minIndex];
                // sorted[minIndex] = temp;
                // }
                // }

                // sort
                for (int i = 0; i < numCount; i++) {
                    for (int j = i; j < numCount; j++) {
                        if (sorted[j] < sorted[i]) {
                            int temp = sorted[i];
                            sorted[i] = sorted[j];
                            sorted[j] = temp;
                        }
                    }
                }

                // print
                System.out.print("ordernados =");
                for (int i = 0; i < numCount; i++)
                    System.out.print(String.format(" %d", sorted[i]));
                System.out.print("\n");

            } catch (Exception e) {
                System.out.println("Erro: " + e.toString());
                continue;
            }
        }
    }
}