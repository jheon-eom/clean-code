package com.read.cleancode._01_method;

public class Printer {

    /**
     * 해당 메서드는 너무 많은 내용을 담고 있음
     * 1. 유효성 검사를 하고
     * 2. 서비스가 되는 학교인지를 검사하고
     * 3. 해당 학교에 맞는 서비스를 리턴함
     * 메서드 내의 코드 수는 짧으면 짧을수록 좋음 !!!!
     */
    public String printing(String name) throws Exception {
        // 유효성 검사에 실패할 경우 예외 발생
        if (name == null && name.isEmpty()) {
            throw new Exception("유효성 검사 실패 !!!");
        }

        // A, B, C 클래스 안에 속해 있을 경우
        String[] schools = new String[3];
        schools[0] = "A";
        schools[1] = "B";
        schools[2] = "C";
        for(String s : schools) {
            if (!s.contains(name)) {
                throw new Exception("해당 학교가 아님 !!!");
            }
        }

        // 속해있는 학교에 따라 다른 문자를 리턴
        if ("A".equals(name)) {
            return "AAA";
        } else if ("B".equals(name)) {
            return "BBB";
        } else {
            return "CCC";
        }
    }

    /**
     * 역할을 나눠서 메서드를 생성..
     * 이게 맞을까..?!!
     */
    public String printing2(String name) throws Exception {
        isName(name);
        isIncludeSchool(name);

        if ("A".equals(name)) {
            return "AAA";
        } else if ("B".equals(name)) {
            return "BBB";
        } else {
            return "CCC";
        }
    }

    private boolean isIncludeSchool(String name) throws Exception {
        String[] schools = new String[3];
        schools[0] = "A";
        schools[1] = "B";
        schools[2] = "C";
        for(String s : schools) {
            if (!s.contains(name)) {
                throw new Exception("해당 학교가 아님 !!!");
            }
        }

        return true;
    }

    private boolean isName(String name) throws Exception {
        if (name == null && name.isEmpty()) {
            throw new Exception("유효성 검사 실패 !!!");
        }

        return true;
    }

}
