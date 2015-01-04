package com.uniksoft.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uniksoft.model.Team;
/*
 * @Repository indicates that this is a DAO
 */
@Repository
public class TeamDAOImpl implements TeamDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public void addTeam(Team team) {
		getCurrentSession().save(team);
	}

	public void updateTeam(Team team) {
		Team teamtoUpdate = getTeam(team.getId());
		teamtoUpdate.setName(team.getName());
		teamtoUpdate.setRating(team.getRating());
		getCurrentSession().update(teamtoUpdate);
	}

	public Team getTeam(int id) {
		Team team = (Team) getCurrentSession().get(Team.class, id);
        return team;
	}

	public void deleteTeam(int id) {
		Team team = getTeam(id);
        if (team != null)
            getCurrentSession().delete(team);
	}

	@SuppressWarnings("unchecked")
	public List<Team> getTeams() {
		return getCurrentSession().createQuery("from Team").list();
	}

}
