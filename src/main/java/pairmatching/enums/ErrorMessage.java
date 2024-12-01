package pairmatching.enums;

public enum ErrorMessage {
    // 입력 관련 에러 메시지
    INVALID_INPUT("잘못된 입력입니다. 다시 입력해 주세요."),

    INVALID_COURSE("존재하지 않는 과정입니다. 다시 입력해 주세요."),
    INVALID_LEVEL("존재하지 않는 레벨입니다. 다시 입력해 주세요."),
    INVALID_MISSION("존재하지 않는 미션입니다. 다시 입력해 주세요.");

    private static final String ERROR_TAG = "[ERROR]";
    private static final String ERROR_SEPARATOR = " ";  // 태그 뒤 공백
    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return ERROR_TAG + ERROR_SEPARATOR + message;
    }
}
