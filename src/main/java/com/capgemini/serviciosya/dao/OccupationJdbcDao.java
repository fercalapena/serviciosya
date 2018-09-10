package com.capgemini.serviciosya.dao;

import com.capgemini.serviciosya.beans.domain.Occupation;

import java.util.List;

public class OccupationJdbcDao implements IOccupationDao {

    @Override
    public List<Occupation> findAllOccupations() {
	  	return null;
    }

    @Override
    public void add(Occupation occupation) {
    	//TODO: Add
    }

    @Override
    public Occupation searchById(String id) {
	  // TODO Auto-generated method stub
	  return null;
    }

    @Override
    public void update(Occupation occupationOld, Occupation occupationUpdate) {
    	// TODO Auto-generated method stub
    }

    @Override
    public void delete(Occupation occupation) {
	// TODO Auto-generated method stub
	}
}
