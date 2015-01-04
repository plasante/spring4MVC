package com.uniksoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uniksoft.dao.TeamDAO;
import com.uniksoft.model.Team;

@Service		// The annotated class is a Service
@Transactional	// Transaction is applied in all the methods of the class
public class TeamServiceImpl implements TeamService {

	@Autowired
    private TeamDAO teamDAO;
	
	public void addTeam(Team team) {
        teamDAO.addTeam(team);     
    }
 
    public void updateTeam(Team team) {
        teamDAO.updateTeam(team);
    }
 
    public Team getTeam(int id) {
        return teamDAO.getTeam(id);
    }
 
    public void deleteTeam(int id) {
        teamDAO.deleteTeam(id);
    }
    
    public List<Team> getTeams() {
        return teamDAO.getTeams();
    }
}
