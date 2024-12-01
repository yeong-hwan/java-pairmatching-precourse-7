package pairmatching.enums;

public enum Mission {
    CAR_RACING("자동차경주"),
    LOTTO("로또"),
    BASEBALL("숫자야구게임"),

    CART("장바구니"),
    PURCHASE("결제"),
    SUBWAY("지하철노선도"),

    IMPROVEMENT("성능개선"),
    DEPLOY("배포");

    private final String name;

    Mission(String name) {
        this.name = name;
    }

    private String getName() {
        return name;
    }
}
