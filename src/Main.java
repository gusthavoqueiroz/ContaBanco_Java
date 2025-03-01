//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setnumConta(1111);
        p1.setDono("Gusthavo");
        p1.abrirConta("CC");
        p1.depositar(100);
        p1.fecharConta();

        p1.estadoAtual();



        ContaBanco p2 = new ContaBanco();
        p2.setnumConta(2222);
        p2.setDono("Eduarda");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(100);
        p2.fecharConta();

        p2.estadoAtual();

    }
}