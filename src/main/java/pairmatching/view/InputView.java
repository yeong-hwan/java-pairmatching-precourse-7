package pairmatching.view;

import camp.nextstep.edu.missionutils.Console;
import pairmatching.domain.Condition;
import pairmatching.utils.ConditionParser;
import pairmatching.utils.InputValidator;

public class InputView {
    public String readFeatureSelect() {
        String input = Console.readLine();

        return InputValidator.validateFeatureSelect(input);
    }

    public Condition readCondition() {
        String input = Console.readLine();

        return ConditionParser.parseCondition(input);
    }
}
