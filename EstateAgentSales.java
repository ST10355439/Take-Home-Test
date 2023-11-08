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
public class EstateAgentSales extends EstateAgent
{
    
    //EstateAgent class constructor with two parameters.
    public EstateAgentSales(String aN, double pP)
    {
        
        super(aN, pP);
        
    }
    
    //Overriding superclass abstract accessor method.
    @Override
    public String getAgentName()
    {
        return agentName;
    }
    
    //Overriding superclass abstract accessor method.
    @Override
    public double getPropertyPrice()
    {
        return propertyPrice;
    }
    
    //Overriding superclass abstract accessor method.
    @Override
    public double getAgentCommission()
    {
        return agentCommission;
    }
    
    //Method used to print out the agent's name, property price and the agent's commission.
    public void printPropertyReport()
    {
        
        System.out.println("ESTATE AGENT NAME: " + getAgentName());
        System.out.println("PROPERTY PRICE: R " + getPropertyPrice());
        System.out.println("AGENT COMMISSION: R " + getAgentCommission());
        
    }
    
}
