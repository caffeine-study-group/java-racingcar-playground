package racingcar.view;

public class ResultView {
    private static final String EXECUTE_RESULT_MESSAGE = "실행 결과";
    private static final String GAME_RESULT_MESSAGE = "%s가 최종 우승했습니다.";
    private static final String PROCESS_MESSAGE = "%s : %s";

    public void printExecuteResultMessage() {
        System.out.println(EXECUTE_RESULT_MESSAGE);
    }

    public void printProcessMessage(String racingCarName, String processBar) {
        System.out.printf((PROCESS_MESSAGE) + "%n", racingCarName, processBar);
    }

    public void printGameResult(String racingCarName) {
        System.out.printf((GAME_RESULT_MESSAGE) + "%n", racingCarName);
    }
}
