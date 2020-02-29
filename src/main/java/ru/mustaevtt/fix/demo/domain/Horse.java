package ru.mustaevtt.fix.demo.domain;

public class Horse extends ChessboardSquare {

    protected int horseSteps = 0;
    private int minDistance = 5;

    public Horse(String startSquare, Chessboard chessboard) {
        super(startSquare, chessboard);
    }

    public void move(Vector directionVector) {
        if (isOnBoard(super.getX() + directionVector.getStepX(), super.getY() + directionVector.getStepY())) {
            super.updateCoordinate(super.getX() + directionVector.getStepX(), super.getY() + directionVector.getStepY());
            this.horseSteps++;
        } else if (isOnBoard(super.getX() + directionVector.getStepY(), super.getY() + directionVector.getStepX())) {
            super.updateCoordinate(getX() + directionVector.getStepY(), super.getY() + directionVector.getStepX());
            this.horseSteps++;
        }
    }

    public boolean isFarFromEndSquare(Vector directionVector, EndSquare endSquare) {
        if (directionVector.getDistanceX() >= minDistance && directionVector.getDistanceY() >= minDistance ) {
            return true;
        } else {
            this.horseSteps += isNearEndSquare(directionVector, endSquare);
            return false;
        }
    }


    public int isNearEndSquare(Vector directionVector, EndSquare endSquare) {
        if (directionVector.getDistanceX() == 0 && directionVector.getDistanceY() == 0) {
            return 0;
        }
        int row = 0;
        int coll = 0;
        int[][] mat = new int[11][11];
        for (int i = endSquare.getX() - minDistance; i < endSquare.getX() + minDistance + 1; i++) {
            for (int j = endSquare.getY() - minDistance; j < endSquare.getY() + minDistance + 1; j++) {
                if (isOnBoard(i, j)) {
                    mat[row][coll] = 0;
                } else {
                    mat[row][coll] = 1;
                }
                row++;
            }
            row = 0;
            coll++;
        }
        return (Util.LeeAlgorithm(mat, this.getX() - endSquare.getX() + minDistance,
                this.getY() - endSquare.getY() + minDistance, minDistance, minDistance));
    }

    public int getHorseSteps() {
        return horseSteps;
    }


}
