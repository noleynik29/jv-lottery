package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        Ball ball = new Ball();
        Random rand = new Random();

        ball.setColor(ColorSupplier.getRandomColor());
        ball.setNumber(rand.nextInt(100));

        return ball;
    }
}
