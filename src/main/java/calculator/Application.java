package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String input = Console.readLine();

        if (input.length() == 0) {
            System.out.println("결과 : 0");
        } else {
            String arr[] = input.split(",|:");
            int num = 0;
            for (String cut : arr) {
                num += Integer.parseInt(cut);
            }
            System.out.println("결과 : " + num);
        }

    }
}
