package racingcar.domain.action;

import racingcar.domain.Location;

@FunctionalInterface
public interface Action {
    void action(Location location);
}
