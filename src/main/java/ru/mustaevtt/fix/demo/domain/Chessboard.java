package ru.mustaevtt.fix.demo.domain;

import lombok.Data;

@Data
public class Chessboard {
    private int width;
    private int height;


    public Chessboard(int width, int height) {
        if (width>0 && height>0) {
            this.width=width;
            this.height=height;
        }else  {
            System.out.println(-1);
            System.exit(-1);
        }
    }

    public int getHeight() {
        return height;

    }
    public int getWidth() {
        return width;
    }

}
