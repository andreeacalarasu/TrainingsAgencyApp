package manager;

import model.Employee;
import model.EmployeeTrainer;
import model.Training;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmployeeManager {

    //returns a list of all trainers able to sustain a specified training (by training code)
    public Set<EmployeeTrainer> getEmployeeTrainersByTrainingCode(List<Employee> employeeList, String code) {
        Set<EmployeeTrainer> resultEmployeeTrainer = new HashSet<>();
        for (Employee e : employeeList) {
            if (e instanceof EmployeeTrainer) {
                EmployeeTrainer et = (EmployeeTrainer) e;
                for (Training t : et.getTrainingList()) {
                    if (t.getCode().equals(code)) {
                        resultEmployeeTrainer.add(et);
                        break;
                    }
                }
            }
        }
        return resultEmployeeTrainer;
    }
}

