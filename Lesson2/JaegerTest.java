public class JaegerTest {
	public static void main(String[] args) {
		Jaeger jaegerOne = new Jaeger("Saber Athena", "Mark-7", "Destroyed", 252, "Ionic Twinblades, N-16 Particle Charger");
		jaegerOne.setWeight(1628);
		jaegerOne.setEquipment("Conn-Pod Chamber, X-411 Supermetal Body Work, RG-28 Accelerator Limbs");
		
		Jaeger jaegerTwo = new Jaeger("November Ajax", "Mark-6", "Destroyed", 259, "Grappling Hook Cables");

		jaegerOne.drift();
		jaegerTwo.move();

		System.out.println(jaegerOne);
		System.out.println(jaegerTwo);
	}
	
}