//Stephanie Dragoi, Danielle White
//20220415
//APCS Project #2-- Tester class

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {

		ArrayList<Book> library = new ArrayList<Book>(43);
		ArrayList<Student> englishClass = new ArrayList<Student>(43);

		// populate library
		library.add(new Book("The Red Pyramid", "Rick Riordan", "Fantasy", true));
		library.add(new Book("Don Quixote", "Miguel de Cervantes", "Fiction", false));
		library.add(new Book("Nineteen Eighty Four", "George Orwell", "Fiction", false));
		library.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "Fiction", true));
		library.add(new Book("Beloved", "Toni Morrison", "Fiction", false));
		library.add(new Book("Mrs Dalloway", "Virginia Woolf", "Fiction", true));
		library.add(new Book("Midnight's Children", "Salman Rushdie", "Fiction", false));
		library.add(new Book("Ulysses", "James Joyce", "Fiction", false));
		library.add(new Book("The Kite Runner", "Khaled Hosseini", "Fiction", false));
		library.add(new Book("Adventures of Huckleberry Finn", "Mark Twain", "Fiction", true));
		library.add(new Book("Fahrenheit 451", "Ray Bradbury", "Fiction", true));
		library.add(new Book("The Viscount Who Loved Me", "Julia Quinn", "Romance", false));
		library.add(new Book("Dune", "Frank Herbert", "Fiction", true));
		library.add(new Book("The Sixth Extinction", "Elizabeth Kolbert", "Nonfiction", true));
		library.add(new Book("The Year of Magical Thinking", "Joan Didion", "Nonfiction", true));
		library.add(new Book("No Logo", "Naomi Klein", "Nonfiction", true));
		library.add(new Book("Birthday Letters", "Ted Hughes", "Nonfiction", false));
		library.add(new Book("Dreams from My Father", "Barack Obama", "Nonfiction", false));
		library.add(new Book("A Brief History of Time", "Stephen Hawking", "Nonfiction", true));
		library.add(new Book("The Right Stuff", "Tom Wolfe", "Nonfiction", false));
		library.add(new Book("Orientalism", "Edward Said", "Nonfiction", true));
		library.add(new Book("Dispatches", "Micheal Herr", "Nonfiction", false));
		library.add(new Book("The Name of the Wind", "Patrick Rothfuss", "Fantasy", false));
		library.add(new Book("The Fifth Season", "N. K. Jemisin", "Fantasy", false));
		library.add(new Book("A Game of Thrones", "George R. R. Martin", "Fantasy", true));
		library.add(new Book("The Way of Kings", "Brandon Sanderson", "Fantasy", true));
		library.add(new Book("The Eye of the World", "Robert Jordan", "Fantasy", false));
		library.add(new Book("A Wizard of Earthsea", "Ursula K. Le Guin", "Fantasy", false));
		library.add(new Book("The Lies of Locke Lamora", "Scott Lynch", "Fantasy", true));
		library.add(new Book("All the Birds in the Sky", "Charlie Jane Anders", "Sci-Fi", true));
		library.add(new Book("Who Fears Death", "Nnedi Okorafor", "Sci-Fi", true));
		library.add(new Book("Dragonflight", "Anne McCaffrey", "Sci-Fi", false));
		library.add(new Book("Perdido Street Station", "China Mieville", "Sci-Fi", false));
		library.add(new Book("The Hundred Thousand", "N. K. Jemisin", "Sci-Fi", false));
		library.add(new Book("The Stand", "Stephen King", "Sci-Fi", true));
		library.add(new Book("Guns, Germs, and Steel", "Jared Diamond", "History", false));
		library.add(new Book("An Army at Dawn", "Rick Atkinson", "History", false));
		library.add(new Book("Into the Wild", "Jon Krakauer", "Biography", false));
		library.add(new Book("Founding Brothers", "Joseph J. Ellis", "Biography", true));
		library.add(new Book("Stalin's Englishmen", "Andrew Lownie", "Biography", false));
		library.add(new Book("The Devil in the White City", "Erik Larson", "Biography", false));
		library.add(new Book("The Right Time", "Danielle Steel", "Romance", false));
		library.add(new Book("It Ends With Us", "Colleen Hoover", "Romance", true));

		// populate English class
		englishClass.add(new Student("Gatsby", "Zion", 98, "Humanities", 1.6));
		englishClass.add(new Student("Bart", "Maeve", 72, "not sure", 1.3));
		englishClass.add(new Student("Heinz", "Nova", 50, "Humanities", 1.5));
		englishClass.add(new Student("James", "Aaliyah", 98, "Humanities", 3.8));
		englishClass.add(new Student("Leslia", "Aurora", 50, "STEM", 2.5));
		englishClass.add(new Student("Miller", "Ezra", 80, "STEM", 1.8));
		englishClass.add(new Student("Johnson", "Ivy", 37, "STEM", 3.4));
		englishClass.add(new Student("Cooper", "Amara", 99, "STEM", 3.6));
		englishClass.add(new Student("Hearst", "Phoebe", 32, "not sure", 1.3));
		englishClass.add(new Student("Wilson", "Michael", 49, "Humanities", 1.4));
		englishClass.add(new Student("Moore", "Daniel", 99, "not sure", 1.6));
		englishClass.add(new Student("Taylor", "Elizabeth", 43, "not sure", 3.4));
		englishClass.add(new Student("Allen", "Emma", 49, "STEM", 4.1));
		englishClass.add(new Student("Anderson", "Joseph", 68, "not sure", 2.1));
		englishClass.add(new Student("Bennett", "Thomas", 55, "not sure", 3.2));
		englishClass.add(new Student("Harris", "Andrew", 32, "STEM", 1.4));
		englishClass.add(new Student("Garcia", "Benjamin", 77, "Humanities", 3.4));
		englishClass.add(new Student("Wright", "Evelyn", 96, "not sure", 4.0));
		englishClass.add(new Student("Evans", "Christopher", 50, "STEM", 4.0));
		englishClass.add(new Student("Sullivan", "Emily", 40, "not sure", 4.4));
		englishClass.add(new Student("Gomez", "Alexander", 74, "not sure", 4.9));
		englishClass.add(new Student("White", "Richard", 90, "not sure", 3.5));
		englishClass.add(new Student("Grayson", "Matthew", 79, "STEM", 1.7));
		englishClass.add(new Student("Skyles", "Grace", 64, "not sure", 3.3));
		englishClass.add(new Student("Williams", "Olivia", 42, "STEM", 1.9));
		englishClass.add(new Student("Brown", "Sophia", 74, "STEM", 3.7));
		englishClass.add(new Student("Jones", "Edward", 64, "Humanities", 4.3));
		englishClass.add(new Student("Cadell", "Jacob", 54, "not sure", 1.8));
		englishClass.add(new Student("Minor", "Oliver", 46, "STEM", 4.9));
		englishClass.add(new Student("Davis", "Noah", 77, "Humanities", 3.4));
		englishClass.add(new Student("Rodrigruez", "Eleanor", 34, "Humanities", 1.1));
		englishClass.add(new Student("Ginsburg", "Ruth", 46, "not sure", 2.2));
		englishClass.add(new Student("Martinez", "Robert", 47, "not sure", 3.1));
		englishClass.add(new Student("Hernandez", "Gabriel", 86, "not sure", 4.8));
		englishClass.add(new Student("Lopez", "John", 54, "Humanities", 1.6));
		englishClass.add(new Student("Hansen", "Charlie", 99, "not sure", 3.0));
		englishClass.add(new Student("Thomas", "Anthony", 80, "not sure", 1.0));
		englishClass.add(new Student("Jackson", "Mark", 48, "Humanities", 2.1));
		englishClass.add(new Student("Sanchez", "Donald", 35, "Humanities", 3.1));
		englishClass.add(new Student("Clark", "Steven", 49, "Humanities", 3.9));
		englishClass.add(new Student("Walker", "Paul", 53, "STEM", 4.7));
		englishClass.add(new Student("Robinson", "Brian", 69, "Humanities", 3.0));
		englishClass.add(new Student("Young", "George", 53, "Humanities", 3.2));

		Class english = new Class(englishClass);
		// english.sortBy("lastName");
		// for (int i = 0; i< englishClass.size(); i++) {
		// System.out.println(englishClass.get(i).favSubject + " " +
		// englishClass.get(i).lastName);
		// }

		Library bookstore = new Library(library);
		// bookstore.sortByTitle(library);
		// for (int j = 0; j < library.size(); j++) {
		// System.out.println(library.get(j).title);
		// }

		Scanner input = new Scanner(System.in);
		String action;
		do {
			System.out.println(
					"Would you like to sort a class, sort a library, or assign books to students for a report? " 
				+"Please reply with c, b, or r. ");
			while (!input.hasNext()) {
				System.out.println("Please reply with c, b, or r. ");
				input.next();
			}
			action = input.next();
			if (action.equalsIgnoreCase("c") || action.equalsIgnoreCase("b") 
			    || action.equalsIgnoreCase("r"))
				break;
		} while (!(action.equalsIgnoreCase("c") || action.equalsIgnoreCase("b") 
			   || action.equalsIgnoreCase("r")));

		if (action.equalsIgnoreCase("c")) {
			Scanner studentSortBy = new Scanner(System.in);
			String sortBy;
			do {
				System.out.println(
						"Would you like to sort by last name, first name, GPA, grade in the class, or favorite subject?" 
					+" Please reply with ln, fn, gpa, gr, or sub. ");
				while (!input.hasNext()) {
					System.out.println("Please reply with ln, fn, gpa, gr, or sub. ");
					input.next();
				}
				sortBy = input.next();
				if (sortBy.equalsIgnoreCase("ln") || sortBy.equalsIgnoreCase("fn") 
				    || sortBy.equalsIgnoreCase("gpa")|| sortBy.equalsIgnoreCase("gr") 
				    || sortBy.equalsIgnoreCase("sub"))
					break;
			} while (!(sortBy.equalsIgnoreCase("ln") || sortBy.equalsIgnoreCase("fn") 
				   || sortBy.equalsIgnoreCase("gpa")|| sortBy.equalsIgnoreCase("gr") 
				   || sortBy.equalsIgnoreCase("sub")));

			switch (sortBy) {
			case "ln":
				english.sortBy("lastName");
				for (int i = 0; i < englishClass.size(); i++) {
					System.out.println(englishClass.get(i).lastName + ", " + englishClass.get(i).firstName 
							   + "-   GPA: "+ englishClass.get(i).gpa + ";   Grade: " 
							   + englishClass.get(i).gradeInClass+ ";   Favorite subject: " 
							   + englishClass.get(i).favSubject);
				}
				break;
			case "fn":
				english.sortBy("firstName");
				for (int i = 0; i < englishClass.size(); i++) {
					System.out.println(englishClass.get(i).lastName + ", " + englishClass.get(i).firstName 
							   + "-   GPA: "+ englishClass.get(i).gpa + ";   Grade: " 
							   + englishClass.get(i).gradeInClass+ ";   Favorite subject: " 
							   + englishClass.get(i).favSubject);
				}
				break;
			case "gpa":
				english.sortBy("gpa");
				for (int i = 0; i < englishClass.size(); i++) {
					System.out.println(englishClass.get(i).lastName + ", " + englishClass.get(i).firstName 
							   + "-   GPA: "+ englishClass.get(i).gpa + ";   Grade: " 
							   + englishClass.get(i).gradeInClass + ";   Favorite subject: " 
							   + englishClass.get(i).favSubject);
				}
				break;
			case "gr":
				english.sortBy("gradeInClass");
				for (int i = 0; i < englishClass.size(); i++) {
					System.out.println(englishClass.get(i).lastName + ", " + englishClass.get(i).firstName 
							   + "-   GPA: "+ englishClass.get(i).gpa + ";   Grade: " 
							   + englishClass.get(i).gradeInClass+ ";   Favorite subject: " 
							   + englishClass.get(i).favSubject);
				}
				break;
			case "sub":
				english.sortBy("favSubject");
				for (int i = 0; i < englishClass.size(); i++) {
					System.out.println(englishClass.get(i).lastName + ", " + englishClass.get(i).firstName 
							   + "-   GPA: "+ englishClass.get(i).gpa + ";   Grade: " 
							   + englishClass.get(i).gradeInClass+ ";   Favorite subject: " 
							   + englishClass.get(i).favSubject);
				}
				break;
			}
		}

		if (action.equalsIgnoreCase("b")) {
			Scanner librarySortBy = new Scanner(System.in);
			String sortBy;
			do {
				System.out.println(
						"Would you like to sort by title, author, is hardcover, or genre? "
					+ "Please reply with t, a, h, or g. ");
				while (!input.hasNext()) {
					System.out.println("Please reply with t, a, h, or g. ");
					input.next();
				}
				sortBy = input.next();
				if (sortBy.equalsIgnoreCase("t") || sortBy.equalsIgnoreCase("a") 
				    || sortBy.equalsIgnoreCase("h")|| sortBy.equalsIgnoreCase("g"))
					break;
			} while (!(sortBy.equalsIgnoreCase("t") || sortBy.equalsIgnoreCase("a") 
				   || sortBy.equalsIgnoreCase("h")|| sortBy.equalsIgnoreCase("g")));
			switch (sortBy) {
			case "t":
				bookstore.sortBy("title");
				for (int i = 0; i < library.size(); i++) {
					System.out.println(library.get(i).title + " by " + library.get(i).author + ". Genre: "
							+ library.get(i).genre + "; isHardcover? " + library.get(i).isHardcover);
				}
				break;
			case "a":
				bookstore.sortBy("author");
				for (int i = 0; i < library.size(); i++) {
					System.out.println(library.get(i).title + " by " + library.get(i).author + ". Genre: "
							+ library.get(i).genre + "; isHardcover? " + library.get(i).isHardcover);
				}
				break;
			case "h":
				bookstore.sortBy("isHardcover");
				for (int i = 0; i < library.size(); i++) {
					System.out.println(library.get(i).title + " by " + library.get(i).author + ". Genre: "
							+ library.get(i).genre + "; isHardcover? " + library.get(i).isHardcover);
				}
				break;
			case "g":
				bookstore.sortBy("genre");
				for (int i = 0; i < library.size(); i++) {
					System.out.println(library.get(i).title + " by " + library.get(i).author + ". Genre: "
							+ library.get(i).genre + "; isHardcover? " + library.get(i).isHardcover);
				}
				break;
			}
		}

		else if (action.equalsIgnoreCase("r")) {
			Scanner assignS = new Scanner(System.in);
			String assignByS;
			do {
				System.out.println("You may assign students to books based on one attribute of each. ");
				System.out.println(
						"What would you like to assign students by: last name, first name, GPA, grade in the class, "
					+"or favorite subject? Please reply with ln, fn, gpa, gr, or sub. ");
				while (!input.hasNext()) {
					System.out.println("Please reply with ln, fn, gpa, gr, or sub. ");
					input.next();
				}
				assignByS = input.next();
				if (assignByS.equalsIgnoreCase("ln") || assignByS.equalsIgnoreCase("fn")
						|| assignByS.equalsIgnoreCase("gpa") || assignByS.equalsIgnoreCase("gr")
						|| assignByS.equalsIgnoreCase("sub"))
					break;
			} while (!(assignByS.equalsIgnoreCase("ln") || assignByS.equalsIgnoreCase("fn")
					|| assignByS.equalsIgnoreCase("gpa") || assignByS.equalsIgnoreCase("gr")
					|| assignByS.equalsIgnoreCase("sub")));

			Scanner assignB = new Scanner(System.in);
			String assignByB;
			do {
				System.out.println(
						"What would you like to assign books by: title, author, is hardcover, or genre? "
					+"Please reply with t, a, h, or g. ");
				while (!input.hasNext()) {
					System.out.println("Please reply with t, a, h, or g. ");
					input.next();
				}
				assignByB = input.next();
				if (assignByB.equalsIgnoreCase("t") || assignByB.equalsIgnoreCase("a")
						|| assignByB.equalsIgnoreCase("h") || assignByB.equalsIgnoreCase("g"))
					break;
			} while (!(assignByB.equalsIgnoreCase("t") || assignByB.equalsIgnoreCase("a")
					|| assignByB.equalsIgnoreCase("h") || assignByB.equalsIgnoreCase("g")));

			switch (assignByS) {
			case "ln":
				english.sortBy("lastName");
				switch (assignByB) {
				case "t":
					bookstore.sortBy("title");
				case "a":
					bookstore.sortBy("author");
				case "h":
					bookstore.sortBy("isHardcover");
				case "g":
					bookstore.sortBy("genre");
				}
				for (int i = 0; i < englishClass.size(); i++) {
					System.out.println(englishClass.get(i).lastName + ", " + englishClass.get(i).firstName 
							   + "-   GPA: "+ englishClass.get(i).gpa + ";   Grade: " 
							   + englishClass.get(i).gradeInClass+ ";   Favorite subject: " 
							   + englishClass.get(i).favSubject);
					System.out.println("     Book: " + library.get(i).title + " by " + library.get(i).author
							+ ". Genre: " + library.get(i).genre + "; isHardcover? " + library.get(i).isHardcover);
				}
				break;
			case "fn":
				english.sortBy("firstName");
				switch (assignByB) {
				case "t":
					bookstore.sortBy("title");
					break;
				case "a":
					bookstore.sortBy("author");
					break;
				case "h":
					bookstore.sortBy("isHardcover");
					break;
				case "g":
					bookstore.sortBy("genre");
					break;
				}
				for (int i = 0; i < englishClass.size(); i++) {
					System.out.println(englishClass.get(i).lastName + ", " + englishClass.get(i).firstName 
							   + "-   GPA: "+ englishClass.get(i).gpa + ";   Grade: " 
							   + englishClass.get(i).gradeInClass+ ";   Favorite subject: " 
							   + englishClass.get(i).favSubject);
					System.out.println("     Book: " + library.get(i).title + " by " + library.get(i).author
							+ ". Genre: " + library.get(i).genre + "; isHardcover? " + library.get(i).isHardcover);
				}
				break;
			case "gpa":
				english.sortBy("gpa");
				switch (assignByB) {
				case "t":
					bookstore.sortBy("title");
					break;
				case "a":
					bookstore.sortBy("author");
					break;
				case "h":
					bookstore.sortBy("isHardcover");
					break;
				case "g":
					bookstore.sortBy("genre");
					break;
				}
				for (int i = 0; i < englishClass.size(); i++) {
					System.out.println(englishClass.get(i).lastName + ", " + englishClass.get(i).firstName 
							   + "-   GPA: "+ englishClass.get(i).gpa + ";   Grade: " 
							   + englishClass.get(i).gradeInClass+ ";   Favorite subject: " 
							   + englishClass.get(i).favSubject);
					System.out.println("     Book: " + library.get(i).title + " by " + library.get(i).author
							+ ". Genre: " + library.get(i).genre + "; isHardcover? " + library.get(i).isHardcover);
				}
				break;
			case "gr":
				english.sortBy("grade");
				switch (assignByB) {
				case "t":
					bookstore.sortBy("title");
					break;
				case "a":
					bookstore.sortBy("author");
					break;
				case "h":
					bookstore.sortBy("isHardcover");
					break;
				case "g":
					bookstore.sortBy("genre");
					break;
				}
				for (int i = 0; i < englishClass.size(); i++) {
					System.out.println(englishClass.get(i).lastName + ", " + englishClass.get(i).firstName 
							   + "-   GPA: "+ englishClass.get(i).gpa + ";   Grade: " 
							   + englishClass.get(i).gradeInClass+ ";   Favorite subject: " 
							   + englishClass.get(i).favSubject);
					System.out.println("     Book: " + library.get(i).title + " by " + library.get(i).author
							+ ". Genre: " + library.get(i).genre + "; isHardcover? " + library.get(i).isHardcover);
				}
				break;
			case "sub":
				english.sortBy("favSubject");
				switch (assignByB) {
				case "t":
					bookstore.sortBy("title");
					break;
				case "a":
					bookstore.sortBy("author");
					break;
				case "h":
					bookstore.sortBy("isHardcover");
					break;
				case "g":
					bookstore.sortBy("genre");
					break;
				}
				for (int i = 0; i < englishClass.size(); i++) {
					System.out.println(englishClass.get(i).lastName + ", " + englishClass.get(i).firstName 
							   + "-   GPA: "+ englishClass.get(i).gpa + ";   Grade: " 
							   + englishClass.get(i).gradeInClass+ ";   Favorite subject: "
							   + englishClass.get(i).favSubject);
					System.out.println("     Book: " + library.get(i).title + " by " + library.get(i).author
							+ ". Genre: " + library.get(i).genre + "; isHardcover? " + library.get(i).isHardcover);
				}
				break;
			}
		}
	}
}
