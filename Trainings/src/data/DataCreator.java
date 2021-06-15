package data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import model.*;

public class DataCreator {
    public List<Employee> createEmployeeList() {
        List<Employee> employeeList = new ArrayList<>();
        DataReader dataReader = new DataReader();
        List<Training> allTrainingList = dataReader.createTrainingList();

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String stringBirthDate1 = "20/11/1989 12:00:00";
        LocalDateTime birthDate1 = LocalDateTime.parse(stringBirthDate1, dtf1);
        String stringEmploymentDate1 = "10/06/2008 12:00:00";
        LocalDateTime employmentDate1 = LocalDateTime.parse(stringEmploymentDate1, dtf1);

        Employee employee1 = new Employee(1, "2891120080060", "Mara", "Istrate", "mara.istrate@yahoo.com", "0268099956", birthDate1,
                employmentDate1, "Brasov, str. Viitorului, nr.17", "Software tester", "Quality Assurance", 2500);

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String stringBirthDate2 = "20/11/1989 12:00:00";
        LocalDateTime birthDate2 = LocalDateTime.parse(stringBirthDate2, dtf2);
        String stringEmploymentDate2 = "10/06/2008 12:00:00";

        LocalDateTime employmentDate2 = LocalDateTime.parse(stringEmploymentDate2, dtf2);
        Employee employee2 = new Employee(2, "1850909080060", "Emil", "Codrea", "emil.codrea@yahoo.com", "0723179802", birthDate2,
                employmentDate2, "Brasov, str. Carierei, nr.17", "QA Manager", "Quality Assurance", 4250);

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String stringBirthDate3 = "20/11/1989 12:00:00";
        LocalDateTime birthDate3 = LocalDateTime.parse(stringBirthDate3, dtf3);
        String stringEmploymentDate3 = "10/06/2008 12:00:00";
        LocalDateTime employmentDate3 = LocalDateTime.parse(stringEmploymentDate3, dtf3);

        Employee employee3 = new Employee(3, "1820630080012", "Rares", "Popa", "rares.popa@gmail.com", "0745245749", birthDate3, employmentDate3,
                "Cluj, str. Alba, nr.50Bis", "Java Developer", "Quality Assurance", 2500);

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String stringBirthDate4 = "20/11/1989 12:00:00";
        LocalDateTime birthDate4 = LocalDateTime.parse(stringBirthDate4, dtf4);
        String stringEmploymentDate4 = "10/06/2008 12:00:00";
        LocalDateTime employmentDate4 = LocalDateTime.parse(stringEmploymentDate4, dtf4);

        Employee employee4 = new EmployeeTrainer(4, "2820329080012", "Elena - Maria", "Petru", "elena_petru82@yahoo.com", "0723378692", birthDate4,
                employmentDate4, "Iasi, str. Cireselor, nr.20", "Business Analyst", "Quality Assurance", 2500, new ArrayList<>(), 90);

        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String stringBirthDate5 = "20/11/1989 12:00:00";
        LocalDateTime birthDate5 = LocalDateTime.parse(stringBirthDate5, dtf5);
        String stringEmploymentDate5 = "10/06/2008 12:00:00";
        LocalDateTime employmentDate5 = LocalDateTime.parse(stringEmploymentDate5, dtf5);

        List<Training> e5TrainingList = new ArrayList<>();
        e5TrainingList.add(allTrainingList.get(0));
        e5TrainingList.add(allTrainingList.get(1));

        Employee employee5 = new EmployeeTrainer(5, "1931218080041", "Valeriu", "Tudor", "valeriu.tudor@yahoo.com", "0745490564", birthDate5,
                employmentDate5, "Cluj, str. Matei Basarb, nr.77", "UI / UX Designer", "Design", 2500, e5TrainingList, 500);

        DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String stringBirthDate6 = "20/11/1989 12:00:00";
        LocalDateTime birthDate6 = LocalDateTime.parse(stringBirthDate6, dtf6);
        String stringEmploymentDate6 = "10/06/2008 12:00:00";
        LocalDateTime employmentDate6 = LocalDateTime.parse(stringEmploymentDate6, dtf6);

        List<Training> e6TrainingList = new ArrayList<>();
        e6TrainingList.add(allTrainingList.get(1));
        e6TrainingList.add(allTrainingList.get(3));

        Employee employee6 = new EmployeeTrainer(6, "1700723080055", "Gabriel",
                "Dobrin", "gabrieldobrin7007.istrate@yahoo.com", "0723511437", birthDate6,
                employmentDate6, "Timisoara, str. Tudor Vladimirescu, nr.17", "Java Web Developer",
                "Development", 2500, e6TrainingList, 50);

        DateTimeFormatter dtf7 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String stringBirthDate7 = "20/11/1989 12:00:00";
        LocalDateTime birthDate7 = LocalDateTime.parse(stringBirthDate7, dtf7);
        String stringEmploymentDate7 = "10/06/2008 12:00:00";
        LocalDateTime employmentDate7 = LocalDateTime.parse(stringEmploymentDate7, dtf7);

        List<Training> e7TrainingList = new ArrayList<>();
        e7TrainingList.add(allTrainingList.get(2));
        e7TrainingList.add(allTrainingList.get(3));

        Employee employee7 = new EmployeeTrainer(7, "2850422080026", "Adelina",
                "Ene", "adelina.ene@yahoo.com", "0745623311", birthDate7,
                employmentDate7, "Cluj, str. Codrii Cosminului, nr.40, bl.409A, Sc.B, et. 3, ap.4",
                "Frontend Developer", "Development", 2500, e7TrainingList, 30);

        DateTimeFormatter dtf8 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String stringBirthDate8 = "20/11/1989 12:00:00";
        LocalDateTime birthDate8 = LocalDateTime.parse(stringBirthDate8, dtf8);
        String stringEmploymentDate8 = "10/06/2008 12:00:00";
        LocalDateTime employmentDate8 = LocalDateTime.parse(stringEmploymentDate8, dtf8);

        List<Training> e8TrainingList = new ArrayList<>();
        e8TrainingList.add(allTrainingList.get(0));
        e8TrainingList.add(allTrainingList.get(3));

        Employee employee8 = new EmployeeTrainer(8, "2760509080087", "Cristina",
                "Apostolescu", "cristina.apostolescu@yahoo.com", "0744950106", birthDate8,
                employmentDate8, "Timisoara, str. Viitorului, nr.17", "Java Web Developer",
                "Development", 2500, e8TrainingList, 75);

        DateTimeFormatter dtf9 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String stringBirthDate9 = "20/11/1989 12:00:00";
        LocalDateTime birthDate9 = LocalDateTime.parse(stringBirthDate9, dtf9);
        String stringEmploymentDate9 = "10/06/2008 12:00:00";
        LocalDateTime employmentDate9 = LocalDateTime.parse(stringEmploymentDate9, dtf9);

        List<Training> e9TrainingList = new ArrayList<>();
        e9TrainingList.add(allTrainingList.get(0));
        e9TrainingList.add(allTrainingList.get(1));
        e9TrainingList.add(allTrainingList.get(2));
        e9TrainingList.add(allTrainingList.get(3));

        Employee employee9 = new EmployeeTrainer(9, "1761107080086", "Alin",
                "Soare", "alin.soare@gmail.com", "0744957059", birthDate9,
                employmentDate9, "Bucuresti, str. Lunga, nr.20", "Java Developer",
                "Development", 2500, e9TrainingList, 60);

        DateTimeFormatter dtf10 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String stringBirthDate10 = "20/11/1989 12:00:00";
        LocalDateTime birthDate10 = LocalDateTime.parse(stringBirthDate10, dtf10);
        String stringEmploymentDate10 = "10/06/2008 12:00:00";
        LocalDateTime employmentDate10 = LocalDateTime.parse(stringEmploymentDate1, dtf10);

        List<Training> e10TrainingList = new ArrayList<>();
        e10TrainingList.add(allTrainingList.get(0));
        e10TrainingList.add(allTrainingList.get(1));
        e10TrainingList.add(allTrainingList.get(2));
        e10TrainingList.add(allTrainingList.get(3));

        Employee employee10 = new EmployeeTrainer(10, "1900113080036", "Florin",
                "Miron", "florin.miron@yahoo.com", "0734065021", birthDate10,
                employmentDate10, "Sibiu, str. Macesului, nr.59", "Java Web Developer",
                "Development", 2500, e10TrainingList, 90);


    /*public EmployeeTrainer(int id, String cnp, String firstName, String lastName, String email, String telephoneNo,
                LocalDateTime birthDate, LocalDateTime employmentDate, String address, String position, String department,
        double monthlySalary, List<String> trainingList, double bonus)*/


        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);
        employeeList.add(employee7);
        employeeList.add(employee8);
        employeeList.add(employee9);
        employeeList.add(employee10);
        return employeeList;
    }

    public List<TrainingGroup> createTrainingGroupList(){
        List<TrainingGroup> trainingGroup = new ArrayList<>();
        List<Employee> allEmployeeList = createEmployeeList();

        List<Employee> tg1List = new ArrayList<>();
        tg1List.add(allEmployeeList.get(0));
        tg1List.add(allEmployeeList.get(1));
        tg1List.add(allEmployeeList.get(2));


        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String stringStartDate1 = "15/06/2021 12:00:00";
        LocalDateTime startDate1 = LocalDateTime.parse(stringStartDate1, dtf1);
        String stringEndDate1 = "01/07/2021 12:00:00";
        LocalDateTime endDate1 = LocalDateTime.parse(stringEndDate1, dtf1);
        TrainingGroup trainingGroup1 = new TrainingGroup(1, "TR_JAVA", startDate1, endDate1, Location.BRASOV,"2820329080012", tg1List);

        List<Employee> tg2List = new ArrayList<>();
        tg2List.add(allEmployeeList.get(0));
        tg2List.add(allEmployeeList.get(1));
        tg2List.add(allEmployeeList.get(2));

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String stringStartDate2 = "01/07/2021 12:00:00";
        LocalDateTime startDate2 = LocalDateTime.parse(stringStartDate2, dtf2);
        String stringEndDate2 = "01/09/2021 12:00:00";
        LocalDateTime endDate2 = LocalDateTime.parse(stringEndDate2, dtf2);
        TrainingGroup trainingGroup2 = new TrainingGroup(2, "TR_IOS", startDate2, endDate2, Location.IASI,"1931218080041", tg2List);

        List<Employee> tg3List = new ArrayList<>();
        tg3List.add(allEmployeeList.get(0));
        tg3List.add(allEmployeeList.get(2));
        tg3List.add(allEmployeeList.get(4));

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String stringStartDate3 = "15/08/2021 12:00:00";
        LocalDateTime startDate3 = LocalDateTime.parse(stringStartDate3, dtf3);
        String stringEndDate3 = "30/11/2021 12:00:00";
        LocalDateTime endDate3 = LocalDateTime.parse(stringEndDate3, dtf3);
        TrainingGroup trainingGroup3 = new TrainingGroup(3, "TR_EMOTIONAL_INTELLIGENCE", startDate3, endDate3, Location.CLUJ_NAPOCA,"1700723080055", tg3List);

        List<Employee> tg4List = new ArrayList<>();
        tg4List.add(allEmployeeList.get(1));
        tg4List.add(allEmployeeList.get(3));
        tg4List.add(allEmployeeList.get(7));

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String stringStartDate4 = "15/09/2021 12:00:00";
        LocalDateTime startDate4 = LocalDateTime.parse(stringStartDate4, dtf4);
        String stringEndDate4 = "19/09/2021 12:00:00";
        LocalDateTime endDate4 = LocalDateTime.parse(stringEndDate4, dtf4);
        TrainingGroup trainingGroup4 = new TrainingGroup(4, "TR_PUBLIC_SPEAKING", startDate4, endDate4, Location.TIMISOARA,"2850422080026", tg4List);

        List<Employee> tg5List = new ArrayList<>();
        tg5List.add(allEmployeeList.get(0));
        tg5List.add(allEmployeeList.get(1));
        tg5List.add(allEmployeeList.get(2));
        tg5List.add(allEmployeeList.get(7));

        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String stringStartDate5 = "25/08/2021 12:00:00";
        LocalDateTime startDate5 = LocalDateTime.parse(stringStartDate5, dtf5);
        String stringEndDate5 = "10/09/2021 12:00:00";
        LocalDateTime endDate5 = LocalDateTime.parse(stringEndDate5, dtf5);
        TrainingGroup trainingGroup5 = new TrainingGroup(5, "TR_JAVA", startDate5, endDate5, Location.BUCURESTI,"2760509080087", tg5List);

        List<Employee> tg6List = new ArrayList<>();
        tg6List.add(allEmployeeList.get(4));
        tg6List.add(allEmployeeList.get(6));
        tg6List.add(allEmployeeList.get(8));
        tg6List.add(allEmployeeList.get(9));

        DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String stringStartDate6 = "01/05/2021 12:00:00";
        LocalDateTime startDate6 = LocalDateTime.parse(stringStartDate6, dtf6);
        String stringEndDate6 = "01/12/2021 12:00:00";
        LocalDateTime endDate6 = LocalDateTime.parse(stringEndDate6, dtf6);
        TrainingGroup trainingGroup6 = new TrainingGroup(6, "TR_IOS", startDate6, endDate6, Location.BUCURESTI,"2760509080087", tg6List);


        trainingGroup.add(trainingGroup1);
        trainingGroup.add(trainingGroup2);
        trainingGroup.add(trainingGroup3);
        trainingGroup.add(trainingGroup4);
        trainingGroup.add(trainingGroup5);
        trainingGroup.add(trainingGroup6);
        return trainingGroup;
    }
}



