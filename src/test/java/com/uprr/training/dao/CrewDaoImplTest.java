package com.uprr.training.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by igen006 on 4/9/2014.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:spring/application-context.xml")
@Transactional
public class CrewDaoImplTest {
    @Autowired
    private CrewDao crewDao;

    @Test
    public void testGetAllCrew() throws Exception {
    }
}
