package by.epam.jb24.hw.task1;

public class PopularMagazine extends Magazines {
	private String groupOfProple = "";

	public String getGroupOfProple() {
		return groupOfProple;
	}

	public void setGroupOfProple(String groupOfProple) {
		this.groupOfProple = groupOfProple;
	}

	public PopularMagazine(String name, String dateOfprinted,
			String formatOfmagazine, String frequencyOfOutput,
			String groupOfProple) {
		setName(name);
		setDateOfprinted(dateOfprinted);
		setFormatOfmagazine(formatOfmagazine);
		setFrequencyOfOutput(frequencyOfOutput);
		this.groupOfProple = groupOfProple;
	}

}
