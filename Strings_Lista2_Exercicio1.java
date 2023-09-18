import java.util.Scanner;

public class Strings_Lista2_Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEscreva o nome >> ");
        String name = scanner.nextLine();

        System.out.print("\n");
        System.out.print(name.charAt(0));
        System.out.print(name.charAt(1));
        System.out.print(name.charAt(2));
        System.out.print(name.charAt(3));
        System.out.print("\n");
    }
}
