package racingcar.domain;

import racingcar.domain.action.Action;

import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    private final List<Car> carList;
    public Cars(CarNames carNames) {
        this.carList =  carNames.getList().stream().map(RacingCar::new).collect(Collectors.toList());
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void racing(Action action) {
        for (Car car : carList) {
            car.move(action);
        }
    }


    public Car entryNumber(int index){
        return carList.get(index);
    }

}
