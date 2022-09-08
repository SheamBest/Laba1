package src.Task10;

import java.util.List;

public class House {
    private List<Room> rooms;
    private String color;
    private String street;

    public House(final List<Room> rooms, final String color, final String street) {
        this.rooms = rooms;
        this.color = color;
        this.street = street;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(final List<Room> rooms) {
        this.rooms = rooms;
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(final String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "House{" +
                "rooms=" + rooms +
                ", color='" + color + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
