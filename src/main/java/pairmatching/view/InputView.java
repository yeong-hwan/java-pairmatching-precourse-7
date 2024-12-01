package pairmatching.view;

import camp.nextstep.edu.missionutils.Console;
import pairmatching.utils.InputValidator;

public class InputView {
    public String readFeatureSelect() {
        String input = Console.readLine();

        return InputValidator.validateFeatureSelect(input);
    }
}
