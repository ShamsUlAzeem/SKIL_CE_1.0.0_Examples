package ai.skymind.skil.examples;

import ai.skymind.skil.examples.endpoints.Authorization;
import ai.skymind.skil.examples.endpoints.Deployment;
import org.json.JSONArray;
import org.json.JSONObject;

import java.text.MessageFormat;

public class Main {
    public static void main(String[] args) {
        Authorization authorization = new Authorization();
        String authToken = authorization.getAuthToken("admin", "admin");
        System.out.println(MessageFormat.format("Auth Token: {0}", authToken));

        Deployment deployment = new Deployment();
        JSONArray deployments = deployment.getAllDeployments();
        System.out.println(deployments);

        JSONObject deploymentById = deployment.getDeploymentById(0);
        System.out.println(deploymentById);

        JSONObject addedDeployment = deployment.addDeployment("New deployment");
        System.out.println(addedDeployment);
    }
}