import java.util.Random;

class Lista4_Exercicio9 {
    static boolean contains(int[] array, int number) {
        for (int i = 0; i < array.length; i++)
            if (array[i] == number)
                return true;
        return false;
    }

    public static void main(String[] args) {
        Random rand = new Random();

        int[] nums = new int[10];
        
        for (int i = 0; i < nums.length; i++) {
            int randNum = -1;
            do
                randNum = 1 + rand.nextInt(50);
            while (contains(nums, randNum));
            nums[i] = randNum;
        }

        for (int i = 0; i < nums.length; i++)
            System.out.println(String.format("nums[%d] = %d", i, nums[i]));
    }
}