package ai.skymind.skil.examples;

import ai.skymind.skil.examples.endpoints.auth.Login;

import java.text.MessageFormat;

public class Main {
    public static void main(String[] args) {
        String authToken = new Login().getAuthToken("admin", "admin");
        System.out.println(MessageFormat.format("Auth Token: {0}", authToken));


    }
}