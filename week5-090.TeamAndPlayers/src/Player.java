/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author playgrnd
 */
public class Player {   

    private String name;
    private int goalAmount;    

    public Player(String name, int goals) {
        this.name = name;
        this.goalAmount = goals;

    }

    public Player(String name) {
        this(name, 0);
    }
    public int goals(){
        return this.goalAmount;
    
    }
    
    public String getName() {
        return name;
    }
    
    public String toString() {
        return this.name +", "+this.goalAmount;
    }
}
