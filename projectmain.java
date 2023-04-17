/*Name Nitya Boyapati
Roll No HU21CSEN0100723*/
import java.util.Scanner;
class fun
{
    int bal;
    int dp;
    int wd;
    void us1()
    {
        String [] arr011={"Name: User 1","AccType:Savings "};
        int [] arr012={001,10000};
        for(int i=0;i<2;i++)
        {
            System.out.print(arr011[i]);
            System.out.println();
        }
        bal=arr012[1];
        System.out.print("User id:001");
        System.out.println();
    }
    void us2()
    {
        String [] arr021={"Name: User 2","AccType:Current "};
        int [] arr022={010,20000};
        for(int i=0;i<2;i++)
        {
            System.out.print(arr021[i]);
            System.out.println();
        }
        bal=arr022[1];
        System.out.print("User id:010");
        System.out.println();
    }    
    void us3()
    {
        String [] arr031={"Name: User 3","AccType:Savings "};
        int [] arr032={010,30000};
        for(int i=0;i<2;i++)
        {
            System.out.print(arr031[i]);
            System.out.println();
        }
        bal=arr032[1];
        System.out.print("User id:010");
        System.out.println();
    }
    void us4()
    {
        String [] arr041={"Name: User 4","AccType:Current "};
        int [] arr042={100,40000};
        for(int i=0;i<2;i++)
        {
            System.out.print(arr041[i]);
            System.out.println();
        }
        bal=arr042[1];
        System.out.print("User id:100");
        System.out.println();        
    }
    void us5()
    {
        String [] arr051={"Name: User 5","AccType:Current "};
        int [] arr052={101,50000};
        for(int i=0;i<2;i++)
        {
            System.out.print(arr051[i]);
            System.out.println();
        }
        bal=arr052[1];
        System.out.print("User id:100");
        System.out.println();        
    }
    void checkbal()
    {
        System.out.println("Your balance is: "+bal);
    }
    void with()
    {
        System.out.println();
        System.out.print("Enter amount to be withdrawed: ");
        Scanner sc1=new Scanner(System.in);
        wd=sc1.nextInt();
        bal=bal-wd;
        System.out.println("Your balance is: "+bal);
    }
    void dep()
    {
        System.out.println();
        System.out.print("Enter amount to be deposited: ");
        Scanner sc2=new Scanner(System.in);
        dp=sc2.nextInt();
        bal=bal+dp;
        System.out.println("Your balance is: "+bal);
    }
    void msw()
    {

    }
    void msd()
    {
    
    }
    void ex()
    {
        System.out.println("Bye Have a Nice Day");
    }
}
class Main
{
    public static void main(String[] args)
    {
        System.out.print("Enter password: ");
        Scanner sc9=new Scanner(System.in);
        int psw=sc9.nextInt();
        if(psw==123)
        {
            fun obj=new fun();
            obj.us1();
            int n=0;
            while(n<100)
            {
                System.out.println("Enter 1 for balance check");
                System.out.println("Enter 2 for withdrawal");
                System.out.println("Enter 3 for deposite");
                System.out.println("Enter 4 for mini statement");
                System.out.println("Enter 5 to exit");
                Scanner sc=new Scanner(System.in);
                int opt=sc.nextInt();
                if(opt==1)
                {
                    obj.checkbal();
                }
                else if(opt==2)
                {
                    obj.with();
                }
                else if(opt==3)
                {
                    obj.dep();
                }
                else if(opt==4)
                {
                    
                }
                else if(opt==5)
                {
                    obj.ex();
                    break;
                }
                else
                {
                    System.out.println("Wrong option");
                }
                n=n+1;
            }
        }
        else if(psw==456)
        {
            fun obj=new fun();
            obj.us2();
            int m=0;
            while(m<100)
            {
                System.out.println("Enter 1 for balance check");
                System.out.println("Enter 2 for withdrawal");
                System.out.println("Enter 3 for deposite");
                System.out.println("Enter 4 for mini statement");
                System.out.println("Enter 5 to exit");
                Scanner sc=new Scanner(System.in);
                int opt=sc.nextInt();
                if(opt==1)
                {
                    obj.checkbal();
                }
                else if(opt==2)
                {
                    obj.with();
                }
                else if(opt==3)
                {
                    obj.dep();
                }
                else if(opt==4)
                {
                    
                }
                else if(opt==5)
                {
                    obj.ex();
                    break;
                }
                else
                {
                    System.out.println("Wrong option");
                }
                m=m+1;
            }
        }
        else if(psw==789)
        {
            fun obj=new fun();
            obj.us3();
            int m=0;
            while(m<100)
            {
                System.out.println("Enter 1 for balance check");
                System.out.println("Enter 2 for withdrawal");
                System.out.println("Enter 3 for deposite");
                System.out.println("Enter 4 for mini statement");
                System.out.println("Enter 5 to exit");
                Scanner sc=new Scanner(System.in);
                int opt=sc.nextInt();
                if(opt==1)
                {
                    obj.checkbal();
                }
                else if(opt==2)
                {
                    obj.with();
                }
                else if(opt==3)
                {
                    obj.dep();
                }
                else if(opt==4)
                {
                    
                }
                else if(opt==5)
                {
                    obj.ex();
                    break;
                }
                else
                {
                    System.out.println("Wrong option");
                }
                m=m+1;
            }
        }
        else if(psw==987)
        {
            fun obj=new fun();
            obj.us4();
            int m=0;
            while(m<100)
            {
                System.out.println("Enter 1 for balance check");
                System.out.println("Enter 2 for withdrawal");
                System.out.println("Enter 3 for deposite");
                System.out.println("Enter 4 for mini statement");
                System.out.println("Enter 5 to exit");
                Scanner sc=new Scanner(System.in);
                int opt=sc.nextInt();
                if(opt==1)
                {
                    obj.checkbal();
                }
                else if(opt==2)
                {
                    obj.with();
                }
                else if(opt==3)
                {
                    obj.dep();
                }
                else if(opt==4)
                {
                    
                }
                else if(opt==5)
                {
                    obj.ex();
                    break;
                }
                else
                {
                    System.out.println("Wrong option");
                }
                m=m+1;
            }
        }
        else if(psw==321)
        {
            fun obj=new fun();
            obj.us5();
            int m=0;
            while(m<100)
            {
                System.out.println("Enter 1 for balance check");
                System.out.println("Enter 2 for withdrawal");
                System.out.println("Enter 3 for deposite");
                System.out.println("Enter 4 for mini statement");
                System.out.println("Enter 5 to exit");
                Scanner sc=new Scanner(System.in);
                int opt=sc.nextInt();
                if(opt==1)
                {
                    obj.checkbal();
                }
                else if(opt==2)
                {
                    obj.with();
                }
                else if(opt==3)
                {
                    obj.dep();
                }
                else if(opt==4)
                {
                    
                }
                else if(opt==5)
                {
                    obj.ex();
                    break;
                }
                else
                {
                    System.out.println("Wrong option");
                }
                m=m+1;
            }
        }
        else
        {
            System.out.print("Wrong password");
        }
    }
}
