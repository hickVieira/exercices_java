package herancaBebida;

public class Bebida {
    protected String nome;
    protected float preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Bebida(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void mostrarBebida() {
        System.out.println("[BEBIDA]");
        System.out.println("nome = " + nome);
        System.out.println("preco = " + preco);
    }
}
