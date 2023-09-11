import java.util.Scanner;

class Lista3_Exercicio12 {
    static int factorial(int n) {
        return n > 0 ? _factorial(n) : 0;
    }

    static int _factorial(int n) {
        return n == 1 ? 1 : n * _factorial(--n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("insira quantiadade de nums >> ");
        int numCount = Integer.parseInt(scanner.nextLine());

        System.out.print("fatorial = " + factorial(numCount));
    }
}