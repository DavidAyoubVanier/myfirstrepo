package org.example;

import java.util.ArrayList;
import java.util.List;

public class Team<T> {
    private List<T> players;

    public Team() {
        this.players = new ArrayList<>();
    }

    public void addPlayer(T player) {
        players.add(player);
    }
}
