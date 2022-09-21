package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();

    public String getRandomColor() {
        int colorIndex = random.nextInt(Color.values().length - 1);
        return Color.values()[colorIndex].name();
    }
}