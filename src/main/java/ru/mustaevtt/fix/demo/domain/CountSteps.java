package ru.mustaevtt.fix.demo.domain;


public class CountSteps {

    public static int count(Horse horse, EndSquare endSquare) {
        Vector directionVector = new Vector(horse, endSquare);
        while (horse.isFarFromEndSquare(directionVector, endSquare)) {
            horse.move(directionVector);
            directionVector.updateVector(horse, endSquare);
        }
        return horse.getHorseSteps();
    }
}
