package ListaOOP1_Exer3;

public class Principal {
    public static void main(String[] args) {
        var m = new Media();
        m.Acrescenta(3);
        m.Acrescenta(5);
        m.Acrescenta(10);
        m.Acrescenta(18);
        Le_Esc_String.ResetString();
        Le_Esc_String.EscreverString("Media = " + m.MediaAtual());
        Le_Esc_String.PrintString();
    }
}
