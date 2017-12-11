package ai.skymind.skil.examples.endpoints.auth;

public class Login {

    String host;
    String port;

    public Login() {
        this.host = "localhost";
        this.port = "9008"
    }

    public Login(String host, String port) {
        this.host = host;
        this.port = port;
    }

    public String getAuthToken(String userId, String password) {

    }
}