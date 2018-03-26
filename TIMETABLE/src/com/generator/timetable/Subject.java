package com.generator.timetable;
public class Subject {
    private String name;
    private int subjectId;
    private boolean hasSpaceConstraint = false;
    //2 lectures per day for a single subject constraints
    private int numOfLectures = 2 ;//keeps decreasing every time this subject if placed
    
    public Subject(int subjectId, String name){
        this.subjectId = subjectId;
        this.name = name;
    }
    public int getNumOfLectures() {
		return numOfLectures;
	}

	public void setNumOfLectures(int numOfLectures) {
		this.numOfLectures = numOfLectures;
	}

	public String getName() {
		return name;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public boolean hasSpaceConstraint() {
		return hasSpaceConstraint;
	}

	public void setHasSpaceConstraint(boolean hasSpaceConstraint) {
		this.hasSpaceConstraint = hasSpaceConstraint;
	}
}
