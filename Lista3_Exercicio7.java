import java.util.Random;

class Lista3_Exercicio7 {
    public static void main(String[] args) {
        Random rand = new Random();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 20; i++) {
            int randNum = (1 + rand.nextInt(50));
            min = Math.min(min, randNum);
            max = Math.max(max, randNum);
        }

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}