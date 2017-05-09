package com.comall.bdd.cucumber.stepdefs;

import com.comall.bdd.BddDemoApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = BddDemoApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
