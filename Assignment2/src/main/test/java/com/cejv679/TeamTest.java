package com.cejv679;

import com.cejv679.beans.Player;
import com.cejv679.beans.PositionEnum;
import com.cejv679.beans.Team;
import com.cejv679.beans.Trainer;
import com.cejv679.service.SoccerLeagueService;
import config.TestConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Carlos Molina.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfig.class)
public class TeamTest {

    @Autowired
    private SoccerLeagueService soccerLeagueService;

    @Autowired
    private Team team;

    @Test
    public void assertThatTeam_IsBuilt() {
        assertNotNull(team);
    }

    @Test
    public void assertThatTeamInfo_IsCorrect() {
        assertEquals(team.getName(), "Clone Team");
    }

    @Test
    public void assertThatTeam_IsCreated() {
        Player newPlayer = soccerLeagueService.createPlayer("Lionel", "Messi", 30, new BigDecimal(150000), Currency.getInstance("EUR"), "Argentina", PositionEnum.FORWARD);

        Trainer newTrainer = soccerLeagueService.createTrainer("Carlos", "Molina", 44, Currency.getInstance("EUR"), new BigDecimal(80000));

        List<Player> players = new ArrayList<Player>();
        players.add(newPlayer);

        Team newTeam = soccerLeagueService.createTeam("AC Milan", 1900, players,  newTrainer);

        assertNotNull(newTeam);

        assertEquals(newTeam.getName(), "AC Milan");
        assertEquals(newTeam.getDateFounded(), 1900);
        assertEquals(newTeam.getTrainer(), newTrainer);
        assertEquals(newTeam.getPlayers(), players);

    }

    @Test
    public void assertThatTeam_IsValid() {
        Player newPlayer = soccerLeagueService.createPlayer("Lionel", "Messi", 23, new BigDecimal(150000), Currency.getInstance("EUR"), "Argentina", PositionEnum.FORWARD);
        Trainer newTrainer = soccerLeagueService.createTrainer("Carlos", "Molina", 44, Currency.getInstance("EUR"), new BigDecimal(80000));

        List<Player> players = new ArrayList<Player>();
        for (int i = 1; i < 22; i++) {
            players.add(newPlayer);
        }

        Team newTeam = soccerLeagueService.createTeam("AC Milan", 1950, players, newTrainer);
        assertFalse(soccerLeagueService.isValidTeam(newTeam));

        players.add(newPlayer);
        newTeam = soccerLeagueService.createTeam("AC Milan", 1950, players, newTrainer);
        assertTrue(soccerLeagueService.isValidTeam(newTeam));

        newTeam = soccerLeagueService.createTeam("AC Milan", 1945, players, newTrainer);
        assertFalse(soccerLeagueService.isValidTeam(newTeam));

    }
}
