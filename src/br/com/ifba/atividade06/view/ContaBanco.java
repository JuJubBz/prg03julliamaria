
package br.com.ifba.atividade06.view;
public class ContaBanco {
     //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    //metodos personalizados
    
    public void estadoAtual() {
    System.out.println("---------------------------");
    System.out.println("Conta: " + this.getNumConta());
    System.out.println("Dono: " + this.getDono());
    System.out.println("Saldo: " + this.getSaldo());
    System.out.println("Status: " + this.getStatus());
}
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.saldo = 50;
            this.setSaldo(50);
        } else if (t == "CP"){
            this.setSaldo(150);
        }
    }
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta nao pode ser fechada, ainda tem dinhairo!");
        }else if(this.getSaldo()< 0){
            System.out.println("Conta nao pode ser fechada, ainda tem debito!");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    public void depositar(float v){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado, conta de:" + this.getDono());
        }else{
            System.out.println("Impossivel depositar.");
        }
    }
    public void sacar(float v){
        if (this.getStatus()){
            if(this.getSaldo() >= v){
                System.out.println("Saque realizado, conta de:" + this.getDono());
            }else{
                System.out.println("Sem dinheiro suficeinte!");      
        }
    }else{
            System.out.println("Impossivel sacar de uma conta fechada!");
        }
}
    
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC"){
            v = 12;
        } else if (this.getTipo() == "CP"){
            v = 20;
        } 
        if (this.getStatus()){ 
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga! Por:" + this.getDono());   
           }else{
            System.out.println("Impossivel pagar mensalidade!");
        }      
    }
    //metodos especiais
    public ContaBanco() {
        this.setSaldo(0);
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

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    }
    
    
    