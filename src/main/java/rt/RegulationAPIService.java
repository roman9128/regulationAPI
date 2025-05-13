package rt;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.*;
import com.fasterxml.jackson.datatype.jsr310.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RegulationAPIService {

    private final APIClient client;
    private final XmlMapper mapper;
    private String requestResultInXML;

    public RegulationAPIService() {
        client = new APIClient();
        mapper = new XmlMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    /**
     * Метод для отправки запроса к API regulation.gov.ru
     *
     * @param request строка с запросом. Для создания запроса следует использовать объект класса APIRequest
     * @throws IOException
     * @throws InterruptedException
     */
    public void makeRequest(String request) throws IOException, InterruptedException {
        requestResultInXML = client.makeRequest(request);
    }

    public String getRequestResultInXML() {
        return requestResultInXML;
    }

    public List<Project> getRequestResultAsObjectsList() throws IOException {
        if (!requestResultInXML.isBlank()) {
            return mapper.readValue(requestResultInXML, ProjectListWrapper.class).getProjects();
        }
        return new ArrayList<>();
    }
}