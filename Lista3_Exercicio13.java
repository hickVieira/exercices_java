import java.util.Scanner;

class Lista3_Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("insira o numero >> ");
        int num = Integer.parseInt(scanner.nextLine());

        boolean isPrimo = true;
        for (int i = num - 1; i > 1; i--) {
            if (num % i == 0) {
                isPrimo = false;
                break;
            }
        }

        System.out.print("é primo = " + (isPrimo ? "sim" : "não"));
    }
}