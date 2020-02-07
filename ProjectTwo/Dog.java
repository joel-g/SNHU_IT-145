import java.util.Arrays;

public class Dog extends RescueAnimal {

    // Instance variable
    public String breed;

    // Constructor
    public Dog(String breed) {
        this.breed = breed;
    }

    // Accessor Method
    public String getBreed() {
        return breed;
    }

    // Mutator Method
    public void setBreed(String breed) {
        this.breed = breed;
    }

    // used to check is breed is eligible for the rescue program
    public boolean isEligibleBreed(String breed) {
        final String[] validBreeds = {
            "American pit bull terrier",
            "Beagle",
            "Belgian Malinois",
            "Border collie",
            "Bloodhound",
            "Coonhound",
            "English springer spaniel",
            "German shepherd",
            "German shorthaired pointer",
            "Golden retriever",
            "Labrador retriever",
            "Nova Scotia duck tolling retriever",
            "Rough collie",
            "Smooth collie"};
        
        return Arrays.asList(validBreeds).contains(breed);
    }

}
