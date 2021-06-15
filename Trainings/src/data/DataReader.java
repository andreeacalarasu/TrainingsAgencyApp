package data;

import model.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


    public class DataReader {
        public List<Training> createTrainingList(){
            List<Training> trainingList = new ArrayList<>();
            File file = new File("./resources/Training.txt");
            if (!file.exists()){
                System.out.println("The file doesn't exist!");
                return trainingList;
            }
            FileReader fileReader = null;
            BufferedReader bufferedReader = null;
            try{
                fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                System.out.println("Reading data .....");
                String line;
                List<Course> courseList = new ArrayList<>();
                while( (line = bufferedReader.readLine()) != null ) {
                    //System.out.println(line); // enable for debug
                    String[] words = line.split(",");
                    if(line.startsWith("[TRAINING]")){
                        courseList = new ArrayList<>();

                    //Ex: [TRAINING] 1,TR_JAVA, Java Programming Language, 10,Intermediary,Technical Skills
                        //private String id;
                        //private String code;
                        //private String name;
                        //private int attendeeNo;
                        //private Level level;
                        //private TrainingType trainingType;
                        //private List<Course> courseList;
                        String idString = words[0].substring(10).trim();
                        String code = words[1].trim();
                        String name = words[2].trim();
                        String numberOfAttendeesString = words[3].trim();
                        String levelString = words[4].trim();
                        String trainingTypeString = words[5].trim();

                        int id = Integer.parseInt(idString);
                        int numberOfAttendees = Integer.parseInt(numberOfAttendeesString);
                        Level level = Level.valueOf(levelString);
                        TrainingType trainingType = TrainingType.valueOf(trainingTypeString);

                        Training training = new Training(id, code, name, numberOfAttendees, level, trainingType, courseList);
                        trainingList.add(training);
                    } else
                        {
                        //private int id;
                        //private String title;
                        //private String description;
                        //private int hoursDuration;
                        String idString = words[0].trim();
                        String title = words[1].trim();
                        String description = words[2].trim();
                        String hoursDurationString = words[3].trim();

                        int id = Integer.parseInt(idString);
                        int hoursDuration = Integer.parseInt(hoursDurationString);

                        Course course = new Course(id, title, description, hoursDuration);
                        courseList.add(course);
                        // update course list for the last added training
                        Training t = trainingList.get(trainingList.size()-1);
                        t.setCourseList(courseList);
                        trainingList.set(trainingList.size()-1,t);
                    }

                }
                System.out.println("Reading data ..... DONE");


            }
            catch (IOException e) {
                System.out.println("File reading has failed!");
            }
            finally {
                try{
                    if (fileReader != null){
                        fileReader.close();
                    }
                    if (bufferedReader != null){
                        bufferedReader.close();
                    }
                }
                catch (IOException e){
                    System.out.println("....");
                }
            }
            return trainingList;
        }
    }
