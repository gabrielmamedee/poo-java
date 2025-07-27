package aula07;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private Double altura;
    private Double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(
            String nome,
            String nacionalidade,
            int idade,
            Double altura,
            Double peso,
            int vitorias,
            int derrotas,
            int empates
    ) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public void apresentar() {
        System.out.println("___________________________________");
        System.out.println("Lutador = " + this.nome);
        System.out.println("Nacionalidade = " + this.nacionalidade);
        System.out.println("Idade = " + this.idade + " anos");
        System.out.println("Altura = " + this.altura + " m");
        System.out.println("Peso = " + this.peso + " Kg");
        System.out.println("categoria = " + this.categoria);
        System.out.println("vitorias = " + this.vitorias);
        System.out.println("derrotas = " + this.derrotas);
        System.out.println("empates = " + this.empates);
    }

    public void status() {
        System.out.println("nome = " + this.nome);
        System.out.println("peso = " + this.peso + " Kg");
        System.out.println("vitorias = " + this.vitorias);
        System.out.println("derrotas = " + this.derrotas);
        System.out.println("empates = " + this.empates);
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
