package racingcar;

import racingcar.domain.*;
import racingcar.domain.action.RandomPercentageForwardAction;
import racingcar.view.InputView;
import racingcar.view.ResultView;

public class Game {

    public Game(){ }

    public static void start(){
        InputView inputView = new InputView();

        inputView.start();

        CarNames carNames = CarNames.from(inputView.readCarNames());
        Cars cars = new Cars(carNames);

        inputView.printTryCountReadMsg();
        Lap lap = new Lap(inputView.readTryCount());

        ResultView resultView = new ResultView(lap);
        resultView.printEnter();
        resultView.printExecuteResultMessage();

        while (lap.isOnTheRacing()) {
            cars.racing(new RandomPercentageForwardAction());
            lap.tryLap();

            resultView.printCurrentGrid(cars);
        }

        CarNames winners = cars.findWinners();
        resultView.printGameResult(winners);

    }
}
