package ultimaOOP;

import java.util.Scanner;

class Atleta {
    private String nome;
    private String sexo;
    private double peso;
    private double altura;

    public Atleta() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do atleta >> ");
        this.nome = scanner.nextLine();

        System.out.print("Digite o sexo do atleta >> ");
        this.sexo = scanner.nextLine();

        System.out.print("Digite o peso do atleta (em kg) >> ");
        this.peso = scanner.nextDouble();

        System.out.print("Digite a altura do atleta (em metros) >> ");
        this.altura = scanner.nextDouble();

        scanner.close();
    }

    public void ImprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
    }

    public void CalcularIMC() {
        double imc = peso / (altura * altura);

        System.out.println("IMC: " + imc);

        if (imc < 17) {
            System.out.println("Classificação = Muito abaixo do peso");
        } else if (imc >= 17 && imc < 18.5) {
            System.out.println("Classificação = Abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Classificação = Peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Classificação = Acima do peso");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Classificação = Obesidade I");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Classificação = Obesidade II (severa)");
        } else {
            System.out.println("Classificação = Obesidade III (mórbida)");
        }
    }
}

public class Principal3 {
    public static void main(String[] args) {
        Atleta atleta = new Atleta();

        System.out.println("\nDados do Atleta: ");
        atleta.ImprimirDados();

        System.out.println("\nResultado do IMC: ");
        atleta.CalcularIMC();
    }
}
