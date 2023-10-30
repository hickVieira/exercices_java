package herancaBebida;

public class Suco extends Bebida {
    protected String sabor;

    public Suco(String nome, float preco, String sabor) {
        super(nome, preco);
        this.sabor = sabor;
    }

    public void mostrarBebida() {
        super.mostrarBebida();
        System.out.println("sabor = " + sabor);
    }
}
