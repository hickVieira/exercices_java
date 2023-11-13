package ultimaOOP;

class Animal {
    private String nome;
    private String tipo;
    private String raca;

    public Animal(String nome, String tipo, String raca) {
        this.nome = nome;
        this.tipo = tipo;
        this.raca = raca;
    }

    public void Imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Raça: " + raca);
    }
}

public class Principal2 {
    public static void main(String[] args) {
        Animal cao = new Animal("Dog", "Cachorro", "Linguiça");

        System.out.println("Dados do Animal:");
        cao.Imprimir();
    }
}
