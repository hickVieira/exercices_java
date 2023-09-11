import java.util.Scanner;

class Lista5_Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[2][3];
        
        for (int i = 0; i < 2; i++) {
            System.out.println(String.format("Insira a %d linha com elementos separados por espaço: ", i + 1));
            var input = scanner.nextLine();
            var nums = input.split("\\s+");
            for (int j = 0; j < 3; j++)
                array[i][j] = Integer.parseInt(nums[j]);
        }

        // somar
        int sum = 0;
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 3; j++)
                sum += array[i][j];

        // imprimir
        for (int i = 0; i < 2; i++) {
            System.out.print("\n");
            for (int j = 0; j < 3; j++)
                System.out.print(array[i][j] + " ");
        }

        System.out.println("\nSoma = " + sum);
    }
}