package by.epam.jb24.hw.task1;

public class ChildrenBooks extends Books {
	private String rangeOfAge = "";
	private String typeOfChildrenBook = "";

	public ChildrenBooks(String name, String author, String dateOfprinted,
			int countOfpage, String coverType, String rangeOfAge,
			String typeOfChildrenBook) {
		setName(name);
		setAuthor(author);
		setDateOfprinted(dateOfprinted);
		setCountOfpage(countOfpage);
		setCoverType(coverType);
		this.rangeOfAge = rangeOfAge;
		this.typeOfChildrenBook = typeOfChildrenBook;
	}

	public String getRangeOfAge() {
		return rangeOfAge;
	}

	public void setRangeOfAge(String rangeOfAge) {
		this.rangeOfAge = rangeOfAge;
	}

	public String getTypeOfChildrenBook() {
		return typeOfChildrenBook;
	}

	public void setTypeOfChildrenBook(String typeOfChildrenBook) {
		this.typeOfChildrenBook = typeOfChildrenBook;
	}
}
