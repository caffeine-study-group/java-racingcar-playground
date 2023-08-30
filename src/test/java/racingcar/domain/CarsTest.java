package racingcar.domain;

import org.junit.jupiter.api.Test;
import racingcar.domain.action.Action;
import racingcar.domain.action.RandomPercentageForwardActionFake;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarsTest {
    @Test
    void 카들_테스트() {
        String carNames = "pobi,crong,honux";
        Cars cars = new Cars(CarNames.from(carNames));

        assertThat(cars).isNotNull();
    }

    @Test
    void 한_바퀴_레이싱_테스트() {
        String carNames = "pobi,crong";
        Cars cars = new Cars(CarNames.from(carNames));

        Action randomPercentageForwardAction = new RandomPercentageForwardActionFake();
        cars.racing(randomPercentageForwardAction);

        List<Car> expected = cars.getCarList();

        assertEquals(new Location(0), cars.entryNumber(0).getLocation());
        assertEquals(new Location(1), cars.entryNumber(1).getLocation());
    }
}
