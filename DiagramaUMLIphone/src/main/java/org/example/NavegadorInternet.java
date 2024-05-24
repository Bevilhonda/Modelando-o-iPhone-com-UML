package org.example;

public class NavegadorInternet {

    public static void exibirPagina(String URL){
        System.out.println("Exibindo página: " + URL);
    }

    public static void adicionarNovaAba(String URL){
        System.out.println("Exibindo nova página:  " + URL);

    }
    public static void atualizarPagina(String NovaURL){
        exibirPagina(NovaURL);

    }
}
