
package com.generator.timetable;

import java.util.ArrayList;
import java.util.HashMap;


public class Data {
	private int activityKey = 0;
	private int roomKey = 0;
	private static  Data instance = null;
	private int timeSlotKey = 0;
   // private static String institutionName = "Quantum Global Campus";

   // private String[] nameOfHours;
    //private String[] nameOfDays;
    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    private ArrayList<Subject> subjects;
    private HashMap<Integer,Room> rooms;
    private ArrayList<LabActivity> labActivity;
    private ArrayList<LectureActivity> lectureActivity;
    //private HashMap<Integer,Activity> activities;
    private HashMap<Integer, TimeSlot> timeslots;
    
    
    //private TeacherConstraint[] listOfTeacherConstraints;
    //private TimeConstraint[] listOfStudentConstraints;
    //private SpaceConstraint[] listOfSpaceConstraints;
    
    
    private Data(){
        initialize();
    }
    
    private void initialize(){
        teachers = new ArrayList<>();
        students = new ArrayList<>();
        subjects = new ArrayList<>();
        labActivity = new ArrayList<>();
        lectureActivity = new ArrayList<>();
        timeslots = new HashMap<>();
        
    }
    
    public static Data getInstance() { //singleton object for data class
    	if(instance == null) {
    		instance = new Data();
    	}
    	return instance;
    }
    public void addTimeSlot(TimeSlot ts) {
    	timeslots.put(timeSlotKey++, ts);
    }
    
    public HashMap<Integer, TimeSlot> getTimeSlots() {
    	return timeslots;
    }
    
    public void addLabActivity(LabActivity activity){
        labActivity.add(activity);
    }
    public void addLectureActivity(LectureActivity activity){
        lectureActivity.add(activity);
    }
    
    public void addSubject(Subject subject){
        subjects.add(subject);
    }
    
    public void addStudent(Student student){
        
        students.add(student);
    }
    
    public void addTeacher(Teacher teacher){
        
        teachers.add(teacher);
    }
    
    public void addRoom(Room room){
        rooms.put(roomKey++, room);
    }


	public ArrayList<Teacher> getTeachers() {
		return teachers;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public ArrayList<Subject> getSubjects() {
		return subjects;
	}

	public HashMap<Integer, Room> getRooms() {
		return rooms;
	}

	public ArrayList<LabActivity> getLabActivities() {
		return labActivity;
	}

    public ArrayList<LectureActivity> getLectureActivity() {
        return lectureActivity;
    }
}
