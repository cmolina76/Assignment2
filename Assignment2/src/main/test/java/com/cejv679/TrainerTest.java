package com.cejv679;

import com.cejv679.beans.Trainer;
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
public class TrainerTest {

    @Autowired
    private SoccerLeagueService soccerLeagueService;

    @Autowired
    private Trainer trainer;

    @Test
    public void assertThatTrainer_IsBuilt() {
        assertNotNull(trainer);

        assertEquals(trainer.getFirstName(), "Clone");
        assertEquals(trainer.getLastName(), "Trainer");
        assertEquals(trainer.getAge(), 45);
        assertEquals(trainer.getCurrency(), Currency.getInstance("CAD"));
        assertEquals(trainer.getSalary(), new BigDecimal(80000));
    }

    @Test
    public void assertThatTrainerInfo_IsCorrect() {
        assertEquals(trainer.getLastName(), "Trainer");
    }

    @Test
    public void assertThatTrainer_IsCreated() {
        Trainer newTrainer = soccerLeagueService.createTrainer("Carlos", "Molina", 44, Currency.getInstance("EUR"), new BigDecimal(80000));

        assertNotNull(newTrainer);

        assertEquals(newTrainer.getFirstName(), "Carlos");
        assertEquals(newTrainer.getLastName(), "Molina");
        assertEquals(newTrainer.getAge(), 44);
        assertEquals(newTrainer.getCurrency(), Currency.getInstance("EUR"));
        assertEquals(newTrainer.getSalary(), new BigDecimal(80000));
    }

    @Test
    public void assertThatTrainer_IsValid() {
        Trainer newTrainer = soccerLeagueService.createTrainer("Carlos", "Molina", 44, Currency.getInstance("EUR"), new BigDecimal(80000));

        assertTrue(soccerLeagueService.isValidTrainer(newTrainer));

        newTrainer = soccerLeagueService.createTrainer("Carlos", "Molina", 36, Currency.getInstance("EUR"), new BigDecimal(80000));

        assertFalse(soccerLeagueService.isValidTrainer(newTrainer));
    }
}
