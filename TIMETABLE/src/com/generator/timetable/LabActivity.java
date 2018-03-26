package com.generator.timetable;

import java.util.ArrayList;

public class LabActivity extends Activity{

    private String activityTag = "(L)";//to identify whether the activity is lab or class.
    private ArrayList<Teacher> teacherList;
    private ArrayList<Subject> labSubjects;
    private ArrayList<Student> studentsLists;

    public LabActivity(ArrayList<Teacher> teachers, ArrayList<Subject> subjects, ArrayList<Student> students,
                       int duration, int totalDuration, int activityId, String activityTag) {
        super(duration, totalDuration,activityId,activityTag);
        this.labSubjects = subjects;
        this.studentsLists = students;
        this.teacherList = teachers;
    }
    public ArrayList<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(ArrayList<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public ArrayList<Subject> getLabSubjects() {
        return labSubjects;
    }

    public void setLabSubjects(ArrayList<Subject> labSubjects) {
        this.labSubjects = labSubjects;
    }

    public ArrayList<Student> getStudentsLists() {
        return studentsLists;
    }

    public void setStudentsLists(ArrayList<Student> studentsLists) {
        this.studentsLists = studentsLists;
    }
}
