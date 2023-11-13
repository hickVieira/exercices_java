package ultimaOOP;

import java.util.Scanner;

class Veiculo {
    private String tipo;
    private String marca;
    private int anoFabricacao;

    public Veiculo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tipo do veículo >> ");
        this.tipo = scanner.nextLine();

        System.out.print("Digite a marca do veículo >> ");
        this.marca = scanner.nextLine();

        System.out.print("Digite o ano de fabricação do veículo >> ");
        this.anoFabricacao = scanner.nextInt();

        scanner.close();
    }

    public void ImprimirDados() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
    }

    public int CalcularIdade(int anoAtual) {
        return anoAtual - anoFabricacao;
    }
}

public class Principal1 {
    public static void main(String[] args) {
        Veiculo carro = new Veiculo();

        System.out.println("\nDados do Veículo:");
        carro.ImprimirDados();

        int idadeVeiculo = carro.CalcularIdade(2023);
        System.out.println("\nIdade do Veículo: " + idadeVeiculo + " anos");
    }
}
