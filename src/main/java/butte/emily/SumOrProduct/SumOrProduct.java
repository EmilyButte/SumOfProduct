package butte.emily.SumOrProduct;
/* Write a program that asks the user for a number n and gives him the possibility
to choose between computing the sum and computing the product of 1,…,n */

import java.util.Scanner;
/**
 * Created by emilybutte on 9/10/16.
 */
public class SumOrProduct {


    public void engine() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = myScanner.nextInt();
        myScanner.nextLine();
        System.out.println("Do you want to find the product or the sum? ");
        String userChoice = myScanner.nextLine();

        if (userChoice.equals("sum")){
          sum(n);
        } else if (userChoice.equals("product")) {
          product(n);
        } else {
            System.out.println("Invalid entry");
        }
    }

    public void sum(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }

    public void product(int n) {
        int product = 0;
        for (int i = 1; i < n; i++) {
            product *= i;
            }
        System.out.println("The product is " + product);
    }

    public static void main(String[] args) {
        SumOrProduct sumOfProduct = new SumOrProduct();
        sumOfProduct.engine();
        }
    }
