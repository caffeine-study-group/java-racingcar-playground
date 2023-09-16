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

    public CarNames findWinners() {
        Location topRecord = findMaxLocation();
        String winners = carList.stream().filter(car -> topRecord.equals(car.getLocation())).map(car -> car.getCarName().getCarName()).collect(Collectors.joining(","));
        return CarNames.from(winners);
    }

    private Location findMaxLocation() {
        Location maxLocation = new Location(0);
        for (Car car : carList) {
            maxLocation = car.getLocation().getMaxLocation(maxLocation);
        }

        return maxLocation;
    }
}
