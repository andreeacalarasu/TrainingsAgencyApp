package main;

import data.DataCreator;
import data.DataReader;
import data.GenerateTrainingGroupFile;
import manager.EmployeeManager;
import manager.TrainingGroupManager;
import manager.TrainingManager;
import model.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        DataReader dataReader = new DataReader();
        List<Training> trainingList = dataReader.createTrainingList();


        DataCreator dataCreator = new DataCreator();
        List<Employee> employeeList = dataCreator.createEmployeeList();
        List<TrainingGroup> trainingGroupList = dataCreator.createTrainingGroupList();
        System.out.println("===========================================================================");
        System.out.println("Training list is:\n" + trainingList + "\n");
        System.out.println("===========================================================================");
        System.out.println("Employee list is:\n" + employeeList + "\n");
        System.out.println("===========================================================================");
        System.out.println("Training group list is:\n" + trainingGroupList + "\n");
        System.out.println("===========================================================================");

        TrainingGroup tg = trainingGroupList.get(0);
        GenerateTrainingGroupFile generateTrainingGroupFile = new GenerateTrainingGroupFile();
        generateTrainingGroupFile.generateTrainingGroupFile(tg);

        EmployeeManager em = new EmployeeManager();
        TrainingGroupManager tgm = new TrainingGroupManager();
        TrainingManager tm = new TrainingManager();

        System.out.println("*************************************************************************************************************");
        System.out.println("*************************************************************************************************************");

    // Call EmployeeManager methods
        Set<EmployeeTrainer> resultTr_Java = em.getEmployeeTrainersByTrainingCode(employeeList, "TR_JAVA");
        Set<EmployeeTrainer> resultTr_Ios = em.getEmployeeTrainersByTrainingCode(employeeList, "TR_IOS");
        Set<EmployeeTrainer> resultTr_Public_Speaking = em.getEmployeeTrainersByTrainingCode(employeeList, "TR_PUBLIC_SPEAKING");
        Set<EmployeeTrainer> resultTr_Emotional_Int = em.getEmployeeTrainersByTrainingCode(employeeList, "TR_EMOTIONAL_INTELLIGENCE");
        System.out.println("Employee trainers by training code (TR_JAVA) are: \n" + resultTr_Java);
        System.out.println("Employee trainers by training code (TR_IOS) are: \n"  + resultTr_Ios);
        System.out.println("Employee trainers by training code (TR_PUBLIC_SPEAKING) are: \n"  + resultTr_Public_Speaking);
        System.out.println("Employee trainers by training code (TR_EMOTIONAL_INTELLIGENCE) are: \n"  + resultTr_Emotional_Int);
        System.out.println("===========================================================================");

   // Call TrainingGroupManager methods
        System.out.println("Number of trainings in Bucuresti: \n" + tgm.getNrOfTrainingsByLocation(trainingGroupList, Location.BUCURESTI));
        System.out.println("Number of trainings in Cluj-Napoca: \n" + tgm.getNrOfTrainingsByLocation(trainingGroupList, Location.CLUJ_NAPOCA));
        System.out.println("Number of trainings in Timisoara: \n" + tgm.getNrOfTrainingsByLocation(trainingGroupList, Location.TIMISOARA));
        System.out.println("Number of trainings in Iasi: \n" + tgm.getNrOfTrainingsByLocation(trainingGroupList, Location.IASI));
        System.out.println("Number of trainings in Brasov: \n" + tgm.getNrOfTrainingsByLocation(trainingGroupList, Location.BRASOV));
        System.out.println("===========================================================================");

        System.out.println("Number of emplyees with BEGINNER level : \n" + tgm.getNrOfEmployeesByTrainingLevel( trainingGroupList,trainingList, Level.BEGINNER));
        System.out.println("Number of emplyees with INTERMEDIARY level \n: " + tgm.getNrOfEmployeesByTrainingLevel( trainingGroupList,trainingList, Level.INTERMEDIARY));
        System.out.println("Number of emplyees with ADVANCED level \n: " + tgm.getNrOfEmployeesByTrainingLevel( trainingGroupList,trainingList, Level.ADVANCED));
        System.out.println("===========================================================================");

        System.out.println("Number of active trainings is: \n" + tgm.getNrOfActiveTrainings(trainingGroupList));
        System.out.println("===========================================================================");


        System.out.println(tgm.getTrainingListWithNonFullCapacity(trainingGroupList, trainingList).size() + "Trainings with non full capacity are: \n"
                + tgm.getTrainingListWithNonFullCapacity(trainingGroupList, trainingList));
        System.out.println("===========================================================================");

        System.out.println("Number of trainings per location is: \n" + tgm.getNrOfTrainingsPerLocation(trainingGroupList));
        System.out.println("===========================================================================");

        System.out.println("The training list for employee with ID1 is: \n" + tgm.getTrainingListByEmployeeId(trainingGroupList, 1, trainingList));
        System.out.println("The training list for employee with ID2 is: \n" + tgm.getTrainingListByEmployeeId(trainingGroupList, 2, trainingList));
        System.out.println("The training list for employee with ID3 is: \n" + tgm.getTrainingListByEmployeeId(trainingGroupList, 3, trainingList));
        System.out.println("The training list for employee with ID4 is: \n" + tgm.getTrainingListByEmployeeId(trainingGroupList, 4, trainingList));
        System.out.println("The training list for employee with ID5 is: \n" + tgm.getTrainingListByEmployeeId(trainingGroupList, 5, trainingList));
        System.out.println("The training list for employee with ID6 is: \n" + tgm.getTrainingListByEmployeeId(trainingGroupList, 6, trainingList));
        System.out.println("The training list for employee with ID7 is: \n" + tgm.getTrainingListByEmployeeId(trainingGroupList, 7, trainingList));
        System.out.println("The training list for employee with ID8 is: \n" + tgm.getTrainingListByEmployeeId(trainingGroupList, 8, trainingList));
        System.out.println("The training list for employee with ID9 is: \n" + tgm.getTrainingListByEmployeeId(trainingGroupList, 9, trainingList));
        System.out.println("The training list for employee with ID10 is: \n" + tgm.getTrainingListByEmployeeId(trainingGroupList, 10, trainingList));
        System.out.println("===========================================================================");

        System.out.println("Number of trainings for employee with ID1 is: \n" + tgm.getNrOfTrainingsByEmployeeId(trainingGroupList,1));
        System.out.println("Number of trainings for employee with ID5 is: \n" + tgm.getNrOfTrainingsByEmployeeId(trainingGroupList,5));
        System.out.println("Number of trainings for employee with ID6 is: \n" + tgm.getNrOfTrainingsByEmployeeId(trainingGroupList,6));
        System.out.println("Number of trainings for employee with ID7 is: \n" + tgm.getNrOfTrainingsByEmployeeId(trainingGroupList,7));
        System.out.println("Number of trainings for employee with ID8 is: \n" + tgm.getNrOfTrainingsByEmployeeId(trainingGroupList,8));

        System.out.println("===========================================================================");

        System.out.println("The list of trainers that teach TR_JAVA is: \n" + tgm.getTrainerListOfTrainingByTrainingId(trainingGroupList,"TR_JAVA", employeeList));
        System.out.println("The list of trainers that teach TR_IOS is: \n" + tgm.getTrainerListOfTrainingByTrainingId(trainingGroupList,"TR_IOS", employeeList));
        System.out.println("===========================================================================");

        System.out.println("The list of training groups for 2820329080012 trainer cnp is: \n" + tgm.getTrainingListOfTrainerByTrainerCnp(trainingGroupList, "2820329080012", trainingList));
        System.out.println("The list of training groups for 1761107080086 trainer cnp is: \n" + tgm.getTrainingListOfTrainerByTrainerCnp(trainingGroupList, "1761107080086", trainingList));
        System.out.println("===========================================================================");

        System.out.println("The hours duration of a training is: \n" + tgm.getHoursDurationPerTraining(trainingList));
        System.out.println("===========================================================================");

        System.out.println("The training with maximum number of hour duration is (a list if there are many): \n" +
                tgm.getTrainingsWithMaximumNrOfHoursDuration(trainingList));
        System.out.println("===========================================================================");

        System.out.println("Filter employee list by Development department is: \n" + tgm.filterEmployeeListByDepartament(employeeList, "Development"));
        System.out.println("Filter employee list by Design department is: \n" + tgm.filterEmployeeListByDepartament(employeeList, "Design"));
        System.out.println("Filter employee list by Quality Assurance department is: \n" + tgm.filterEmployeeListByDepartament(employeeList, "Quality Assurance"));
        System.out.println("===========================================================================");

        System.out.println("Number of employees per department is: \n" + tgm.getNumberOfEmployeesPerDepartment(employeeList));
        System.out.println("===========================================================================");

        System.out.println("The total remuneration of all trainings for trainer with 2820329080012 cnp is: \n" +
                tgm.calculateTotalBonusesForAllTrainingsOfTrainerByTrainerCnp(trainingGroupList, "2820329080012", employeeList));
        System.out.println("The total remuneration of all trainings for trainer with 1900113080036 cnp is: \n" +
                tgm.calculateTotalBonusesForAllTrainingsOfTrainerByTrainerCnp(trainingGroupList, "1900113080036", employeeList));
        System.out.println("The total remuneration of all trainings for trainer with 2760509080087 cnp is: \n" +
                tgm.calculateTotalBonusesForAllTrainingsOfTrainerByTrainerCnp(trainingGroupList, "2760509080087", employeeList));
        System.out.println("===========================================================================");


        List<Employee> tg1List = new ArrayList<>();
        tg1List.add(employeeList.get(0));
        tg1List.add(employeeList.get(1));
        tg1List.add(employeeList.get(2));


        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String stringStartDate1 = "15/08/2021 12:00:00";
        LocalDateTime startDate1 = LocalDateTime.parse(stringStartDate1, dtf1);
        String stringEndDate1 = "01/09/2021 12:00:00";
        LocalDateTime endDate1 = LocalDateTime.parse(stringEndDate1, dtf1);
        TrainingGroup tg1 = new TrainingGroup(7, "TR_JAVA", startDate1, endDate1, Location.BUCURESTI,"2890329080012", tg1List);


        System.out.println("Training group size before add is: \n" + trainingGroupList.size());
        tgm.addTrainingGroup(trainingGroupList,tg1);
        System.out.println("Add training group result is: \n" + trainingGroupList);
        System.out.println("Training group size after add is: \n" + trainingGroupList.size());
        System.out.println("===========================================================================");
        tgm.removeTrainingGroupById(trainingGroupList, tg1.getId());
        System.out.println("Remove training group by ID result is: \n" + trainingGroupList);
        System.out.println("Training group size after remove is: \n" + trainingGroupList.size());
        System.out.println("===========================================================================");


        tgm.addTrainingGroup(trainingGroupList,tg1);
        System.out.println("Add training group result is: \n" + trainingGroupList);
        System.out.println("Training group size after remove is: \n" + trainingGroupList.size());
        System.out.println("===========================================================================");
        tgm.removeTrainingGroup(trainingGroupList, tg1);
        System.out.println("Remove training group result is: \n" + trainingGroupList);
        System.out.println("Training group size after remove is: \n" + trainingGroupList.size());
        System.out.println("===========================================================================");



        // Call TrainingManager methods
        System.out.println("Filter training list by TECHNICAL_SKILLS training type result is: \n" + tm.filterTrainingListByType(trainingList, TrainingType.TECHNICAL_SKILLS));
        System.out.println("Filter training list by SOFT_SKILLS training type result is: \n" + tm.filterTrainingListByType(trainingList, TrainingType.SOFT_SKILLS));
        System.out.println("===========================================================================");

        System.out.println("Filter training list by BEGINNER level result is: \n" + tm.filterTrainingListByLevel(trainingList, Level.BEGINNER));
        System.out.println("Filter training list by INTERMEDIARY level result is: \n" + tm.filterTrainingListByLevel(trainingList, Level.INTERMEDIARY));
        System.out.println("Filter training list by ADVANCED level result is: \n" + tm.filterTrainingListByLevel(trainingList, Level.ADVANCED));
    }
}
