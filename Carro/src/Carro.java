class Carro {
    String marca;
    String modelo;
    int velocidade = 0;
    boolean ligado;

    void status(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Velocidade: " + this.velocidade);
    }
    void ligar(){
        this.ligado = true;
        System.out.println("Carro ligado!");
    }

    void desligar(){
        this.ligado = false;
        System.out.println("Carro desligado!");
    }

    void acelerar(){
        if(ligado == false){
            System.out.println("Carro esta desligado, nao eh possivel acelerar");
        }else{
            velocidade += 10;
        }
    }

    void frear(){
        if(velocidade == 0){
            System.out.println("Carro esta parado");
        }else{
            velocidade -= 10;
        }
    }
}
