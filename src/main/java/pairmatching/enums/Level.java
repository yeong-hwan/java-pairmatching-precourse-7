package pairmatching.enums;

import java.util.Set;

public enum Level {
    LEVEL1("레벨1"),
    LEVEL2("레벨2"),
    LEVEL3("레벨3"),
    LEVEL4("레벨4"),
    LEVEL5("레벨5");

    private String name;

    Level(String name) {
        this.name = name;
    }

    private String getName() {
        return name;
    }

    public static Set<String> getLevels() {
        return Set.of(
                LEVEL1.getName(),
                LEVEL2.getName(),
                LEVEL3.getName(),
                LEVEL4.getName(),
                LEVEL5.getName()
        );
    }
}