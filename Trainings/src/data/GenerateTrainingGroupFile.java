package data;

import model.Employee;
import model.TrainingGroup;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GenerateTrainingGroupFile {
        public void generateTrainingGroupFile(TrainingGroup trainingGroup) {
            String directoryName = "./trainingOffer";
            String fileName = "/TrainingGroup.txt";

            File dir = new File(directoryName);
            if (!dir.exists()){
                dir.mkdir();
            }
            File file = new File(dir, fileName);
            if(!file.exists()){
                try {
                    file.createNewFile();
                }
                catch (IOException ex){
                    System.out.println("Couldn't create file!");
                }
            }

            FileWriter fw = null;
            BufferedWriter bw = null;
            try{
                fw = new FileWriter(file);
                bw = new BufferedWriter(fw);
                bw.write("Thank you for joining our training!");
                bw.newLine();
                bw.newLine();
                bw.write("Registration confirmed for: " + trainingGroup.getTrainingCode() + " \n" +
                        "which will take place during " + trainingGroup.getStartDate() +
                        " - " + trainingGroup.getEndDate() + " in " + trainingGroup.getLocation().getName() + ".");
                bw.newLine();
                bw.write("The list of the attendees to the course is: ");
                bw.newLine();
                for(Employee e : trainingGroup.getEmployeeList()) {
                    bw.write("      " + e.getFirstName() + " " + e.getLastName());
                    bw.newLine();
                }
                bw.newLine();
                bw.write("Your dedicated trainer will be the trainer with: " + trainingGroup.getTrainerCnp()+ " CNP.");
                bw.newLine();
                bw.newLine();
                bw.write("You will learn new things, put at work those you already know, receive easy-to-apply tips and tricks and answer all your " + "\n" +
                        "questions that might come along. At the end of the process, you will have to put together a project and carry it" + "\n" + "forth to our colleagues and your mentors.");
                bw.newLine();
                bw.newLine();
                bw.write("For questions and inquiries please contact us via e-mail!");
                bw.newLine();
                bw.newLine();
                bw.write("We look forward to welcoming you!");
                bw.newLine();

                        bw.flush();
            }
            catch(IOException ex){
                System.out.println("Couldn't write in this file!");
            }
            finally {
                try {
                    if(fw != null){
                        fw.close();
                    }
                    if(bw != null) {
                        bw.close();
                    }
                }
                catch (IOException e){
            }
        }
    }
}
