/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pricedifferencebetweentwotypesofcameratechnologiesapplication;

/**
 *
 * @author mchar
 * @version Apache NetBeans IDE 19
 */
public class PriceDifferenceBetweenTwoTypesOfCameraTechnologiesApplication
{

    public static void main(String[] args)
    {
        
        //Declaring variables.
        double difference, highestDiff;
        int index = 0, y = 0;
        
        //Declaring and populating arrays.
        String[] cameraTypes = {"     ", "MIRRORLESS", "DSLR      "};
        
        String[] manufacturers = {"CANON", "SONY ", "NIKON"};
        
        double[][] dSLRVSMirrorlessCamera = {{10500.00, 8500.00},
                                             {9500.00, 7200.00},
                                             {12000.00, 8000.00}};
        
        //Declaring and instatiating an array with a defined size.
        double[] differenceBetweenMirrorlessAndDSLR = new double[3];
        
        /*
         *Using a for loop statement to determine the difference between the values that fall under the first index of
         *the dSLRVSMirrorlessCamera two dimentional array and storing the differences within the 
         *differenceBetweenMirrorlessAndDSLR array.
         */
        for(int x = 0; x < 3; x++)
        {
            
            difference = dSLRVSMirrorlessCamera[x][0] - dSLRVSMirrorlessCamera[x][1];
            
            differenceBetweenMirrorlessAndDSLR[x] = difference;
            
        }
        
        //Printing out messages.
        System.out.println("-----------------------------------------------");
        System.out.println("CAMERA TECHNOLOGY REPORT");
        System.out.println("-----------------------------------------------");
        
        //Printing out message using a for loop statement.
        for(int x = 0; x < 3; x++)
        {
            
            System.out.print(cameraTypes[x] + "          ");
            
        }
        
        //Printing out space/empty line.
        System.out.println();
        
        //Printing out messages.
        System.out.println(manufacturers[0] + "          R " + dSLRVSMirrorlessCamera[0][0] + "           R " + dSLRVSMirrorlessCamera[0][1]);
        System.out.println(manufacturers[1] + "          R " + dSLRVSMirrorlessCamera[1][0] + "            R " + dSLRVSMirrorlessCamera[1][1]);
        System.out.println(manufacturers[2] + "          R " + dSLRVSMirrorlessCamera[2][0] + "           R " + dSLRVSMirrorlessCamera[2][1]);
        
        //Printing out messages.
        System.out.println("-----------------------------------------------");
        System.out.println("CAMERA TECHNOLOGY RESULTS");
        System.out.println("-----------------------------------------------");
        
        //Printing out message using an if-else statement insinde of a for loop statement.
        for(int x = 0; x < 3; x++)
        {
            
            System.out.print(manufacturers[x] + "     R " + differenceBetweenMirrorlessAndDSLR[x]);
            if(differenceBetweenMirrorlessAndDSLR[x] >= 2500)
                System.out.println("***");
            else
                System.out.println();
            
        }
        
        //Printingout messages.
        System.out.println();
        
        //Declaring and assigning a value to a variable.
        int x = 0;
        
        //Assigning a value to a variable.
        highestDiff = differenceBetweenMirrorlessAndDSLR[0];
        
        /*
         *Using an if statement within a while loop statement to determine the highest value within the 
         *differenceBetweenMirrorlessAndDSLR array and assign it to the highestDiff variable and to the index of the 
         *highest value within the differenceBetweenMirrorlessAndDSLR array to the index variable.
         */
        while(x < differenceBetweenMirrorlessAndDSLR.length)
        {
            
            if(differenceBetweenMirrorlessAndDSLR[x] > highestDiff)
            {
                
                highestDiff = differenceBetweenMirrorlessAndDSLR[x];
                
                y = x;
                
            }
            
            index = y;
            
            x++;
            
        }
        
        //Printing out messages.
        System.out.println("CAMERA WITH THE MOST COST DIFFERENCE: " + manufacturers[index]);
        System.out.println("-----------------------------------------------");
        
    }
}
