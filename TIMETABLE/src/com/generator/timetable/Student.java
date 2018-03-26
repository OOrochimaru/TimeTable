package com.generator.timetable;

import java.util.ArrayList;

public class Student {
    private String groupName;//btech_first_cse_cse1
    private int groupId;//unique id for comparision
    private boolean isStudentNotAvailable = false;
    private ArrayList<String> subGroups = new ArrayList<>(2); 

    public Student(String groupName, int groupId) {
        this.groupName = groupName;
        this.groupId++;
    }
    public int getGroupId() {
    	return groupId;
    }
    public String getGroupName() {
    	return groupName;
    }
    
    public void setSubGropus(String subGroupName ) {
    	subGroups.add(subGroupName);
    }
    public ArrayList<String> getSubGroups(){
    	return subGroups;
    }

    public boolean isStudentNotAvailable() {
        return isStudentNotAvailable;
    }

    public void setStudentNotAvailable(boolean studentNotAvailable) {
        isStudentNotAvailable = studentNotAvailable;
    }
}
