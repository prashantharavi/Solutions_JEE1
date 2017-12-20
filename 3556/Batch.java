package com.htc.training;

import java.util.Date;

public class Batch {
	String batchCode;
	Date startDate;
	Date endDate;
	static Trainee Trainee[];

	private static Trainee getTrainee(int traineeId) {
		Trainee trainee = new Trainee();
		trainee.setTraineeId(traineeId);
		System.out.println("traineeId is " + traineeId);
		return trainee;
	}

	private static Trainee[] getTrainee(String[] gender) {
		Trainee[] trainee = new Trainee[2];
		for (int i = 0; i < gender.length; i++) {
			trainee[i] = new Trainee();
			trainee[i].setGender(gender[i]);
		}
		return trainee;

	}

	public static void main(String[] args) {

		// Executing 1st part of overloaded method of assignment 1
		Trainee trainee = new Trainee();
		trainee = getTrainee(10);
		System.out.println("Trainee ID is " + trainee.getTraineeId());

		// Executing 2nd part of overloaded method of assignment 1
		Trainee[] traineeNew;
		String[] gender = { "Male" };
		traineeNew = getTrainee(gender);
		for (int i = 0; i < gender.length; i++) {
			System.out.println("Retrieved gender value is " + traineeNew[i].getGender());
		}

	}
}
