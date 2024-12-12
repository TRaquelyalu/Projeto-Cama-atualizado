package br.projeto.cama;

public class Cama {
    private String material;
    private String tamanho;
    private String cor;
    private boolean ocupada;

    // Construtor com parâmetros
    public Cama(String material, String tamanho, String cor) {
        this.material = material;
        this.tamanho = tamanho;
        this.cor = cor;
        this.ocupada = false; // Inicialmente, a cama está vazia
    }

    // Método para deitar na cama
    public void deitar() {
        if (!ocupada) {
            ocupada = true;
            System.out.println("Você se deitou na cama. É uma cama " + tamanho + " feita de " + material + " e de cor " + cor + ".");
        } else {
            System.out.println("A cama já está ocupada.");
        }
    }

    // Método para levantar da cama
    public void levantar() {
        if (ocupada) {
            ocupada = false;
            System.out.println("Você levantou da cama.");
        } else {
            System.out.println("A cama já está vazia.");
        }
    }

    // Método para verificar o estado da cama
    public void verificarEstado() {
        if (ocupada) {
            System.out.println("A cama está ocupada.");
        } else {
            System.out.println("A cama está livre.");
        }
    }

    // Método para exibir detalhes da cama
    public void detalhes() {
        System.out.println("Detalhes da cama:");
        System.out.println("Material: " + material);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Cor: " + cor);
        System.out.println("Estado: " + (ocupada ? "Ocupada" : "Livre"));
    }
}




