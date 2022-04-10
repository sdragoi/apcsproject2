//Stephanie Dragoi, Danielle White
//20220415
//APCS Project #2-- Tester class

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		
		ArrayList <Book> library = new ArrayList <Book>(43);
		ArrayList <Student> englishClass = new ArrayList <Student>(43);
					
		//populate library
				  library.add(new Book("The Red Pyramid", "Rick Riordan", "Fantasy"	, true));
				  library.add(new Book("Don Quixote", "Miguel de Cervantes", "Fiction"	, false));
				  library.add(new Book("Nineteen Eighty Four", "George Orwell"	, "Fiction"	, false));
				  library.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "Fiction"	, true));
				  library.add(new Book("Beloved"	, "Toni Morrison"	, "Fiction"	, false));
				  library.add(new Book("Mrs Dalloway"	, "Virginia Woolf"	, "Fiction"	, true));
				  library.add(new Book("Midnight's Children"	, "Salman Rushdie"	, "Fiction"	, false));
				  library.add(new Book("Ulysses"	, "James Joyce"	, "Fiction"	, false));
				  library.add(new Book("The Kite Runner"	, "Khaled Hosseini"	, "Fiction"	, false));
				  library.add(new Book("Adventures of Huckleberry Finn"	, "Mark Twain"	, "Fiction"	, true));
				  library.add(new Book("Fahrenheit 451"	, "Ray Bradbury"	, "Fiction"	, true));
				  library.add(new Book("The Viscount Who Loved Me"	, "Julia Quinn"	, "Romance"	, false));
				  library.add(new Book("Dune"	, "Frank Herbert"	, "Fiction"	, true));
				  library.add(new Book("The Sixth Extinction"	, "Elizabeth Kolbert"	, "Nonfiction"	, true));
				  library.add(new Book("The Year of Magical Thinking"	, "Joan Didion"	, "Nonfiction"	, true));
				  library.add(new Book("No Logo"	, "Naomi Klein"	, "Nonfiction"	, true));
				  library.add(new Book("Birthday Letters"	, "Ted Hughes"	, "Nonfiction"	, false));
				  library.add(new Book("Dreams from My Father"	, "Barack Obama"	, "Nonfiction"	, false));
				  library.add(new Book("A Brief History of Time"	, "Stephen Hawking"	, "Nonfiction"	, true));
				  library.add(new Book("The Right Stuff"	, "Tom Wolfe"	, "Nonfiction"	, false));
				  library.add(new Book("Orientalism"	, "Edward Said"	, "Nonfiction"	, true));
				  library.add(new Book("Dispatches"	, "Micheal Herr"	, "Nonfiction"	, false));
				  library.add(new Book("The Name of the Wind"	, "Patrick Rothfuss"	, "Fantasy"	, false));
				  library.add(new Book("The Fifth Season"	, "N. K. Jemisin"	, "Fantasy"	, false));
				  library.add(new Book("A Game of Thrones"	, "George R. R. Martin"	, "Fantasy"	, true));
				  library.add(new Book("The Way of Kings"	, "Brandon Sanderson"	, "Fantasy"	, true));
				  library.add(new Book("The Eye of the World"	, "Robert Jordan"	, "Fantasy"	, false));
				  library.add(new Book("A Wizard of Earthsea"	, "Ursula K. Le Guin"	, "Fantasy"	, false));
				  library.add(new Book("The Lies of Locke Lamora"	, "Scott Lynch"	, "Fantasy"	, true));
				  library.add(new Book("All the Birds in the Sky"	, "Charlie Jane Anders"	, "Sci-Fi"	, true));
				  library.add(new Book("Who Fears Death"	, "Nnedi Okorafor"	, "Sci-Fi"	, true));
				  library.add(new Book("Dragonflight"	, "Anne McCaffrey"	, "Sci-Fi"	, false));
				  library.add(new Book("Perdido Street Station"	, "China Mieville"	, "Sci-Fi"	, false));
				  library.add(new Book("The Hundred Thousand"	, "N. K. Jemisin"	, "Sci-Fi"	, false));
				  library.add(new Book("The Stand"	, "Stephen King"	, "Sci-Fi"	, true));
				  library.add(new Book("Guns, Germs, and Steel"	, "Jared Diamond"	, "History"	, false));
				  library.add(new Book("An Army at Dawn"	, "Rick Atkinson"	, "History"	, false));
				  library.add(new Book("Into the Wild"	, "Jon Krakauer"	, "Biography"	, false));
				  library.add(new Book("Founding Brothers"	, "Joseph J. Ellis"	, "Biography"	, true));
				  library.add(new Book("Stalin's Englishmen"	, "Andrew Lownie"	, "Biography"	, false));
				  library.add(new Book("The Devil in the White City"	, "Erik Larson"	, "Biography"	, false));
				  library.add(new Book("The Right Time"	, "Danielle Steel"	, "Romance"	, false));
				  library.add(new Book("It Ends With Us"	, "Colleen Hoover"	, "Romance"	, true));
				 
				 
		//populate English class
				  englishClass.add(new Student("Gatsby", "Zion",	98	, "Humanities"	, 1.6));
				  englishClass.add(new Student("Bart", "Maeve"	,72	, "not sure"	, 1.3));
				  englishClass.add(new Student("Heinz", "Nova"	,50	, "Humanities"	, 1.5));
				  englishClass.add(new Student("James", "Aaliyah"	,98	, "Humanities"	, 3.8));
				  englishClass.add(new Student("Leslia", "Aurora"	,50	, "STEM"	, 2.5));
				  englishClass.add(new Student("Miller", "Ezra"	,80	, "STEM"	, 1.8));
				  englishClass.add(new Student("Johnson", "Ivy"	,37	, "STEM"	, 3.4));
				  englishClass.add(new Student("Cooper", "Amara",	99	, "STEM"	, 3.6));
				  englishClass.add(new Student("Hearst", "Phoebe",	32	, "not sure"	, 1.3));
				  englishClass.add(new Student("Wilson", "Michael",	49	, "Humanities"	, 1.4));
				  englishClass.add(new Student("Moore", "Daniel",	99	, "not sure"	, 1.6));
				  englishClass.add(new Student("Taylor", "Elizabeth",	43	, "not sure"	, 3.4));
				  englishClass.add(new Student("Allen", "Emma",	49	, "STEM"	, 4.1));
				  englishClass.add(new Student("Anderson"	, "Joseph",	68	, "not sure"	, 2.1));
				  englishClass.add(new Student("Bennett"	, "Thomas",	55	, "not sure"	, 3.2));
				  englishClass.add(new Student("Harris"	, "Andrew",	32	, "STEM"	, 1.4));
				  englishClass.add(new Student("Garcia"	, "Benjamin",	77	, "Humanities"	, 3.4));
				  englishClass.add(new Student("Wright"	, "Evelyn",	96	, "not sure"	, 4.0));
				  englishClass.add(new Student("Evans"	, "Christopher",	50	, "STEM"	, 4.0));
				  englishClass.add(new Student("Sullivan"	, "Emily",	40	, "not sure"	, 4.4));
				  englishClass.add(new Student("Gomez"	, "Alexander",	74	, "not sure"	, 4.9));
				  englishClass.add(new Student("White"	, "Richard",	90	, "not sure"	, 3.5));
				  englishClass.add(new Student("Grayson"	, "Matthew",	79	, "STEM"	, 1.7));
				  englishClass.add(new Student("Skyles"	, "Grace",	64	, "not sure"	, 3.3));
				  englishClass.add(new Student("Williams"	, "Olivia",	42	, "STEM"	, 1.9));
				  englishClass.add(new Student("Brown"	, "Sophia",	74	, "STEM"	, 3.7));
				  englishClass.add(new Student("Jones"	, "Edward",	64	, "Humanities"	, 4.3));
				  englishClass.add(new Student("Cadell"	, "Jacob",	54	, "not sure"	, 1.8));
				  englishClass.add(new Student("Minor"	, "Oliver",	46	, "STEM"	, 4.9));
				  englishClass.add(new Student("Davis"	 , "Noah",	77	, "Humanities"	, 3.4));
				  englishClass.add(new Student("Rodrigruez"	, "Eleanor",	34	, "Humanities"	, 1.1));
				  englishClass.add(new Student("Ginsburg"	, "Ruth",	46	, "not sure"	, 2.2));
				  englishClass.add(new Student("Martinez"	, "Robert",	47	, "not sure"	, 3.1));
				  englishClass.add(new Student("Hernandez"	, "Gabriel",	86	, "not sure"	, 4.8));
				  englishClass.add(new Student("Lopez"	, "John",	54	, "Humanities"	, 1.6));
				  englishClass.add(new Student("Hansen"	, "Charlie",	99	, "not sure"	, 3.0));
				  englishClass.add(new Student("Thomas"	, "Anthony",	80	, "not sure"	, 1.0));
				  englishClass.add(new Student("Jackson"	, "Mark",	48	, "Humanities"	, 2.1));
				  englishClass.add(new Student("Sanchez"	, "Donald",	35	, "Humanities"	, 3.1));
				  englishClass.add(new Student("Clark"	, "Steven",	49	, "Humanities"	, 3.9));
				  englishClass.add(new Student("Walker"	, "Paul",	53	, "STEM"	, 4.7));
				  englishClass.add(new Student("Robinson"	, "Brian", 69	, "Humanities"	, 3.0));
				  englishClass.add(new Student("Young"	, "George" ,	53	, "Humanities"	, 3.2));

				Class english = new Class(englishClass);
				english.sortByLastName(englishClass);
				for (int i = 0; i< englishClass.size(); i++) {
					System.out.println(englishClass.get(i).lastName);
				}
	}

}
