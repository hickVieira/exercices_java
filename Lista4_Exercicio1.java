import java.util.Random;

class Lista4_Exercicio1 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] nums = new int[10];
        boolean[] isPar = new boolean[10];
        int numPares = 0;
        int numImpares = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = 1 + rand.nextInt(50);
            if (nums[i] % 2 == 0) {
                isPar[i] = true;
                numPares++;
            } else {
                isPar[i] = false;
                numImpares++;
            }
        }

        for (int i = 0; i < nums.length; i++)
            System.out.println(String.format("nums[%d] = %d (%s)", i, nums[i], isPar[i] ? "par" : "impar"));

        System.out.println("Quantidade de pares = " + numPares);
        System.out.println("Quantidade de impares = " + numImpares);
    }
}