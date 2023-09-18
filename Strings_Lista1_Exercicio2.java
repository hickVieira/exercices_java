// 2 Elabore um programa em Java que leia várias Strings (use . para finalizar)  com o  nome completo de uma pessoa e em seguida crie uma string contendo apenas as iniciais de cada nome. Veja: Nome: “Jose Antonio Santos” o programa produzira “J.A.S.”/

import java.util.Scanner;

public class Strings_Lista1_Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nEscreva o nome >> ");
            String str = scanner.nextLine();

            if (str.charAt(0) == '.')
                break;

            String[] subs = str.split("\\s+");

            for (int i = 0; i < subs.length; i++)
                System.out.print(subs[i].charAt(0) + ".");
        }
    }
}
