package heranca;

public class Principal {
    private static void swap(Empregado[] values, int i, int j) {
        Empregado temp = values[i];
        values[i] = values[j];
        values[j] = temp;
    }

    public static void main(String[] args) {
        Empregado e1 = new Vendedor("Lucio", 0, 2000, 15, 15);
        Empregado e2 = new Gerente("Marcleo", 1, 7000);
        Empregado e3 = new Horista("Laura", 2, 10, 8);

        System.out.println("Salaio de vendedor = R$" + e1.valor_do_salario(1));
        System.out.println("Salaio de gerente = R$" + e2.valor_do_salario(1));
        System.out.println("Salaio de horista = R$" + e3.valor_do_salario(1));

        Empregado[] people = new Empregado[3];
        people[0] = e1;
        people[1] = e2;
        people[2] = e3;

        if (people[0].valor_do_salario(1) > people[1].valor_do_salario(1))
            swap(people, 0, 1);
        if (people[0].valor_do_salario(1) > people[2].valor_do_salario(1))
            swap(people, 0, 2);
        if (people[1].valor_do_salario(1) > people[2].valor_do_salario(1))
            swap(people, 1, 2);

        System.out
                .println("Maoir salorio é de " + people[2].getNome() + " que é de R$" + people[2].valor_do_salario(1));
    }
}
