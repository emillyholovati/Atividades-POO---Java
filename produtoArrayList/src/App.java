import java.util.ArrayList;
import java .util.Comparator;
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Produto> lista = new ArrayList<>();

        lista.add(new Produto("Batton Matte", 45));
        lista.add(new Produto("Vestido Midi", 180));
        lista.add(new Produto("Delineador", 35));
        lista.add(new Produto("Jaqueta Jeans", 220));
        lista.add(new Produto("Bolsa de Couro", 350));

        //classificando a lista por ordem crescente
        lista.sort(Comparator.comparing(Produto::getNome));

        System.out.println("----- Lista em ordem crescente por nome -----");
        
        //Listagem
        for(int i = 0; i < 5; i++){
            System.out.println("Produto: " + lista.get(i).getNome());
            System.out.println("Preco: " + lista.get(i).getPreco());
            System.out.println();
        }

        System.out.println("----- Lista em ordem crescente por preco -----");

        lista.sort(Comparator.comparing(Produto::getPreco));

        for(int i = 0; i < lista.size(); i++){
            System.out.println("Produto: " + lista.get(i).getNome());
            System.out.println("Preco: " + lista.get(i).getPreco());
            System.out.println();
        }

        System.out.println("----- Listando itens com preco maior que 100 -----");

        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getPreco() > 100){
                System.out.println("Produto: " + lista.get(i).getNome());
                System.out.println("Preco: " + lista.get(i).getPreco());
                System.out.println();
            }
        }

        System.out.println("----- Procurando Produto -----");
        //definindo um nome para buscar
        String nomeBuscar= "Blush";
        boolean encontrado = false;

        System.out.println("Produto procurado: " + nomeBuscar);
        //1. Pega o objeto na posição 'i' -> 2. Abre o objeto e pega o Nome -> 3. Compara o texto ignorando maiúsculas
        for(int i = 0; i < lista.size();i++){
            if(lista.get(i).getNome().equalsIgnoreCase(nomeBuscar)){
                System.out.println("O produto foi encontrado");
                encontrado = true;
            }
        }

        if(!encontrado){
            System.out.println("O produto nao existe na lista!");
        }

        System.out.println();
        System.out.println("----- Excluindo Produto -----");
        
        String excluirNome = "Battom Matte";

        System.out.println("Produto Excluido: " + excluirNome);

        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getNome().equalsIgnoreCase(excluirNome)){
                lista.remove(i);
            System.out.println("O produto foi excluido!");
            encontrado = true;
            }
        }
        
        if(!encontrado){
        System.out.println("O produto nao existe na lista!");
        }
    }
}

