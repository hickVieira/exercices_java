package ListaOOP1_Exer2;

import ListaOOP1_Exer3.Le_Esc_String;

public class Retangulo {
    private float base;
    private float altura;

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public Retangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public Retangulo() {
        this.base = Float.parseFloat(Le_Esc_String.LerString("Inisira base"));
        this.altura = Float.parseFloat(Le_Esc_String.LerString("Inisira altura"));
    }

    public float calculaArea() {
        return base * altura;
    }

    public float calculaPerimetro() {
        return 2 * (base + altura);
    }

    public void exibeArea() {
        System.out.println(calculaArea());
    }

    public void exibePerimetro() {
        System.out.println(calculaPerimetro());
    }
}