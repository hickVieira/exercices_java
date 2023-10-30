package heranca;

public class Empregado {
    private String nome;
    private int numero;

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public Empregado(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public float valor_do_salario(int meses) {
        return 0;
    }
}
