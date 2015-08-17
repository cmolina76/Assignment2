package com.cejv679;


import com.cejv679.beans.Player;
import com.cejv679.beans.PositionEnum;
import com.cejv679.service.SoccerLeagueService;
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
public class PlayerTest {

    @Autowired
    private SoccerLeagueService soccerLeagueService;

    @Autowired
    private Player player;

    @Test
    public void assertThatPlayer_IsBuilt() {
        assertNotNull(player);
    }

    @Test
    @SuppressWarnings("Deprecated")
    public void assertThatPlayerInfo_IsCorrect() {
        assertEquals(player.getFirstName(), "Clone");
        assertEquals(player.getLastName(), "Player");
        assertEquals(player.getAge(), 30);
        assertEquals(player.getCurrency(), Currency.getInstance("CAD"));
        assertEquals(player.getSalary(), new BigDecimal(100000));
        assertEquals(player.getCountryOfBirth(), "Canada");
    }

    @Test
    @SuppressWarnings("Deprecated")
    public void assertThatPlayer_IsCreated() {
        Player newPlayer = soccerLeagueService.createPlayer("Lionel", "Messi", 30, new BigDecimal(150000), Currency.getInstance("EUR"), "Argentina", PositionEnum.FORWARD);

        assertNotNull(newPlayer);

        assertEquals(newPlayer.getFirstName(), "Lionel");
        assertEquals(newPlayer.getLastName(), "Messi");
        assertEquals(newPlayer.getAge(), 30);
        assertEquals(newPlayer.getCurrency(), Currency.getInstance("EUR"));
        assertEquals(newPlayer.getSalary(), new BigDecimal(150000));
        assertEquals(newPlayer.getCountryOfBirth(), "Argentina");
    }

    @Test
    public void assertThatPlayer_IsValid() {
        Player newPlayer = soccerLeagueService.createPlayer("Lionel", "Messi", 23, new BigDecimal(150000), Currency.getInstance("EUR"), "Argentina", PositionEnum.FORWARD);
        System.out.println(newPlayer.toString());
        assertTrue(soccerLeagueService.isValidPlayer(newPlayer));

        newPlayer = soccerLeagueService.createPlayer("Lionel", "Messi", 25, new BigDecimal(150000), Currency.getInstance("EUR"), "Argentina", PositionEnum.FORWARD);

        assertFalse(soccerLeagueService.isValidPlayer(newPlayer));

    }
}
