package com.sjprogramming;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        AtmOperationInterf op=new AtmOperationImpl();
        int atmnumber=12345;
        int atmpin=123;
        Scanner in=new Scanner(System.in) ;
        System.out. println("Welcome to ATM Machine..");
        System.out. print("Enter Atm Number : ");
        int atmNumber=in.nextInt();
        System.out. print("Enter Pin: ");
        int pin=in.nextInt();
        if((atmnumber == atmNumber) &&(atmpin == pin) ){
            while(true){
                System.out.println("1. View Available Balance\n2. Withdraw\n3. Deposit Amount\n4. View Ministatement\n5. Exit");
                System.out.println("Enter Choice : ");
                int ch=in.nextInt();
                if(ch==1){
                    op.viewBalance();

                }
                else if(ch==2){

                }
                else if(ch==3){
                    System.out.println("Enter Amount to Deposit :");
                    double depositAmount=in.nextDouble();
                    op.depositAmount(depositAmount);

                }
                else if(ch==4){

                }
                else if(ch==5){
                    System.out.println("Collect your ATM card\n Thank you");
                }
                else{
                    System.out.print("Incorrect Choice");
                }
            }
        }
        else{
            System.out.println("Incorrect ATM Number or Pin");
        }
    }
}
