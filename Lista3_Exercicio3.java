import java.util.Scanner;

class Lista3_Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um nome: ");
        String input = scanner.nextLine();

        for (int i = 0; i < 10; i++)
            System.out.println(input);
    }
}