package com.giral.cardgame.games;

import com.giral.cardgame.controller.GameController;
import com.giral.cardgame.model.Deck;
import com.giral.cardgame.view.View;

public class Games {
    public static void main(String[] args) {
        GameController gc = new GameController(new Deck(), new View());
        gc.run();
    }
}
