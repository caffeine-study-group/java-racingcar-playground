package racingcar.domain;

import org.junit.jupiter.api.Test;

public class CarsTest {
    @Test
    void 카들_테스트() {
        String carNames = "pobi,crong,honux";
        Cars cars = new Cars(CarNames.from(carNames));

        assertThat(cars);
    }
}
