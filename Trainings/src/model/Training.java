package model;

import java.util.List;

public class Training {
    private int id;
    private String code;
    private String name;
    private int numberOfAttendees;
    private Level level;
    private TrainingType trainingType;
    private List<Course> courseList;

    public Training(int id, String code, String name, int numberOfAttendees, Level level, TrainingType trainingType,
                    List<Course> courseList){
        this.id = id;
        this.code = code;
        this.name = name;
        this.numberOfAttendees = numberOfAttendees;
        this.level = level;
        this.trainingType = trainingType;
        this.courseList = courseList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFirstName() {
        return name;
    }

    public void setFirstName(String firstName) {
        this.name = name;
    }

    public int getNumberOfAttendees() {
        return numberOfAttendees;
    }

    public void setNumberOfAttendees(int attendeeNo) {
        this.numberOfAttendees = numberOfAttendees;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public TrainingType getTrainingType() {
        return trainingType;
    }

    public void setTrainingType(TrainingType trainingType) {
        this.trainingType = trainingType;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public boolean equals(Object o) {
        Training training = (Training) o;
        if ( this.code == training.getCode()) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 1;
        int prim = 31;
        result = result * prim + code.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return id + ", " + code + ", " + name + ", " + numberOfAttendees + ", " + level + ", " + trainingType + ", " + courseList + "\n";
    }
}