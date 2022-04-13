//Stephanie Dragoi, Danielle White
//20220415
//APCS Project #2-- Class class

import java.util.ArrayList;
import java.util.Arrays;

public class Class {

	public ArrayList<Student> classroom;
	
	public Class(ArrayList <Student> classroom) {
		this.classroom = classroom;
	}
	
	public void sortBy(String studentAttribute){
		
		switch (studentAttribute) {
		case "lastName":
			this.sortByLastName(classroom);
			break;
		case "firstName":
			this.sortByFirstName(classroom);
			break;
		case "gpa":
			this.sortByGPAIncreasing(classroom);
			break;
		case"gradeInClass":
			this.sortByGradeIncreasing(classroom);
			break;
		case "favSubject": 
			this.sortByFavSubjectAlpha(classroom);
			break;
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
	
	public ArrayList<Student> sortByFirstName(ArrayList<Student> students){
		for (int i = 0; i < students.size(); i++ ) {
			for (int j = 0; j < students.size() - 1; j++) {
				if (students.get(j).firstName.charAt(0) > students.get(j + 1).firstName.charAt(0)){
					Student temp = students.set(j, students.get(j + 1));
					students.set(j + 1, temp);
				}
				else if((students.get(j).firstName.charAt(0) == students.get(j + 1).firstName.charAt(0))) {
					if (students.get(j).firstName.charAt(1) > students.get(j + 1).firstName.charAt(1)) {
						Student temp = students.set(j, students.get(j + 1));
						students.set(j + 1, temp);
					}
					else if (students.get(j).firstName.charAt(1) == students.get(j + 1).firstName.charAt(1)){
						if (students.get(j).firstName.charAt(2) > students.get(j + 1).firstName.charAt(2)) {
							Student temp = students.set(j, students.get(j + 1));
							students.set(j + 1, temp);
						}
				}

				}
			}	
		}
		return students;
	}
	
	public ArrayList<Student> sortByGPAIncreasing(ArrayList<Student> students){
		for (int i = 0; i < students.size(); i++ ) {
			for (int j = 0; j < students.size() - 1; j++) {
				if (students.get(j).gpa > students.get(j + 1).gpa){
					Student temp = students.set(j, students.get(j + 1));
					students.set(j + 1, temp);
				}

			}
		}	
		return students;
	}
	
	public ArrayList<Student> sortByGradeIncreasing(ArrayList<Student> students){
		for (int i = 0; i < students.size(); i++ ) {
			for (int j = 0; j < students.size() - 1; j++) {
				if (students.get(j).gradeInClass > students.get(j + 1).gradeInClass){
					Student temp = students.set(j, students.get(j + 1));
					students.set(j + 1, temp);
				}

			}
		}	
		return students;
	}
	
	public ArrayList<Student> sortByFavSubjectAlpha(ArrayList<Student> students){
		for (int i = 0; i < students.size(); i++ ) {
			for (int j = 0; j < students.size() - 1; j++) {
				if (students.get(j).favSubject.charAt(0) > students.get(j + 1).favSubject.charAt(0)){
					Student temp = students.set(j, students.get(j + 1));
					students.set(j + 1, temp);
				}

			}
		}	
		return students;
	}
}
