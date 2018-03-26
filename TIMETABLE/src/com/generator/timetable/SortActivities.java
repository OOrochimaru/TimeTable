package com.generator.timetable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class SortActivities {
	private static Integer keyValue = 0;
	Data data = Data.getInstance();
	public SortActivities() {
		
	}
	public static HashMap<Integer, LectureActivity> sortLectureActivityWithWeightage(ArrayList<LectureActivity> lecture){
		HashMap<Integer, LectureActivity> sortedLecture = new HashMap<>();
		lecture.sort(new Comparator<LectureActivity>() {
			@Override
			public int compare(LectureActivity o1, LectureActivity o2) {
				int l1 = o1.getWeightage();
				int l2 = o2.getWeightage();
				if (l1 > l2) {
					return -1;
				} else if (l1 < l2) {
					return 1;
				} else
					return 0;
			}
		});
		lecture.forEach((k)->{
			sortedLecture.put(keyValue++,k);
			//System.out.println(keyValue+" "+k.getSubject().getName()+" "+ k.getWeightage());
		});
		return sortedLecture;
	}
	public static HashMap<Integer, LabActivity> sortedLabActivityWithWeightage(ArrayList<LabActivity> lab){
		HashMap<Integer, LabActivity> sortedLab = new HashMap<>();
		lab.sort(new Comparator<LabActivity>() {
			@Override
			public int compare(LabActivity o1, LabActivity o2) {
				int l1 = o1.getWeightage();
				int l2 = o2.getWeightage();
				if (l1 > l2){
					return -1;
				}else if (l1 < l2){
					return 1;
				}else
					return 0;
			}
		});
		lab.forEach((k)->{
			sortedLab.put(keyValue++, k);
			//System.out.println(keyValue+" "+ k.getLabSubjects());
			//System.out.println(keyValue+" "+k.getWeightage());
		});
		return sortedLab;
	}
	//public static Comparator<LectureActivity> sortActitivies =
	
	/*public TreeMap<Integer, LabActivity> sortLabActivitiesWeightage(ArrayList<LabActivity> activity) {

		TreeMap<Integer, LabActivity> sortedLabActivity = new TreeMap<>();
		new TreeMap<Integer,LabActivity>(new Comparator<Object>() {
			@Override
			public int compare(Object o1, Object o2) {

				LabActivity l1 = (LabActivity)o1;
				LabActivity l2 = (LabActivity)o2;
				if (l1.getWeightage() > l2.getWeightage()){
					return -1;
				}else if (l1.getWeightage() < l2.getWeightage()){
					return 1;
				}else {
					return 0;
				}
			}

		});
		activity.forEach(lab -> {
			//System.out.println(1);
			sortedLabActivity.put(keyValue++,lab);
			//System.out.println(keyValue+" " + lab.getLabSubjects().toString());

		});
		return sortedLabActivity;
	}
	public TreeMap<Integer, LectureActivity> sortedLectureActivitiesWeightage(ArrayList<LectureActivity> activity) {


		TreeMap<Integer, LectureActivity> sortedLectureActivity = new TreeMap<Integer, LectureActivity>();
		new TreeMap<Integer, LectureActivity>(
				new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				LectureActivity l1 = (LectureActivity) o1;
				*//*if (o1 instanceof LectureActivity){
					l1 = (LectureActivity) o1;
				}else {
					l1 = (LectureActivity) o1;
				}*//*
				LectureActivity l2 = (LectureActivity) o2;
				*//*if (o2 instanceof LectureActivity){
					l2 = (LectureActivity) o2;
				}else {
					l2 = (LectureActivity) o2;
				}*//*
				if (l1.getWeightage() > l2.getWeightage()) {
					return 1;
				} else if (l1.getWeightage() < l2.getWeightage()) {
					return -1;
				} else {
					return 0;
				}
			}

		});
		activity.forEach(lecture -> {
			sortedLectureActivity.put(keyValue++,lecture);
		});
		return sortedLectureActivity;
	}*/
}
