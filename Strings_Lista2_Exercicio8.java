import java.util.Scanner;

public class Strings_Lista2_Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEscreva a frase >> ");
        String name = scanner.nextLine();

        System.out.print("\n");

        for (int i = name.length() - 1; i >= 0; i--)
            System.out.print(name.charAt(i));

        System.out.print("\n");
    }
}
