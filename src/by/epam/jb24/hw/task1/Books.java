package by.epam.jb24.hw.task1;

public class Books extends PrintedPublications {
	private int countOfpage = 0;
	private String coverType = "";

	public Books() {
	}

	public Books(String name, String author, String dateOfprinted,
			int countOfpage, String coverType) {
		setName(name);
		setAuthor(author);
		setDateOfprinted(dateOfprinted);
		this.countOfpage = countOfpage;
		this.coverType = coverType;
	}

	public int getCountOfpage() {
		return countOfpage;
	}

	public void setCountOfpage(int countOfpage) {
		this.countOfpage = countOfpage;
	}

	public String getCoverType() {
		return coverType;
	}

	public void setCoverType(String coverType) {
		this.coverType = coverType;
	}

}
