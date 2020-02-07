import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.text.SimpleDateFormat;

public class Driver {
    // Instance variables
    static ArrayList<RescueAnimal> rescueAnimals = new ArrayList<RescueAnimal>();

    
    // Method to process request for a rescue animal


    // Method(s) to update information on existing animals



    // Method to display matrix of aninmals based on location and status/training phase



    // Method to add animals
    public static void addAnimal() {
        char animalType = '0';
        Scanner scnr = new Scanner(System.in);
        while (animalType != 'M' && animalType != 'D') { // While loop keeps asking until it gets valid input of M or D
            System.out.println("Add a (D)og or (M)onkey?");
            animalType = Character.toUpperCase(scnr.next().charAt(0)); 
        }
        RescueAnimal newAnimal = new RescueAnimal();
        if (animalType == 'D') {
            newAnimal = getDogInfo();
        } else {
            newAnimal = getMonkeyInfo(newAnimal);
        }
        newAnimal = getCommonInfo(newAnimal);
        
        System.out.println("Thank you. The new animal, "+newAnimal.getName()+ ", was added to the system.");
        return;
    }

    // this method is only called by addAnimal()
    private static Dog getDogInfo() {
        
        HashMap<Integer, String> breeds = new HashMap<>();
        breeds.put(0,"American pit bull terrier");
        breeds.put(1, "Beagle");
        breeds.put(2, "Belgian Malinois");
        breeds.put(3, "Border collie");
        breeds.put(4, "Bloodhound");
        breeds.put(5, "Coonhound");
        breeds.put(6, "English springer spaniel");
        breeds.put(7, "German shepherd");
        breeds.put(8, "German shorthaired pointer");
        breeds.put(9, "Golden retriever");
        breeds.put(10, "Labrador retriever");
        breeds.put(11, "Nova Scotia duck tolling retriever");
        breeds.put(12, "Rough collie");
        breeds.put(13, "Smooth collie");

        String breedListString = "";
        // crafts long string of choices from breeds HashMap
        for (HashMap.Entry<Integer, String> entry : breeds.entrySet()) {
		    breedListString += "(" + entry.getKey() + ") " + entry.getValue()+ "\n";
        }

        // while loop keeps asking for breed until valid selection is made
        int breedSelection = -1;
        Scanner scnr = new Scanner(System.in);
        while (breedSelection < 0 || breedSelection > 13) {
            System.out.println("Select a dog breed:\n"+ breedListString);
            breedSelection = scnr.nextInt();
        }
        Dog dog = new Dog(breeds.get(breedSelection)); // HashMap guarantees only a valid breed is set

        return dog;
    }

    // this method is only called by addAnimal()
    private static Monkey getMonkeyInfo(RescueAnimal animal) {
        Monkey monkey = (Monkey)animal;
        return monkey;
    }

    // this method is only called by addAnimal()
    private static RescueAnimal getCommonInfo(RescueAnimal animal) {
        // The fields not captured in this method are fields that would not necessarily be known at the intake of a new animalß
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter name:");
        animal.setName(scnr.nextLine());
        
        System.out.println("Enter gender: (M or F)");
        animal.setGender(scnr.nextLine());
        
        System.out.println("Enter age in years");
        animal.setAge(scnr.nextInt());

        System.out.println("Enter weight in pounds (may use decimals)");
        animal.setWeight(scnr.nextFloat());

        System.out.println("Enter acquisition date in this format: EEE MMM dd hh:mm:ss z yyyy"); 
        String acqDate = scnr.nextLine();
        SimpleDateFormat inDateFormat = new SimpleDateFormat(acqDate);
        animal.setAcquisitionDate(inDateFormat);

        System.out.println("Enter acquistion source:");
        animal.setAcquisitionSource(scnr.nextLine());

        System.out.println("Enter new training location");
        animal.setTrainingLocation(scnr.nextLine());

        return animal;
    }

     public static void main(String[] args) {
        // Create New Dog - EXAMPLE
        Dog daisy = new Dog("American pit bull terrier");
        daisy.setName("Daisy");
        daisy.setAge(4);
        daisy.setGender("F");
        daisy.setInServiceCity("Seattle");
        rescueAnimals.add(daisy);

        // Create New Monkey - EXAMPLE
        Monkey ivan = new Monkey("Tamarin");
        ivan.setAge(6);
        ivan.setGender("M");
        ivan.setInServiceCity("Tacoma");
        rescueAnimals.add(ivan);


        // Add an animal - this will call other functions to gather all the info about a new animal 
        addAnimal();
    }
}
