import java.util.Random;

class Lista4_Exercicio2 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] nums = new int[20];
        boolean[] isPar = new boolean[20];
        float sumPares = 0;
        int numPares = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = 1 + rand.nextInt(50);
            if (nums[i] % 2 == 0) {
                isPar[i] = true;
                numPares++;
                sumPares += nums[i];
            } else {
                isPar[i] = false;
            }
        }

        for (int i = 0; i < nums.length; i++)
            System.out.println(String.format("nums[%d] = %d (%s)", i, nums[i], isPar[i] ? "par" : "impar"));

        System.out.println("Média dos numeros pares = " + sumPares / numPares);
    }
}