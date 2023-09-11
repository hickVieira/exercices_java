import java.util.Scanner;

class Lista3_Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println(String.format("\nAluno %d", i));

            System.out.print("Insira nota1: ");
            String nota1 = scanner.nextLine();

            System.out.print("Insira nota2: ");
            String nota2 = scanner.nextLine();

            float media = (Float.parseFloat(nota1) + Float.parseFloat(nota2)) / 2;

            System.out.println("Media = " + media);
        }
    }
}