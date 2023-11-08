/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.runapplication;

/**
 *
 * @author mchar
 * @version Apache NetBeans IDE 19
 */
public class RunApplication
{

    public static void main(String[] args)
    {
        
        //Declaring and instantiating an object of type EstateAgentSales.
        EstateAgentSales estateAgentSale = new EstateAgentSales("Joe Bloggs", 1200000);
        
        //Printing out messages.
        System.out.println("Enter the current estate agent name: " + estateAgentSale.getAgentName());
        System.out.println("Enter the property price: " + estateAgentSale.getPropertyPrice());
        System.out.println();
        System.out.println("ESTATE AGENT REPORT");
        System.out.println("*******************");
        
        //Calling the printPropertyReport of the estateAgentSale object.
        estateAgentSale.printPropertyReport();
        
    }
}
