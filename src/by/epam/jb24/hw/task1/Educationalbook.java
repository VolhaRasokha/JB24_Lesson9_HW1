package by.epam.jb24.hw.task1;

public class Educationalbook extends Books {
	private String bookAssignment = "";
	private String subjectOfstudying = "";
	private int classOfstudying = 0;
	private String typeOfstudying = "";

	public Educationalbook(String name, String author, String dateOfprinted,
			int countOfpage, String coverType, String bookAssignment,
			String subjectOfstudying, int classOfstudying, String typeOfstudying) {
		setName(name);
		setAuthor(author);
		setDateOfprinted(dateOfprinted);
		setCountOfpage(countOfpage);
		setCoverType(coverType);
		this.bookAssignment = bookAssignment;
		this.subjectOfstudying = subjectOfstudying;
		this.classOfstudying = classOfstudying;
		this.typeOfstudying = typeOfstudying;
	}

	public String getBookAssignment() {
		return bookAssignment;
	}

	public void setBookAssignment(String bookAssignment) {
		this.bookAssignment = bookAssignment;
	}

	public String getSubjectOfstudying() {
		return subjectOfstudying;
	}

	public void setSubjectOfstudying(String subjectOfstudying) {
		this.subjectOfstudying = subjectOfstudying;
	}

	public int getClassOfstudying() {
		return classOfstudying;
	}

	public void setClassOfstudying(int classOfstudying) {
		this.classOfstudying = classOfstudying;
	}

	public String getTypeOfstudying() {
		return typeOfstudying;
	}

	public void setTypeOfstudying(String typeOfstudying) {
		this.typeOfstudying = typeOfstudying;
	}

}
