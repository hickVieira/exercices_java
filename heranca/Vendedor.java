package heranca;

public class Vendedor extends Empregado {
    private float salario_base;
    private float valor_vendas_mes;
    private float perc_comissao;

    public float getSalario_base() {
        return salario_base;
    }

    public float getValor_vendas_mes() {
        return valor_vendas_mes;
    }

    public float getPerc_comissao() {
        return perc_comissao;
    }

    public Vendedor(String nome, int numero, float salario_base, float valor_vendas_mes, float perc_comissao) {
        super(nome, numero);
        this.salario_base = salario_base;
        this.valor_vendas_mes = valor_vendas_mes;
        this.perc_comissao = perc_comissao;
    }

    public float valor_do_salario(int meses) {
        return (salario_base + valor_vendas_mes * perc_comissao) * meses;
    }
}
