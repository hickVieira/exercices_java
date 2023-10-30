package heranca;

public class Horista extends Empregado {
    private float valor_hora;
    private float horas_trabalhadas;

    public Horista(String nome, int numero, float valor_hora, float horas_trabalhadas) {
        super(nome, numero);
        this.valor_hora = valor_hora;
        this.horas_trabalhadas = horas_trabalhadas;
    }

    public float valor_do_salario(int meses) {
        return valor_hora * horas_trabalhadas * meses * 30;
    }
}
