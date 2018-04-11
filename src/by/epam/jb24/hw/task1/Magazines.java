package by.epam.jb24.hw.task1;

public class Magazines extends PrintedPublications {
	private String formatOfmagazine = "";
	private String frequencyOfOutput = "";

	public Magazines() {
	}

	public Magazines(String name, String dateOfprinted,
			String formatOfmagazine, String frequencyOfOutput) {
		super(name, dateOfprinted);
		this.formatOfmagazine = formatOfmagazine;
		this.frequencyOfOutput = frequencyOfOutput;
	}

	public String getFormatOfmagazine() {
		return formatOfmagazine;
	}

	public void setFormatOfmagazine(String formatOfmagazine) {
		this.formatOfmagazine = formatOfmagazine;
	}

	public String getFrequencyOfOutput() {
		return frequencyOfOutput;
	}

	public void setFrequencyOfOutput(String frequencyOfOutput) {
		this.frequencyOfOutput = frequencyOfOutput;
	}

}
