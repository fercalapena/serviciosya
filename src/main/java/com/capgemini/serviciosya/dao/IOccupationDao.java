
package com.capgemini.serviciosya.dao;


import java.util.List;

import com.capgemini.serviciosya.beans.domain.Occupation;


public interface IOccupationDao {


	/**
	 * must implements a functionality that finds and returns all functionality
	 * @return all occupations
	 */
    List<Occupation> findAllOccupations ();

    /**
     * must implement a functionality that adds an occupation
     * @param occupation an occupation that adds
     */
    void add (Occupation occupation);
    
    /**
     * must implements a functionality that returns an occupation by your id
     * @param id occupation´s id
     * @return occupation
     */
    Occupation searchById(String id);
    
    /**
     * must implements a functionality that update an old occupation for a new update
     * @param occupationOld old occupation that must be update
     * @param occupationUpdate update occupation
     */
    void update (Occupation occupationOld,  Occupation occupationUpdate);
    
    /**
     * must implements a functionality that delete an occupation
     * @param occupation occupation to delete
     */
    void delete (Occupation occupation);
}
