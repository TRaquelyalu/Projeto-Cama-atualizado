package br.projeto.cama;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita informações da cama ao usuário
        System.out.println("Criação de uma nova cama:");
        System.out.print("Informe o material da cama: ");
        String material = scanner.nextLine();
        System.out.print("Informe o tamanho da cama (ex: solteiro, casal, queen): ");
        String tamanho = scanner.nextLine();
        System.out.print("Informe a cor da cama: ");
        String cor = scanner.nextLine();

        // Instancia a cama com os dados fornecidos
        Cama minhaCama = new Cama(material, tamanho, cor);

        int opcao;
        do {
            // Menu interativo
            System.out.println("\nEscolha uma ação:");
            System.out.println("1. Deitar na cama");
            System.out.println("2. Levantar da cama");
            System.out.println("3. Verificar estado da cama");
            System.out.println("4. Exibir detalhes da cama");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha

            // Execução das ações com base na escolha do usuário
            switch (opcao) {
                case 1:
                    minhaCama.deitar();
                    break;
                case 2:
                    minhaCama.levantar();
                    break;
                case 3:
                    minhaCama.verificarEstado();
                    break;
                case 4:
                    minhaCama.detalhes();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}

