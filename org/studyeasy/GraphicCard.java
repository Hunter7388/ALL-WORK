package org.studyeasy;

public class GraphicCard {

	private String brand;
	private int series;
	private String Memory;

	public GraphicCard() {

		this.brand = "nvidia";
		this.series = 890;
		Memory = "2 gb";

	}

	public GraphicCard(String brand, int series, String memory) {

		this.brand = brand;
		this.series = series;
		Memory = memory;
	}

	@Override
	public String toString() {
		return "GraphicCard [brand=" + brand + ", series=" + series + ", Memory=" + Memory + "]";
	}
	

}
