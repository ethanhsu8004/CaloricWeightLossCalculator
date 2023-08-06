package main.entities;
/**
 * Different activity level correspond to different factors
 */
public enum ActivityLevel {
    SEDENTARY(1.2),
    LIGHTLY_ACTIVE(1.375),
    MODERATELY_ACTIVE(1.55),
    VERY_ACTIVE(1.725),
    EXTRA_ACTIVE(1.9);

    private final double value;

    ActivityLevel(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}