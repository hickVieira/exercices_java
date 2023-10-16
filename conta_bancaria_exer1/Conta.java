package conta_bancaria_exer1;

public class Conta {
    private String nome;
    private int numero;
    private float saldo;

    public Conta(String nome, int numero, float saldo) {
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
    }

    public float consulta_saldo() {
            
        return saldo;
    }

    public void depositar(float quantia) {
        quantia = Math.max(0, quantia);
        saldo += quantia;
    }

    public boolean retirar(float quantia) {
        quantia = Math.max(0, quantia);
        if (saldo >= quantia) {
            saldo -= quantia;
            return true;
        }
        return false;
    }
}
