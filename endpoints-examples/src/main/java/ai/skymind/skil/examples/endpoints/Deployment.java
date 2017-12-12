package ai.skymind.skil.examples.endpoints;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONArray;

import java.text.MessageFormat;

public class Deployment {

    private String host;
    private String port;

    public Deployment() {
        this.host = "localhost";
        this.port = "9008";
    }

    public Deployment(String host, String port) {
        this.host = host;
        this.port = port;
    }

    public JSONArray getAllDeployments() {
        JSONArray deployments = new JSONArray();

        try {
            deployments =
                    Unirest.get(MessageFormat.format("http://{0}:{1}/deployments", host, port))
                            .header("accept", "application/json")
                            .header("Content-Type", "application/json")
                            .asJson()
                            .getBody().getArray();
        } catch (UnirestException e) {
            e.printStackTrace();
        }

        return deployments;
    }
}
