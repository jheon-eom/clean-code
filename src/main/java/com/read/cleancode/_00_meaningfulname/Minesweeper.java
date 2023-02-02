package com.read.cleancode._00_meaningfulname;

import java.util.ArrayList;
import java.util.List;

/**
 * 지뢰찾기 클래스
 */
public class Minesweeper {

    /**
     * 메서드가 무슨 일을 하는지 짐작하기 어렵다.
     */
    public List<int[]> getThem() {
        List<int[]> list1 = new ArrayList<>();
        List<int[]> theList = new ArrayList<>();

        for (int[] x : theList) {
            if (x[0] == 4) {
                list1.add(x);
            }
        }

        return list1;
    }

//    public List<int[]> getFlaggedCells() {
//        List<int[]> flaggedCells = new ArrayList<>();
//
//        for (int[] cell : gameBoard) {
//            if (cell[STATUS_VALUE] == FLAGGED) {
//                flaggedCells.add(cell);
//            }
//        }
//
//        return flaggedCells;
//    }

    /**
     * 이름만으로도 무슨 일을 하는지 짐작할 수 있다.
     */
    public List<Cell> getFlaggedCells() {
        List<Cell> flaggedCells = new ArrayList<>();
        List<Cell> gameBoard = new ArrayList<>();

        for (Cell cell : gameBoard) {
            if (cell.isFlagged()) {
                flaggedCells.add(cell);
            }
        }

        return flaggedCells;
    }

}

class Cell {

    public boolean isFlagged() {

        return true;
    }

}