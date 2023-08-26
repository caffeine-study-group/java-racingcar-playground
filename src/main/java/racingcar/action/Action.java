package racingcar.action;

import racingcar.Location;

@FunctionalInterface
public interface Action {
    void action(Location location);
}
