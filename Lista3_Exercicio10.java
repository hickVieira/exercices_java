import java.util.Scanner;

class Lista3_Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("valor1 >> ");
            int val1 = Integer.parseInt(scanner.nextLine());

            System.out.print("valor2 >> ");
            int val2 = Integer.parseInt(scanner.nextLine());

            if (val1 > val2) {
                System.out.println("valor1 > valor2");
                System.out.println("tente novamente");
                continue;
            }

            System.out.println("soma val1 + val2 = " + (val1 + val2));

            System.out.println("tentar novamente? (y/n)");
            char again = Character.toLowerCase(scanner.nextLine().charAt(0));
            if (again == 'y')
                continue;
            else
                break;
        }
    }
}