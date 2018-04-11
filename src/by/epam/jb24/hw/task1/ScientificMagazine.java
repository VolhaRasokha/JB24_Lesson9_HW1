package by.epam.jb24.hw.task1;

public class ScientificMagazine extends Magazines {
	private String scientificTopic = "";

	public ScientificMagazine(String name, String dateOfprinted,
			String formatOfmagazine, String frequencyOfOutput,
			String scientificTopic) {
		setName(name);
		setDateOfprinted(dateOfprinted);
		setFormatOfmagazine(formatOfmagazine);
		setFrequencyOfOutput(frequencyOfOutput);
		this.scientificTopic = scientificTopic;
	}

	public String getScientificTopic() {
		return scientificTopic;
	}

	public void setScientificTopic(String scientificTopic) {
		this.scientificTopic = scientificTopic;
	}

}
