package com.company;

import java.util.Scanner;

class Check
{
    int balance=10000;
    void display()
    {
        System.out.println("Your account balance is:"+balance);
    }
}

class Deposit extends Check
{
    void add(int amount)
    {
        balance+=amount;
        System.out.println("Your account balance is:"+balance);
    }
}

class Withdraw extends Deposit
{
    void sub(int amount)
    {

        if((balance-amount)>=100)
        {
            balance-=amount;
            System.out.println("Your account balance is:"+balance);
        }
        else
        {
            System.out.println("You cant withdraw");
        }
    }
}
public class Bank
{
    public static void main(String[] args)
    {
        Withdraw obj=new Withdraw();
        boolean flag=true;
        Scanner sc=new Scanner(System.in);

        while(flag)
        {
            System.out.println("Select Option\n1.Check\n2.Deposit\n3.Withdraw\n4.Exit");

            int ch=sc.nextInt();

            switch(ch)
            {
                case 1 : obj.display();
                break;

                case 2 :
                    System.out.println("Enter amount:");
                    int amount=sc.nextInt();
                    obj.add(amount);
                    break;

                case 3 :
                    System.out.println("Enter amount:");
                    amount=sc.nextInt();
                    obj.sub(amount);
                    break;

                case 4 : flag= false;
                break;

                default :
                    System.out.println("Wrong Input");
                    break;
            }
        }
        sc.close();

    }
}
