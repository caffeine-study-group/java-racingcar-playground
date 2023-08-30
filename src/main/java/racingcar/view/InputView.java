package racingcar.view;

import java.util.Scanner;

public class InputView {

    private final Scanner scanner;

    private static final String RACING_CAR_START_MESSAGE = "경주할 자동차 이름을 입력하세요. \n(이름은 쉼표(,)를 기준으로 구분)." ;

    private static final String GAME_LAPS_MESSAGE = "시도할 회수는 몇회인가요?";

    public InputView() {
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println(RACING_CAR_START_MESSAGE);
    }

    public String readCarNames() {
        return scanner.nextLine();
    }

    public void printTryCountReadMsg() {
        System.out.println(GAME_LAPS_MESSAGE);
    }

    public int readTryCount() {
        return scanner.nextInt();
    }

}
