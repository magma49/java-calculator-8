package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String input = Console.readLine();

        if (input.length() == 0) {
            System.out.println("결과 : 0");
        } else if (input.charAt(0) == '/' && input.charAt(1) == '/') {
            int idx = input.indexOf("\\n");
            String custom = ",|:";
            for (char c : input.substring(2, idx).toCharArray()) {
                if (c == '.') {
                    custom += "|" + "\\" + c;
                } else {
                    custom += "|" + c;
                }
            }
            String arr[] = input.substring(idx + 2).split(custom);
            int num = 0;
            for (String cut : arr) {
                try {
                    if (cut.isEmpty()) {
                        continue;
                    }
                    if (Integer.parseInt(cut) < 0) {
                        throw new IllegalArgumentException("잘못된 입력");
                    }
                    num += Integer.parseInt(cut);
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("잘못된 입력");
                }
            }
            System.out.println("결과 : " + num);
        } else {
            String arr[] = input.split(",|:");
            int num = 0;
            for (String cut : arr) {
                try {
                    if (cut.isEmpty()) {
                        continue;
                    }
                    if (Integer.parseInt(cut) < 0) {
                        throw new IllegalArgumentException("잘못된 입력");
                    }
                    num += Integer.parseInt(cut);
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("잘못된 입력");
                }
            }
            System.out.println("결과 : " + num);
        }

    }
}
