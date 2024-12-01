package pairmatching.utils;

import java.util.List;
import java.util.Set;
import pairmatching.enums.ErrorMessage;

public class InputValidator {
    private static Set<String> validFeatureSelect = Set.of("1", "2", "3", "Q");
    private static Set<String> validReMatchingSelect = Set.of("네", "아니오");

    public static String validateFeatureSelect(String input) {
        if (!validFeatureSelect.contains(input)) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT.getMessage());
        }

        return input;
    }

    public static String validateReMatchingSelect(String input) {
        if (!validReMatchingSelect.contains(input)) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT.getMessage());
        }

        return input;
    }
}
