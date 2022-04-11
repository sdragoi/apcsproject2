import java.util.ArrayList;

public class Library {
	
	public ArrayList<Book> library;
	
	public Library(ArrayList<Book> library) {
		this.library = library; 
	}
	 public ArrayList<Book> sortByTitle(ArrayList<Book> books) {
         for (int i = 0; i < books.size(); i++) {
             for (int j = 0; j < books.size() - 1; j++) {
                 if (books.get(j).title.charAt(0) > books.get(j + 1).title.charAt(0)) {
                     Book temp = books.set(j, books.get(j + 1));
                     books.set(j + 1, temp);
                 } else if ((books.get(j).title.charAt(0) == books.get(j + 1).title.charAt(0))) {
                     if (books.get(j).title.charAt(1) > books.get(j + 1).title.charAt(1)) {
                         Book temp = books.set(j, books.get(j + 1));
                         books.set(j + 1, temp);
                     } else if (books.get(j).title.charAt(1) == books.get(j + 1).title.charAt(1)) {
                         if (books.get(j).title.charAt(2) > books.get(j + 1).title.charAt(2)) {
                             Book temp = books.set(j, books.get(j + 1));
                             books.set(j + 1, temp);
                         }
                     }

                 }
             }

         }
         return books;
     }

}
