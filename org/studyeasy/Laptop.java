package org.studyeasy;

public class Laptop {

	private float screen;
	private processor processor;
	private String ram;
	private String hardDrive;
	private GraphicCard GraphicCard;
	private String opticleDrive;
	private String keyboard;

	public Laptop() {
		this.screen = 12.5f;
		this.processor = new processor();
		this.ram = "DDR$";
		this.hardDrive = "2tb";
		this.GraphicCard = new GraphicCard();
		this.keyboard = "baclight";
		this.opticleDrive = "multi layer";
	}

	public Laptop(float screen, org.studyeasy.processor processor, String ram, String hardDrive,
			org.studyeasy.GraphicCard graphicCard, String opticleDrive, String keyboard) {

		this.screen = screen;
		this.processor = processor;
		this.ram = ram;
		this.hardDrive = hardDrive;
		GraphicCard = graphicCard;
		this.opticleDrive = opticleDrive;
		this.keyboard = keyboard;
	}

	@Override
	public String toString() {
		return "Laptop [screen=" + screen + ", processor=" + processor + ", ram=" + ram + ", hardDrive=" + hardDrive
				+ ", GraphicCard=" + GraphicCard + ", opticleDrive=" + opticleDrive + ", keyboard=" + keyboard + "]";
	}

	public processor getProcessor() {
		return processor;
	}
    
}
