package version1;

public class Home {
    private int namOfFloors;
    private String address;
    private boolean openDoor;

    public Home(){

    }

    public Home(int namOfFloors, String address){
        this.namOfFloors = namOfFloors;
        this.address = address;
    }

    public void setAddress (String address) {
        this.address = address;
    }

    public String getAddress () {
        return address;
    }

    public void setNamOfFloors (int namOfFloors) {
        this.namOfFloors = namOfFloors;
    }

    public int getNamOfFloors () {
        return namOfFloors;
    }

    public void setOpenDoor (boolean openDoor) {
        this.openDoor = openDoor;
    }

    public boolean isOpenDoor () {
        return openDoor;
    }
}


