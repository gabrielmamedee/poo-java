package aula05;

import java.util.Objects;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private Double saldo;
    private boolean statusConta;

    public ContaBanco() {
        this.saldo = 0.0;
        this.statusConta = false;
    }

    public void estadoAtual() {
        System.out.println("-----------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status da conta: " + this.isStatusConta());
    }

    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatusConta(true);

        if ("CC".equals(tipo)) {
            this.setSaldo(50.00);
        } else if ("CP".equals(tipo)) {
            this.setSaldo(150.00);
        }
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito");
        } else {
            this.setStatusConta(false);
            System.out.println("Conta fechada com sucesso");
        }
    }

    public void depositar(Double valor) {
        if (this.isStatusConta()) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depisito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossivel depositar, conta inativa");
        }
    }

    public void sacar(Double valor) {
        if (this.isStatusConta()) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossivel sacar, conta inativa");
        }
    }

    public void pagarMensal() {
        Double valor = 0.0;
        if (Objects.equals(tipo, "CC")) {
            valor = 12.00;
        } else if (Objects.equals(tipo, "CP")) {
            valor = 20.00;
        }

        if (this.isStatusConta()) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(getSaldo() - valor);
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossivel descontar, conta inativa");
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatusConta() {
        return statusConta;
    }

    public void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }
}
