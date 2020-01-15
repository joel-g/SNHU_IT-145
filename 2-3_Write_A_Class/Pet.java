
public class Pet {
	private String petType;
	private String petName;
	private int petAge;
	private String catSpace; // there is no indication what data catSpace represents so I just guessed that string would be ok
	private String dogSpace; 
	private int daysStay;
	private int amountDue;
	
	public Pet() {
		petType = "unknown";
		petName = "unknown";
		petAge = 0;
		catSpace = "none";
		dogSpace = "none";
		daysStay = 0;
		amountDue = 0;
	}
	
	// getters
	public String getPetType() {
		return petType;
	}
	
	public String getPetName() {
		return petName;
	}
	
	public int getPetAge() {
		return petAge;
	}
	
	public String getCatSpace() {
		return catSpace;
	}
	
	public String getDogSpace() {
		return dogSpace;
	}
	
	public int getDaysStay() {
		return daysStay;
	}
	
	public int getAmountDue() {
		return amountDue;
	}

	// setters
	public void setPetType(String type) {
		petType = type;
	}
	
	public void setPetName(String name) {
		petName = name;
	}
	
	public void setPetAge(int age) {
		petAge = age;
	}
	
	public void setCatSpace(String space) {
		catSpace = space;
	}
	
	public void setDogSpace(String space) {
		dogSpace = space;
	}
	
	public void setDaysStay(int stay) {
		daysStay = stay;
	}
	
	public void setAmountDue(int amount) {
		amountDue = amount;
	}
	
	// custom methods that the rubric gives no indication what they should do so are empty
	public static void checkIn() {
		
	}
	
	public static void checkOut() {
		
	}

	public static void getPet() {
		
	}

	public static void createPet() {
		
	}
	
	public static void updatePet() {
		
	}
	
}
