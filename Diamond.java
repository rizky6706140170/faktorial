/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diamond;
import java.io.*;
import java.util.Scanner;
public class Diamond {
    private static int j;


    public static void main(String[] args) {
    Scanner scn = new Scanner (System.in);
        System.out.print("Masukan angka : ");
        int a = scn.nextInt();
    for (int i = 2; i < 10; i += 2) {
      for (int j = 0; j < 9 - i / 2; j++)
        System.out.print(" ");

      for (int j = 0; j < i; j++)
        System.out.print("*");

      System.out.print("\n");
    }

    for (int i = 8; i > 0; i -= 2) {
      for (int j = 0; j < 9 - i / 2; j++)
        System.out.print(" ");

      for (int j = 0; j < i; j++)
        System.out.print("*");

      System.out.print("\n");
    }
  }
}
