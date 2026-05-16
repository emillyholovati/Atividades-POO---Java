public class ContaBancaria {
    private String titular;
    private double saldo = 0;

    //consrtutor
    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    //getters tem que retornar alguma coisa
    //public se utiliza os tipos de valores
    public String getTitular(){
        return this.titular;
    }

    public double getSaldo(){
        return this.saldo;
    }

    //setters

    // entre parentesses deve estra a variavel
    // tem que definir a variavel = variavel
    public void setTitular(String titular){
        this.titular = titular;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double saldo){
        if(saldo > this.saldo){
            System.out.println("Erro");
        }else{
            this.saldo -= saldo;
        }
    }
}
