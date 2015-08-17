package com.cejv679.service;

import com.cejv679.beans.Player;
import com.cejv679.beans.Stats;

/**
 * Created by Carlos Molina.
 */
public interface StatsService {

    void updateStatistic(Player player,Stats stats);
}
