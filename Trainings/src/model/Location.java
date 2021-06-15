package model;

public enum Location {
    BUCURESTI("Bucuresti"),
    CLUJ_NAPOCA("Cluj"),
    IASI("Iasi"),
    TIMISOARA("Timisoara"),
    BRASOV("Brasov");

    private String name;

    Location(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
