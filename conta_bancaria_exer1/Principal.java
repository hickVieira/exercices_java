package conta_bancaria_exer1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nCriando conta");
        System.out.print("\nNome >> ");
        String nome = scanner.nextLine();
        System.out.print("\nNumero >> ");
        int numero = Integer.parseInt(scanner.nextLine());
        System.out.print("\nSaldo >> ");
        float saldo = Float.parseFloat(scanner.nextLine());

        Conta cliente = new Conta(nome, numero, saldo);
        
        String message = "";
        int op = -1;
        boolean lockop = false;
        boolean loop = true;
        while (loop) {
            System.out.print("\n------------------------------");
            System.out.print("\nCONTA CORRENTE");
            System.out.print("\n1 - Depositar");
            System.out.print("\n2 - Retirar");
            System.out.print("\n3 - Consultar Saldo");
            System.out.print("\n4 - Finalizar");
            System.out.print("\n------------------------------");
            System.out.print(message);
            System.out.print("\n >> ");

            String input = scanner.nextLine();

            if (input.isEmpty() || input.isBlank()) {
                message = "\nErro: operação vazia";
                lockop = false;
                continue;
            }

            if (!lockop) {
                op = Integer.parseInt(input);
                if (op < 1 || op > 4) {
                    message = "\nErro: operação inválida";
                    lockop = false;
                    continue;
                }
            }

            float valor;
            switch (op) {
                case 1:
                    message = "\nDigite o valor a ser depositado";
                    lockop = true;
                    op = 11;
                    break;
                case 11:
                    valor = Float.parseFloat(input);
                    cliente.depositar(valor);
                    message = "\nValor depositado com sucesso";
                    lockop = false;
                    break;
                case 2:
                    message = "\nDigite o valor a ser retirado";
                    lockop = true;
                    op = 22;
                    break;
                case 22:
                    valor = Float.parseFloat(input);
                    message = cliente.retirar(valor) ? "\nValor retirado com sucesso" : "\nErro: Saldo insuficiente";
                    lockop = false;
                    break;
                case 3:
                    message = String.format("\nSaldo = R$%.02f", cliente.consulta_saldo());
                    break;
                case 4:
                    loop = false;
                    break;
            }
        }

        scanner.close();
    }
}
