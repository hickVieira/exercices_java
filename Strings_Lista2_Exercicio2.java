import java.util.Scanner;

public class Strings_Lista2_Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEscreva o nome >> ");
        String name = scanner.nextLine();

        System.out.print("\n");

        for (int i = 0; i < name.length(); i++)
            if ((i + 1) % 2 != 0)
                System.out.print(name.charAt(i));

        System.out.print("\n");
    }
}
