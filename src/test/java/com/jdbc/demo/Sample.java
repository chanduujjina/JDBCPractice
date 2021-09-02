package com.jdbc.demo;

public class Sample {
	
	public Sample(int id, String sampleName, String labName, String sampleType) {
		super();
		this.id = id;
		this.sampleName = sampleName;
		this.labName = labName;
		this.sampleType = sampleType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSampleName() {
		return sampleName;
	}

	public void setSampleName(String sampleName) {
		this.sampleName = sampleName;
	}

	public String getLabName() {
		return labName;
	}

	public void setLabName(String labName) {
		this.labName = labName;
	}

	public String getSampleType() {
		return sampleType;
	}

	public void setSampleType(String sampleType) {
		this.sampleType = sampleType;
	}

	private int id;
	
	private String sampleName;
	
	private String labName;
	
	private String sampleType;

}
