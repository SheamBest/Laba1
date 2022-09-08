package src.Task8;

import java.util.Objects;

public class CustomDouble {
    private int integer;
    private double fraction;

    public int getInteger() {
        return integer;
    }

    public void setInteger(final int integer) {
        this.integer = integer;
    }

    public double getFraction() {
        return fraction;
    }

    public void setFraction(final double fraction) {
        this.fraction = fraction;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final CustomDouble that = (CustomDouble) o;
        return integer == that.integer && Double.compare(that.fraction, fraction) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(integer, fraction);
    }

    public CustomDouble(final int integer, final double decimal) {
        this.integer = integer;
        this.fraction = decimal;
    }

    public CustomDouble(final double result) {
        this.integer = (int) result;
        this.fraction = result - integer;
    }
    public double toDouble() {
        return (double) integer + fraction;
    }
    public CustomDouble addition (final CustomDouble numeric) {
        final double result = this.toDouble() + numeric.toDouble();
        return new CustomDouble(result);
    }


    public CustomDouble subtraction(final CustomDouble numeric) {
        final double result = this.toDouble() - numeric.toDouble();
        return new CustomDouble(result);
    }

    public CustomDouble multiplying(final CustomDouble numeric) {
        final double result = this.toDouble() * numeric.toDouble();
        return new CustomDouble(result);
    }

    public CustomDouble division(final CustomDouble numeric) {
        if (numeric.toDouble() == 0) {
            throw new ArithmeticException("Division by zero is impossible!");
        }
        final double result = this.toDouble() / numeric.toDouble();
        return new CustomDouble(result);
    }

    public String toString() {
        return Double.toString(toDouble());
    }
}
