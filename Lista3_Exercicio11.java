class Lista3_Exercicio11 {
    public static void main(String[] args) {
        for (int i = 1000; i < 9999; i++) {
            int partL = i / 100;
            int partR = i % 100;

            int sum = partL + partR;
            if (sum * sum == i)
                System.out.println(i);
        }
    }
}