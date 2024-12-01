package pairmatching.view;

import java.util.List;
import pairmatching.enums.Course;
import pairmatching.enums.NotificationMessage;
import pairmatching.enums.SelectGuide;

public class OutputView {
    private static final String LINE_DIVIDER = "#############################################";
    private static final String SPLITTER = " | ";
    private static final String INDENT = "  ";
    private static final String PAIR_SPLITTER = " : ";

    public void displaySelectGuide() {
        System.out.println(NotificationMessage.CHOOSE_FEATURE.getMessage());
        SelectGuide.getSelectGuides().forEach(System.out::println);
    }

    public void displayAvailableGuide() {
        displayLineSpace();
        System.out.println(LINE_DIVIDER);

        displayCourseInfo();
        displayMissionInfo();

        System.out.println(LINE_DIVIDER);
    }

    public void displayConditionGuide() {
        System.out.println(NotificationMessage.CONDITION_GUIDE.getMessage());
        System.out.println(NotificationMessage.CONDITION_EXAMPLE.getMessage());
    }

    public static void displayPairMatchingResult(List<String> crewNames) {
        System.out.println(NotificationMessage.PAIR_MATCHING_RESULT.getMessage());

        for (int i = 0; i < crewNames.size(); i++) {
            if (i == crewNames.size()-3 && crewNames.size() % 2 != 0) {
                System.out.println(crewNames.get(i) + PAIR_SPLITTER + crewNames.get(i+1) + PAIR_SPLITTER + crewNames.get(i+2));
                break;
            }

            if (i % 2 == 0) {
                System.out.println(crewNames.get(i) + PAIR_SPLITTER + crewNames.get(i+1));
            }
        }
    }

    public void displayResetInfo() {
        displayLineSpace();
        System.out.println(NotificationMessage.RESET.getMessage());
    }

    public void displayErrorMessage(String message) {
        System.out.println(message);
    }

    private void displayCourseInfo() {
        System.out.println(
                NotificationMessage.COURSE_TAG.getMessage() +
                Course.BACKEND.getName() +
                SPLITTER +
                Course.FRONTEND.getName()
        );
    }

    private void displayMissionInfo() {
        System.out.println(NotificationMessage.MISSION_TAG.getMessage());
        System.out.println(INDENT + NotificationMessage.LEVEL_TAG.format(1) + "자동차경주 | 로또 | 숫자야구게임");
        System.out.println(INDENT + NotificationMessage.LEVEL_TAG.format(2) + "장바구니 | 결제 | 지하철노선도");
        System.out.println(INDENT + NotificationMessage.LEVEL_TAG.format(3));
        System.out.println(INDENT + NotificationMessage.LEVEL_TAG.format(4) + "성능개선 | 배포");
        System.out.println(INDENT + NotificationMessage.LEVEL_TAG.format(5));
    }

    private void displayLineSpace() {
        System.out.println();
    }
}
