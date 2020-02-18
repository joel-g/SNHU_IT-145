public class Ship {

    // Instance Variables
    private String shipName;
    private int roomBalcony;
    private int roomOceanView;
    private int roomSuite;
    private int roomInterior;
    private boolean inService;

    // Constructor - default
    Ship() {
    }

    // Constructor - full
    Ship(String tName, int tBalcony, int tOceanView,
         int tSuite, int tInterior, boolean tInService) {
        shipName = tName;
        roomBalcony = tBalcony;
        roomOceanView = tOceanView;
        roomSuite = tSuite;
        roomInterior = tInterior;
        inService = tInService;
    }

    // Accessors
    public String getShipName() {
        return shipName;
    }

    public int getRoomBalcony() {
        return roomBalcony;
    }

    public int getRoomOceanView() {
        return roomOceanView;
    }

    public int getRoomSuite() {
        return roomSuite;
    }

    public int getRoomInterior() {
        return roomInterior;
    }

    public boolean getInService() {
        return inService;
    }

    // Mutators
    public void setShipName(String tVar) {
        shipName = tVar;
    }

    public void setRoomBalcony(int tVar) {
        roomBalcony = tVar;
    }

    public void setRoomOceanView(int tVar) {
        roomOceanView = tVar;
    }

    public void setRoomSuite(int tVar) {
        roomSuite = tVar;
    }

    public void setRoomInterior(int tVar) {
        roomInterior = tVar;
    }

    public void setInService(boolean tVar) {
        inService = tVar;
    }

    // print method
    public void printShipData() {
        int spaceCount;
        String spaces = "";
        spaceCount = 20 - shipName.length();

        for (int i = 1; i <= spaceCount; i++) {
            spaces = spaces + " ";
        }

        System.out.println(shipName + spaces + roomBalcony + "\t" +
                roomOceanView + "\t" + roomSuite + "\t" +
                roomInterior + "\t\t" + inService);
    }

    // method added to print ship's name vice memory address
    @Override
    public String toString() {
        return shipName;
    }
}
