import java.util.ArrayList;

public class ClassReports {
	
	public ArrayList<Report> classReports;
	
	public ClassReports(ArrayList<Report> classReports) {
		this.classReports = classReports;
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
	
	
	public void Assign(ArrayList<Student> classroom, ArrayList<Book> library, String studentAttribute, String bookAttribute){
			
			switch (studentAttribute) {
			case "lastName":
				this.sortbylastName())
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

}
