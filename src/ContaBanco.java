public class ContaBanco {
    public int numConta;
    protected String tipo; //cc ou cp
    private String dono;
    private float saldo;
    private boolean status;


    public void estadoAtual(){
        System.out.println("\n--------------------------------");
        System.out.println("Conta: " + this.getnumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public void abrirConta(String t){

        this.setTipo(t);
        this.setStatus(true);

        if (tipo == "CC") {
            this.setSaldo(50);
        } else if (tipo == "CP") {
            this.setSaldo(150);
        }

        System.out.println("Conta aberta com sucesso");
    }

    public void fecharConta() {

        if (this.getStatus()) {
           if (this.getSaldo()>0) {
            System.out.println("Você deve retirar o valor da conta para fecha-la");
            } else if (this.getSaldo()<0) {
            System.out.println("Você deve pagar o valor que está em débito antes de fechar a conta");
            } else {
                this.setStatus(false);
                System.out.println("A conta foi fechada");
            }
        } else {
            System.out.println("A conta já está fechada");
        }

    }

    public void depositar(float v){

        if (this.getStatus()){
            this.setSaldo(getSaldo()+v); //ou (= this.saldo + v;
            System.out.println("\nDepósito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossivel depositar em uma conta fechada");
        }
    }

    public void sacar(float v){
        if (this.getStatus() == true){
            if (this.getSaldo()>=v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque");
            }
        } else {
            System.out.println("Impossivel sacar, conta fechada");
        }
    }

    public void pagarMensal(){
        float v = 0;  //variavel local

        if (this.getTipo() == "CC"){
            v = 12;
        } else if (this.getTipo() == "CP"){
            v = 20;
        }

        if (this.getStatus()) {
            if (this.getSaldo()>=v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso por " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossivel pagar, a conta está fechada");
        }
    }


    public void ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }


    public int getnumConta(){
        return this.numConta;
    }

    public void setnumConta(int n){
        this.numConta = n;
    }


    public String getTipo(){
        return this.tipo;
    }

    public void setTipo(String t){
        this.tipo = t;
    }


    public String getDono(){
        return this.dono;
    }

    public void setDono(String d){
        this.dono = d;
    }


    public float getSaldo(){
        return this.saldo;
    }

    public void setSaldo(float s){
        this.saldo = s;
    }


    public boolean getStatus(){
        return this.status;
    }

    public void setStatus(boolean s){
        this.status = s;
    }
}
