package ru.mustaevtt.fix.demo.service;

import org.springframework.stereotype.Service;
import ru.mustaevtt.fix.demo.domain.Chessboard;
import ru.mustaevtt.fix.demo.domain.CountSteps;
import ru.mustaevtt.fix.demo.domain.EndSquare;
import ru.mustaevtt.fix.demo.domain.Horse;
@Service
public class HorseService {

    public int  count(int width, int height, String start, String end) {
        Chessboard chessboard= new Chessboard(width,height);
        Horse horse =new Horse(start,chessboard);
        EndSquare endSquare= new EndSquare(end,chessboard);
        return CountSteps.count(horse,endSquare);
    }
}
