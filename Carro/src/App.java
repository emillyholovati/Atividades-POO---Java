public class App {
    public static void main(String[] args){
        Carro c1 = new Carro();
        c1.marca = "Volkswagen";
        c1.modelo = "Gol";

        Carro c2 = new Carro();
        c2.marca = "Renault";
        c2.modelo = "Sandero";

        c1.ligar();
        c1.acelerar();
        c1.acelerar();
        c1.status();
        c1.frear();
        c1.status();
        c1.desligar();
    }
}
