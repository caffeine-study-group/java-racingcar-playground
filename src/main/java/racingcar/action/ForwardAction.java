package racingcar.action;

import racingcar.Location;

public class ForwardAction implements Action {


    @Override
    public void action(Location location) {
        location.forward();
    }
}
