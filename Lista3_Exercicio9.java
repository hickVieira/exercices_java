import java.util.Scanner;

class Lista3_Exercicio9 {
    static void fib(int n) {
        if (n > 0) {
            System.out.println(1);
            if (n > 1)
                System.out.println(1);
            if (n < 3)
                return;
        }
        _fib(n - 2, 1, 1);
    }

    static void _fib(int n, int num1, int num2) {
        if (n > 0) {
            int sum = num1 + num2;
            System.out.println(sum);
            _fib(--n, num2, sum);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("insira quantiadade de nums >> ");
        int numCount = Integer.parseInt(scanner.nextLine());

        fib(numCount);
    }
}