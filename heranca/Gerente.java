package heranca;

public class Gerente extends Empregado {
    private float salarion_mensal;

    public Gerente(String nome, int numero, float salarion_mensal) {
        super(nome, numero);
        this.salarion_mensal = salarion_mensal;
    }

    public float valor_do_salario(int meses) {
        return salarion_mensal * meses;
    }
}
