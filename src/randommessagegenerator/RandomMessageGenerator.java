/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package randommessagegenerator;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author dbarter1
 */
public class RandomMessageGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> messageList = new ArrayList<String>();
        messageList.add("Message number one!");
        messageList.add("Message number two!");
        messageList.add("Message number three!");
        messageList.add("Message number four!");
        messageList.add("Message number five!");
        messageList.add("Message number six!");
        messageList.add("Message number three!");
        
        //Set the arraylist to a linked hash set to maintain the order but eliminate duplicates
        Set<String> messageSet = new LinkedHashSet<String>(messageList);
        //Set the linked hash set back ot an array list
        messageList = new ArrayList<String>(messageSet);
        
        //Get the random set to nanotime
        Random RandomGenerator = new Random(System.nanoTime());
        //Determine random number
        int randomNumber = RandomGenerator.nextInt(messageList.size());
        String randomMessage = messageList.get(randomNumber);  
        System.out.println();
        
        
    }
    
}
