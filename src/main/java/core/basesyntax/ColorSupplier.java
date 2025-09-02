package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        Random random = new Random();
        Colors color = Colors.values()[random.nextInt(Colors.values().length)];
        return color.name();
    }
}
