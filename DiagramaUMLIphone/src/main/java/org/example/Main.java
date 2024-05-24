package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select option Iphone");

        int numberOption = scanner.nextInt();
        chooseOptionIphone(numberOption, scanner);

        scanner.close();
    }

    public static void chooseOptionIphone(int numberOption, Scanner scanner){
        boolean running = true;

        while (running){
            try {
                switch (numberOption){
                    case 1:

                        SystemIphone.selectOptionMusic();
                        break;
                    case 2:
                        System.out.println("Choose type connection Iphone");
                        int connectionOption = scanner.nextInt();
                        SystemIphone.conectionsApp(connectionOption);
                        break;
                    case 3:
                        running = false;
                        System.out.println("Desligando Iphone , Obrigado...");
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, selecione uma opção válida.");
                        break;
                }
                if (running) {
                    System.out.println("Select option Iphone");
                    numberOption = scanner.nextInt();
                }
            } catch (Exception e) {
                System.out.println("Erro de entrada. Por favor, tente novamente.");
                scanner.nextLine(); // Limpa a linha de entrada incorreta
            }
        }
    }
}
