package com.sf.employee.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.sf.employee.bean.*;

@Repository
public class PlaceDao {
	@Autowired
	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;
	private Query q;
	
	
	public ArrayList<Country> getCountry()
	{
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		q=session.createQuery("from Country");
		return (ArrayList<Country>) q.list();
	}
	
	public Country viewCountrybyId(String countryid) {
		
		Country elBean=new Country();
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
		Query<Country> q2=session.createQuery("from Country where countryid=:countryid");
		q2.setParameter("countryid", countryid);
		ArrayList<Country> all=(ArrayList<Country>) q2.getResultList();
		for( Country e1:all)
		{
			elBean=e1;
		}
		return elBean;
		}

	
	public ArrayList<State> getStateBycountryid(String countryid) {
	    System.out.println("Under DAO " + countryid);
	   Country country = viewCountrybyId(countryid);
	    if (country != null) {
	        session = sessionFactory.openSession();
	        try {
	            transaction = session.beginTransaction();
	            Query<State> query = session.createQuery("FROM State WHERE country.countryid = :countryid");
	            query.setParameter("countryid", countryid);
	            ArrayList<State> reservations = (ArrayList<State>) query.getResultList();
	            transaction.commit();
	            return reservations;
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	    }
	    return null;
	}
	
	
	
public State viewStatebyId(String stateid) {
		
		State elBean=new State();
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
		Query<State> q2=session.createQuery("from State where stateid=:stateid");
		q2.setParameter("stateid", stateid);
		ArrayList<State> all=(ArrayList<State>) q2.getResultList();
		for( State e1:all)
		{
			elBean=e1;
		}
		return elBean;
		}
	
	


public ArrayList<City> getCityBystateid(String stateid) {
    System.out.println("Under DAO " + stateid);
    State state = viewStatebyId(stateid);
    if (state != null) {
        session = sessionFactory.openSession();
        try {
            transaction = session.beginTransaction();
            Query<City> query = session.createQuery("FROM City WHERE state.stateid = :stateid");
            query.setParameter("stateid", stateid);
            ArrayList<City> reservations = (ArrayList<City>) query.getResultList();
            transaction.commit();
            return reservations;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
    return null;
}

public City viewCitybyId(String cityid) {
	
	City elBean=new City();
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
	Query<City> q2=session.createQuery("from City where cityid=:cityid");
	q2.setParameter("cityid", cityid);
	ArrayList<City> all=(ArrayList<City>) q2.getResultList();
	for( City e1:all)
	{
		elBean=e1;
	}
	return elBean;
	}


public ArrayList<Location> getLocationBycityid(String cityid) {
    System.out.println("Under DAO " + cityid);
    City city = viewCitybyId(cityid);
    if (city != null) {
        session = sessionFactory.openSession();
        try {
            transaction = session.beginTransaction();
            Query<Location> query = session.createQuery("FROM Location WHERE city.cityid = :cityid");
            query.setParameter("cityid", cityid);
            ArrayList<Location> reservations = (ArrayList<Location>) query.getResultList();
            transaction.commit();
            return reservations;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
    return null;
}

public String addCountry(Country country) {
	session=sessionFactory.openSession();
	transaction=session.beginTransaction();
	session.save(country);
	transaction.commit();
	session.close();
	return "success";
	
}
public String addState(State state) {
	session=sessionFactory.openSession();
	transaction=session.beginTransaction();
	session.save(state);
	transaction.commit();
	session.close();
	return "success";
}
public String addCity(City city) {
	session=sessionFactory.openSession();
	transaction=session.beginTransaction();
	session.save(city);
	transaction.commit();
	session.close();
	return "success";
}
public String addLocation(Location location) {
	session=sessionFactory.openSession();
	transaction=session.beginTransaction();
	session.save(location);
	transaction.commit();
	session.close();
	return "success";
}


public Location viewlocationbyId(String locationid) {
	
	Location elBean=new Location();
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
	Query<Location> q2=session.createQuery("from Location where locationid=:locationid");
	q2.setParameter("locationid", locationid);
	ArrayList<Location> all=(ArrayList<Location>) q2.getResultList();
	for( Location e1:all)
	{
		elBean=e1;
	}
	return elBean;
	}





}
