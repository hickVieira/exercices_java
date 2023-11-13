package ultimaOOP;

import java.util.Scanner;

class Funcionario {
    private String nome;
    private String funcao;
    private double salario;

    public Funcionario(String nome, String funcao, double salario) {
        this.nome = nome;
        this.funcao = funcao;
        this.salario = salario;
    }

    public String RetornarNome() {
        return nome;
    }

    public String RetornarFuncao() {
        return funcao;
    }

    public double RetornarSalario() {
        return salario;
    }

    public void AlterarSalario(double novoSalario) {
        this.salario = novoSalario;
        System.out.println("Salário alterado para: " + this.salario);
    }

    public void AlterarSalarioComAumento(double percentualAumento) {
        double aumento = salario * (percentualAumento / 100);
        this.salario += aumento;
        System.out.println("Salário alterado para: " + this.salario);
    }
}

public class Principal4 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Fulano", "Fazedor de programas", 5000.0);

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Imprimir dados do funcionário");
            System.out.println("2. Alterar salário com novo valor");
            System.out.println("3. Alterar salário com percentual de aumento");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nDados do Funcionário:");
                    System.out.println("Nome: " + funcionario.RetornarNome());
                    System.out.println("Função: " + funcionario.RetornarFuncao());
                    System.out.println("Salário: " + funcionario.RetornarSalario());
                    break;
                case 2:
                    System.out.print("\nDigite o novo salário: ");
                    double novoSalario = scanner.nextDouble();
                    funcionario.AlterarSalario(novoSalario);
                    break;
                case 3:
                    System.out.print("\nDigite o percentual de aumento: ");
                    double percentualAumento = scanner.nextDouble();
                    funcionario.AlterarSalarioComAumento(percentualAumento);
                    break;
                case 0:
                    System.out.println("Saindo do programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
