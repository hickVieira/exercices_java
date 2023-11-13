package ultimaOOP;

import java.util.Arrays;
import java.util.Random;

class Vetor {
    private int[] vetor;

    public Vetor(int tamanho, int faixaDeValores) {
        vetor = new int[tamanho];
        Random random = new Random();

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(faixaDeValores);
        }
    }

    public void Ordenar() {
        Arrays.sort(vetor);
    }

    public int AcharMaior() {
        int maior = vetor[0];
        for (int i = 1; i < vetor.length; i++)
            if (vetor[i] > maior)
                maior = vetor[i];
        return maior;
    }

    public int AcharMenor() {
        int menor = vetor[0];
        for (int i = 1; i < vetor.length; i++)
            if (vetor[i] < menor)
                menor = vetor[i];
        return menor;
    }

    public int ProcurarElemento(int elemento) {
        for (int i = 0; i < vetor.length; i++)
            if (vetor[i] == elemento)
                return i;
        return -1;
    }

    public void ImprimirVetor() {
        System.out.println(Arrays.toString(vetor));
    }

    public static void main(String[] args) {
        Vetor vet = new Vetor(10, 100);
        System.out.println("Vetor original:");
        vet.ImprimirVetor();

        vet.Ordenar();
        System.out.println("\nVetor ordenado:");
        vet.ImprimirVetor();

        System.out.println("\nMaior elemento = " + vet.AcharMaior());
        System.out.println("Menor elemento = " + vet.AcharMenor());

        int elementoProcurado = 42;
        int posicao = vet.ProcurarElemento(elementoProcurado);
        if (posicao != -1)
            System.out.println("\nElemento " + elementoProcurado + " encontrado na posição " + posicao);
        else
            System.out.println("\nElemento " + elementoProcurado + " não encontrado no vetor");
    }
}
