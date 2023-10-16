package conta_bancaria_exer2;

public class Conta {
    private String nome;
    private int numero;
    private float saldo;
    private Cartao card;

    public Conta(String nome, int numero, float saldo, Cartao card) {
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
        this.card = card;
    }

    public String consulta_saldo(String senha) {
        return card.verifica_senha(senha) ? Float.toString(saldo) : "";
    }

    public void depositar(float quantia) {
        quantia = Math.max(0, quantia);
        saldo += quantia;
    }

    public boolean retirar(String senha, float quantia) {
        if (!card.verifica_senha(senha))
            return false;

        quantia = Math.max(0, quantia);
        if (saldo >= quantia) {
            saldo -= quantia;
            return true;
        }
        return false;
    }
}
