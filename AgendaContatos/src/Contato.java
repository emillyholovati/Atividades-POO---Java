import java.util.ArrayList;
import java.util.Scanner;

public class Contato {
    private String nome;
    private String telefone;
    
    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public String getNome() {return nome;}
    
    public String getTelefone() {return telefone;}
    
    public void setNome(String nome) { this.nome = nome; }

    public void setTelefone(String telefone) {this.telefone = telefone;}

    public static void menuPrincipal(){
        System.out.println("======= AGENDA =======");
        System.out.println("[1] Adicionar contato");
        System.out.println("[2] Editar contato");
        System.out.println("[3] Excluir contato");
        System.out.println("[4] Listar contatos");
        System.out.println("[5] Sair");
        System.out.print("\nEscolha uma opcao: ");
    }
 
    public static void menuEditar(){
        System.out.println("\n=== EDITAR CONTATO ===");
        System.out.println("[1] Editar telefone");
        System.out.println("[2] Editar email");
        System.out.println("[3] Voltar");
        System.out.print("\nEscolha uma opcao: ");
    }
    
    public static void adicionarContato(Scanner scanner, ArrayList<Contato> lista){
    
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
 
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
 
        lista.add(new Contato(nome, telefone));
 
        System.out.println("Contato adicionado!");
    }
    
    public static void listarContatos(ArrayList<Contato> lista){
        
        if(lista.isEmpty()){
            System.out.println("Agenda vazia!");
            return;
        }
        
        System.out.printf("\n%-20s | %-10s\n", "Nome", "Telefone");
        
        for(int i = 0; i < lista.size(); i++){
            System.out.printf("%-20s | %-10s\n",
                lista.get(i).getNome(), lista.get(i).getTelefone());
        }
    }
}