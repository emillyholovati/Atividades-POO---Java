class ContaBancaria {
    String titular;
    double saldo = 0;

    void exibirInfo(){
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: " + this.saldo);
    }

    void depositar(double valor){
        this.saldo += valor;
    }

    void sacar(double valor){
        if(this.saldo < valor){
            System.out.println("SAldo insuficiente");
        }
        else{
            this.saldo -= valor;
        }
    }
}
