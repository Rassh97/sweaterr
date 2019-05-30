package com.example.sweater.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "team")
public class Team extends Teams {
    private Integer id;
    private Integer rate;
    private String teamName;
    private String coach;
    private String league;

    public Team() {
    }

    public Team(Integer id, Integer rate, String teamName, String coach, String league) {
        this.id = id;
        this.rate = rate;
        this.teamName = teamName;
        this.coach = coach;
        this.league = league;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", rate=" + rate +
                ", teamName='" + teamName + '\'' +
                ", coach='" + coach + '\'' +
                ", league='" + league + '\'' +
                '}';
    }
}
