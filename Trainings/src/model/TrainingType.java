package model;

public enum TrainingType {
    TECHNICAL_SKILLS("Technical skills"),
    SOFT_SKILLS("Soft skills");

    private String name;

    TrainingType(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

