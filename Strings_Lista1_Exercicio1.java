// 1 Elabore um programa em Java que leia várias Strings (use “.” para finalizar)  e remova de cada String todas as ocorrências de uma dada letra, oferecida pelo usuário.

import java.util.Scanner;

public class Strings_Lista1_Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEscreva a letra para remover >> ");
        char letra = scanner.nextLine().charAt(0);

        while (true) {
            System.out.print("\nEscreva string >> ");
            String str = scanner.nextLine();

            if (str.charAt(0) == '.')
                break;

            str = str.replace(Character.toString(letra), "");

            System.out.println(str);
        }
    }
}
