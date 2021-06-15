package model;

public enum Level {
    BEGINNER("Beginner"),
    INTERMEDIARY("Intermediary"),
    ADVANCED("Advanced");

    private String name;

    Level(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
