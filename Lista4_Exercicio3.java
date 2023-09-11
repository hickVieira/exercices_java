import java.util.Random;

class Lista4_Exercicio3 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] nums = new int[20];

        for (int i = 0; i < nums.length; i++)
            nums[i] = 1 + rand.nextInt(50);

        for (int i = 0; i < nums.length; i++)
            System.out.println(String.format("nums[%d] = %d", i, nums[i]));

        System.out.println("Multiplos de 5:");
        for (int i = 0; i < nums.length; i++)
            if (nums[i] % 5 == 0)
                System.out.println(String.format("nums[%d] = %d", i, nums[i]));
    }
}