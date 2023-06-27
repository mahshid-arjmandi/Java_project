//daryaft yek number(hade aksar 12 raghami) az user va namayesh moadel harfi un. 

import java.util.Scanner;
public class Main
{
  public static long [] digitsList=new long[12];
  public static void main(String[] args)
  {
     long number,number_,r;
     int count=0;
     Scanner data=new Scanner(System.in);
     System.out.print("Please,enter a number:");
     number=data.nextLong();
     if(number==0)
     {
        System.out.println("_____________________________________________________________________");
        System.out.println("\n\t\tLiteral_equivalent"+"'"+number+"'"+"\t\t\t");
        System.out.println("_____________________________________________________________________");
        System.out.print("Zero");
     }


     else
     {
     System.out.println("_____________________________________________________________________");
     System.out.println("\n\t\tLiteral_equivalent"+"'"+number+"'"+"\t\t\t");
     System.out.println("_____________________________________________________________________");
     number_=number;
     while(number_>=1)
     {
       r=number_%10;
       digitsList[count]=r;//negah dari ragham ha.
       number_=number_/10;
       count++;
     }

     //adade 1 raghami.
     if(count==1)
     {
      int temp=0;
      digitsList[temp]=digitsList[1];
      oneDigitNumber(number);
     }
     

     //adad e 2 raghami.
     else if(count==2)
     {
      doubleDigitNumber(digitsList[1],digitsList[0]);
     }

     //adad e 3 raghami.
     else if(count==3)
     {
      threeDigitNumber(digitsList[2],digitsList[1],digitsList[0]);
     }     

    //adade 4 raghami.
    else if(count==4)
     {
      fourDigitNumber(digitsList[3],digitsList[2],digitsList[1],digitsList[0]);
     } 

     //adad 5 raghami.
     else if(count==5)
     {
      fiveDigitNumber(digitsList[4],digitsList[3],digitsList[2],digitsList[1],digitsList[0]);
     }  

     //adad 6 raghami.
     else if(count==6)
     {
      sixDigitNumber(digitsList[5],digitsList[4],digitsList[3],digitsList[2],digitsList[1],digitsList[0]);
     }

     //adad 7 raghami.
     else if(count==7)
     {
      sevenDigitNumber(digitsList[6],digitsList[5],digitsList[4],digitsList[3],digitsList[2],digitsList[1],digitsList[0]);
     }

     //adad 8 raghami.
     else if(count==8)
     {
      eightDigitNumber(digitsList[7],digitsList[6],digitsList[5],digitsList[4],digitsList[3],digitsList[2],digitsList[1],digitsList[0]);
     }

     //adad 9 raghami.
     else if(count==9)
     {
      nineDigitNumber(digitsList[8],digitsList[7],digitsList[6],digitsList[5],digitsList[4],digitsList[3],digitsList[2],digitsList[1],digitsList[0]);
     }

     //adad 10 raghami.
     else if(count==10)
     {
      tenDigitNumber(digitsList[9],digitsList[8],digitsList[7],digitsList[6],digitsList[5],digitsList[4],digitsList[3],digitsList[2],digitsList[1],digitsList[0]);
     }
     
     //adad 11 raghami.
     else if(count==11)
     {
      elevnDigitNumber(digitsList[10],digitsList[9],digitsList[8],digitsList[7],digitsList[6],digitsList[5],digitsList[4],digitsList[3],digitsList[2],digitsList[1],digitsList[0]);
     }

     //adad 12 raghami.
     else if(count==12)
     {
         twelveDigitNumber(digitsList[11],digitsList[10],digitsList[9],digitsList[8],digitsList[7],digitsList[6],digitsList[5],digitsList[4],digitsList[3],digitsList[2],digitsList[1],digitsList[0]);
     }

     else{
      System.out.print("The entered number has more than twelve digits.");
     }
    }
  }
     
  //adade 1 raghami.
  public static void oneDigitNumber(long digit)
  {
    
    int intDigit=(int) digit;
    switch(intDigit)
    {
    case 1:System.out.print("One");
    break;
    case 2:System.out.print("Two");
    break;
    case 3:System.out.print("Three");
    break;
    case 4:System.out.print("Four");
    break;
    case 5:System.out.print("Five");
    break;
    case 6:System.out.print("Six");
    break;
    case 7:System.out.print("Seven");
    break;
    case 8:System.out.print("Eight");
    break;
    case 9:System.out.print("Nine");
    break;
    };
    
  }
  
  //adade 2 raghami.
  public static void doubleDigitNumber(long oneDigit,long twoDigit)
  {
       //ragham aval 0.
       if(oneDigit==0)
       {
        oneDigitNumber(twoDigit);
       }

       //ragham aval 1.
      if(oneDigit==1)
      {
          int inttwoDigit=(int) twoDigit;
        //ragham dovom.
        switch(inttwoDigit)
       {
        case 0:System.out.print("Ten");
        break;
        case 1:System.out.print("Eleven");
        break;
        case 2:System.out.print("Twelve");
        break;
        case 3:System.out.print("Thirteen");
        break;
        case 4:System.out.print("Fourteen");
        break;
        case 5:System.out.print("Fifteen");
        break;
        case 6:System.out.print("Sixteen");
        break;
        case 7:System.out.print("Seventeen");
        break;
        case 8:System.out.print("Eighteen");
        break;
        case 9:System.out.print("Nineteen");
        break;
       } 
     }   
       
      //ragham aval 2.
       else if(oneDigit==2)
      {
        System.out.print("Twenty ");
        oneDigitNumber(twoDigit);
      }

      //ragham aval 3.
       else if(oneDigit==3)
       {
        System.out.print("Thirty ");
        oneDigitNumber(twoDigit);
       }

       //ragham aval 4.
       else if(oneDigit==4)
       {
        System.out.print("Forty ");
        oneDigitNumber(twoDigit);
       }

       //ragham aval 5.
       else if(oneDigit==5)
       {
        System.out.print("Fifty ");
        oneDigitNumber(twoDigit);
       }
      
       //ragham aval 6.
       else if(oneDigit==6)
       {
        System.out.print("Sixty ");
        oneDigitNumber(twoDigit);
       }

       //ragham aval 7.
       else if (oneDigit==7)
       {
        System.out.print("Seventy ");
        oneDigitNumber(twoDigit);
       }

       //ragham aval 8.
       else if(oneDigit==8)
       {
        System.out.print("Eighty ");
        oneDigitNumber(twoDigit);
       }

       //ragham aval 9.
       else if(oneDigit==9)
       {
        System.out.print("Ninety ");
        oneDigitNumber(twoDigit);
       }

  }

  //adade 3 raghami.
  public static void threeDigitNumber(long threeDigit,long twoDigit,long oneDigit)
  {
     
      //ragham aval.
        oneDigitNumber(threeDigit);
        if(threeDigit!=0)System.out.print(" hundred ");
        
        
        //doubleDigitNumber(digitsList[1],digitsList[0]);
        if(twoDigit!=0)
        {
          doubleDigitNumber(twoDigit,oneDigit);
        }
        else//twoDigit==0
        {
          oneDigitNumber(oneDigit);
        }
  }
  

  //adade 4 raghami.
  public static void fourDigitNumber(long fourDigit,long threeDigit,long twoDigit,long oneDigit)
  {
     
      //ragham aval .
        oneDigitNumber(fourDigit);
        System.out.print(" Thousand ");
        //ragham e dovom.
        if(threeDigit!=0)
        {
             //argham e baghimandeh tashkil e adad 3 raghami midahand.
             threeDigitNumber(threeDigit,twoDigit,oneDigit);
        }
        else 
        {
            doubleDigitNumber(twoDigit,oneDigit);
        }
  }

  //adad 5 raghami.
  public static void fiveDigitNumber(long fiveDigit,long fourDigit,long threeDigit,long twoDigit,long oneDigit)
  {
    //ragham aval va dovom az samte chap(araghami ke dar number made nazar daraye bishtarin arzesh makani mibashadand).
    doubleDigitNumber(fiveDigit,fourDigit);
    System.out.print(" Thousand ");
    
    //argahm az samte chap :ragham e sevom.
    if(threeDigit!=0)//ragham e sevom.
    {
         //argham e baghimandeh tashkil e adad 3 raghami midahand.
         threeDigitNumber(threeDigit,twoDigit,oneDigit);
    }
    else //if(threeDigit==0)
    {
        //argham e baghimandeh tashkil e adad 2 raghami midahand.
        doubleDigitNumber(twoDigit,oneDigit);
      
    }
  }

  //adad 6 raghami.
  public static void sixDigitNumber(long sixDigit,long fiveDigit,long fourDigit,long threeDigit,long twoDigit,long oneDigit)
  {
     //3ragham aval az samte chap(raghami ke dar number made nazar daraye bishtarin arzesh makani mibashad).
     
     threeDigitNumber(sixDigit,fiveDigit,fourDigit);
     System.out.print(" Thousand ");
     //3 ragham e dovom.
     threeDigitNumber(threeDigit,twoDigit,oneDigit);
  }

  //adad 7 raghami.

  public static void sevenDigitNumber(long sevenDigit,long sixDigit,long fiveDigit,long fourDigit,long threeDigit,long twoDigit,long oneDigit)
  {
    //ragham e aval.
    oneDigitNumber(sevenDigit);
    System.out.print(" Million ");
    
    threeDigitNumber(sixDigit,fiveDigit,fourDigit);
    if(sixDigit!=0 || fiveDigit!=0 || fourDigit!=0)System.out.print(" Thousand ");
    //3 ragham e dovom.
    threeDigitNumber(threeDigit,twoDigit,oneDigit);
    
  }

  //adade 8 raghami.
  public static void eightDigitNumber(long eightDigit,long sevenDigit,long sixDigit,long fiveDigit,long fourDigit,long threeDigit,long twoDigit,long oneDigit)
  {
    //2 ragham aval az samte chap.
    doubleDigitNumber(eightDigit,sevenDigit);
    System.out.print(" Million ");
    
    //3 ragham badi. 
    threeDigitNumber(sixDigit,fiveDigit,fourDigit);
    if(sixDigit!=0 || fiveDigit!=0 || fourDigit!=0)System.out.print(" Thousand ");
    
    //3 ragham akhar.
    threeDigitNumber(threeDigit,twoDigit,oneDigit);
  }

  //adade 9 raghami.
  public static void nineDigitNumber(long nineDigit,long eightDigit,long sevenDigit,long sixDigit,long fiveDigit,long fourDigit,long threeDigit,long twoDigit,long oneDigit)
  {
       //3ragham e aval az chap.
       
       threeDigitNumber(nineDigit,eightDigit,sevenDigit);
       System.out.print(" Million ");

       //3 ragham dovom.
        threeDigitNumber(sixDigit,fiveDigit,fourDigit);
        if(sixDigit!=0 || fiveDigit!=0 || fourDigit!=0)System.out.print(" Thousand ");
      //3 ragham akhar.  
        threeDigitNumber(threeDigit,twoDigit,oneDigit);
  }

  //adade 10 raghami.
  public static void tenDigitNumber(long tenDigit,long nineDigit,long eightDigit,long sevenDigit,long sixDigit,long fiveDigit,long fourDigit,long threeDigit,long twoDigit,long oneDigit)
  {
       //2 ragham e aval az chap.
       oneDigitNumber(tenDigit);
       System.out.print(" Billion ");

       //3ragham badi .
        threeDigitNumber(nineDigit,eightDigit,sevenDigit);
        if(nineDigit!=0 || eightDigit!=0 || sevenDigit!=0)System.out.print(" Million ");
      
       
        //3 ragham sevom.
        threeDigitNumber(sixDigit,fiveDigit,fourDigit);
        if(sixDigit!=0 || fiveDigit!=0 || fourDigit!=0)System.out.print(" Thousand ");

        //3 ragham e akhar.
        threeDigitNumber(threeDigit,twoDigit,oneDigit);
       
  }

  //adad e 11 raghami.
  public static void elevnDigitNumber(long elevenDigit,long tenDigit,long nineDigit,long eightDigit,long sevenDigit,long sixDigit,long fiveDigit,long fourDigit,long threeDigit,long twoDigit,long oneDigit)
  {
       //2ragham e aval az chap.
       doubleDigitNumber(elevenDigit,tenDigit);
       System.out.print(" Billion ");

       //3ragham badi .
        threeDigitNumber(nineDigit,eightDigit,sevenDigit);
        if(nineDigit!=0 || eightDigit!=0 || sevenDigit!=0)System.out.print(" Million ");
       
        //3ragham dovom.
        threeDigitNumber(sixDigit,fiveDigit,fourDigit);
        if(sixDigit!=0 || fiveDigit!=0 || fourDigit!=0)System.out.print(" Thousand ");

        //3ragham e akhar.
        threeDigitNumber(threeDigit,twoDigit,oneDigit);    
  }

  //12 raghami.
  public static void twelveDigitNumber(long twelveDigit,long elevenDigit,long tenDigit,long nineDigit,long eightDigit,long sevenDigit,long sixDigit,long fiveDigit,long fourDigit,long threeDigit,long twoDigit,long oneDigit)
  {
    threeDigitNumber(twelveDigit,elevenDigit,tenDigit);
    System.out.print(" Billion ");

    //3ragham badi . 
    threeDigitNumber(nineDigit,eightDigit,sevenDigit);
    if(nineDigit!=0 || eightDigit!=0 || sevenDigit!=0)System.out.print(" Million ");

    //3ragham dovom.
    threeDigitNumber(sixDigit,fiveDigit,fourDigit);
    if(sixDigit!=0 || fiveDigit!=0 || fourDigit!=0)System.out.print(" Thousand ");

    //3ragham e akhar.
    threeDigitNumber(threeDigit,twoDigit,oneDigit);
   
  }
}
  
  

    
  



    
  

