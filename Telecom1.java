package interfaceconcept;

public class Telecom1 implements Telecummunication, Telecom {

	@Override
	public void call() {
		System.out.println("Telecom......call");
		
	}

	@Override
	public void video() {
		System.out.println("Telecom......video");
		
	}

	@Override
	public void text() {
		System.out.println("Telecom..... text");
		
	}

	@Override
	public void Tmobile() {
		System.out.println("Telecommunition...Tmobile");
		
	}

	@Override
	public void Simplemobile() {
		System.out.println("Telecommution...Simplemobile");
		
	}

	@Override
	public void verizonmobile() {
		System.out.println("tel...Verizonmobile");
		
	}

}
