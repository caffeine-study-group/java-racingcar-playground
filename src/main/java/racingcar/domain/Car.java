package racingcar.domain;

import racingcar.domain.action.Action;

public interface Car {
    void move(Action action);

    Location getLocation();

    CarName getCarName();
}
