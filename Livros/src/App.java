public class App {
    public static void main(String[] args) {
        Livros l = new Livros();

        l.titulo = "Amor Corrompido";
        l.autor = "Ana Huang";
        l.exibirInfo();

        System.out.println("------------");

        Livros l2 = new Livros();
        l2.titulo = "Trono de Vidro";
        l2.autor = "Sarah J. Mass";
        l2.exibirInfo();
    }
}
