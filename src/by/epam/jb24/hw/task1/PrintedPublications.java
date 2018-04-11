package by.epam.jb24.hw.task1;

public class PrintedPublications {
	private String name = "";
	private String author = "";
	private String dateOfprinted;

	public PrintedPublications() {
	}

	public PrintedPublications(String name, String dateOfprinted) {
		this.name = name;
		this.dateOfprinted = dateOfprinted;
	}

	public PrintedPublications(String name, String author, String dateOfprinted) {
		this.name = name;
		this.author = author;
		this.dateOfprinted = dateOfprinted;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDateOfprinted() {
		return dateOfprinted;
	}

	public void setDateOfprinted(String dateOfprinted) {
		this.dateOfprinted = dateOfprinted;
	}

}
