package ListaOOP1_Exer4;

public class Principal {
    public static void main(String[] args) {
        var m = new Media();

        while (true) {
            String input = Le_Esc_String.LerString("Inisira um numero (ou 'sair' para terminar)").toLowerCase();

            if (input.compareTo("sair") == 0)
                break;

            m.Acrescenta(Float.parseFloat(input));
        }

        Le_Esc_String.ResetString();
        Le_Esc_String.EscreverString("Media = " + m.MediaAtual());
        Le_Esc_String.PrintString();
    }
}
