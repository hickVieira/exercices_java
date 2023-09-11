import java.util.Random;

class Lista4_Exercicio8 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] nums = new int[20];
        boolean[] isPar = new boolean[nums.length];
        int countPares = 0;
        int countImpares = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = 1 + rand.nextInt(50);
            if (nums[i] % 2 == 0) {
                isPar[i] = true;
                countPares++;
            } else {
                isPar[i] = false;
                countImpares++;
            }
        }

        int[] numsPares = new int[countPares];
        int[] numsImpares = new int[countImpares];

        for (int i = 0, j = 0, k = 0; i < nums.length; i++)
            if (isPar[i])
                numsPares[j++] = nums[i];
            else
                numsImpares[k++] = nums[i];

        for (int i = 0; i < nums.length; i++)
            System.out.println(String.format("nums[%d] = %d", i, nums[i]));
        for (int i = 0; i < numsPares.length; i++)
            System.out.println(String.format("numsPares[%d] = %d", i, numsPares[i]));
        for (int i = 0; i < numsImpares.length; i++)
            System.out.println(String.format("numsImpares[%d] = %d", i, numsImpares[i]));
    }
}