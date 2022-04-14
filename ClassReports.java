import java.util.ArrayList;

public class ClassReports {
	
	public ArrayList<Report> classReports;
	
	public ClassReports(ArrayList<Report> classReports) {
		this.classReports = classReports;
	}
	
	public ClassReports() {
		this.classReports = new ArrayList<Report>(43);
	}
	
	//public String lastName;
	//public String firstName;
	//public double gpa;
	//public int gradeInClass;
	//public String favSubject;
	
	//public String title;
	//public String author;
	//public boolean isHardcover;
	//public String genre;
	
	/* lastName title
	 * lastName author
	 * lastName isHardcover
	 * lastName genre
	 * firstName title
	 * firstName author
	 * firstName isHardcover
	 * firstName genre
	 * gpa title
	 * gpa author
	 * gpa isHardcover
	 * gpa genre
	 * grade title
	 * grade author
	 * grade isHardcover
	 * grade genre
	 * XXXfavs title
	 * XXXfavs author
	 * XXXfavs isHardcover
	 * favs genre
	 */
	
	
	public void Assign(Class classroom, Library library, String studentAttribute, String bookAttribute){
			
			switch (studentAttribute) {
			case "lastName":
				switch (bookAttribute) {
				case "title":
					classroom.sortByLastName(classroom.classroom);
					library.sortByTitle(library.library);
					for (int i = 0; i < classroom.classroom.size(); i++) {
						this.classReports.add(new Report(classroom.classroom.get(i), library.library.get(i)));
					}
					break;
				case "author":
					classroom.sortByLastName(classroom.classroom);
					library.sortByAuthor(library.library);
					for (int i = 0; i < classroom.classroom.size(); i++) {
						this.classReports.add(new Report(classroom.classroom.get(i), library.library.get(i)));
					}
					break;
				case "isHardcover":
					break;
				case "genre":
					break;
				}
				break;
			case "firstName":
				switch (bookAttribute) {
				case "title":
					classroom.sortByFirstName(classroom.classroom);
					library.sortByTitle(library.library);
					for (int i = 0; i < classroom.classroom.size(); i++) {
						this.classReports.add(new Report(classroom.classroom.get(i), library.library.get(i)));
					}
					break;
				case "author":
					classroom.sortByFirstName(classroom.classroom);
					library.sortByAuthor(library.library);
					for (int i = 0; i < classroom.classroom.size(); i++) {
						this.classReports.add(new Report(classroom.classroom.get(i), library.library.get(i)));
					}
					break;
				case "isHardcover":
					break;
				case "genre":
					break;
				}
				break;
			case "gpa":
				switch (bookAttribute) {
				case "title":
					classroom.sortByGPAIncreasing(classroom.classroom);
					library.sortByTitle(library.library);
					for (int i = 0; i < classroom.classroom.size(); i++) {
						this.classReports.add(new Report(classroom.classroom.get(i), library.library.get(i)));
					}
					break;
				case "author":
					classroom.sortByGPAIncreasing(classroom.classroom);
					library.sortByAuthor(library.library);
					for (int i = 0; i < classroom.classroom.size(); i++) {
						this.classReports.add(new Report(classroom.classroom.get(i), library.library.get(i)));
					}
					break;
				case "isHardcover":
					break;
				case "genre":
					break;
				}
				break;
			case"gradeInClass":
				switch (bookAttribute) {
				case "title":
					classroom.sortByGradeIncreasing(classroom.classroom);
					library.sortByTitle(library.library);
					for (int i = 0; i < classroom.classroom.size(); i++) {
						this.classReports.add(new Report(classroom.classroom.get(i), library.library.get(i)));
					}
					break;
				case "author":
					classroom.sortByGradeIncreasing(classroom.classroom);
					library.sortByAuthor(library.library);
					for (int i = 0; i < classroom.classroom.size(); i++) {
						this.classReports.add(new Report(classroom.classroom.get(i), library.library.get(i)));
					}
					break;
				case "isHardcover":
					break;
				case "genre":
					break;
				}
				break;
			case "favSubject": 
				switch (bookAttribute) {
				case "title":
					classroom.sortByFavSubjectAlpha(classroom.classroom);
					library.sortByTitle(library.library);
					for (int i = 0; i < classroom.classroom.size(); i++) {
						this.classReports.add(new Report(classroom.classroom.get(i), library.library.get(i)));
					}
					break;
				case "author":
					classroom.sortByFavSubjectAlpha(classroom.classroom);
					library.sortByAuthor(library.library);
					for (int i = 0; i < classroom.classroom.size(); i++) {
						this.classReports.add(new Report(classroom.classroom.get(i), library.library.get(i)));
					}
					break;
				case "isHardcover":
					break;
				case "genre":
					break;
				}
				break;
			}
		}

}
