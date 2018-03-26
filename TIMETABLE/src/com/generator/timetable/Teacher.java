package com.generator.timetable;

public class Teacher {
    private String name;
    private int id;
    private int targetNoHours;// total hours in a week.
    private boolean isTeacherNotAvailable = false;
    //todo: add a variable that stores lists of subgropus that the teacher teaches to.
    
    public Teacher(int id,String name,int targetNoHours) {
        this.id = id;
        this.name = name;
        this.targetNoHours = targetNoHours;
    }

    public boolean isTeacherNotAvailable() {
        return isTeacherNotAvailable;
    }

    public void setTeacherNotAvailable(boolean teacherNotAvailable) {
        isTeacherNotAvailable = teacherNotAvailable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTargetNoHours() {
        return targetNoHours;
    }

    public void setTargetNoHours(int targetNoHours) {
        this.targetNoHours = targetNoHours;
    }
}
