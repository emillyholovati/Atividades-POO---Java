public class App {
    public static void main(String[] args) throws Exception {
        ContaBancaria c1 = new ContaBancaria("Jessica", 100);
        
        c1.depositar(50);
        
        System.out.println("Titular: " + c1.getTitular());
        System.out.println("Saldo: " + c1.getSaldo());

        
    }
}
