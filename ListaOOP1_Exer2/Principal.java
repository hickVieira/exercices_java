package ListaOOP1_Exer2;

import ListaOOP1_Exer3.Le_Esc_String;

public class Principal {
    public static void main(String[] args) {
        Retangulo ret1 = new Retangulo(6, 4);
        Retangulo ret2 = new Retangulo();

        Le_Esc_String.ResetString();
        float area1 = ret1.calculaArea();
        float peri1 = ret1.calculaPerimetro();
        Le_Esc_String.EscreverString("ret1.area = " + area1);
        Le_Esc_String.EscreverString("ret1.perimetro = " + peri1);

        float area2 = ret2.calculaArea();
        float peri2 = ret2.calculaPerimetro();
        Le_Esc_String.EscreverString("ret2.area = " + area2);
        Le_Esc_String.EscreverString("ret2.perimetro = " + peri2);

        Le_Esc_String.EscreverString("Area max = " + Math.max(area1, area2));
        Le_Esc_String.EscreverString("Perimetro max = " + Math.max(peri1, peri2));
        Le_Esc_String.PrintString();
    }
}