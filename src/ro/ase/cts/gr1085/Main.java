package ro.ase.cts.gr1085;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Tastati ceva");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String text = null;
            text = br.readLine();
            System.out.println(text);
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }


    }

}
