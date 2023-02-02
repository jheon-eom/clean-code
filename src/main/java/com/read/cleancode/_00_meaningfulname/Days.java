package com.read.cleancode._00_meaningfulname;

public class Days {

    /**
     * 안 좋은 변수명
     * d는 의미하는 것이 없음
     */
    private int d; // 경과 시간

    /**
     * 좋은 변수명
     * 무엇을 나타내는 변수인지 주석이 없이도 파악할 수 있음
     */
    private int daysSinceCreation;
    private int daySinceModification;

    public Days(int d, int daysSinceCreation, int daySinceModification) {
        this.d = d;
        this.daysSinceCreation = daysSinceCreation;
        this.daySinceModification = daySinceModification;
    }

    public int getD() {
        return d;
    }

    public int getDaysSinceCreation() {
        return daysSinceCreation;
    }

    public int getDaySinceModification() {
        return daySinceModification;
    }
}
