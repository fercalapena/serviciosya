
package com.capgemini.serviciosya.dao;


import java.util.*;

import javax.management.RuntimeErrorException;

import static org.apache.commons.lang3.RandomStringUtils.*;

import com.capgemini.serviciosya.beans.domain.Occupation;


public class OccupationDaoMemory implements IOccupationDao {


    private Map<String, Occupation> occupations;


    /**
     * Public constructor, this include two occupations
     */
    public OccupationDaoMemory() {

        super ();

        this.occupations = new TreeMap<>();

        // Load occupations.
        Occupation o1 = new Occupation (randomAlphabetic(5),
                                        "Entandador de Serpientes",
                                    "Entandador de Serpientes");

        Occupation o2 = new Occupation (randomAlphabetic(5),
                                       "Cuidador de Suegras",
                                   "Cuidador de Suegras");

        // Add values to map.
        this.occupations.put (o1.getId (), o1);
        this.occupations.put (o2.getId (), o2);
    }

    /**
     * find all occupations and returns in a List<Occupation>.
     */
    @Override
    public List<Occupation> findAllOccupations () {

        // Get the entries.
        Set<Map.Entry<String, Occupation>> entries = this.occupations.entrySet ();

        // Build the occupation list.
        List<Occupation> list = new ArrayList<> ();
        for (Map.Entry<String, Occupation> item: entries) {

            list.add (item.getValue ());
        }

        // Return the occupations.
        return list;
    }

    /**
     * Receives an occupation and salves in memory 
     */
    @Override
    public void add (Occupation occupation) {

        this.occupations.put (occupation.getId (), occupation);
    }

    /**
     * search a Occupation by Id.
     * If not exists, returns null, else return an Occupation
     */
	@Override
	public Occupation searchById(String id) {
		List<Occupation> aux = this.findAllOccupations();
		
		for (Occupation occupation : aux) {
			if (id.equals(occupation.getId()))
				return occupation;
		}
		return null;
	}

	/**
	 * Take an Occupation and replace with a new update.
	 * @throws If not exists occupationOld, launch a error.
	 */
	@Override
	public void update(Occupation occupationOld, Occupation occupationUpdate) {
		try {
			this.occupations.remove(occupationOld);
		} catch (Exception e) {
			throw new Error("Occupation not exists");
		}
		this.occupations.put(occupationUpdate.getId(), occupationUpdate);
	}

	/**
	 * delete an occupation, if not exists, launch error.
	 */
	@Override
	public void delete(Occupation occupation) {
		try {
			this.occupations.remove(occupation);			
		} catch (Exception e) {
			throw new Error("Occupation not exists");
		}
	}
}