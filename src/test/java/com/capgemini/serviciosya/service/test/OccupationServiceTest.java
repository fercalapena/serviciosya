package com.capgemini.serviciosya.service.test;


import com.capgemini.serviciosya.dao.*;
import com.capgemini.serviciosya.beans.domain.*;
import com.capgemini.serviciosya.service.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class OccupationServiceTest {

	private OccupationService occupationService = new OccupationService ();

    private IOccupationDao occupationDao = new OccupationDaoMemory ();


    @Test
    public void testFindAllOccupations () {


        this.occupationService.setOccupationDao (this.occupationDao);

        List<Occupation> list = this.occupationService.findAllOccupations ();

        Assert.assertFalse (list.isEmpty ());
    }

    @Test
    public void testAddOccupation () {


        this.occupationService.setOccupationDao (this.occupationDao);

        Occupation o = new Occupation ("1", "Catador de Ron", "Beber alcohol...");

        List<Occupation> init = this.occupationDao.findAllOccupations ();

        this.occupationService.addOccupation (o);

        List<Occupation> end = this.occupationDao.findAllOccupations ();

        Assert.assertTrue (init.size()+1 == end.size());
    }

}
