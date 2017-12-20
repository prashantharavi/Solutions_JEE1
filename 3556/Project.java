package com.htc.training;

public class Project {

	private int projectId;
	private String projectName;
	private String projectHead;
	private int noOfResources;

	public Project() {
		projectId = 0;
		projectName = "";
		projectHead = "";
		noOfResources = 0;

	}

	public Project(int projectId, String projectName, String projectHead, int noOfResources) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectHead = projectHead;
		this.noOfResources = noOfResources;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectHead() {
		return projectHead;
	}

	public void setProjectHead(String projectHead) {
		this.projectHead = projectHead;
	}

	public int getNoOfResources() {
		return noOfResources;
	}

	public void setNoOfResources(int noOfResources) {
		this.noOfResources = noOfResources;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Project project = new Project();
		project.setProjectId(10);
		project.setProjectName("Project XYZ");
		project.setProjectHead("Williams Henry");
		project.setNoOfResources(15);

		System.out.println("Project Id is " + project.getProjectId());
		System.out.println("ProjectName is " + project.getProjectName());
		System.out.println("ProjectHead is " + project.getProjectHead());
		System.out.println("NoOfResources " + project.getNoOfResources());

	}

}
