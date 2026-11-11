//Author: Sam Goldberg
//Date: 6/5/2024
//Description: Main class for the application 

import java.util.Arrays;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        //Asks the user for a server name and then passes that name to getAssetLocation 
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a Virtual Asset name: ");
        String assetName = input.nextLine();
        getAssetlocation(assetName);
    }
    public static void getAssetlocation(String assetName) {
        //Converts the asseName variable to a an array of characters and then checks elements 0 to 2
        // to determine the location of the asset
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

