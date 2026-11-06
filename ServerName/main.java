//Author: Sam Goldberg
//Date: 6/5/2024
//Description: Main class for the application 

import java.util.Arrays;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a Virtual Asset name: ");
        String assetName = input.nextLine();
        //System.out.println("You entered: " + assetName);
        getAssetlocation(assetName);

    }
    static void getAssetlocation(String assetName) {
        char[] assetLocation= assetName.toCharArray();
        char[] location = Arrays.copyOfRange(assetLocation, 0, 3);
        if ((location[1] == 'V') && (location[2] == 'F')) {
            System.out.println("The asset is located at the Valley Forge Data Center.");
        }  else if ((location[1] == 'T') && (location[2] == 'P')) {
            System.out.println("The asset is located at the Tek ParkData Center.");
        } else if ((location[1] == 'C') && (location[2] == 'C')) {
            System.out.println("The asset is located at the Cash Connect Data Center.");
        } else {
            System.out.println("The asset location is unknown.");
        }
    }
} 
