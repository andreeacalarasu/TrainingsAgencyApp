package model;

import java.time.LocalDateTime;
import java.util.List;

public class TrainingGroup {
    private int id;
    private String trainingCode;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Location location;
    private String trainerCnp;
    private List<Employee> employeeList;

    public TrainingGroup(int id, String trainingCode, LocalDateTime startDate, LocalDateTime endDate, Location location,
                         String trainerCnp, List<Employee> employeeList) {
        this.id = id;
        this.trainingCode = trainingCode;
        this.startDate = startDate;
        this.endDate = endDate;
        this.location = location;
        this.trainerCnp = trainerCnp;
        this.employeeList = employeeList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTrainingCode() {
        return trainingCode;
    }

    public void setTrainingCode(String trainingCode) {
        this.trainingCode = trainingCode;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getTrainerCnp() {
        return trainerCnp;
    }

    public void setTrainerCnp(String trainerCnp) {
        this.trainerCnp = trainerCnp;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public boolean equals(Object o) {
        TrainingGroup trainingGroup = (TrainingGroup) o;
        if ( this.id == trainingGroup.getId()) {
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
    public String toString() {
        return id + ", " + trainingCode + ", " + startDate + ", " + endDate + ", " + location + ", " + trainerCnp + ", "
                + employeeList + "\n";}
}
