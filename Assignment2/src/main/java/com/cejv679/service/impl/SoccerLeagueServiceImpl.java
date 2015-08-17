package com.cejv679.service.impl;

import com.cejv679.beans.*;
import com.cejv679.service.SoccerLeagueService;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.List;

/**
 * Created by Carlos Molina.
 */
@Component
public class SoccerLeagueServiceImpl implements SoccerLeagueService{

    String message = "";
    PositionEnum position;

    public SoccerLeagueServiceImpl(){
        super();
    }

    /**
     * create new player
     *
     * @param firstName
     * @param lastName
     * @param age
     * @param currency
     * @param salary
     * @param country
     * @param position
     * @return Player
     */

    public Player createPlayer(String firstName, String lastName, int age, BigDecimal salary, Currency currency, String country, PositionEnum position) {

        Stats statistic = new Stats(0, 0);
        Player player = new Player(firstName, lastName, age, salary, currency, country, position, statistic);

        return player;
    }

    public Player createPlayer(String firstName, String lastName, int age, BigDecimal salary, Currency currency, String country, PositionEnum position, int goals, int bookings) {
        Stats statistic = new Stats(goals, bookings);
        Player player = new Player(firstName, lastName, age, salary, currency, country, position, statistic);

        return player;
    }

    /**
     * create new trainer
     *
     * @param firstName
     * @param lastName
     * @param age
     * @param currency
     * @param salary
     * @return Trainer
     */
    public Trainer createTrainer(String firstName, String lastName, int age, Currency currency, BigDecimal salary) {

        Trainer trainer = new Trainer(firstName, lastName, age, salary, currency);

        return trainer;
    }

    /**
     * create new team
     *
     * @param name
     * @param foundationYear
     * @param trainer
     * @param players
     * @return Team
     */
    public Team createTeam(String name, int foundationYear, List<Player> players,Trainer trainer) {
        Team team = new Team(name, foundationYear, trainer);
        team.setPlayers(players);

        return team;
    }

    /**
     * create new statistic
     *
     * @param goals
     * @param bookings
     * @return Stats
     */
    public Stats createStatistic(int goals, int bookings){
        Stats stats = new Stats(goals, bookings);

        return stats;
    }

    /**
     * validate player
     *
     * @param player
     * @return boolean
     */
    public boolean isValidPlayer(Player player) {
        if (player.getFirstName().isEmpty()) {

            message = "Firstname cannot be empty";
            return false;
        } else if (player.getFirstName().matches(".*\\d.*")) {

            message = "Firstname cannot contain numbers";
            return false;
        } else if (player.getLastName().isEmpty()) {

            message = "Lastname cannot be empty";
            return false;
        } else if (player.getLastName().matches(".*\\d.*")) {

            message = "Lastname cannot contain numbers";
            return false;
        } else if (player.getAge() < 20 || player.getAge() > 23) {

            message = "Player age must be between 20 and 23 years old";
            return false;
        } else if (player.getCountryOfBirth().isEmpty()) {

            message = "Country cannot be empty";
            return false;
        } else if (player.getCountryOfBirth().matches(".*\\d.*")) {

            message = "Country cannot contain numbers";
            return false;
        } else if (player.getCurrency() == null || player.getSalary() == null) {
            message = "Salary cannot be empty";
            return false;
        }

        return true;
    }

    /**
     * validate trainer
     *
     * @param trainer
     * @return boolean
     */
    public boolean isValidTrainer(Trainer trainer) {
        if (trainer.getFirstName().isEmpty()) {

            message = "Firstname cannot be empty";
            return false;
        } else if (trainer.getFirstName().matches(".*\\d.*")) {

            message = "Firstname cannot contain numbers";
            return false;
        } else if (trainer.getLastName().isEmpty()) {

            message = "Lastname cannot be empty";
            return false;
        } else if (trainer.getLastName().matches(".*\\d.*")) {

            message = "Lastname cannot contain numbers";
            return false;
        } else if (trainer.getAge() < 40) {

            message = "Trainer age must be equal or greater than 40";
            return false;
        } else if (trainer.getCurrency() == null || trainer.getSalary() == null) {
            message = "Salary cannot be empty";
            return false;
        }

        return true;
    }

    /**
     * validator tream
     *
     * @param team
     * @return boolean
     */
    public boolean isValidTeam(Team team) {
        if (team.getPlayers().size() < 22) {
            message = "The team must has 22 players at least";
            return false;
        } else if (team.getName().isEmpty()) {

            message = "Team name cannot be empty";
            return false;
        } else if (team.getDateFounded() < 1950) {

            message = "Team foundation year must be equal or greater than 1950";
            return false;
        }
        return true;
    }

    /**
     * validate statistic
     *
     * @param stats
     * @return boolean
     */
    public boolean isValidStatistic(Stats stats) {
        if (stats.getGoals() < 0) {
            message = "the Goal must be equal or greater than zero";
            return false;
        } else if (stats.getBookings() < 0) {
            message = "the booking must be equal or greater than zero";
            return false;
        }

        return true;
    }
}
