/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generator.timetable;

public class Activity {

    private int duration;//duration of this activity i.e normal class have duration of 1hrs.
    private int totalDuration;//no of lectures in the entire week.
    private int activityId;
    private String activityTag;
    private int weightage = 0;
	/*private ArrayList<Teacher> teachers;
	private ArrayList<Student> students;
	private ArrayList<Subject> subjects;
	
	private Teacher teacher;
    private Subject subject;//subject that belongs to this activity
    private Student student;//students that belongs to this activity
    */
    public Activity() {
    	
    }
    
    //construtor for creating activity for labs
    public Activity(int duration,int totalDuration,int activityId, String activityTag){
    	
    	this.duration = duration;
        this.totalDuration = totalDuration;
        this.activityId = activityId;
        this.activityTag = activityTag;

        
    }

    public int getWeightage() {
        return weightage;
    }

    public void setWeightage(int weightage) {
        this.weightage = weightage;
    }
    /* //constructor for creating lectures
    public Activity(Teacher teacher, Subject subject, Student student, 
            int duration,int totalDuration,int activityId, String activityTag){
    	
    	this.duration = duration;
        this.totalDuration = totalDuration;
        this.activityId = activityId;
        
    }*/

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getTotalDuration() {
        return totalDuration;
    }

    public void setTotalDuration(int totalDuration) {
        this.totalDuration = totalDuration;
    }

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    public String getActivityTag() {
        return activityTag;
    }

    public void setActivityTag(String activityTag) {
        this.activityTag = activityTag;
    }
}
