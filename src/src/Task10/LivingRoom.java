package src.Task10;

public class LivingRoom extends Room{
    private int numberOfTVs;
    private int numberOfSovas;

    public LivingRoom(final String typeOfRoom, final String colorOfRoom, final int numberOfTables, final int numberOfWindows, final int numberOfChairs, final int numberOfWardrobe, final int numberOfTVs, final int numberOfSovas) {
        super(typeOfRoom, colorOfRoom, numberOfTables, numberOfWindows, numberOfChairs, numberOfWardrobe);
        this.numberOfTVs = numberOfTVs;
        this.numberOfSovas = numberOfSovas;
    }

    public int getNumberOfTVs() {
        return numberOfTVs;
    }

    public void setNumberOfTVs(final int numberOfTVs) {
        this.numberOfTVs = numberOfTVs;
    }

    public int getNumberOfSovas() {
        return numberOfSovas;
    }

    public void setNumberOfSovas(final int numberOfSovas) {
        this.numberOfSovas = numberOfSovas;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof LivingRoom that)) return false;
        if (!super.equals(o)) return false;

        if (getNumberOfTVs() != that.getNumberOfTVs()) return false;
        return getNumberOfSovas() == that.getNumberOfSovas();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getNumberOfTVs();
        result = 31 * result + getNumberOfSovas();
        return result;
    }

    @Override
    public String toString() {
        return "LivingRoom{" +
                "numberOfTVs=" + numberOfTVs +
                ", numberOfSovas=" + numberOfSovas + super.toString() +
                '}';
    }
}
