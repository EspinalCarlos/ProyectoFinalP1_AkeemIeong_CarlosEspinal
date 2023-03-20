
package pfinalp1_cespinal_aieong;

import java.util.*;

public class Player {
    private int posx;
    private int posy;
    private int lives;
    private boolean alive;
    private char sprite;

    public Player(int posx, int posy, int lives, boolean alive, char icon) {
        this.posx = posx;
        this.posy = posy;
        this.lives = lives;
        this.alive = alive;
        this.sprite = icon;
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
    
    
}
