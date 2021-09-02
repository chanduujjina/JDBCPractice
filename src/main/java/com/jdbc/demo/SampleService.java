package com.jdbc.demo;

import java.util.ArrayList;
import java.util.List;

public class SampleService {
	
	//decalring variable
	private static List<Sample> sampleList = new ArrayList();
	
	static {
		sampleList.add(new Sample(1, "test1", "vasavi clinic", "blood"));
		sampleList.add(new Sample(2, "test1", "vasavi clinic", "blood"));
		sampleList.add(new Sample(3, "test1", "vasavi clinic", "blood"));
		sampleList.add(new Sample(4, "test1", "vasavi clinic", "blood"));
		sampleList.add(new Sample(5, "test1", "vasavi clinic", "blood"));
		
		sampleList.add(new Sample(6, "test2", "vasavi clinic", "urine"));
		sampleList.add(new Sample(7, "test2", "vasavi clinic", "urine"));
		sampleList.add(new Sample(8, "test2", "vasavi clinic", "urine"));
		sampleList.add(new Sample(9, "test2", "vasavi clinic", "urine"));
		sampleList.add(new Sample(10, "test2", "vasavi clinic", "urine"));
	}
	
	public static List<Sample> getSampleList() {
		return sampleList;
	}
	
	

}
