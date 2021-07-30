package com.rebecka.doubledrops.week;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeekService {
    @Autowired private WeekRepository repo;

    public List<Week> findAll() {
        return (List<Week>) repo.findAll();
    }

    public Boolean showStatus(Integer day) {
        Week w = new Week();

        switch (day) {
            case 1:
                return w.getMonday();
            case 2:
                return w.getTuesday();
            case 3:
                return w.getWednesday();
            case 4:
                return w.getThursday();
            case 5:
                return w.getFriday();
            case 6:
                return w.getSaturday();
            case 7:
                return w.getSunday();
        }
        return null;
    }

    public void toggleStatus(Integer day) {
        Week w = new Week();

        switch (day) {
            case 1:
                w.setMonday(!w.getMonday());
                repo.save(w);
            case 2:
                w.setTuesday(!w.getTuesday());
                repo.save(w);
            case 3:
                w.setWednesday(!w.getWednesday());
                repo.save(w);
            case 4:
                w.setThursday(!w.getThursday());
                repo.save(w);
            case 5:
                w.setFriday(!w.getFriday());
                repo.save(w);
            case 6:
                w.setSaturday(!w.getSaturday());
                repo.save(w);
            case 7:
                w.setSunday(!w.getSunday());
                repo.save(w);
        }
    }
}
