package herancaBebida;

public class Vinho extends Bebida {
    protected int safra;

    public Vinho(String nome, float preco, int safra) {
        super(nome, preco);
        this.safra = safra;
    }

    public void mostrarBebida() {
        super.mostrarBebida();
        System.out.println("safra = " + safra);
    }
}
