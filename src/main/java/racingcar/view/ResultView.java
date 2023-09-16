package racingcar.view;

import racingcar.domain.*;

public class ResultView {
    private static final String EXECUTE_RESULT_MESSAGE = "실행 결과";
    private static final String GAME_RESULT_MESSAGE = "%s가 최종 우승했습니다.";
    private static final String PROCESS_MESSAGE = "%s : %s";
    private static final String ENTER = "%n";

    private final Lap lap;

    public ResultView(Lap lap) {
        this.lap = lap;
    }

    public void printExecuteResultMessage() {
        System.out.println(EXECUTE_RESULT_MESSAGE);
    }

    public void printProcessMessage(Car car, String processBar) {
        System.out.printf((PROCESS_MESSAGE) + "%n", car.getCarName(), processBar);
    }

    public void printGameResult(CarNames racingCarName) {
        System.out.printf((GAME_RESULT_MESSAGE) + "%n", racingCarName);
    }

    public void printCurrentGrid(Cars cars) {
        for (Car car : cars.getCarList()) {
            this.printProcessMessage(car, this.printProcessBar(car.getLocation()));
        }
        this.printEnter();
    }

    private String printProcessBar(Location location) {
        return lap.getProgressBar(location);
    }

    public void printEnter(){
        System.out.printf(ENTER);
    }

}
