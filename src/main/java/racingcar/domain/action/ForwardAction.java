package racingcar.domain.action;

import racingcar.domain.Location;

public class ForwardAction implements Action {


    @Override
    public void action(Location location) {
        location.forward();
    }
}
