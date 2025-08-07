/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bound.properties;

/**
 *
 * @author WANITTRA
 */
import java.util.Scanner;
public class BoundProperties {

    public static void main(String[] args) {
        LiveScoreBean liveScore = new LiveScoreBean();

        
        Subscriber sub1 = new Subscriber("Subscriber1");
        Subscriber sub2 = new Subscriber("Subscriber2");

      
        liveScore.addPropertyChangeListener(sub1);
        liveScore.addPropertyChangeListener(sub2);

        Scanner sc = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Enter Score: ");
            input = sc.nextLine().trim();

            if (input.isEmpty()) {
                break;
            }

            liveScore.setScoreLine(input);
        }

        sc.close();
        System.out.println("Program ended.");
    }
}
