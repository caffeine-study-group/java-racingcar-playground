package racingcar;

import racingcar.action.Action;

public interface Car {
    void move(Action action);

    Location getLocation();
}
