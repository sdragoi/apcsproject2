//Stephanie Dragoi, Danielle White
//20220415
//APCS Project #2-- Class class

import java.util.ArrayList;

public class Class {

	public ArrayList<Student> classroom;
	
	public Class(ArrayList <Student> classroom) {
		this.classroom = classroom;
	}
	
	public ArrayList<Student> sortBy(String studentAttribute){
		//lastName;
		//firstName;
		//gpa;
		//gradeInClass;
		//favSubject;
		//E set(int index, E obj) Replaces the element at position index with obj; returns the element formerly at position index
		
		switch (studentAttribute) {
		case "lastName":
			
		case "firstName":
		case "gpa":
		case"gradeInClass":
		case "favSubject": 
		}
		
	}
	
	
	
	public ArrayList<Student> sortByLastName(ArrayList<Student> students){ 
		for (int i = 0; i < students.size(); i++ ) {
			for (int j = 0; j < students.size() - 1; j++) {
				if (students.get(j).lastName.charAt(0) > students.get(j + 1).lastName.charAt(0)){
					Student temp = students.set(j, students.get(j + 1));
					students.set(j + 1, temp);
				}
				else if((students.get(j).lastName.charAt(0) == students.get(j + 1).lastName.charAt(0))) {
					if (students.get(j).lastName.charAt(1) > students.get(j + 1).lastName.charAt(1)) {
						Student temp = students.set(j, students.get(j + 1));
						students.set(j + 1, temp);
					}
					else if (students.get(j).lastName.charAt(1) == students.get(j + 1).lastName.charAt(1)){
						if (students.get(j).lastName.charAt(2) > students.get(j + 1).lastName.charAt(2)) {
							Student temp = students.set(j, students.get(j + 1));
							students.set(j + 1, temp);
						}
				}

				}
			}	
		}
		
		return students;
		
		
	}
	
}
