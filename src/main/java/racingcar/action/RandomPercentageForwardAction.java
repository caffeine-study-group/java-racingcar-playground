package racingcar.action;

import racingcar.Location;

import java.util.Random;

public class RandomPercentageForwardAction implements Action {

    private static final int MIN_MOVE_VALUE= 4;
    private static final int MAX_MOVE_VALUE= 9;

    private final Random random;

    public RandomPercentageForwardAction() {
        this.random = new Random();
    }

    public int getRandom() {
        return random.nextInt(MAX_MOVE_VALUE);
    }

    @Override
    public void action(Location location) {
        if (MIN_MOVE_VALUE <= getRandom()) {
            location.forward();
        }
    }
}
