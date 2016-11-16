package com.netcracker.cinema.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by gaya on 05.11.2016.
 */
@Getter
@Setter
@ToString
public class Zone {

    private long id;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Zone)) return false;

        Zone zone = (Zone) o;

        if (getId() != zone.getId()) return false;
        return getName() != null ? getName().equals(zone.getName()) : zone.getName() == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        return result;
    }
}