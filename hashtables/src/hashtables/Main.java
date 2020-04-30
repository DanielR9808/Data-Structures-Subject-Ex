package hashtables;

import java.util.ArrayList;
import java.util.Hashtable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main mainClass =new Main();
		Hashtable <String, String> subjects =new <String,String> Hashtable ();
		Hashtable <Integer,Student> students=new <Integer,Student> Hashtable();
		
		initializeSubjects(subjects);
		initializeStudents(students,subjects);
		
	}
	
	public static void initializeSubjects(Hashtable<String, String> subjects) {
		subjects.put("A270", "Geografia");
		subjects.put("A271", "Historia");
		subjects.put("A272", "Lengua");
		subjects.put("A273", "Filosofia");
		subjects.put("A274", "Informatica");
		subjects.put("A275", "Programacion");
		subjects.put("A276", "Estructuras de datos");
		subjects.put("A277", "Bases de datos");
		subjects.put("A278", "Infraestructura de redes");
		subjects.put("A279", "Logica computacional");
		subjects.put("A280", "Hitoria del cine");
		
		
	}
	
	public static void initializeStudents(Hashtable<Integer,Student> students, Hashtable<String,String> subjects) {
		
		ArrayList subs=new ArrayList ();
		subs.add(subjects.get("A273"));
		subs.add(subjects.get("A276"));
		subs.add(subjects.get("A274"));
		subs.add(subjects.get("A271"));
		subs.add(subjects.get("A278"));
		
		
		/*Student s =new Student();
		s.setName("Daniel");
		s.setLastName("Nempeque");
		s.setLastName2("Naranjo");
		s.setSubs(subs);
		
		students.put(1, s);
		
		
		System.out.println(students.get(1).toString());*/
		
		
	}
	

}
