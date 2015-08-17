package com.cejv679;

import com.cejv679.beans.Player;
import com.cejv679.beans.PositionEnum;
import com.cejv679.beans.Stats;
import com.cejv679.service.SoccerLeagueService;
import com.cejv679.service.StatsService;
import config.TestConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.Currency;

import static org.junit.Assert.*;

/**
 * Created by Carlos Molina.
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfig.class)
public class StatsTest {

    @Autowired
    private SoccerLeagueService soccerLeagueService;

    @Autowired
    private Stats stats;

    @Autowired
    private StatsService statsService;

    @Test
    public void assertThatStatistic_IsBuilt() {
        assertNotNull(stats);
    }

    @Test
    public void assertThatStatisticInfo_IsCorrect() {
        assertEquals(stats.getGoals(), 2);
        assertEquals(stats.getBookings(), 1);
    }

    @Test
    public void assertThatStatistic_IsCreated() {
        Stats newStatistic = soccerLeagueService.createStatistic(5, 1);

        assertNotNull(newStatistic);

        assertEquals(newStatistic.getGoals(), 5);
        assertEquals(newStatistic.getBookings(), 1);
    }

    @Test
    public void assertThatStatistic_IsUpdated() {
        Stats newStatistic = soccerLeagueService.createStatistic(3, 2);

        Player newPlayer = soccerLeagueService.createPlayer("Lionel", "Messi", 30, new BigDecimal(150000), Currency.getInstance("EUR"), "Argentina", PositionEnum.FORWARD);

        statsService.updateStatistic(newPlayer, newStatistic);

        assertEquals(newPlayer.getStats().getGoals(), 3);
        assertEquals(newPlayer.getStats().getBookings(), 2);
    }

    @Test
    public void assertThatStatistic_IsValid() {
        Stats newStatistic = soccerLeagueService.createStatistic(0, 0);
        assertTrue(soccerLeagueService.isValidStatistic(newStatistic));

        newStatistic = soccerLeagueService.createStatistic(1, 1);
        assertTrue(soccerLeagueService.isValidStatistic(newStatistic));

        newStatistic = soccerLeagueService.createStatistic(-1, 0);
        assertFalse(soccerLeagueService.isValidStatistic(newStatistic));

        newStatistic = soccerLeagueService.createStatistic(0, -1);
        assertFalse(soccerLeagueService.isValidStatistic(newStatistic));
    }
}