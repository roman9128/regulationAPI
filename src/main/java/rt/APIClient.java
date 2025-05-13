package rt;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

class APIClient {

    private final HttpClient client = HttpClient.newBuilder().build();

    public String makeRequest(String APIRequest) throws InterruptedException, IOException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(APIRequest))
                .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64)") // кругом обман
                .header("Accept", "text/xml,application/xml")
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}