package aula05;

public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo; //ou CC ou CP
    private String dono;
    private Double saldo;
    private boolean status;

    //Metodos personalizados
    public void estadoAtual() {
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }

    public void abrirConta(String tipoConta) {
        //conta aberta = status true
        // tem que informar que tipo de conta é CP ou CC
        // abertura de CC = bonus de 50,00
        // abertura de CP = bonus de 150,00
        this.setTipo(tipoConta);
        this.setStatus(true);

        if (tipoConta.equals("CP")) {
            this.setSaldo(150.00);
        } else if (tipoConta.equals("CC")) {
            this.setSaldo(50.00);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        // não pode ter dinheiro nem debito na conta
        //conta fechada = status false
        if (this.getSaldo() == 00.0 && this.isStatus()) {
            this.setStatus(false);
            System.out.println("Conta encerada com sucesso");
        } else {
            System.out.println("Desculpe, para fechar a conta ela precisa estar ativa e seu saldo precisa ser igual a R$ 00.00");
        }
    }

    public void depositar(Double valorDeposito) {
        // a conta precisa está ativa
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + valorDeposito);
            System.out.println("Deposito realizado com sucesso, saldo atual = " + this.getSaldo());
        } else {
            System.out.println("Desculpe, para realizar depositos a conta precisa estar ativa!");
        }
    }

    public void sacar(Double valorSaque) {
        // a conta precisa está ativa
        // precisa ter saldo
        if (this.isStatus()) {
            if (this.getSaldo() >= valorSaque) {
                this.setSaldo(this.getSaldo() - valorSaque);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Desculpe sua conta não está ativa");
        }
    }

    public void pagarMensal() {
        // CC = cobrança de 12,00
        // CP = cobrança de 20,00
        Double valorMensalidade = 0.0;
        if (this.getTipo() == "CC") {
            valorMensalidade = 12.00;
        } else if (this.getTipo() == "CP") {
            valorMensalidade = 20.00;
        }

        if (isStatus()) {
            if (getSaldo() >= valorMensalidade) {
                this.setSaldo(this.getSaldo() - valorMensalidade);
            } else {
                System.out.println("Impossível pagar, saldo insufuciente");
            }
        } else {
            System.out.println("Impossível pagar, a conta está inativa");
        }
    }

    //Metodos Especiais
    public ContaBanco () {
        this.setSaldo(00.0);
        this.setStatus(false);
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
