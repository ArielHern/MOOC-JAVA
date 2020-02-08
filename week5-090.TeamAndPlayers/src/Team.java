
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author playgrnd
 */
public class Team {

    private String name;
    private int maxSize;
    private ArrayList<Player> members;

    public Team(String name) {
        this.name = name;
        this.members = new ArrayList<Player>();
        this.maxSize = 16;

    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;

    }

    public int size() {
        return this.members.size();
    }

    public void addPlayer(Player player) {
        if ((size() < this.maxSize)) {
            this.members.add(player);          

        }
    }

    public int goals() {
        int total = 0;
        for (Player player : members) {
            total += player.goals();
        }
        return total;
    }

    public String getName() {
        return this.name;
    }

    public void printPlayers() {
        for (Player player : this.members) {
            System.out.println(player);

        }

    }

}
