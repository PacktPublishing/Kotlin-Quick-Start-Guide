package quickstart.kotlin.chapter6;

public class JavaLength {

    private final double value;

    public JavaLength(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public JavaLength plus(JavaLength other) {
        return new JavaLength(this.value + other.getValue());
    }
}
