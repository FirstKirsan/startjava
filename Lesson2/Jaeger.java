public class Jaeger {
	private String modelName;
	private String mark;
	private String status;
	private float height;
	private float weight;
	private String weapon;
	private String equipment;

	public Jaeger(String modelName, String mark, String status, float height, String weapon) {
		this.modelName = modelName;
		this.mark = mark;
		this.status = status;
		this.height = height;
		this.weapon = weapon;
	}

	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public String getEquipment() {
		return equipment;
	}
	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	public boolean drift() {
		System.out.println("Вы вошли в дрифт");
		return true;
	}
	public void move() {
		System.out.println("Вы прошли 7 шагов");
	}
	public String scanKaiju() {
		return "nothing";
	}

	public String toString() {
		return "modelName: " + modelName + "; Mark: " + mark + "; Status: " + status + "; Height: " + height + "; Weapon: " + weapon;
	}


}