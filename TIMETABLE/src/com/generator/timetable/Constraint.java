package com.generator.timetable;

import java.util.ArrayList;

public class Constraint {
    String typeOfConstraint;//TEACHER_NOT_AVAILABLE_CONSTRAINTS
    static int noOfHoursPerDay = 8;
    static int noOfDaysPerWeek =6;
    private int totalWeight = 0;
    private static final int TEACHER_CONSTRAINT_WEIGHT = 50;
    private static final int STUDENT_CONSTRAINT_WEIGHT = 50;
    private static final int SPACE_CONSTRAINT_WEIGHT = 50;
    static String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    static String[] lectureTimes = {"09:00-09:55","09:55-10:50","10:50-11:45","11:45-12:40","12:40-1:35",
                                            "01:35-02:30","02:30-03:25","03:25-04:20"};
    private static int weightage = 0;

    public void computeLabWeightage(ArrayList<LabActivity> labs){
        labs.forEach((v)->{

            v.getTeacherList().forEach(teacher -> {
                if (teacher.isTeacherNotAvailable()){
                    totalWeight = totalWeight + TEACHER_CONSTRAINT_WEIGHT;

                }
            });
            v.getStudentsLists().forEach(student -> {
                if (student.isStudentNotAvailable()){
                    totalWeight = totalWeight + STUDENT_CONSTRAINT_WEIGHT;
                }
            });
            v.getLabSubjects().forEach(subject -> {
                if (subject.hasSpaceConstraint()){
                    totalWeight = totalWeight + SPACE_CONSTRAINT_WEIGHT;
                }
            });
            v.setWeightage(totalWeight);
            totalWeight = 0;

        });
    }
    public void computeLectureWeightage(ArrayList<LectureActivity> lecture){
        lecture.forEach((v)->{
            if (v.getTeacher().isTeacherNotAvailable()){
                totalWeight = totalWeight + TEACHER_CONSTRAINT_WEIGHT;
            }
            if (v.getStudent().isStudentNotAvailable()){
                totalWeight = totalWeight + STUDENT_CONSTRAINT_WEIGHT;
            }
            if (v.getSubject().hasSpaceConstraint()){
                totalWeight = totalWeight + SPACE_CONSTRAINT_WEIGHT;
            }
            v.setWeightage(totalWeight);
            totalWeight = 0;
        });

    }


}
