package src.Task10;

public class Kitchen extends Room {
    private int numberOfFridges;
    private int numberOfOven;

    public Kitchen(final String typeOfRoom, final String colorOfRoom, final int numberOfTables, final int numberOfWindows, final int numberOfChairs, final int numberOfWardrobe, final int numberOfFridges, final int numberOfOven) {
        super(typeOfRoom, colorOfRoom, numberOfTables, numberOfWindows, numberOfChairs, numberOfWardrobe);
        this.numberOfFridges = numberOfFridges;
        this.numberOfOven = numberOfOven;
    }

    public int getNumberOfFridges() {
        return numberOfFridges;
    }

    public void setNumberOfFridges(final int numberOfFridges) {
        this.numberOfFridges = numberOfFridges;
    }

    public int getNumberOfOven() {
        return numberOfOven;
    }

    public void setNumberOfOven(final int numberOfOven) {
        this.numberOfOven = numberOfOven;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Kitchen kitchen)) return false;
        if (!super.equals(o)) return false;

        if (getNumberOfFridges() != kitchen.getNumberOfFridges()) return false;
        return getNumberOfOven() == kitchen.getNumberOfOven();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getNumberOfFridges();
        result = 31 * result + getNumberOfOven();
        return result;
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "numberOfFridges=" + numberOfFridges +
                ", numberOfOven=" + numberOfOven + super.toString() +
                '}';
    }
}
