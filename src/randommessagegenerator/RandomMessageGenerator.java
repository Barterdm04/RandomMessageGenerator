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
        
        
        Set<String> MessageSet = new LinkedHashSet<String>(messageList);
        messageList = new ArrayList<String>(messageList);
        
        Random RandomGenerator = new Random(System.nanoTime());
        int randomNumber = RandomGenerator.nextInt(messageList.size());
        String randomMessage = (String)messageList.get(randomNumber);  
        System.out.println();
        
        
    }
    
}
