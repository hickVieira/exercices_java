package herancaBebida;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Refrigerante> refris = new ArrayList<Refrigerante>();
        ArrayList<Suco> sucos = new ArrayList<Suco>();
        ArrayList<Vinho> vinhos = new ArrayList<Vinho>();

        while (true) {
            System.out.println("-------------------");
            System.out.println("Bebidas");
            System.out.println("1. Cadastrar");
            System.out.println("    A. Refrigerante");
            System.out.println("    B. Suco");
            System.out.println("    C. Vinho");
            System.out.println("2. Imprimir");
            System.out.println("    A. Refrigerante");
            System.out.println("    B. Suco");
            System.out.println("    C. Vinho");
            System.out.println("3. Sair");
            System.out.println("Insira comando");
            System.out.print(">> ");
            String op_str = scanner.nextLine();
            int op_int = Integer.parseInt(op_str);

            if (op_int == 3)
                break;

            switch (op_int) {
                case 1:
                    System.out.println("Insira tipo de bebida");
                    System.out.print(">> "); {
                    String op2_str = scanner.nextLine();
                    char op2_char = op2_str.charAt(0);
                    switch (op2_char) {
                        case 'A':
                            System.out.println("Insira nome preco retornalve (separado por espaços)");
                            System.out.print(">> "); {
                            String op3_str = scanner.nextLine();
                            String[] vals = op3_str.split("\\s+");
                            refris.add(new Refrigerante(vals[0], Float.parseFloat(vals[1]),
                                    vals[2].charAt(0) == '1' ? true : false));
                        }
                            break;
                        case 'B':
                            System.out.println("Insira nome preco sabor (separado por espaços)");
                            System.out.print(">> "); {

                            String op3_str = scanner.nextLine();
                            String[] vals = op3_str.split("\\s+");
                            sucos.add(new Suco(vals[0], Float.parseFloat(vals[1]),
                                    vals[2]));
                        }
                            break;
                        case 'C':
                            System.out.println("Insira nome preco safra (separado por espaços)");
                            System.out.print(">> "); {
                            String op3_str = scanner.nextLine();
                            String[] vals = op3_str.split("\\s+");
                            vinhos.add(new Vinho(vals[0], Float.parseFloat(vals[1]),
                                    Integer.parseInt(vals[2])));
                        }
                            break;
                    }
                }
                    break;
                case 2:
                    System.out.println("Insira tipo de bebida");
                    System.out.print(">> "); {
                    String op2_str = scanner.nextLine();
                    char op2_char = op2_str.charAt(0);
                    switch (op2_char) {
                        case 'A':
                            for (Bebida bebida : refris)
                                bebida.mostrarBebida();
                            break;
                        case 'B':
                            for (Bebida bebida : sucos)
                                bebida.mostrarBebida();
                            break;
                        case 'C':
                            for (Bebida bebida : vinhos)
                                bebida.mostrarBebida();
                            break;
                    }
                }
                    break;
            }
        }

        scanner.close();
    }
}
