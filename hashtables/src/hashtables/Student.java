package hashtables;

import java.util.ArrayList;

public class Student {
 
	private String name;
	private String lastName;
	private String lastName2;
	private int id;
	public Student(String name, String lastName, String lastName2, int id, ArrayList subs) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.lastName2 = lastName2;
		this.id = id;
		this.subs = subs;
	}
	private ArrayList subs;
	
	public ArrayList getSubs() {
		return subs;
	}
	public void setSubs(ArrayList subs) {
		this.subs = subs;
	}
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLastName2() {
		return lastName2;
	}
	public void setLastName2(String lastName2) {
		this.lastName2 = lastName2;
	}
	@Override
	public String toString() {
		String subsMsj="";
		for(int i=0; i<subs.size();i++ )
			subsMsj+="\n"+subs.get(i);
		
		return "Datos del Estudiante"+"\nid: "+id+"\nNombre Completo:" +"\n"+name +" "+ lastName + " " + lastName2 + "\nAsignaturas: " + subsMsj;
	}
	
	
	
	
	
}
