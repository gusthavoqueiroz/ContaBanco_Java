public class ContaBanco {
    public int numConta;
    protected String tipo; //cc ou cp
    private String dono;
    private float saldo;
    private boolean status;

    public void abrirConta(){
        status = true;

        if (tipo == "CC") {
            saldo = 50;
        } else if (tipo == "CP") {
            saldo = 150;
        }
    }

    public void fecharConta() {

        if (status) {
        }  else if (saldo>0) {
            System.out.println("Você deve retirar o valor da conta para fecha-la");
        } else if (saldo<0) {
            System.out.println("Você deve pagar o valor que está em débito antes de fechar a conta");
        } else if (saldo==0) {
            status = false;
            System.out.println("A conta foi fechada");
        } else {
            System.out.println("A conta já está fechada");
        }
    }

    public void depositar(){

        if (status == true){
            System.out.println("Digite quanto você deseja depositar: ");

            saldo = saldo - d;
        }
    }

    public void sacar(){
        if (status == true){
            if (saldo>=s){

            }
        }
    }

    public void pagarMensal(){
        if (tipo == "CC"){
            saldo = saldo - 12;
        } else if (tipo == "CP"){
            saldo -= 20;
        }
    }


    public int getnumConta(){
        return numConta;
    }

    public void setnumConta(int n){
        numConta = n;
    }


    public String getTipo(){
        return tipo;
    }

    public void setTipo(String t){
        tipo = t;
    }


    public String getDono(){
        return dono;
    }

    public void setDono(String d){
        dono = d;
    }


    public float getSaldo(){
        return saldo;
    }

    public void setSaldo(float s){
        saldo = s;
    }
}
