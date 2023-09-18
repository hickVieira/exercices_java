import java.util.Scanner;

public class Strings_Lista2_Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEscreva a frase >> ");
        String name = scanner.nextLine();

        System.out.print("\n");

        int vogalCount = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = Character.toLowerCase(name.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vogalCount++;
        }

        System.out.println(name + " possui: " + vogalCount + " vogais.");

        System.out.print("\n");
    }
}
