public class Passenger {

    // Instance variables
    private String passengerName;
    private String passengerCruise;
    private String passengerRoomType;


    // Constructor - default
    Passenger() {
    }

    // Constructor - full
    Passenger(String pName, String pCruise, String pRoomType) {
        passengerName = pName;
        passengerCruise = pCruise;
        passengerRoomType = pRoomType; // should be BAL, OV, STE, or INT
    }

    // Accessors
    public String getPassengerName() {
        return passengerName;
    }

    public String getPassengerCruise() {
        return passengerCruise;
    }

    public String getPassengerRoomType() {
        return passengerRoomType;
    }

    // Mutators
    public void setPassengerName(String tVar) {
        passengerName = tVar;
    }

    public void setPassengerCruise(String tVar) {
        passengerCruise = tVar;
    }

    public void setPassengerRoomType(String tVar) {
        passengerRoomType = tVar;
    }

    // print method
    public void printPassenger() {
        int spaceCount;
        String spaces1 = "";
        String spaces2 = "";
        spaceCount = 20 - passengerName.length();
        for (int i = 1; i <= spaceCount; i++) {
            spaces1 = spaces1 + " ";
        }
        spaceCount = 20 - passengerCruise.length();
        for (int i = 1; i <= spaceCount; i++) {
            spaces2 = spaces2 + " ";
        }

        System.out.println(passengerName + spaces1 + passengerCruise + spaces2 +
                passengerRoomType);
    }

    // method added to print passenger's name vice memory address
    @Override
    public String toString() {
        return passengerName;
    }

}
