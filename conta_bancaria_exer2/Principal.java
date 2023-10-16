package conta_bancaria_exer2;

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

        String message = "Digite a senha 2 vezes: ";
        String senha = "";
        while (true) {
            System.out.print(message);
            System.out.print("\n >> ");
            senha = scanner.nextLine();
            System.out.print("\n >> ");
            String senha2 = scanner.nextLine();
            if (senha.compareTo(senha2) != 0)
                message = "\nErro: Senhas diferentes. Tente novamente.";
            else
                break;
        }

        Cartao card = new Cartao(senha);
        Conta cliente = new Conta(nome, numero, saldo, card);

        int op = 0;
        int opNext = 0;
        int opLast = 0;
        String input = "";
        boolean opLock = false;
        boolean loop = true;
        message = "";
        while (loop) {
            System.out.print("\n------------------------------");
            System.out.print("\nCONTA CORRENTE");
            System.out.print("\n1 - Depositar");
            System.out.print("\n2 - Retirar");
            System.out.print("\n3 - Consultar Saldo");
            System.out.print("\n4 - Alterar Senha");
            System.out.print("\n5 - Finalizar");
            System.out.print("\n------------------------------");
            System.out.print(message);
            System.out.print("\n >> ");

            if (opLast != -1)
                input = scanner.nextLine();

            if (input.isEmpty() || input.isBlank()) {
                message = "\nErro: operação vazia";
                opLock = false;
                continue;
            }

            if (!opLock) {
                op = Integer.parseInt(input);
                if (op < 1 || op > 4) {
                    message = "\nErro: operação inválida";
                    opLock = false;
                    continue;
                }
            }

            float valor;
            switch (op) {
                case -1:
                    senha = input;
                    op = opNext;
                    break;
                case 1:
                    message = "\nDigite o valor a ser depositado";
                    opLock = true;
                    op = 11;
                    break;
                case 11:
                    valor = Float.parseFloat(input);
                    cliente.depositar(valor);
                    message = "\nValor depositado com sucesso";
                    opLock = false;
                    break;
                case 2:
                    message = "\nDigite o valor a ser retirado";
                    opLock = true;
                    op = 22;
                    break;
                case 22:
                    message = "\nDigite a senha";
                    opLock = true;
                    op = -1;
                    opNext = 222;
                    break;
                case 222:
                    valor = Float.parseFloat(input);
                    message = cliente.retirar(senha, valor) ? "\nValor retirado com sucesso"
                            : "\nErro: Saldo insuficiente";
                    opLock = false;
                    break;
                case 3:
                    message = "\nDigite a senha";
                    opLock = true;
                    op = -1;
                    opNext = 33;
                    break;
                case 33:
                    String result = cliente.consulta_saldo(senha);
                    if (result.isEmpty())
                        message = String.format("\nAcesso Negado");
                    else
                        message = String.format("\nSaldo = R$%.02f", Float.parseFloat(result));
                    opLock = false;
                    break;
                case 4:
                    message = "\nAlterando senha";
                    while (true) {
                        System.out.print(message);
                        System.out.print("\n Senha atual >> ");
                        String senhaAtual = scanner.nextLine();
                        System.out.print("\n Senha nova >> ");
                        String senhaNova = scanner.nextLine();
                        if (!card.alterar_senha(senhaAtual, senhaNova))
                            message = "\nErro: Senhas diferentes. Tente novamente.";
                        else
                            break;
                    }
                    opLock = false;
                    break;
                case 5:
                    loop = false;
                    break;
            }

            opLast = op;
        }

        scanner.close();
    }
}
