package aula02;

public class Aula {
    String professor;
    String disciplina;
    Double duracao;
    String dataDeInicio;
    String horaDeInicio;
    boolean iniciada = false;

    void status() {
        System.out.println("Professor: " + this.professor);
        System.out.println("Disciplina: " + this.disciplina);
        System.out.println("Duração: " + this.duracao);
        System.out.println("Data de inicio: " + this.dataDeInicio);
        System.out.println("Hora de inicio: " + this.horaDeInicio);
        System.out.println("Aula iniciada: " + this.iniciada);
    }

    void comecarAula() {
        if (this.iniciada) {
            System.out.println("Desculpe, a aula já está em andamento!");
        } else {
            System.out.println("Iniciando Aula!!");
            this.iniciada = true;
        }
    }

    void cancelarAula() {
        if (this.iniciada) {
            System.out.println("Desculpe, a aula já está em andamento!");
        } else {
            System.out.println("Cancelando Aula!!");
            this.iniciada = false;
        }
    }

    void terminarAula() {
        if (!this.iniciada) {
            System.out.println("Desculpe, a aula ainda não começou!");
        } else {
            System.out.println("Finalizando Aula!!");
        }
    }
}
