package pairmatching.enums;

public enum NotificationMessage {
    CHOOSE_FEATURE("기능을 선택하세요."),

    COURSE_TAG("과정: "),
    MISSION_TAG("미션:"),
    LEVEL_TAG("- 레벨%d: "),

    CONDITION_GUIDE("과정, 레벨, 미션을 선택하세요."),
    CONDITION_EXAMPLE("ex) 백엔드, 레벨1, 자동차경주"),

    PAIR_MATCHING_RESULT("페어 매칭 결과입니다."),
    REMATCHING_SELECT("매칭 정보가 있습니다. 다시 매칭하시겠습니까?"),

    RESET("초기화 되었습니다.");


    private final String message;

    NotificationMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String format(Object... args) {
        return String.format(message, args);
    }

}
