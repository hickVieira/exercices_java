import java.util.Scanner;

class Lista3_Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumPares = 0;
        int sumImpares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print(String.format("insira num %d >> ", i));
            int num = Integer.parseInt(scanner.nextLine());

            if (num % 2 == 0)
                sumPares += num;
            else
                sumImpares += num;
        }

        System.out.println("Soma pares = " + sumPares);
        System.out.println("Soma impares = " + sumImpares);
    }
}