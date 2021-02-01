package OOPSConcept;

public class FortisHospital implements INMedical, UKMedical, USMedical {

	@Override
	public void emergencyServices() {
		System.out.println("FH--emergencyServices");
	}

	@Override
	public void medicalInsuranceServices() {
		System.out.println("FH--medicalInsuranceServices");
		
	}

	@Override
	public void boneStructureServices() {
		System.out.println("FH--boneStructureServices");
		
	}

	@Override
	public void orthoServices() {
		System.out.println("FH--orthoServices");
		
	}

	@Override
	public void pediaServices() {
		System.out.println("FH--pediaServices");
		
	}

	@Override
	public void oncologyServices() {
		System.out.println("FH--oncologyServices");
		
	}

	@Override
	public void cardioServices() {
		System.out.println("FH--cardioServices");
		
	}

	@Override
	public void cartilageServices() {
		System.out.println("FH--cartilageServices");
		
	}

	@Override
	public void heartServices() {
		System.out.println("FH--heartServices");
		
	}

	
	public void internalTestMachines() 
	{
		System.out.println("FH--internalTestMachines");
	}
	
	
	
	
}
