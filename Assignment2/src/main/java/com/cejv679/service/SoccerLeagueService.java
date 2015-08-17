package com.cejv679.service;

import com.cejv679.beans.*;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.List;

/**
 * Created by Carlos Molina.
 */
public interface SoccerLeagueService {

    Player createPlayer(String firstName, String lastName, int age, BigDecimal salary, Currency currency, String country, PositionEnum position);
    Player createPlayer(String firstName, String lastName, int age, BigDecimal salary, Currency currency, String country, PositionEnum position,int goals, int bookings);
    Trainer createTrainer(String firstName, String lastName, int age, Currency currency, BigDecimal salary);
    Team createTeam(String name, int foundationYear, List<Player> players,Trainer trainer);
    Stats createStatistic(int goals, int bookings);
    boolean isValidPlayer(Player player);
    boolean isValidTrainer(Trainer trainer);
    boolean isValidTeam(Team team);
    boolean isValidStatistic(Stats stats);


}
