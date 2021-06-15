package manager;

import model.*;
import java.time.LocalDateTime;
import java.util.*;

public class TrainingGroupManager {
    //returns the number of trainings in a location
    public int getNrOfTrainingsByLocation(List<TrainingGroup> trainingGroupList, Location location){
        int result = 0;
        for(TrainingGroup t : trainingGroupList) {
            if (t.getLocation().equals(location)) {
                result ++;
            }
        }
        return result;
    }

    //returns the number of employees by training level
    public int getNrOfEmployeesByTrainingLevel(List<TrainingGroup> trainingGroupList, List<Training> trainingList, Level level){
        int result = 0;
        Set<Employee> employeeSet = new HashSet<>();
        for(TrainingGroup tg : trainingGroupList) {
            String trainingCode = tg.getTrainingCode();
//            System.out.println("Training code: " + trainingCode);
            for (Training t: trainingList) {
                if (t.getCode().equals(trainingCode)) {
//                    System.out.println("    training level: " + t.getLevel());
                    if(t.getLevel().equals(level)) {
//                        System.out.println("            add employees ... " + employeeSet.size() + "   try to add " +tg.getEmployeeList().size());
                        for (Employee e : tg.getEmployeeList()) {
                                employeeSet.add(e);
                        }
//                        System.out.println("            add employees ... " + employeeSet.size() );
                    }
                }
            }
        }
        result = employeeSet.size();
        return result;
    }

    //returns the number of active trainings
    public int getNrOfActiveTrainings(List<TrainingGroup> trainingGroupList){
        int result = 0;
        for(TrainingGroup tg : trainingGroupList) {
            if (tg.getStartDate().isBefore(LocalDateTime.now()) && tg.getEndDate().isAfter(LocalDateTime.now())) {
                result++;
            }
        }
        return result;
    }

    //returns a list of training groups with available places for employees
    public Set<TrainingGroup> getTrainingListWithNonFullCapacity(List<TrainingGroup> trainingGroupList, List<Training> trainingList) {
        Set <TrainingGroup> resultTrainingList = new HashSet<>();
        for(TrainingGroup tg : trainingGroupList) {
            String trainingCode = tg.getTrainingCode();
            for (Training t : trainingList) {
                if ( t.getCode().equals(trainingCode) ) {
                    if (t.getNumberOfAttendees() > tg.getEmployeeList().size()) {
                        resultTrainingList.add(tg);
                    }
                }
            }
        }
        return resultTrainingList;
    }

    // calculates the number of trainings for each location (location with no trainings aren't shown )
    public Map<Location, Integer> getNrOfTrainingsPerLocation(List<TrainingGroup> trainingGroupList) {
        Map<Location, Integer> resultLocationMap = new HashMap<>();
        for (TrainingGroup tg : trainingGroupList) {
            Location location = tg.getLocation();
            if (resultLocationMap.containsKey(location)) {
                int nr = resultLocationMap.get(location) + 1;
                resultLocationMap.put(location,nr);
            }
            else {
                resultLocationMap.put(location,1);
            }
        }
        return resultLocationMap;
    }

    // returns a list of trainings by employee Id
    public List<Training> getTrainingListByEmployeeId(List<TrainingGroup> trainingGroupList, int employeeId, List<Training> trainingList) {
        List<Training> resultTrainingList = new ArrayList<>();
        for (TrainingGroup tg : trainingGroupList) {
            List<Employee> employeeList = tg.getEmployeeList();
            for (Employee e : employeeList){
                if (e.getId() == employeeId) {
                    String trCode = tg.getTrainingCode();
                    for (Training t : trainingList) {
                        if (t.getCode().equals(trCode)) {
                            if (!resultTrainingList.contains(t)) {
                                resultTrainingList.add(t);
                            }
                        }
                    }
                }
            }
        }
        return resultTrainingList;
    }

    // returns the number of trainings by employee Id
    public int getNrOfTrainingsByEmployeeId(List<TrainingGroup> trainingGroupList, int id) {
        int result = 0;
        for (TrainingGroup tg : trainingGroupList) {
            for (Employee e : tg.getEmployeeList()) {
                if ( e.getId() == id) {
                    result ++;
                    break;
                }
            }
        }
        return result;

    }

    //returns a list of employeeTrainer which are doing a specified training
    public Set<EmployeeTrainer> getTrainerListOfTrainingByTrainingId(List<TrainingGroup> trainingGroupList, String code, List<Employee> employeeList) {
        Set<EmployeeTrainer> resultTrainerSet = new HashSet<>();
        for (TrainingGroup tg : trainingGroupList) {
            if (tg.getTrainingCode().equals(code)) {
                String trainerCnp = tg.getTrainerCnp();
                for (Employee e : employeeList) {
                    if (e.getCnp().equals(trainerCnp)) {
                        EmployeeTrainer et = (EmployeeTrainer) e;
                        resultTrainerSet.add(et);
                        break;
                    }
                }
            }
        }
        return resultTrainerSet;
    }

    //cu variabile ajutatoare
    public Set<EmployeeTrainer> getTrainerListOfTraining_1(List<TrainingGroup> trainingGroupList, Training training, List<Employee> employeeList) {
        Set<EmployeeTrainer> resultTrainerSet = new HashSet<>();
        String trainingCode  = training.getCode();
        for (TrainingGroup tg : trainingGroupList) {
            String tgTrainingCode = tg.getTrainingCode();
            if (trainingCode.equals(tgTrainingCode)) {
                String trainerCnp = tg.getTrainerCnp();
                for (Employee e : employeeList) {
                    if (e.getCnp().equals(trainerCnp)) {
                        EmployeeTrainer et = (EmployeeTrainer) e;
                        resultTrainerSet.add(et);
                    }
                }
            }
        }
        return resultTrainerSet;
    }

    //returns a list of all trainings held by a trainer (search by trainer cnp)
    public Set<Training> getTrainingListOfTrainerByTrainerCnp(List<TrainingGroup> trainingGroupList, String trainerCnp, List<Training> trainingList) {
        Set<Training> resultTrainingSet = new HashSet<>();
        for(TrainingGroup tg : trainingGroupList) {
            if (tg.getTrainerCnp().equals(trainerCnp)) {
                String trainingCode = tg.getTrainingCode();
                for (Training t : trainingList) {
                    if (t.getCode().equals(trainingCode)) {
                            resultTrainingSet.add(t);
                    }
                }
            }
        }
        return resultTrainingSet;
    }


    // calculates the duration of each training
    public Map<Training, Integer> getHoursDurationPerTraining(List<Training> trainingList) {
        Map<Training, Integer> resultTrainingMap = new HashMap<>();
        for (Training t : trainingList){
            int duration = 0;
            for (Course c : t.getCourseList()) {
                duration += c.getHoursDuration();
            }
            resultTrainingMap.put(t,duration);
        }
        return resultTrainingMap;
    }

    // returns the training with the maximum duration (a list if there are more with the same maximum duration )
    public List<Training> getTrainingsWithMaximumNrOfHoursDuration(List<Training> trainingList) {
        List<Training> resultTrainingList = new ArrayList<>();
        Map<Training, Integer> resultTrainingMap = new HashMap<>();
/*        for (Training t : trainingList) {
            int duration = 0;
            for (Course c : t.getCourseList()) {
                duration += c.getHoursDuration();
            }
            resultTrainingMap.put(t, duration);
        }*/
        resultTrainingMap = getHoursDurationPerTraining(trainingList);
        int max = 0;
        for (Integer i : resultTrainingMap.values()) {
            if (max < i) {
                max = i;
            }
        }
        Iterator<Map.Entry<Training, Integer>> it = resultTrainingMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Training, Integer> pair = it.next();
            if (pair.getValue() == max) {
                resultTrainingList.add(pair.getKey());
            }
        }
        //int max = 0;
        //parcurg cu for val din map
        //dc i > max atunci max = i
        //for pe tot map-ul dc val corespunzatoare este egala cu max adaug in list result list cheia training
        return resultTrainingList;
    }

    //returns a list of all employees in a department
    public List<Employee> filterEmployeeListByDepartament(List<Employee> employeeList, String department) {
        List<Employee> resultEmployeeList = new ArrayList<>();
        for(Employee e : employeeList) {
            if (e.getDepartment().equals(department)){
                resultEmployeeList.add(e);
            }
        }
        return resultEmployeeList;
    }

    //return the number of employees for each department
    public Map<String, Integer> getNumberOfEmployeesPerDepartment(List<Employee> employeeList){
        Map<String, Integer> resultLocationMap = new HashMap<>();
        for (Employee e : employeeList){
            String department = e.getDepartment();
            if (resultLocationMap.containsKey(department)) {
                int numberOfEmployees = resultLocationMap.get(department);
                numberOfEmployees ++;
                resultLocationMap.put(department, numberOfEmployees);
            }
            else {
                resultLocationMap.put(department, 1);
            }
        }
        return resultLocationMap;
    }

    //calculates trainer's bonuses for all trainings using trainer cnp as search criteria
    public double calculateTotalBonusesForAllTrainingsOfTrainerByTrainerCnp(List<TrainingGroup> trainingGroupList, String trainerCnp,
                                                                                 List<Employee> employeeList) {
        EmployeeTrainer trainer = null;
        for (Employee e: employeeList) {
            if ( e.getCnp().equals(trainerCnp) ) {
                trainer = (EmployeeTrainer) e;
                break;
            }
        }
        double totalRemuneration = 0;
        for (TrainingGroup tg : trainingGroupList) {
            if (tg.getTrainerCnp().equals(trainerCnp)) {
                totalRemuneration += trainer.getBonus();
            }
        }
        return totalRemuneration;
    }

    //adds a new training group to the list of trainings
    public void addTrainingGroup(List<TrainingGroup> trainingGroupList, TrainingGroup trainingGroup){
        trainingGroupList.add(trainingGroup);
    }

    //removes a training group based on training group ID
    public void removeTrainingGroupById(List<TrainingGroup> trainingGroupList, int trainingGroupId){
        TrainingGroup trainingGroupToBeRemoved = null;
        for(TrainingGroup f : trainingGroupList){
            if(f.getId() == trainingGroupId){
                trainingGroupToBeRemoved = f;
            }
        }
        trainingGroupList.remove(trainingGroupToBeRemoved);
    }

    //removes a training group based on training group object
    public void removeTrainingGroup(List<TrainingGroup> trainingGroupList, TrainingGroup trainingGroupToBeDeleted){
        Iterator<TrainingGroup> iterator = trainingGroupList.iterator();
        while (iterator.hasNext()){
            TrainingGroup trainingGroup = iterator.next();
            if(trainingGroup.getId() == trainingGroupToBeDeleted.getId()){
                iterator.remove();
            }
        }
    }
}
