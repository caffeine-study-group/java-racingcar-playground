package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.action.ForwardAction;
import racingcar.action.RandomPercentageForwardAction;
import racingcar.action.RandomPercentageForwardActionFake;
import racingcar.action.StopAction;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class RacingCarTest {

    private Car car;

    @BeforeEach
    void setUp() {
        car = new RacingCar(new CarName("레몽붕붕이"));
    }

    @Test
    void 이름을_가진_자동차_만들기_테스트() {
        assertThat(car).isNotNull();
    }

    @Test
    void 자동차의_전진을_테스트() {
        car.move(new ForwardAction());
        assertEquals(new Location(1), car.getLocation());
        assertNotEquals(new Location(0), car.getLocation());
    }

    @Test
    void 자동차의_정지를_테스트() {
        car.move(new StopAction());
        assertEquals(new Location(0), car.getLocation());
        assertNotEquals(new Location(1), car.getLocation());
    }

    @Test
    void 자동차의_랜덤_동작을_테스트() {
        RandomPercentageForwardAction randomPercentageForwardAction = new RandomPercentageForwardActionFake();
        car.move(randomPercentageForwardAction);
        assertEquals(new Location(0), car.getLocation());
        car.move(randomPercentageForwardAction);
        assertEquals(new Location(1), car.getLocation());
    }

}
