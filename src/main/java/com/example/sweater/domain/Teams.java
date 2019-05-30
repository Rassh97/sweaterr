package com.example.sweater.domain;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class Teams {
    private List<Team> teams = null;

    public Teams() {
    }

    public Teams(List<Team> teams) {
        this.teams = teams;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    @Override
    public String toString() {
        return "Teams{" +
                "teams=" + teams +
                '}';
    }

    public void add(Team manCity) {
        teams.add(manCity);
    }
}
