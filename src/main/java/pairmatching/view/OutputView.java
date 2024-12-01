package pairmatching.view;

import pairmatching.enums.NotificationMessage;
import pairmatching.enums.SelectGuide;

public class OutputView {
    public void displaySelectGuide() {
        System.out.println(NotificationMessage.CHOOSE_FEATURE.getMessage());
        SelectGuide.getSelectGuides().forEach(System.out::println);
    }

    public void displayErrorMessage(String message) {
        System.out.println(message);
    }

}
