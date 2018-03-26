/*
package com.generator.timetable;

import java.util.HashMap;

public class Generate {
	private static int keyValue =0;
	public static void main(String[] args) {
		new Inputs().fetchFromFile();
		Data data = Data.getInstance();
		Constraint constraint = new Constraint();
		constraint.computeLabWeightage(data.getLabActivities());
		constraint.computeLectureWeightage(data.getLectureActivity());
		*/
/*data.getLectureActivity().forEach((k)->{
			System.out.println(x++);
			System.out.print(k.getSubject().getName());
		});*//*

		HashMap<Integer, LectureActivity> sortedLeacture = SortActivities.sortLectureActivityWithWeightage(data.
				getLectureActivity());
		HashMap<Integer, LabActivity> sortedLab = SortActivities.sortedLabActivityWithWeightage(data.getLabActivities());
		*/
/*ArrayList<LectureActivity> lll = new ArrayList<>();
		ArrayList<LectureActivity> ll = data.getLectureActivity();*//*


		sortedLeacture.forEach((k,v)->{
			System.out.println(v.getActivityId()+" "+v.getWeightage());
		});
		sortedLab.forEach((k,v)->{
			System.out.println(k + " "+ v.getWeightage());
		});

		//HashMap<Integer,Activity> sortedActivity = SortActivities.sortWithConstrainsts(data.getActivities());
		//sorted activities
		*/
/*SortActivities s = new SortActivities();
		TimeConstraint timeConstraint = TimeConstraint.getInstance();
		System.out.println(timeConstraint.getNotAvailableTimes(3));
		data.getLectureActivity().forEach((k)->{
			//System.out.println(k.getWeightage());
		});

		TreeMap<Integer, LectureActivity> ss = s.sortedLectureActivitiesWeightage(data.getLectureActivity());
		ss.forEach((k,v)->{

			String w =v.getSubject().getName()+" "+v.getTeacher().getName()+" "+v.getWeightage();
			System.out.println(w);

		});*//*


	}

}
*/
