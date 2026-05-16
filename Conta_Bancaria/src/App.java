public class App {
    public static void main(String[] args){
        ContaBancaria c1 = new ContaBancaria();
        c1.titular = "Luiza";
        c1.depositar(500);
        c1.sacar(600);
        c1.sacar(350);
        c1.exibirInfo();

        System.out.println("----------");

        ContaBancaria c2 = new ContaBancaria();
        c2.titular = "Felipe";
        c2.depositar(1000);
        c2.exibirInfo();
    }
}
