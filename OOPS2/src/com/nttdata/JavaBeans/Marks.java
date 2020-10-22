package com.nttdata.JavaBeans;

public class Marks {
	private double mathsMarks;
	private double chemistryMarks;
	private double physicsMarks;
	public Marks(double mathsMarks, double chemistryMarks, double physicsMarks) {
		super();
		this.mathsMarks = mathsMarks;
		this.chemistryMarks = chemistryMarks;
		this.physicsMarks = physicsMarks;
	}
	public double getMathsMarks() {
		return mathsMarks;
	}
	public void setMathsMarks(double mathsMarks) {
		this.mathsMarks = mathsMarks;
	}
	public double getChemistryMarks() {
		return chemistryMarks;
	}
	public void setChemistryMarks(double chemistryMarks) {
		this.chemistryMarks = chemistryMarks;
	}
	public double getPhysicsMarks() {
		return physicsMarks;
	}
	public void setPhysicsMarks(double physicsMarks) {
		this.physicsMarks = physicsMarks;
	}


}
