/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.runapplication;

/**
 *
 * @author mchar
 * @version Apache NetBeans IDE 19
 */
public abstract class EstateAgent implements iEstateAgent
{
    
    //Declaring variables.
    protected String agentName;
    protected double propertyPrice, agentCommission;
    
    //EstateAgent class constructor with two parameters.
    public EstateAgent(String aN, double pP)
    {
        
        agentName = aN;
        propertyPrice = pP;
        agentCommission = (propertyPrice * 0.2);
        
    }
    
    //Implementing the abstract method from the iEstateAgent interface.
    public abstract String getAgentName();
    
    //Implementing the abstract method from the iEstateAgent interface.
    public abstract double getPropertyPrice();
    
    //Implementing the abstract method from the iEstateAgent interface.
    public abstract double getAgentCommission();
    
}
