class Produto {
    private String nome;
    private double valor = 0 ; //não esquecer de inicializar um valor
    private int quantidade = 0;


//construtor 
public Produto(String nome, double valor, int quantidade){
    this.nome = nome;
    this.valor = valor;
    this.quantidade = quantidade;
}

//setters
public void setNome(String nome){
    this.nome = nome;
}

public void setValor(double valor){
        if(valor >= 0){
            this.valor = valor;
        }else{
            System.out.println("Qauntidade não pode ser negativa");
        }
}

public void setQuantidade(int quantidade){
    if(valor >= 0){
        this.quantidade = quantidade;
    }else{
        System.out.println("Estoque Insuficiente");
    }
}

//getters
public String getNome(){ return nome; }
public double getValor(){ return valor; }
public int getQuantidade(){ return quantidade; }

//métodos
public void adicionarEstoque(int quantidade){
    this.quantidade += quantidade;
}

public void removerEstoque(int quantidade){
    if (this.quantidade >= quantidade  ) {
        this.quantidade-= quantidade;
    }
}

public double valorTotalEstoque(){
    return valor * quantidade;
}
}