package com.mijuamon.technicalTestHB;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.mijuamon.technicalTestHB.controller.MainControllerTest;
import com.mijuamon.technicalTestHB.repository.MainRepositoryTest;
@RunWith(Suite.class)

@Suite.SuiteClasses({ 
    MainControllerTest.class ,MainRepositoryTest.class
})
public class JunitTestSuite {

}
