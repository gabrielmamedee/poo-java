package aula04;

public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta(
                "BIC",
                "Azul",
                0.5f
        );
        c1.status();
        //System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());

        Caneta c2 = new Caneta(
                "KKK",
                "Vermelha",
                0.7f
        );
        c2.status();
    }
}
