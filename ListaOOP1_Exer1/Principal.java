package ListaOOP1_Exer1;

public class Principal {
    public static void main(String[] args) {
        var semParametros = new Retangulo();
        Le_Esc_String.ResetString();
        Le_Esc_String.EscreverString("semParametros.base = " + semParametros.getBase());
        Le_Esc_String.EscreverString("semParametros.altura = " + semParametros.getAltura());
        Le_Esc_String.PrintString();
    }
}