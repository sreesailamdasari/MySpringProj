package com.igate.springbasic;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Course {
	private List<String> subjects;
	private Set<String> faculty;

	private Map<Integer, String> facultyCourseMap;
	
	private Properties properties;
	
	public Course(Set<String> faculty) {
		this.faculty = faculty;
	}

	public void setFacultyCourseMap(Map<Integer, String> facultyCourseMap) {
		this.facultyCourseMap = facultyCourseMap;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	public void showUniversityInof() {

	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public void testProperties(){
		System.out.println("Faculty Subjects");
		for(Object o:properties.keySet()){
			System.out.print(o+"-->");
			System.out.println(properties.get(o));
		}
	}
	@Override
	public String toString() {
		return "Subjects : " + subjects + "\n" + "Faculties : " + faculty;
	}

}