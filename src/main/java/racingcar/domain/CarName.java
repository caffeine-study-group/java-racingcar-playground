package racingcar.domain;

public class CarName {

    private static final int CAR_NAME_LENGTH_LIMIT_POLICY = 5;
    private static final String CAR_NAME_LENGTH_ERROR_MESSAGE = "[ERROR] 자동차의 이름이 올바르지 않습니다.";

    private final String carName;

    public CarName(String carName) {
        isValidCarName(carName);
        this.carName = carName;
    }

    private void isValidCarName(String inputCartName){
        if (inputCartName == null || inputCartName.trim().isEmpty() || inputCartName.length() > CarName.CAR_NAME_LENGTH_LIMIT_POLICY){
            throw new IllegalArgumentException(CarName.CAR_NAME_LENGTH_ERROR_MESSAGE);
        }
    }

    public String getCarName() {
        return carName;
    }
}
