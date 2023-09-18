import java.util.Scanner;

public class Strings_Lista2_Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEscreva o nome >> ");
        String name = scanner.nextLine();

        System.out.print("\n");

        int count = 0;
        for (int i = 0; i < name.length(); i++)
            count++;

        System.out.println(name + " possui: " + count + " letras.");

        System.out.print("\n");
    }
}
