package com.example.sweater.dbutil;

import com.example.sweater.domain.Team;
import com.example.sweater.domain.Teams;

import java.util.ArrayList;
import java.util.List;

public class DBUtil {

    public static  List<Team> teams;
    public static Team teamList = new Team();

    static {
        teams = new ArrayList<>();
        Team manCity = new Team(1, 1, "Manchester City", "Guardiola Pep", "epl");
        Team liver = new Team(2, 2,"Liverpool", "Klopp Jurgen", "epl");
        Team tottenham = new Team(3, 3,"Tottenham", "Pochettino Mauricio", "epl");
        Team chelsea = new Team(4, 4,"Chelsea", "Sarri Maurizio", "epl");
        Team arsenal = new Team(5, 5,"Arsenal", "Emery Unai", "epl");
        Team manUtd = new Team(6, 6,"Manchester United", "Jose Mourinho", "epl");
        Team wolves = new Team(7, 7,"Wolverhampton Wanderers", "Nuno Espirito Santo ", "epl");
        Team leicester = new Team(8, 8,"Leicester City", "Claude Puel", "epl");
        Team everton = new Team(9, 9,"Everton", "Marco Silva", "epl");
        Team watford = new Team(10, 10,"Watford", "Javier Gracia", "epl");
        Team westHam = new Team(11, 11,"West Ham United", "Manuel Pellegrini", "epl");
        Team crystalP = new Team(12, 12,"Crystal Palace", "Roy Hodgson", "epl");
        Team newcastle = new Team(13, 13,"Newcastle United", "Rafa Benitez", "epl");
        Team bournemouth = new Team(14, 14,"Bournemouth", "Eddie Howe", "epl");
        Team burnley = new Team(15, 15,"Burnley", "Sean Dyche", "epl");
        Team southamton = new Team(16, 16,"Southampton", "Mark Hughes", "epl");
        Team brighton = new Team(17, 17,"Brighton and Hove Albion", "Chris Hughton", "epl");
        Team cardiff = new Team(18, 18,"Cardiff City", "Neil Warnock", "epl");
        Team fullham = new Team(19, 19,"Fulham", "Slavisa Jokanovic", "epl");
        Team huddesfield = new Team(20, 20,"Huddersfield Town", "David Wagner", "epl");


        Team bayren = new Team(21, 1,"Bayern Munich", "Kovac Niko", "bundesliga");
        Team dortmund = new Team(22, 2,"Borussia Dortmund", "Favre Lucien", "bundesliga");
        Team leipzig = new Team(23, 3,"RB Leipzig", "Rangnick Ralf", "bundesliga");
        Team eintracht = new Team(24, 4,"Eintracht Frankfurt", "Hutter Adi", "bundesliga");
        Team monchengladbach = new Team(25, 5,"Borussia Monchengladbach", "Hecking Dieter", "bundesliga");
        Team bayer = new Team(26, 6,"Bayer 04 Leverkusen", "Bosz Peter", "bundesliga");
        Team hoffenheim = new Team(27, 7,"TSG 1899 Hoffenheim", "Nagelsmann Julian", "bundesliga");
        Team wolfsburg = new Team(28, 8,"VfL Wolfsburg", "Labbadia Bruno", "bundesliga");
        Team werder = new Team(29, 9,"SV Werder Bremen", "Kohfeldt Florian", "bundesliga");
        Team dusseldorf = new Team(30, 10,"Fortuna Dusseldorf", "Funkel Friedhelm", "bundesliga");
        Team hertha = new Team(31, 11,"Hertha Berlin", "Dardai Pal", "bundesliga");
        Team mainz = new Team(32, 12,"FSV Mainz 05", "Schwarz Sandro", "bundesliga");
        Team freiburg = new Team(33, 13,"Sport-Club Freiburg", "Streich Christian", "bundesliga");
        Team augsburg = new Team(34, 14,"FC Augsburg", "Schmidt Martin", "bundesliga");
        Team schalke = new Team(35, 15,"FC Schalke 04", "Stevens Huub", "bundesliga");
        Team stuttgart = new Team(36, 16,"VfB Stuttgart", "Weinzierl Markus", "bundesliga");
        Team nurnberg = new Team(37, 17,"FC Nurnberg", "Schommers Boris", "bundesliga");
        Team hannover = new Team(38, 18,"Hannover 96", "Doll Thomas", "bundesliga");


        teams.add(manCity);
        teams.add(liver);
        teams.add(tottenham);
        teams.add(chelsea);
        teams.add(arsenal);
        teams.add(manUtd);
        teams.add(wolves);
        teams.add(leicester);
        teams.add(everton);
        teams.add(watford);
        teams.add(westHam);
        teams.add(crystalP);
        teams.add(newcastle);
        teams.add(bournemouth);
        teams.add(burnley);
        teams.add(southamton);
        teams.add(brighton);
        teams.add(cardiff);
        teams.add(fullham);
        teams.add(huddesfield);

        teams.add(bayren);
        teams.add(dortmund);
        teams.add(leipzig);
        teams.add(eintracht);
        teams.add(monchengladbach);
        teams.add(bayer);
        teams.add(hoffenheim);
        teams.add(wolfsburg);
        teams.add(werder);
        teams.add(dusseldorf);
        teams.add(hertha);
        teams.add(mainz);
        teams.add(freiburg);
        teams.add(augsburg);
        teams.add(schalke);
        teams.add(stuttgart);
        teams.add(nurnberg);
        teams.add(hannover);
        teamList.setTeams(teams);
    }

    public static Team getById(Integer id){
        Team team = null;
        for(Team t: teams) {
            if (t.getId() == id) {
                team = t;
                break;
            }
        }
        return  team;
    }


    public static Teams getByRate(Integer rate){
        Teams teamList1 = new Teams();
        List<Team> teamAll = new ArrayList<>();
        for(Team t: teams){
            if(t.getRate() == rate){
                teamAll.add(t);
            }
        }
        teamList1.setTeams(teamAll);
        return teamList1;
    }

    public static Team getByName(String name){
        Team team = null;
        for(Team t: teams){
            if(t.getTeamName().equals(name)){
                team = t;
                break;
            }
        }
        return  team;
    }

    public static Teams getAllByLeague(String league){
        Teams teamList1 = new Teams();
        List<Team> teamAll = new ArrayList<>();
        for(Team t: teams){
            if(t.getLeague().equals(league)){
                teamAll.add(t);
            }
        }
        teamList1.setTeams(teamAll);
        return teamList1;
    }

    public static Teams getAll(){
        return teamList;
    }

}
