package L02_Encapsulation.b_exercise.P01_ClassBoxDataValidation;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    private void setLength(double length) {
        checkIsNegativeOrZero(length, "Length");

        this.length = length;
    }

    private void setWidth(double width) {
        checkIsNegativeOrZero(width, "Width");

        this.width = width;
    }

    private void setHeight(double height) {
        checkIsNegativeOrZero(height, "Height");

        this.height = height;
    }

    public double calculateSurfaceArea() {
        return 2 * (this.length * this.width
                + this.length * this.height +
                this.width * this.height);
    }

    public double calculateLateralSurfaceArea() {
        return 2 * (this.length * this.height +
                this.width * this.height);
    }

    public double calculateVolume() {
        return this.length * this.width * this.height;
    }

    private void checkIsNegativeOrZero(double side, String typeSide) {
        if (side <= 0) {
            throw new IllegalArgumentException(String.format("%s cannot be zero or negative.", typeSide));
        }
    }
}
