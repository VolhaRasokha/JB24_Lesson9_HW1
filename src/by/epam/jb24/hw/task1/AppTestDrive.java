package by.epam.jb24.hw.task1;

import java.util.ArrayList;
import java.util.List;

public class AppTestDrive {

	public static void main(String[] args) {
		List<PrintedPublications> printedPublications = new ArrayList<PrintedPublications>();

		// add some Children Books to the list
		printedPublications.add(new ChildrenBooks("Buratino", "Tolstyo A.N.",
				"2000", 10, "Soft cover", "3-15", "Fairy tale"));
		printedPublications
				.add(new ChildrenBooks("The Adventures of Dennis",
						"Victor Dragunsky", "2005", 105, "Hard cover", "10-15",
						"Story"));

		// print Children Books
		System.out.println("-----------------Children Books--------------");
		System.out.println(printedPublications.get(0).getName()
				+ " by "
				+ printedPublications.get(0).getAuthor()
				+ " type: "
				+ ((ChildrenBooks) printedPublications.get(0))
						.getTypeOfChildrenBook());
		System.out.println(printedPublications.get(1).getName()
				+ " by "
				+ printedPublications.get(1).getAuthor()
				+ " type: "
				+ ((ChildrenBooks) printedPublications.get(1))
						.getTypeOfChildrenBook());

		// add some Educational Book to the list
		printedPublications.add(new Educationalbook("Head First Java",
				"Kathy Sierra", "2016", 600, "Hard cover", "Junior developer",
				"Programming language", 11, "Book with exercises"));

		// print Educational Book
		System.out.println("");
		System.out.println("-----------------Educational Book--------------");
		System.out.println(printedPublications.get(2).getName()
				+ " by "
				+ printedPublications.get(2).getAuthor()
				+ " "
				+ ((Educationalbook) printedPublications.get(2))
						.getSubjectOfstudying()
				+ " type: "
				+ ((Educationalbook) printedPublications.get(2))
						.getTypeOfstudying());

		// add Popular magazine to the list
		printedPublications.add(new PopularMagazine("Cosmopolitan",
				"01.04.2018", "A4", "Every month", "Women"));

		// print Popular magazine
		System.out.println("");
		System.out.println("-----------------Popular magazine--------------");
		System.out.println(printedPublications.get(3).getName()
				+ " for: "
				+ ((PopularMagazine) printedPublications.get(3))
						.getGroupOfProple());

	}
}
