package com.generator.timetable;

import java.util.ArrayList;
import java.util.HashMap;

public class SpaceConstraint {

    private static SpaceConstraint instance = null;
    private HashMap<Integer, ArrayList<Integer>> preferredRoom;
    private int weightage = 0;

    private SpaceConstraint() {
        preferredRoom = new HashMap<>();
    }
    public static SpaceConstraint getInstance(){
        if (instance == null){
            instance = new SpaceConstraint();
        }
        return instance;
    }

    public void addPreferredRoom(int subjectId, ArrayList<Integer> roomsId){
        preferredRoom.put(subjectId, roomsId);
    }
    public ArrayList<Integer> getPreferredRoom(int subjectId){
        return preferredRoom.get(subjectId);
    }

    public int getWeightage() {
        return weightage;
    }

    public void setWeightage(int weightage) {
        this.weightage = weightage;
    }
}
