package model;

import java.time.LocalDateTime;
import java.util.List;

public class EmployeeTrainer extends Employee implements Trainer{
    private List<Training> trainingList;
    private double bonus;

    public EmployeeTrainer(int id, String cnp, String firstName, String lastName, String email, String telephoneNo,
                           LocalDateTime birthDate, LocalDateTime employmentDate, String address, String position, String department,
                           double monthlySalary, List<Training> trainingList, double bonus) {
        super(id, cnp, firstName, lastName, email, telephoneNo, birthDate, employmentDate, address, position,
                department, monthlySalary);
        this.trainingList = trainingList;
        this.bonus = bonus;
    }


    public List<Training> getTrainingList() {
        return trainingList;
    }

    public void setTrainingList(List<Training> trainingList) {
        this.trainingList = trainingList;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + trainingList + ", " + bonus + "\n";
    }

    @Override
    public double calculateEmployeeTrainerSalary() {
        double salaryResult = getMonthlySalary() + bonus;
        return salaryResult;
    }
}
