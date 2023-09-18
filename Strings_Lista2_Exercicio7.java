import java.util.Scanner;

public class Strings_Lista2_Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEscreva a letra para contar >> ");
        char letra = Character.toLowerCase(scanner.nextLine().charAt(0));

        System.out.print("\nEscreva a frase >> ");
        String name = scanner.nextLine();

        System.out.print("\n");

        int letraCount = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = Character.toLowerCase(name.charAt(i));
            if (ch == letra)
                letraCount++;
        }

        System.out.println(name + " possui: " + letraCount + " vezes a letra " + letra);

        System.out.print("\n");
    }
}
