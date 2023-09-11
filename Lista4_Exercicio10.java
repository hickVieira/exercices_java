import java.util.Random;
import java.util.Scanner;

class Lista4_Exercicio10 {
    static boolean contains(int[] array, int number) {
        for (int i = 0; i < array.length; i++)
            if (array[i] == number)
                return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o numero >> ");
        int num = Integer.parseInt(scanner.nextLine());

        Random rand = new Random();

        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++)
            nums[i] = 1 + rand.nextInt(50);

        System.out.println(String.format("O array %scontém o numero inserido.", contains(nums, num) ? "" : "não "));
        for (int i = 0; i < nums.length; i++)
            System.out.println(String.format("nums[%d] = %d", i, nums[i]));
    }
}