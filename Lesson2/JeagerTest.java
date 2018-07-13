public class JeagerTest {
	public static void main(String[] args) {
		Jeager jeagerOne = new Jeager();
		Jeager jeagerTwo = new Jeager();

		jeagerOne.setModelName("Saber Athena");
		jeagerOne.setMark("Mark-7");
		jeagerOne.setStatus("Destroyed");
		jeagerOne.setHeight(252);
		jeagerOne.setWeight(1628);
		jeagerOne.setWeapon("Ionic Twinblades, N-16 Particle Charger");
		jeagerOne.setEquipment("Conn-Pod Chamber, X-411 Supermetal Body Work, RG-28 Accelerator Limbs");

		jeagerTwo.setModelName("November Ajax");
		jeagerTwo.setMark("Mark-6");
		jeagerTwo.setStatus("Destroyed");
		jeagerTwo.setHeight(259);
		jeagerTwo.setWeapon("Grappling Hook Cables");

		jeagerOne.drift();
		jeagerTwo.move();

		System.out.println(jeagerOne);
		System.out.println(jeagerTwo);
	}
	
}