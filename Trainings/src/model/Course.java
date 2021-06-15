package model;

public class Course {
    private int id;
    private String title;
    private String description;
    private int hoursDuration;

    public Course(int id, String title, String description, int hoursDuration){
        this.id = id;
        this.title = title;
        this.description = description;
        this.hoursDuration = hoursDuration;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    @Override
    public boolean equals(Object o) {
        Course course = (Course) o;
        if ( this.id == course.getId()) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 1;
        int prim = 31;
        result = result * prim + id;
        return result;
    }

    @Override
    //toate fields
    public String toString() {
        return id + ", " + title + ", " + description + ", " + hoursDuration + "\n";
    }
}