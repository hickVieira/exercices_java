import java.util.Random;
import java.util.Scanner;

class Lista4_Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o numero >> ");
        int num = Integer.parseInt(scanner.nextLine());

        Random rand = new Random();

        int[] nums = new int[20];

        for (int i = 0; i < nums.length; i++)
            nums[i] = 1 + rand.nextInt(50);

        for (int i = 0; i < nums.length; i++)
            System.out.println(String.format("nums[%d] = %d", i, nums[i]));

        System.out.println(String.format("Multiplos de %d:", num));
        for (int i = 0; i < nums.length; i++)
            if (nums[i] % num == 0)
                System.out.println(String.format("nums[%d] = %d", i, nums[i]));
    }
}