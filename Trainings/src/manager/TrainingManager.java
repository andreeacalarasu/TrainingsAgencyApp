package manager;

import model.Level;
import model.Training;
import model.TrainingType;
import java.util.ArrayList;
import java.util.List;

public class TrainingManager {
    //filters the training list by training type
    public List<Training> filterTrainingListByType(List<Training> trainingList, TrainingType type) {
        List<Training> resultTrainingList = new ArrayList<>();
        for(Training t : trainingList) {
            if(t.getTrainingType().equals(type)){
                resultTrainingList.add(t);
            }
        }
        return resultTrainingList;
    }
    //filters the training list by training level
    public List<Training> filterTrainingListByLevel(List<Training> trainingList, Level level) {
        List<Training> resultTrainingList = new ArrayList<>();
        for(Training t : trainingList) {
            if (t.getLevel().equals(level)) {
                resultTrainingList.add(t);
            }
        }
        return resultTrainingList;
    }
}
