import java.util.ArrayList;

public class Library {
	
	public ArrayList<Book> library;
	
	public Library(ArrayList<Book> library) {
		this.library = library; 
	}
	
	public void sortBy(String bookAttribute){
		
		switch (bookAttribute) {
		case "title":
			this.sortByAuthor(library);
			break;
		case "author":
			this.sortByAuthor(library);
			break;
		case "isHardcover":
			this.sortByHardcover(library);
			break;
		case"genre":
			this.sortByGenre(library);
			break;
		}
	}
	
	
	 public ArrayList<Book> sortByTitle(ArrayList<Book> books) {
         for (int i = 0; i < books.size(); i++) {
             for (int j = 0; j < books.size() - 1; j++) {
                 if (books.get(j).title.charAt(0) > books.get(j + 1).title.charAt(0)) {
                     Book temp = books.set(j, books.get(j + 1));
                     books.set(j + 1, temp);
                 } 
                 else if ((books.get(j).title.charAt(0) == books.get(j + 1).title.charAt(0))) {
                	 //
                     // to order books if title starts with "the"
                	 if ((books.get(j).title.substring(0, 2)).equals(books.get(j + 1).title.substring(0,2))) {
                    	 if (books.get(j).title.charAt(4) > books.get(j + 1).title.charAt(4)) {
                             Book temp = books.set(j, books.get(j + 1));
                             books.set(j + 1, temp);
                         } 
                    	 else if ((books.get(j).title.charAt(4) == books.get(j + 1).title.charAt(4))) {
                             if (books.get(j).title.charAt(5) > books.get(j + 1).title.charAt(5)) {
                                 Book temp = books.set(j, books.get(j + 1));
                                 books.set(j + 1, temp);
                             }
                         }
                     }
                	 else if (books.get(j).title.charAt(1) > books.get(j + 1).title.charAt(1)) {
                         Book temp = books.set(j, books.get(j + 1));
                         books.set(j + 1, temp);
                     } 
                     else if (books.get(j).title.charAt(1) == books.get(j + 1).title.charAt(1)) {
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

	public ArrayList<Book> sortByAuthor(ArrayList<Book> books){
         for (int i = 0; i < books.size(); i++) {
             for (int j = 0; j < books.size() - 1; j++) {
                 if (books.get(j).author.charAt(0) > books.get(j + 1).author.charAt(0)) {
                     Book temp = books.set(j, books.get(j + 1));
                     books.set(j + 1, temp);
                 } else if ((books.get(j).author.charAt(0) == books.get(j + 1).author.charAt(0))) {
                     if (books.get(j).author.charAt(1) > books.get(j + 1).author.charAt(1)) {
                         Book temp = books.set(j, books.get(j + 1));
                         books.set(j + 1, temp);
                     } else if (books.get(j).author.charAt(1) == books.get(j + 1).author.charAt(1)) {
                         if (books.get(j).author.charAt(2) > books.get(j + 1).author.charAt(2)) {
                             Book temp = books.set(j, books.get(j + 1));
                             books.set(j + 1, temp);
                         }
                     }

                 }
             }

         }
         return books;

     }
	public ArrayList<Book> sortByGenre(ArrayList<Book> books) {
         for (int i = 0; i < books.size()-1; i++) {
             for (int j = 0; j < books.size() - 1; j++) {
                 if (books.get(j).genre.charAt(0) > books.get(j + 1).genre.charAt(0)) {
                     Book temp = books.set(j, books.get(j + 1));
                     books.set(j + 1, temp);
                 } else if ((books.get(j).genre.charAt(0) == books.get(j + 1).genre.charAt(0))) {
                     if (books.get(j).genre.charAt(1) > books.get(j + 1).genre.charAt(1)) {
                         Book temp = books.set(j, books.get(j + 1));
                         books.set(j + 1, temp);
                     } else if (books.get(j).genre.charAt(1) == books.get(j + 1).genre.charAt(1)) {
                         if (books.get(j).genre.charAt(2) > books.get(j + 1).genre.charAt(2)) {
                             Book temp = books.set(j, books.get(j + 1));
                             books.set(j + 1, temp);
                         }
                     }

                 }
             }

         }
                 //sci fi, non fiction, biography, history, fiction, fantasy, romance

             //public ArrayList<Book> isHardCover(ArrayList<Book> books){
             //put in an array and sort whether true or false?

             // }
         return books;
     }
	
	public ArrayList<Book> sortByHardcover(ArrayList<Book> books) {
        for (int i = 0; i < books.size()-1; i++) {
            for (int j = 0; j < books.size() - 1; j++) {
                if (books.get(j).isHardcover) {
                    Book temp = books.set(j, books.get(j + 1));
                    books.set(j + 1, temp);
                } 

            }

        }
        return books;
	}
	

}
