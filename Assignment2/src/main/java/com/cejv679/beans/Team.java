package com.cejv679.beans;

import java.util.List;

/**
 * Created by Carlos Molina.
 */
public class Team {

    private String name;
    private int dateFounded;
    private List<Player> players;
    private Trainer trainer;

    public Team(String name, int dateFounded, Trainer trainer) {
        this.name = name;
        this.dateFounded = dateFounded;
        this.trainer = trainer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateFounded() {
        return dateFounded;
    }

    public void setDateFounded(int dateFounded) {
        this.dateFounded = dateFounded;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", dateFounded=" + dateFounded +
                ", players=" + players +
                ", trainer=" + trainer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Team team = (Team) o;

        if (getDateFounded() != team.getDateFounded()) return false;
        if (!getName().equals(team.getName())) return false;
        if (!getPlayers().equals(team.getPlayers())) return false;
        return getTrainer().equals(team.getTrainer());

    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getDateFounded();
        result = 31 * result + getPlayers().hashCode();
        result = 31 * result + getTrainer().hashCode();
        return result;
    }
}






















