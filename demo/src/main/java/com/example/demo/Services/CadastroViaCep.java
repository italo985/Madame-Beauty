package com.example.demo.Services;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class CadastroViaCep {

    public static void viacep(String cep) throws IOException, InterruptedException {

        boolean cepValido = false;

        do {

            String cepLimpo = cep.replaceAll("[^0-9]", "");
            if (cepLimpo.length() != 8) {
                System.out.println("CEP Inválido. Digite novamente!");
                break;
            }
            else{
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create("https://viacep.com.br/ws/" + cepLimpo + "/json/"))
                        .build();

                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                if (response.body().contains("erro")){
                    System.out.println("CEP Inválido. Digite novamente!");
                    cepValido = false;
                } else{
                    cepValido = true;
                }
            }
        } while(!cepValido);
    }
}

