package com.generator.timetable;

import java.util.ArrayList;

public class Inputs {
    ArrayList<Integer> notAvailableTimes = new ArrayList<>();
	
	public Inputs() {
		
	}
	
	public void makeSampleInputs() {
		//this is a temporary method for manual creation of objects.
		//there will a method like this that will, take all th inputted records, create objects, from GUI and serialize them to file.
		
		
	}
	
	public void fetchFromFile() {
		//1 fetch serialized objects from file(s)
		//2 get an instance of Data class
		//3 fetch all the serialized objects and store them in respective variables of Data class
		
		Data data = Data.getInstance();//2
        TimeConstraint timeConstraint = TimeConstraint.getInstance();
		
		//creating timeslots
		for(int i=0; i<Constraint.noOfDaysPerWeek; i++) {
			for(int j=0; j<Constraint.noOfHoursPerDay; j++) {
				data.addTimeSlot(createTimeSlot(Constraint.days[i],Constraint.lectureTimes[j]));
			}
		}
		
		
		//creating subjects
		Subject sb1 = createSubject(1, "Industrial Interaction");
		Subject sb2 = createSubject(2, "Wireless Network");
		Subject sb3 = createSubject(3, "Human Resource Management");
		Subject sb4 = createSubject(4, "Computer Administration");
		Subject sb5 = createSubject(5, "Advance Computer Architecture");
		Subject sb6 = createSubject(6, "Data Mining");
		Subject sb7 = createSubject(7, "Computer Admin Lab");


		
		//creating teachers
		Teacher t1  = createTeacher(1, "Abhishek Mittal", 6);
		Teacher t2  = createTeacher(2, "Ankit Tomar", 6);
		Teacher t3  = createTeacher(3, "KK Verma", 6);
		Teacher t4  = createTeacher(4, "Shishir Sangal", 6);
		Teacher t5  = createTeacher(5, "Chunnu Lal", 6);
		Teacher t6  = createTeacher(6, "Mayur Srivastava", 6);
		Teacher t7  = createTeacher(7, "Deepak Panauli", 6);

		//adding teacher not available
		ArrayList<Integer> t = new ArrayList<>();
		t.add(0);
		t.add(8);
		t.add(16);
		t.add(32);
		t.add(40);
		t3.setTeacherNotAvailable(true);
		timeConstraint.addTimesNotAvailable(t3.getId(), t);



		//creating student
		Student s1 = createStudent("BTech", "4", "CSE", "CSE1", 001);//section cse1
		//Student sg1 = createGroup(s1.getGroupName(),"T1", s1.getGroupId());//group t1
		//Student sg2 = createGroup(s1.getGroupName(),"T2", s1.getGroupId());//group t2

        int[] time = {4,6,7,11};
        addTimesToList(time);
        s1.setStudentNotAvailable(true);
        timeConstraint.addTimesNotAvailable(s1.getGroupId(),notAvailableTimes);


		
		//creating Activities LAB
		ArrayList<Teacher> labTeachers1 = new ArrayList<>(2);
		labTeachers1.add(t5);
		labTeachers1.add(t6);

		ArrayList<Student> labStudents1 = new ArrayList<>(2);
		labStudents1.add(s1);
		labStudents1.add(s1);
		
		ArrayList<Subject> labSubjects1  = new ArrayList<>(2);
		labSubjects1.add(sb7);
		labSubjects1.add(sb1);
		
		LabActivity lab1 = createLabActivity(labTeachers1, labStudents1, labSubjects1, 2, 1, 1, "(L)");

		//lab time constraine
		ArrayList<Integer> labTime = new ArrayList<>();
		labTime.add(1);
		labTime.add(9);
		labTime.add(17);
		labTime.add(25);
		labTime.add(33);
		labTime.add(40);
		t5.setTeacherNotAvailable(true);
		timeConstraint.addTimesNotAvailable(t5.getId(),labTime);

		//creating Activities LAB
		ArrayList<Teacher> labTeachers2 = new ArrayList<>(2);
		labTeachers2.add(t5);
		labTeachers2.add(t7);
		
		ArrayList<Student> labStudents2 = new ArrayList<>(2);
		labStudents2.add(s1);
		labStudents2.add(s1);
		
		ArrayList<Subject> labSubjects3  = new ArrayList<>(2);
		labSubjects3.add(sb7);
		labSubjects3.add(sb1);
		
		LabActivity lab2 = createLabActivity(labTeachers1, labStudents1, labSubjects1, 2, 1, 2, "(L)");
		
		//creating Activities lectures
		LectureActivity a10 = createLectureActivity(t1, sb3, s1, 1, 4, 1, "(T)");
		LectureActivity a11 = createLectureActivity(t1, sb3, s1, 1, 4, 1, "(T)");
		LectureActivity a12 = createLectureActivity(t1, sb3, s1, 1, 4, 1, "(T)");
		LectureActivity a13 = createLectureActivity(t1, sb3, s1, 1, 4, 1, "(T)");
		//LectureActivity a14 = createLectureActivity(t1, sb3, s1, 1, 4, 001, "(T)");

		LectureActivity a20 = createLectureActivity(t2, sb5, s1, 1, 5, 2, "(T)");
		LectureActivity a21 = createLectureActivity(t2, sb5, s1, 1, 5, 2, "(T)");
		LectureActivity a22 = createLectureActivity(t2, sb5, s1, 1, 5, 2, "(T)");
		LectureActivity a23 = createLectureActivity(t2, sb5, s1, 1, 5, 2, "(T)");
		LectureActivity a24 = createLectureActivity(t2, sb5, s1, 1, 5, 2, "(T)");

		LectureActivity a30 = createLectureActivity(t3, sb6, s1, 1, 5, 3, "(T)");
		LectureActivity a31 = createLectureActivity(t3, sb6, s1, 1, 5, 3, "(T)");
		LectureActivity a32 = createLectureActivity(t3, sb6, s1, 1, 5, 3, "(T)");
		LectureActivity a33 = createLectureActivity(t3, sb6, s1, 1, 5, 3, "(T)");
		LectureActivity a34 = createLectureActivity(t3, sb6, s1, 1, 5, 3, "(T)");

		LectureActivity a40 = createLectureActivity(t4, sb2, s1, 1, 4, 4, "(T)");
		LectureActivity a41 = createLectureActivity(t4, sb2, s1, 1, 4, 4, "(T)");
		LectureActivity a42 = createLectureActivity(t4, sb2, s1, 1, 4, 4, "(T)");
		LectureActivity a43 = createLectureActivity(t4, sb2, s1, 1, 4, 4, "(T)");

		LectureActivity a50 = createLectureActivity(t5, sb4, s1, 1, 4, 5, "(T)");
		LectureActivity a51 = createLectureActivity(t5, sb4, s1, 1, 4, 5, "(T)");
		LectureActivity a52 = createLectureActivity(t5, sb4, s1, 1, 4, 5, "(T)");
		LectureActivity a53 = createLectureActivity(t5, sb4, s1, 1, 4, 5, "(T)");

		LectureActivity a60 = createLectureActivity(t1, sb3, s1, 1, 4, 6, "(T)");
		LectureActivity a61 = createLectureActivity(t1, sb3, s1, 1, 4, 6, "(T)");
		LectureActivity a62 = createLectureActivity(t1, sb3, s1, 1, 4, 6, "(T)");
		LectureActivity a63 = createLectureActivity(t1, sb3, s1, 1, 4, 6, "(T)");


		a63.setWeightage(500);
		a62.setWeightage(289);
		a40.setWeightage(300);
		a30.setWeightage(160);
		a23.setWeightage(260);

		//storing these inputs to the Data class
		
		data.addTeacher(t1);
		data.addTeacher(t2);
		data.addTeacher(t3);
		data.addTeacher(t4);
		data.addTeacher(t5);
		data.addTeacher(t6);
		data.addTeacher(t7);
		
		
		data.addSubject(sb1);
		data.addSubject(sb2);
		data.addSubject(sb3);
		data.addSubject(sb4);
		data.addSubject(sb5);
		data.addSubject(sb6);
		data.addSubject(sb7);
		
		data.addStudent(s1);
		
		data.addLabActivity(lab1);
		data.addLabActivity(lab2);
		data.addLectureActivity(a10);
		data.addLectureActivity(a11);
		data.addLectureActivity(a12);
		data.addLectureActivity(a13);
		//data.addLectureActivity(a14);
		//data.addLectureActivity(a15);

		data.addLectureActivity(a20);
		data.addLectureActivity(a21);
		data.addLectureActivity(a22);
		data.addLectureActivity(a23);
		data.addLectureActivity(a24);
		//data.addLectureActivity(a25);

		data.addLectureActivity(a30);
		data.addLectureActivity(a31);
		data.addLectureActivity(a32);
		data.addLectureActivity(a33);
		data.addLectureActivity(a34);
		//data.addLectureActivity(a35);
		
		data.addLectureActivity(a40);
		data.addLectureActivity(a41);
		data.addLectureActivity(a42);
		data.addLectureActivity(a43);
		//data.addLectureActivity(a44);
		//data.addLectureActivity(a45);
		
		data.addLectureActivity(a50);
		data.addLectureActivity(a51);
		data.addLectureActivity(a52);
		data.addLectureActivity(a53);
		//data.addLectureActivity(a54);
		//data.addLectureActivity(a55);
		
		data.addLectureActivity(a60);
		data.addLectureActivity(a61);
		data.addLectureActivity(a62);
		data.addLectureActivity(a63);
		//data.addLectureActivity(a64);
		//data.addLectureActivity(a65);
			
	}
	
	public TimeSlot createTimeSlot(String day,String time) {
		TimeSlot ts = new TimeSlot(day,time);
		return ts;
	}
	public ArrayList<Integer> addTimesToList(int[] time){
	    for (int i = 0; i < time.length; i++){
	        notAvailableTimes.add(i);
        }
        return notAvailableTimes;
    }
	

    public Subject createSubject(int subjectId,String subjectName){
    	
         return new Subject(subjectId,subjectName);
    }
    
    public Student createStudent(String course,String year, String branch, String section,int groupId){
        
        return new Student(course+"_"+year+"_"+branch+"_"+section,groupId);
    }
    

    
    public Teacher createTeacher(int teacherId,String teacherName,int totalHours){
        
        return new Teacher(teacherId,teacherName,totalHours);
    }
    
    public Room createRoom(int id, String name){
    	
        return new Room(id,name);
    }
    
	public LectureActivity createLectureActivity(Teacher teacher, Subject subject, Student student,
            int duration,int totalDuration,int activityId,String activityTag){
		
        return new LectureActivity(teacher,subject,student,duration,totalDuration,activityId);
    }
	
	public LabActivity createLabActivity(ArrayList<Teacher> teachers, ArrayList<Student> students, ArrayList<Subject> subjects,
            int duration,int totalDuration,int activityId,String activityTag){
		
        return new LabActivity(teachers,subjects,students,duration,totalDuration,activityId,activityTag);
    }
    
    

}
