package BookList;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<Book>();
		books.add(new Book("The Count of Monte Cristo", 544, "Alexandre Dumas", 1844));
		books.add(new Book("The Idiot", 667, "Dostoyevsky", 1869));
		books.add(new Book("The Family", 425, "Mario Puzo", 1999));
		books.add(new Book("The Epic of Gılgamesh ", 123, "Anonym", -2800));
		books.add(new Book("Die Archetypen und das kollektive Unbewusste", 430, "Carl Gustav Jung", 1954));
		books.add(new Book("Cosmos", 230, "Carl Sagan", 1980));
		books.add(new Book("The Left Hand of Darkness", 324, "Ursula K. Le Guin", 1969));
		books.add(new Book("What is Life ", 250, "Erwin Schrödinger", 1944));
		books.add(new Book("The Birth of Tragedy ", 242, "Friedrich Nietzsche", 1871));
		books.add(new Book("Dr Jekyll and Mr Hyde", 98, "Robert Louis Stevenson", 1886));
		
		books.stream().forEach(t-> System.out.println("Author name :"+ t.getAuthorName() +" Book name: " + t.getName()));
		books.stream().filter(t -> t.getPageNum()>100).forEach(t->System.out.println("The books which's page number greater than 100 "+t.getName()+ "-" + t.getPageNum()));
	
	}

}
