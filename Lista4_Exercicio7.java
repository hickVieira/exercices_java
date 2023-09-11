import java.util.Random;

class Lista4_Exercicio7 {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++)
            nums[i] = 1 + rand.nextInt(50);

        System.out.println("Raw");
        for (int i = 0; i < nums.length; i++)
            System.out.println(String.format("nums[%d] = %d", i, nums[i]));

        // selection sort O(n²) worst case
        for (int i = 0; i < nums.length; i++) {
            int minIndex = i;

            for (int j = i + 1; j < nums.length; j++)
                if (nums[j] < nums[minIndex])
                    minIndex = j;

            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }

        System.out.println("Ordenado");
        for (int i = 0; i < nums.length; i++)
            System.out.println(String.format("nums[%d] = %d", i, nums[i]));
    }
}