
public abstract class House {
	public void prepFoundation() {
		System.out.println("Foundation: Adding a "
				+ "crawlspace, and a strong backbone.");
	}
	public void createFrame() {
		
	}
	public abstract void installDrywall(); 
	
	public void addWindows() {
		System.out.println("Windows: Putting in the glass for the windows.");
	}
	public abstract void addElectrical();
	
	public abstract void addPlumbing();
	public void buildHouse() {
		prepFoundation();
		createFrame();
		installDrywall();
		addWindows();
		addElectrical();
		addPlumbing();
	}

}
