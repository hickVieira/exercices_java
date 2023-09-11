import java.util.Random;

class Lista4_Exercicio5 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++)
            nums[i] = 1 + rand.nextInt(50);

        System.out.println("Direto");
        for (int i = 0; i < nums.length; i++)
            System.out.println(String.format("nums[%d] = %d", i, nums[i]));

        System.out.println("Inverso");
        for (int i = nums.length - 1; i >= 0; i--)
            System.out.println(String.format("nums[%d] = %d", i, nums[i]));
    }
}