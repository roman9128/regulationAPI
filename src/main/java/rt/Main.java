package rt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        RegulationAPIService service = new RegulationAPIService();
        try {
            service.makeRequest(new APIRequest().limit(1).sort().build());
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
        List<Project> projects = new ArrayList<>();
        try {
            projects = service.getRequestResultAsObjectsList();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        for (Project project : projects) {
            System.out.println(project);
        }
    }

    private static void writeTextToFile(String text, String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName, true)) {
            fileWriter.write(text);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static String readTextFromFile(String fileName) {
        StringBuilder builder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line);
                builder.append(System.lineSeparator());
            }
            return builder.toString();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "";
        }
    }
}