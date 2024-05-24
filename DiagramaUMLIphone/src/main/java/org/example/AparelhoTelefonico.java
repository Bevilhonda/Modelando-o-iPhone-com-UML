package org.example;

import java.util.Scanner;

public class AparelhoTelefonico {

    public static void ligar(int numberCall){

        System.out.println("Ligando para :" + numberCall);

    }
    public static void iniciarCorreioDeVoz(int contactNumber , String message){
        System.out.println("Contato :" + contactNumber);
        System.out.println("Iniciando correio de voz : " + message);
    }
}
