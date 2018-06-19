
public class Computer {
	private String processor;
	private double proPower;
	private String graphicsCard;
	private String resolution;
	
	void setProcessor(String p) {
		if (!p.equals("i7") && !p.equals("i3") && !p.equals("i5") && !p.equals("i9")) {
			System.err.println("not valid");	
		} else {
			if (p.equals("i3")) {
				this.processor = "i3";
				this.proPower = 3.70;
			} else if (p.equals("i5")) {
				this.processor = "i5";
				this.proPower = 4.00;
			} else if (p.equals("i7")) {
				this.processor = "i7";
				this.proPower = 4.60;
			} else if (p.equals("i9")) {
				this.processor = "i9";
				this.proPower = 3.70;
			}
		}
	}
	
	String getProcessor() {
		return this.processor;
	}
	double getPower() {
		return this.proPower;
	}
	void setCard (String c) {
		if (!c.equals("GTX1060") && !c.equals("GTX1070") && !c.equals("GTX1080")) {
			System.err.println("not valid");	
		} else {
			if (c.equals("GTX1060")) {
				this.graphicsCard = "GTX1060";
				this.resolution = "4k";
			} else if (c.equals("GTX1070")) {
				this.graphicsCard = "i5";
				this.resolution = "4320p";
			} else if (p.equals("GTX1080")) {
				this.processor = "i7";
				this.proPower = 4.60;
			}
	}
}
