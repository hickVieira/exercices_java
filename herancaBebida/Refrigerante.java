package herancaBebida;

public class Refrigerante extends Bebida {
    protected boolean retornavel;

    public Refrigerante(String nome, float preco, boolean retornavel) {
        super(nome, preco);
        this.retornavel = retornavel;
    }

    public void mostrarBebida() {
        super.mostrarBebida();
        System.out.println("retornavel = " + retornavel);
    }
}
