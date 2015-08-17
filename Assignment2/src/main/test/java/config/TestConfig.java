package config;

import com.cejv679.beans.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.util.Currency;

/**
 * Created by Carlos Molina.
 */

@Configuration
@ComponentScan(basePackages = "com.cejv679")
public class TestConfig {

    @Bean
    public Stats getStatistic() {
        return new Stats(2, 1);
    }

    @Bean
    public Player getPlayer() {
        return new Player("Clone", "Player", 30, new BigDecimal(100000), Currency.getInstance("CAD"),"Canada", PositionEnum.DEFENDER, getStatistic());
    }

    @Bean
    public Trainer getTrainer() {
        return new Trainer("Clone", "Trainer", 45, new BigDecimal(80000),Currency.getInstance("CAD"));
    }

    @Bean
    public Team getTeam() {

        Team team = new Team("Clone Team", 1976, getTrainer());
        team.addPlayer(getPlayer());

        return team;
    }

}
