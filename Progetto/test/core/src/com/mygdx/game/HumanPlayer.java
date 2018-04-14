package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

public class HumanPlayer extends Player {
    @Override
    public int keyPressed() {
        if(Gdx.input.isKeyPressed(Input.Keys.LEFT) && !Gdx.input.isKeyPressed(Input.Keys.RIGHT))
            return Input.Keys.LEFT;
        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT) && !Gdx.input.isKeyPressed(Input.Keys.LEFT))
            return Input.Keys.RIGHT;
        if(Gdx.input.isKeyPressed(Input.Keys.P))
            return Input.Keys.P;
        return Input.Keys.ANY_KEY;
    }
}
