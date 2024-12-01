package pairmatching.utils;

import java.util.List;
import pairmatching.domain.Crew;
import pairmatching.enums.Course;

public class CrewParser {
    private static final String CREW_DELIMITER = "\n";

    public static List<Crew> parseCrews(Course course, String crewData) {
        List<String> crewNames = parseCrewNames(crewData);

        return crewNames.stream()
                .map(name -> new Crew(course, name))
                .toList();
    }

    private static List<String> parseCrewNames(String crewData) {
        return List.of(crewData.split(CREW_DELIMITER));
    }
}
