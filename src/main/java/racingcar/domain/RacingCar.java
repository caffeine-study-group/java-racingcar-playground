package racingcar.domain;

import racingcar.domain.action.Action;

public class RacingCar implements Car {

    private static final int START_LOCATION = 0;

    private final CarName carName;

    private Location location;

    public RacingCar(CarName carName) {
        this.carName = carName;
        this.location = new Location(START_LOCATION);
    }

    @Override
    public void move(Action action) {
        action.action(location);
    }

    @Override
    public Location getLocation() {
        return location;
    }

    @Override
    public CarName getCarName() {
        return this.carName;
    }
}
