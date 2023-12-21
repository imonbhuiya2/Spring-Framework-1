package com.example.springGame.SpringGame;


import game.GameRunner;
import game.MarioGame;

public class AppGame {
    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();

    }
}