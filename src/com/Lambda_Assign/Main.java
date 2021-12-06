package com.Lambda_Assign;

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Interface obj = (leftborder, rightborder) -> { long result = leftborder;
            for (long input = leftborder + 1;
                 input <= rightborder;
                 input++)
            {
                result = result * input;
            }
            return result;
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter left Border value  :");
        long leftborder = sc.nextLong();
        System.out.println("Enter right Border value  :");
        long rightborder = sc.nextLong();
        System.out.println(obj.calculate(leftborder, rightborder));
    }
}
