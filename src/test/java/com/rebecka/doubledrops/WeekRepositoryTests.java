package com.rebecka.doubledrops;

import com.rebecka.doubledrops.week.Week;
import com.rebecka.doubledrops.week.WeekRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)

public class WeekRepositoryTests {
    @Autowired
    private WeekRepository repo;

    @Test
    public void testAddWeek() {
        Week week = new Week();

        /* All the days of the new week should be set to
        false since no day has been filled in. */
        week.setMonday(false);
        week.setTuesday(false);
        week.setWednesday(false);
        week.setThursday(false);
        week.setFriday(false);
        week.setSaturday(false);
        week.setSunday(false);

        Week addedWeek = repo.save(week);

        Assertions.assertNotNull(addedWeek);
    }

    @Test
    public void testAmendFriday() {
        Integer weekId = 1;
        Optional<Week> optionalWeek = repo.findById(weekId);

        Week week = optionalWeek.get();

        if(!week.getFriday()) {
            week.setFriday(true);
        } else if(week.getFriday()) {
            week.setFriday(false);
        }

        Week amendedWeek = repo.save(week);

        Assertions.assertNotNull(amendedWeek);
    }
}
