package src.Task10;

public class Room {
    private String typeOfRoom;
    private String colorOfRoom;
    private int numberOfTables;
    private int numberOfWindows;
    private int numberOfChairs;
    private int numberOfWardrobe;

    public Room(final String typeOfRoom, final String colorOfRoom, final int numberOfTables, final int numberOfWindows, final int numberOfChairs, final int numberOfWardrobe) {
        this.typeOfRoom = typeOfRoom;
        this.colorOfRoom = colorOfRoom;
        this.numberOfTables = numberOfTables;
        this.numberOfWindows = numberOfWindows;
        this.numberOfChairs = numberOfChairs;
        this.numberOfWardrobe = numberOfWardrobe;
    }

    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setTypeOfRoom(final String typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    public String getColorOfRoom() {
        return colorOfRoom;
    }

    public void setColorOfRoom(final String colorOfRoom) {
        this.colorOfRoom = colorOfRoom;
    }

    public int getNumberOfTables() {
        return numberOfTables;
    }

    public void setNumberOfTables(final int numberOfTables) {
        this.numberOfTables = numberOfTables;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public void setNumberOfWindows(final int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

    public int getNumberOfChairs() {
        return numberOfChairs;
    }

    public void setNumberOfChairs(final int numberOfChairs) {
        this.numberOfChairs = numberOfChairs;
    }

    public int getNumberOfWardrobe() {
        return numberOfWardrobe;
    }

    public void setNumberOfWardrobe(final int numberOfWardrobe) {
        this.numberOfWardrobe = numberOfWardrobe;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Room room)) return false;

        if (getNumberOfTables() != room.getNumberOfTables()) return false;
        if (getNumberOfWindows() != room.getNumberOfWindows()) return false;
        if (getNumberOfChairs() != room.getNumberOfChairs()) return false;
        if (getNumberOfWardrobe() != room.getNumberOfWardrobe()) return false;
        if (getTypeOfRoom() != null ? !getTypeOfRoom().equals(room.getTypeOfRoom()) : room.getTypeOfRoom() != null)
            return false;
        return getColorOfRoom() != null ? getColorOfRoom().equals(room.getColorOfRoom()) : room.getColorOfRoom() == null;
    }

    @Override
    public int hashCode() {
        int result = getTypeOfRoom() != null ? getTypeOfRoom().hashCode() : 0;
        result = 31 * result + (getColorOfRoom() != null ? getColorOfRoom().hashCode() : 0);
        result = 31 * result + getNumberOfTables();
        result = 31 * result + getNumberOfWindows();
        result = 31 * result + getNumberOfChairs();
        result = 31 * result + getNumberOfWardrobe();
        return result;
    }

    @Override
    public String toString() {
        return "Room{" +
                "typeOfRoom='" + typeOfRoom + '\'' +
                ", colorOfRoom='" + colorOfRoom + '\'' +
                ", numberOfTables=" + numberOfTables +
                ", numberOfWindows=" + numberOfWindows +
                ", numberOfChairs=" + numberOfChairs +
                ", numberOfWardrobe=" + numberOfWardrobe +
                '}';
    }
}
