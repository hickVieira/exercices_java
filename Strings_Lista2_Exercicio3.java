import java.util.Scanner;

public class Strings_Lista2_Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEscreva o nome >> ");
        String name = scanner.nextLine();

        System.out.print("\n");

        for (int i = 0; i < 10; i++)
            System.out.println(name);

        System.out.print("\n");
    }
}
