
public class VinylHouse extends House {

	@Override
	public void installDrywall() {
		// TODO Auto-generated method stub
		System.out.println("Drywall: Creating the interior walls.");
	}

	@Override
	public void addElectrical() {
		// TODO Auto-generated method stub
		System.out.println("Electrical: Running all "
				+ "the wires and hooking up the power.");
	}

	@Override
	public void addPlumbing() {
		// TODO Auto-generated method stub
		System.out.println("Plumbing: Letting "
				+ "water run throug the house.");
	}
	
	public void createFrame( ) {
		System.out.println("Framing:  Adding the vinyl walls.");
	}

}
