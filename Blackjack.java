/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author kendrabooker
 */
public class Blackjack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ky = new Scanner(System.in);
        Random r = new Random();
        
        String playerInput;
        
        int pCard1, pCard2, playerTotal, dCard1, dCard2, dealerTotal, hit, count;
        
        pCard1 = 1 + r.nextInt(10);
        pCard2 = 1 + r.nextInt(10);
        playerTotal = 0;
        dCard1 = 1 + r.nextInt(10);
        dCard2 = 1 + r.nextInt(10);
        dealerTotal = 0;
        hit = 1 + r.nextInt();
        count = 1;
        
        System.out.println("Welcome to the blackjack game!" + "\n");
        System.out.println("you get a " + pCard1 + " and a " + pCard2 + "\n" + "your total is " + (pCard1 + pCard2));
        playerTotal = (pCard1 + pCard2);
        System.out.println("\n" + "the dealer has a " + dCard1 + " showing " + "and a hidden card" + "\n" + "his total is hidden too " + "\n");
        dealerTotal = dCard1;
        
        while(count > 0){
        
            System.out.print("would you like to \"hit\" or \"stay\"? ");
            playerInput = ky.next();
            
            if("hit".equals(playerInput)){
            
                System.out.println("you drew a " + (hit = 1 + r.nextInt(10)) + "\n");
                playerTotal = playerTotal + hit;
                System.out.println("your total is " + playerTotal + "\n");
                if(playerTotal > 21){
                    
                    count = 0;
                    System.out.println("you went over 21 so the dealer wins" + "\n");
                    break;
                }
                
            
            }else{
            
                System.out.println("okay, it's the dealer's turn \n" + "his hidden card was " + (hit = 1 + r.nextInt(10)) + "\n");
                dealerTotal = dealerTotal + hit;
                
                if(dealerTotal <= 16){
                   
                    while(dealerTotal <= 16){
                    
                        System.out.println("the dealers total is "+ dealerTotal + "\n" + "the dealer decides to take a hit\n"+ "the dealer drew a " +  (hit = 1 + r.nextInt(10)) + "\n");
                        dealerTotal = dealerTotal + hit;
                     }
                
                }else if(dealerTotal > 21 && playerTotal <= 21){

                            count = 0;
                            System.out.println("the dealer went over 21, you win");
                            break;
                        }

                        if(dealerTotal >= playerTotal && dealerTotal <= 21){

                            count = 0;
                            System.out.println("the dealer wins with " + dealerTotal + " to your " + playerTotal);
                            break;
                        }else{

                            count = 0;
                            System.out.println("you win with " + playerTotal + " to the dealers " + dealerTotal);
                            break;
                        }
                
            
            }
            
        }
        
    
    
    
    
    
    
    
    
    }
    
}
