package pairmatching.repository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import pairmatching.domain.Crew;
import pairmatching.enums.Course;
import pairmatching.utils.CrewParser;

public class FrontendRepository {
    private static final String FRONTEND_FILE_PATH = "src/main/resources/frontend-crew.md";
    private static final Course FRONTEND = Course.FRONTEND;
    private final List<Crew> crews;

    public FrontendRepository() {
        String crewData = readFileToString(FRONTEND_FILE_PATH);
        this.crews = CrewParser.parseCrews(FRONTEND, crewData);
    }

    private String readFileToString(String filePath) {
        StringBuilder data = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                data.append(line).append("\n");
            }
        } catch (IOException e) {
            throw new IllegalStateException("[ERROR] 파일 읽기 중 오류가 발생했습니다: " + filePath, e);
        }
        return data.toString();
    }

    public void showCrews() {
        System.out.println(this.crews.toString());
    }
}
