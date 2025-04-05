package aula04;

public class Caneta {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    public Caneta(String modelo, String cor, float ponta) {
        this.setModelo(modelo);
        this.setCor(cor);
        this.setPonta(ponta);
        this.tampar();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

   public void tampar() {
        this.tampada = true;
   }

   public void destampar() {
        this.tampada = false;
   }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public void status() {
        System.out.println("Sobre a caneta:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}
