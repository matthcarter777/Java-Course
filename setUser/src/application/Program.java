package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import entities.Course;
import entities.Student;
import entities.Teacher;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Teacher teacher = new Teacher("Alex");
		
		System.out.print("How many students for course A? ");
		int arrA = sc.nextInt();
		
		int a = 0;
		
		Course courseA = new Course("A", teacher);
		
		while (a < arrA) {
			
			int id = sc.nextInt();
			
			Student student = new Student(id);
			
			courseA.setStudents(student);
			
			a++;
		}
		
		System.out.print("How many students for course B? ");
		int arrB = sc.nextInt();
		
		int b = 0;
		
		Course courseB = new Course("A", teacher);
		
		while (b < arrB) {
			
			int id = sc.nextInt();
			
			Student student = new Student(id);
			
			courseB.setStudents(student);
			
			b++;
		}
		
		System.out.print("How many students for course B? ");
		int arrC = sc.nextInt();
		
		int c = 0;
		
		Course courseC = new Course("A", teacher);
		
		while (c < arrC) {
			
			int id = sc.nextInt();
			
			Student student = new Student(id);
			
			courseC.setStudents(student);
			
			c++;
		}
		
		Set<Student> totalStudentAandA = new TreeSet<>(courseA.getStudents());
		Set<Student> totalStudentAandB = new TreeSet<>(courseB.getStudents());
		
		Set<Student> total = new TreeSet<>(totalStudentAandA);
		
		total.retainAll(totalStudentAandB);
		
		System.out.println(total);
		
		sc.close();
	}

}
