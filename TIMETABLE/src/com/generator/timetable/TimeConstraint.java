package com.generator.timetable;
import java.util.ArrayList;
import java.util.HashMap;

public class TimeConstraint {
    private static TimeConstraint instance = null;              //see static flow/instance flow
    private HashMap<Integer, ArrayList<Integer>> notAvailableTimes;
    private int weightage = 0;
    Data data = Data.getInstance();

    private TimeConstraint() {
        notAvailableTimes = new HashMap<>();
    }
    public static TimeConstraint getInstance(){
        if (instance == null){
            instance = new TimeConstraint();
        }
        return instance;
    }

    public void addTimesNotAvailable(int id, ArrayList<Integer> timesNotavailable){
        notAvailableTimes.put(id,timesNotavailable);
        //data.getTeachers().get(id).setTeacherNotAvailable(true);

    }
    public ArrayList<Integer> getNotAvailableTimes(int id){
        return notAvailableTimes.get(id);
    }

    public int getWeightage() {
        return weightage;
    }

    public void setWeightage(int weightage) {
        this.weightage = weightage;
    }
}
