package org.example;

import java.util.Scanner;

public class ReprodutorMusical {
    private static final Scanner scanner = new Scanner(System.in);

    public static void selecionarMusica() {
        int numberMusic;
        System.out.println("Selecione uma musica: ");
        numberMusic = scanner.nextInt();

        boolean running = true;

        while (running) {
            try {
                int optionsPlayer;

                System.out.println("Selecione uma opção do player: ");
                optionsPlayer = scanner.nextInt();

                switch (optionsPlayer) {
                    case 1:
                        tocar(numberMusic);
                        break;
                    case 2:
                        pausar();
                        break;
                    case 3:
                        System.out.println("1. Aumentar volume\n2. Diminuir volume");
                        int volumeOption = scanner.nextInt();
                        volume(volumeOption);
                        break;
                    case 4:
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
    }

    public static void tocar(int musicNumber) {
        System.out.println("Tocando música: " + musicNumber);
    }

    public static void pausar() {
        System.out.println("Pausando música");
    }

    public static void volume(int volume) {
        switch (volume) {
            case 1:
                System.out.println("Aumentar volume");
                break;
            case 2:
                System.out.println("Diminuir volume");
                break;
            default:
                System.out.println("Opção inválida. Por favor, selecione uma opção válida.");
                break;
        }
    }

    public static void closeScanner() {
        scanner.close();
    }
}
