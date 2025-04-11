package aula05;

public class Aula05 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Creuza");
        p2.abrirConta("CP");

        p1.depositar(300.00);
        p2.depositar(500.00);
        p2.sacar(100.00);

        p1.sacar(350.00);
        p1.fecharConta();

        p1.estadoAtual();
        System.out.println("_____________");
        p2.estadoAtual();
    }
}
