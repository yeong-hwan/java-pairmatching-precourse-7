package pairmatching.enums;

import java.util.List;

public enum SelectGuide {
    PAIR_MATCHING("1. 페어 매칭"),
    PAIR_RETRIEVE("2. 페어 조회"),
    PAIR_RESET("3. 페어 초기화"),
    QUIT("Q. 종료");

    private final String message;

    SelectGuide(String message) {
        this.message = message;
    }

    private String getMessage() {
        return message;
    }

    public static List<String> getSelectGuides() {
        return List.of(
                PAIR_MATCHING.getMessage(),
                PAIR_RETRIEVE.getMessage(),
                PAIR_RESET.getMessage(),
                QUIT.getMessage()
        );
    }

}
