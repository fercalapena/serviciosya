package com.capgemini.serviciosya.service;


import java.util.List;

import com.capgemini.serviciosya.beans.domain.Occupation;
import com.capgemini.serviciosya.dao.IOccupationDao;

/**
 * Services of the class occupation
 * @author Fer Calapeña
 * @see com.capgemini.serviciosya.dao.IOccupationDao
 */
public class OccupationService {

    private IOccupationDao occupationDao;

    /**
     * Constructor by default in class Object
     */
    public OccupationService () {

        super ();
    }

    /**
     * Constructor that requires a implements IOccupationDao
     * @param occupationDao 
     */
    public OccupationService (IOccupationDao occupationDao) {

        super ();

        this.occupationDao = occupationDao;
    }

    /**
     * Set a implements occupation DAO
     * @param occupationDao
     */
    public void setOccupationDao(IOccupationDao occupationDao) {

        this.occupationDao = occupationDao;
    }

    /**
     * finds all occupations and returns
     * @return all occupations
     */
    public List<Occupation> findAllOccupations () {

        return this.occupationDao.findAllOccupations ();
    }

    /**
     * add an occupation
     * @param occupation occupation that adds
     */
    public void addOccupation (Occupation occupation) {

        this.occupationDao.add (occupation);
    }
    
    /**
     * update an occupation for a new update
     * @param occupationOld an old occupation to update
     * @param occupationUpdate a new occupation for update old
     */
    public void updateOccupation (Occupation occupationOld, Occupation occupationUpdate) {
    	this.occupationDao.update(occupationOld, occupationUpdate);
    }
    
    /**
     * delete an occupation
     * @param occupation occupation for delete
     */
    public void deleteOccupation (Occupation occupation) {
    	this.occupationDao.delete(occupation);
    }
    
    /**
     * returns a occupation by your id
     * @param occupationId id from occupation
     * @return an occupation
     */
    public Occupation searchByIdOccupation (String occupationId) {
    	return this.occupationDao.searchById(occupationId);
    }
}