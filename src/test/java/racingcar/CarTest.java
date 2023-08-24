package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    void 이름을_가진_자동차_만들기_테스트() {
        Car car = new Car(new CarName("레몽붕붕이"));
        assertThat(car).isNotNull();
    }

}
