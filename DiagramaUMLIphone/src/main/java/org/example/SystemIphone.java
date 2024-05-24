package org.example;

import java.util.Scanner;

public class SystemIphone {

    public static void selectOptionMusic() {
        ReprodutorMusical.selecionarMusica();
    }

    public static void conectionsApp(int i) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            try {
                System.out.println("Escolha uma opção:");
                System.out.println("1. Ligar para um contato ou número");
                System.out.println("2. Enviar mensagem de voz");
                System.out.println("3. Exibir página na Internet");
                System.out.println("4. Adicionar nova aba no navegador");
                System.out.println("5. Atualizar página no navegador");
                System.out.println("6. Sair");

                int optionNumber = scanner.nextInt();

                switch (optionNumber) {
                    case 1:
                        int contactNumber;
                        System.out.println("Escolha um contato ou digite o número:");
                        contactNumber = scanner.nextInt();
                        AparelhoTelefonico.ligar(contactNumber);
                        break;
                    case 2:
                        int contactNumberMessage;
                        String message;
                        System.out.println("Escolha um contato:");
                        contactNumberMessage = scanner.nextInt();
                        System.out.println("Digite uma mensagem:");
                        scanner.nextLine();
                        message = scanner.nextLine();
                        AparelhoTelefonico.iniciarCorreioDeVoz(contactNumberMessage, message);
                        break;
                    case 3:
                        System.out.println("Digite a URL da página que deseja exibir:");
                        scanner.nextLine();
                        String url = scanner.nextLine();
                        NavegadorInternet.exibirPagina(url);
                        break;
                    case 4:
                        System.out.println("Digite a URL da nova aba que deseja adicionar:");
                        scanner.nextLine();
                        String novaUrl = scanner.nextLine();
                        NavegadorInternet.adicionarNovaAba(novaUrl);
                        break;
                    case 5:
                        System.out.println("Digite a URL da página que deseja atualizar:");
                        scanner.nextLine();  // Consumir a nova linha deixada pelo nextInt()
                        String atualizarUrl = scanner.nextLine();
                        NavegadorInternet.atualizarPagina(atualizarUrl);
                        break;
                    case 6:
                        running = false;
                        System.out.println("Encerrando o programa...");
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, selecione uma opção válida.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Erro de entrada. Por favor, tente novamente.");
                scanner.nextLine();
            }
        }

        scanner.close();
    }


}
