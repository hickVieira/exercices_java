package conta_bancaria_exer2;

public class Cartao {
    private String senha;

    public Cartao(String senha) {
        this.senha = senha;
    }

    public boolean verifica_senha(String senhaTeste) {
        return this.senha.compareTo(senhaTeste) == 0;
    }

    public boolean alterar_senha(String senhaAtual, String novaSenha) {
        if (verifica_senha(senhaAtual)) {
            this.senha = novaSenha;
            return true;
        }
        return false;
    }

}
