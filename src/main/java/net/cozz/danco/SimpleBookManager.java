package net.cozz.danco;

import java.util.List;

public class SimpleBookManager implements BookManager {

	private List<Book> books;
	
	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public List<Book> getBooks() {
		return books;
	}
}
