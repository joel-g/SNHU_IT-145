import java.util.Arrays;

public class Monkey extends RescueAnimal {

    // Instance Variables
    private String species;

    private float tailLengthCM;
    private float heightCM;
    private float bodyLengthCM;
    private float torsoCM;
    private float skullCM;
    private float neckCM;


    // Accessors and mutators
    
	public String getSpecies() {
		return this.species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public float getTailLengthCM() {
		return this.tailLengthCM;
	}

	public void setTailLengthCM(float centimeters) {
		this.tailLengthCM = centimeters;
	}

	public float getHeightCM() {
		return this.heightCM;
	}

	public void setHeightCM(float centimeters) {
		this.heightCM = centimeters;
	}

	public float getBodyLengthCM() {
		return this.bodyLengthCM;
	}

	public void setBodyLengthCM(float centimeters) {
		this.bodyLengthCM = centimeters;
	}

	public float getTorsoCM() {
		return this.torsoCM;
	}

	public void setTorsoCM(float centimeters) {
		this.torsoCM = centimeters;
	}

	public float getSkullCM() {
		return this.skullCM;
	}

	public void setSkullCM(float centimeters) {
		this.skullCM = centimeters;
	}

	public float getNeckCM() {
		return this.neckCM;
	}

	public void setNeckCM(float centimeters) {
		this.neckCM = centimeters;
	}


    // Constructor
    public Monkey(String species) {
		this.species = species;
    }

	// used to check is species is eligible for the rescue program
    public boolean isEligibleSpecies(String species) {
        final String[] validSpecies = {
			"Capuchin",
			"Guenon",
			"Macaque",
			"Marmoset",
			"Squirrel monkey",
			"Tamarin"
		};
        
        return Arrays.asList(validSpecies).contains(species);
    }

}
