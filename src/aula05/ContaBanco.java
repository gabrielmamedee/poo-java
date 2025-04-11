package aula05;

public class ContaBanco {
    public int numConta;
    protected String tipo; //ou CC ou CP
    private String dono;
    private Double saldo;
    private boolean status;

    public ContaBanco () {
        this.status = false;
        this.saldo = 00.0;
    }

    public void abrirConta(String tipo) {
        //conta aberta = status true
        // tem que informar que tipo de conta é CP ou CC
        // abertura de CC = bonus de 50,00
        // abertura de CP = bonus de 150,00
        setTipo(tipo);
        setStatus(true);

        if (this.tipo == "CP") {
            this.setSaldo(150.00);
        } else if (this.tipo == "CC") {
            this.setSaldo(50.00);
        }
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
        if (this.status) {
            this.setSaldo(this.getSaldo() + valorDeposito);
            System.out.println("Deposito realizado com sucesso, saldo atual = " + this.saldo);
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
