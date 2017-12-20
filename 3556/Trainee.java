package com.htc.training;

 
public class Trainee {

	private int traineeId;
	private String traineeName;
	private int contactNo;
	private String email;
	private String gender;
	private String age;

	public Trainee() {
		traineeId = 0;
		traineeName = "";
		contactNo = 0;
		email = "";
		gender = "";
		age = "";
	}

	public Trainee(int traineeId, String traineeName, int contactNo, String email, String gender, String age) {
		super();
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.contactNo = contactNo;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}

	protected int getTraineeId() {
		return traineeId;
	}

	protected void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}

	protected String getTraineeName() {
		return traineeName;
	}

	protected void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	protected int getContactNo() {
		return contactNo;
	}

	protected void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	protected String getEmail() {
		return email;
	}

	protected void setEmail(String email) {
		this.email = email;
	}

	protected String getGender() {
		return gender;
	}

	protected void setGender(String gender) {
		this.gender = gender;
	}

	protected String getAge() {
		return age;
	}

	protected void setAge(String age) {
		this.age = age;
	}

	 
		
}
