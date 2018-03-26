package com.generator.timetable;

public class LectureActivity extends Activity{
    private Teacher teacher;
    private Subject subject;
    private Student student;

    private static String activityTag = "(T)";
    public LectureActivity(Teacher teacher, Subject subject,Student student,
                           int duration, int totalDuration, int activityId) {
        super(duration, totalDuration, activityId, activityTag);
        this.teacher = teacher;
        this.subject = subject;
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return " "+subject.getName();
    }
}
