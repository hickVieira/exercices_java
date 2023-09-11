import java.util.Scanner;

class Lista3_Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("insira o numero >> ");
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num; i++) {
            int repeat = i + 1;
            for (int j = 0; j < repeat; j++)
                System.out.print((repeat + j * repeat) + " ");
            System.out.print("\n");
        }
    }
}