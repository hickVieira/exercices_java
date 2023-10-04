package ListaOOP1_Exer3;

public class Media {
    float soma;
    int contador;

    public Media() {
        this.soma = 0;
        this.contador = 0;
    }

    public void Acrescenta(float val) {
        soma += val;
        contador++;
    }

    public float MediaAtual() {
        return soma / contador;
    }
}
