import java.util.Scanner;

class Lista3_Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("insira o numero >> ");
        int num = Integer.parseInt(scanner.nextLine());

        boolean isQuadradoPerfeito = false;
        int sum = 1;
        for (int i = 3;; i += 2) {
            if (sum > num)
                break;

            if (sum == num) {
                isQuadradoPerfeito = true;
                break;
            }
            
            sum += i;
        }

        System.out.print("é quadrado perfeito = " + (isQuadradoPerfeito ? "sim" : "não"));
    }
}