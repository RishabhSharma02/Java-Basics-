package com.company;
import java.util.Scanner;
class Maxage extends Exception{
    @Override
    public String toString() {
        return "Do check if age is less than 125";
    }
}
public class custom_exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        if (a > 125) {
            try {
                throw new Maxage();
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
