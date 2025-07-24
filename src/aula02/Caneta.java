package aula02;

public class Caneta {
    public String modelo;
    public String cor;
    public Double ponta;
    public int carga;
    public boolean tampada;

    public void status () {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    public void rabiscar () {
        if (this.tampada) {
            System.out.println("Precissa destampar para poder escrever");;
        } else {
            System.out.println("Rabiscando");
        }
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
}
