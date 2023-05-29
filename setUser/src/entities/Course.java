package entities;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private String name;
	private List<Student> students = new ArrayList<Student>();
	private Teacher teacher;
	
	public Course() {}
	
	public Course(String name, Teacher teacher) {
		super();
		this.name = name;
		this.teacher = teacher;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(Student student) {
		this.students.add(student);
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	
	
}
