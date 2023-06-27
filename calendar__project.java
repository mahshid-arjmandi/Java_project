import java.util.Scanner;
public class calendar__project
{
  public static int monthDayLastIndex;//mogheeiyat e makani akharin rouz e   mah(6 mah aval 31 va 5 mah dovom 30) ra taeein mikonad.
  public static void main(String[] args)
  {
    String []day={"Sat","Sun","Mon","Tus","Wen","Tur","Fri"};
    String []month={"OrdibeheSht","khorDaD","Tir","MorDaD","ShahRivaR","MehR","AbaN","AzaR","DeY","BahmaN","Esfand"};
    int dayFirst=1,yearDayFirst,desiredYear,r;//be komak r taeein mikonim aya sal kabiseh ast ya kheyr.(r=>baghimandeh sal e made nazar bar 33)
    int kabiseh=0;
    int [] remainder={1,5,9,13,17,21,26,30};//baghimandeh
    int [] remainde={1,5,9,13,16,17,20,22,26,30};//baghimandeh
    Scanner data=new Scanner(System.in);
    System.out.print("Please,enter the desired year:");
    desiredYear=data.nextInt();
    System.out.print("Please,enter a number between 1-7:");
    yearDayFirst=data.nextInt();
    r=desiredYear%33;
    
    //taein inke aya sal kabiseh ast ya kheyr.
    if(desiredYear>=1244 && desiredYear<=1342)
    {
     for(int i=0;i<8;i++)
     {
      if(r==remainder[i])
      {
       kabiseh=(kabiseh)+1;
      }
    }
   }
   
   //taein inke aya sal kabiseh ast ya kheyr.

    else if(desiredYear>=1343 && desiredYear<=1472)
    {
     for(int f=0;f<10;f++)
     {
      if(r==remainde[f])
      {
        kabiseh=(kabiseh)+1;
      }
     }
    }

    //farvardin.
    //taeein avalin rouze sal.   
      switch(yearDayFirst)
      {
            case 1://avalin rouze sal saturday mibashad.
            System.out.println("____________________________________________________"+"\n\t\t    FarVarDin"+"\n____________________________________________________");
                  for(int dayIndex=0;dayIndex<7;dayIndex++)
                  {
                    System.out.print(day[dayIndex]+"\t");
                  }
                  System.out.println();
                for(int i=0;i<6;i++)
                {
                   
                    for(int j=0;j<7;j++)
                    {
                        if(dayFirst<=31)
                        {
                            
                        if(dayFirst==31)
                        {  
                            monthDayLastIndex=j;
                        }    
                        System.out.print(dayFirst+"\t");
                        dayFirst++;
                        }
                    }
                    System.out.println("\n");
                   
                };
            break; 
            case 2://avalin rouze sal sunday mibashad.
            System.out.println("____________________________________________________"+"\n\t\t    FarVarDin"+"\n____________________________________________________");
            for(int dayIndex=0;dayIndex<7;dayIndex++)
            {
              System.out.print(day[dayIndex]+"\t");
            }
            System.out.println();
          for(int i=0;i<6;i++)
          {
            for(int j=0;j<7;j++)
            {

                if(dayFirst==1)
                {
                    if(j==1)//day[monthDayLastIndex]=>'day[1]=sunday'
                    {
                        System.out.print(dayFirst+"\t");
                        dayFirst++;
                        
                    }
                    else if (j<1)
                    {
                       System.out.print("\t");
                    }
                }

                  
                else if(dayFirst>1)
                {
                 if(dayFirst<=31)
                 {
                    if(dayFirst==31)
                    {
                     monthDayLastIndex=j;
                    }   
                    
                     System.out.print(dayFirst+"\t");
                     dayFirst++;
                    
                 }
               }
            }
              System.out.println("\n");
             
          };
          break;

            
            case 3://avalin rouze sal Monday.
            System.out.println("____________________________________________________"+"\n\t\t    FarVarDin"+"\n____________________________________________________");
            for(int dayIndex=0;dayIndex<7;dayIndex++)
            {
              System.out.print(day[dayIndex]+"\t");
            }
            System.out.println();
          for(int i=0;i<6;i++)
          {
            for(int j=0;j<7;j++)
            {

                if(dayFirst==1)
                {
                    if(j==2)//day[monthDayLastIndex]=>'day[2]=Monday'
                    {
                        System.out.print(dayFirst+"\t");
                        dayFirst++;
                        
                    }
                    else if (j<2)
                    {
                       System.out.print("\t");
                    }
                }

                  
                else if(dayFirst>1)
                {
                 if(dayFirst<=31)
                 {
                    if(dayFirst==31)
                    {
                     monthDayLastIndex=j;
                    }   
                    
                     System.out.print(dayFirst+"\t");
                     dayFirst++;
                    
                 }
               }
            }
              System.out.println("\n");
             
          };
            break;
            case 4://avalin rouze sal tusday.
            System.out.println("____________________________________________________"+"\n\t\t    FarVarDin"+"\n____________________________________________________");
            for(int dayIndex=0;dayIndex<7;dayIndex++)
            {
              System.out.print(day[dayIndex]+"\t");
            }
            System.out.println();
          for(int i=0;i<6;i++)
          {
            for(int j=0;j<7;j++)
            {

                if(dayFirst==1)
                {
                    if(j==3)//day[monthDayLastIndex]=>'day[3]=Tusday'
                    {
                        System.out.print(dayFirst+"\t");
                        dayFirst++;
                        
                    }
                    else if (j<3)
                    {
                       System.out.print("\t");
                    }
                }

                  
                else if(dayFirst>1)
                {
                 if(dayFirst<=31)
                 {
                    if(dayFirst==31)
                    {
                     monthDayLastIndex=j;
                    }   
                    
                     System.out.print(dayFirst+"\t");
                     dayFirst++;
                    
                 }
               }
            }
              System.out.println("\n");
             
          };
          break;
            case 5://avalin rouz e sal wendsday.

            System.out.println("____________________________________________________"+"\n\t\t    FarVarDin"+"\n____________________________________________________");
            for(int dayIndex=0;dayIndex<7;dayIndex++)
            {
              System.out.print(day[dayIndex]+"\t");
            }
            System.out.println();
          for(int i=0;i<6;i++)
          {
            for(int j=0;j<7;j++)
            {

                if(dayFirst==1)
                {
                    if(j==4)//day[monthDayLastIndex]=>'day[4]=wednesday'
                    {
                        System.out.print(dayFirst+"\t");
                        dayFirst++;
                        
                    }
                    else if (j<4)
                    {
                       System.out.print("\t");
                    }
                }

                  
                else if(dayFirst>1)
                {
                 if(dayFirst<=31)
                 {
                    if(dayFirst==31)
                    {
                     monthDayLastIndex=j;
                    }   
                    
                     System.out.print(dayFirst+"\t");
                     dayFirst++;
                    
                 }
               }
            }
              System.out.println("\n");
             
          };
            break;
            case 6://avalin rouz sal Tursday.

            System.out.println("____________________________________________________"+"\n\t\t    FarVarDin"+"\n____________________________________________________");
            for(int k=0;k<7;k++)
            {
              System.out.print(day[k]+"\t");
            }
            System.out.println();
          for(int i=0;i<6;i++)
          {
            for(int j=0;j<7;j++)
            {

                if(dayFirst==1)
                {
                    if(j==5)//day[monthDayLastIndex]=>'day[5]=Tursday'
                    {
                        System.out.print(dayFirst+"\t");
                        dayFirst++;
                        
                    }
                    else if (j<5)
                    {
                       System.out.print("\t");
                    }
                }

                  
                else if(dayFirst>1)
                {
                 if(dayFirst<=31)
                 {
                    if(dayFirst==31)
                    {
                     monthDayLastIndex=j;
                    }   
                    
                     System.out.print(dayFirst+"\t");
                     dayFirst++;
                    
                 }
               }
            }
              System.out.println("\n");
             
          };
            break;
            case 7://avalin rouz e sal Friday.

            System.out.println("____________________________________________________"+"\n\t\t    FarVarDin"+"\n____________________________________________________");
            for(int dayIndex=0;dayIndex<7;dayIndex++)
            {
              System.out.print(day[dayIndex]+"\t");
            }
            System.out.println();
          for(int i=0;i<6;i++)
          {
            for(int j=0;j<7;j++)
            {

              if(dayFirst==1)
              {
                if(j==6)//day[monthDayLastIndex]=>'day[6]=Friday'
                {
                  System.out.print(dayFirst+"\t");
                  dayFirst++;
                        
                }
                else if (j<6)
                {
                  System.out.print("\t");
                }
              }

                  
              else if(dayFirst>1)
              {
                if(dayFirst<=31)
                {
                  if(dayFirst==31)
                  {
                    monthDayLastIndex=j;
                  }   
                    
                  System.out.print(dayFirst+"\t");
                  dayFirst++;
               }
              }
            } 
            System.out.println("\n");
          } ;           
          break;
          default:System.out.println("\t\t    :(\nThe entered number is not in the range of 1-7.");
        }


   //tolid e 5 mah bad az farvardin ke 31 rouzeh mibashand.
   for(int monthIndex=0;monthIndex<5;monthIndex++)
      {
        dayFirst=1;
        monthDayLastIndex=monthDayLastIndex+1;


        if(monthDayLastIndex>=7)
        {
            monthDayLastIndex=0;
        }
        
        
        //taeein avalin rouze mah.
        
         switch(monthDayLastIndex)
         {
            case 0:
            System.out.println("____________________________________________________"+"\n\t\t    "+month[monthIndex]+"\n____________________________________________________");
            for(int dayIndex=0;dayIndex<7;dayIndex++)
            {
              System.out.print(day[dayIndex]+"\t");
            }
            System.out.println();
          for(int i=0;i<6;i++)
          {
            for(int j=0;j<7;j++)
            {

                if(dayFirst==1)
                {
                    if(j==monthDayLastIndex)//day[monthDayLastIndex]=>'day[0]=Saturday'
                    {
                        System.out.print(dayFirst+"\t");
                        dayFirst++;
                        
                    }
                    else if (j<monthDayLastIndex)
                    {
                       System.out.print("\t");
                    }
                }

                  
                else if(dayFirst>1)
                {
                 if(dayFirst<=31)
                 {
                    if(dayFirst==31)
                    {
                     monthDayLastIndex=j;
                    }   
                    
                     System.out.print(dayFirst+"\t");
                     dayFirst++;
                    
                 }
               }
            }
              System.out.println("\n");
             
          };
            break;
             
            case 1:

            System.out.println("____________________________________________________"+"\n\t\t    "+month[monthIndex]+"\n____________________________________________________");
            for(int dayIndex=0;dayIndex<7;dayIndex++)
            {
              System.out.print(day[dayIndex]+"\t");
            }
            System.out.println();
          for(int i=0;i<6;i++)
          {
            for(int j=0;j<7;j++)
            {

                if(dayFirst==1)
                {
                    if(j==monthDayLastIndex)//day[monthDayLastIndex]=>'day[1]=sunday'
                    {
                        System.out.print(dayFirst+"\t");
                        dayFirst++;
                        
                    }
                    else if (j<monthDayLastIndex)
                    {
                       System.out.print("\t");
                    }
                }

                  
                else if(dayFirst>1)
                {
                 if(dayFirst<=31)
                 {
                    if(dayFirst==31)
                    {
                     monthDayLastIndex=j;
                    }   
                    
                     System.out.print(dayFirst+"\t");
                     dayFirst++;
                    
                 }
               }
            }
              System.out.println("\n");
             
          };
            break;
            case 2:

            System.out.println("____________________________________________________"+"\n\t\t    "+month[monthIndex]+"\n____________________________________________________");
            for(int dayIndex=0;dayIndex<7;dayIndex++)
            {
              System.out.print(day[dayIndex]+"\t");
            }
            System.out.println();
          for(int i=0;i<6;i++)
          {
            for(int j=0;j<7;j++)
            {

                if(dayFirst==1)
                {
                    if(j==monthDayLastIndex)//day[monthDayLastIndex]=>'day[2]=Monday'
                    {
                        System.out.print(dayFirst+"\t");
                        dayFirst++;
                        
                    }
                    else if (j<monthDayLastIndex)
                    {
                       System.out.print("\t");
                    }
                }

                  
                else if(dayFirst>1)
                {
                 if(dayFirst<=31)
                 {
                    if(dayFirst==31)
                    {
                     monthDayLastIndex=j;
                    }   
                    
                     System.out.print(dayFirst+"\t");
                     dayFirst++;
                    
                 }
               }
            }
              System.out.println("\n");
             
          };
            break;
            case 3:

            System.out.println("____________________________________________________"+"\n\t\t    "+month[monthIndex]+"\n____________________________________________________");
            for(int dayIndex=0;dayIndex<7;dayIndex++)
            {
              System.out.print(day[dayIndex]+"\t");
            }
            System.out.println();
          for(int i=0;i<6;i++)
          {
            for(int j=0;j<7;j++)
            {

                if(dayFirst==1)
                {
                    if(j==monthDayLastIndex)//day[monthDayLastIndex]=>'day[3]=Tusday'
                    {
                        System.out.print(dayFirst+"\t");
                        dayFirst++;
                        
                    }
                    else if (j<monthDayLastIndex)
                    {
                       System.out.print("\t");
                    }
                }

                  
                else if(dayFirst>1)
                {
                 if(dayFirst<=31)
                 {
                    if(dayFirst==31)
                    {
                     monthDayLastIndex=j;
                    }   
                    
                     System.out.print(dayFirst+"\t");
                     dayFirst++;
                    
                 }
               }
            }
              System.out.println("\n");
             
          };
            break;
            case 4:
            System.out.println("____________________________________________________"+"\n\t\t    "+month[monthIndex]+"\n____________________________________________________");
            for(int dayIndex=0;dayIndex<7;dayIndex++)
            {
              System.out.print(day[dayIndex]+"\t");
            }
            System.out.println();
          for(int i=0;i<6;i++)
          {
            for(int j=0;j<7;j++)
            {

                if(dayFirst==1)
                {
                    if(j==monthDayLastIndex)//day[monthDayLastIndex]=>'day[4]=wednesday'
                    {
                        System.out.print(dayFirst+"\t");
                        dayFirst++;
                        
                    }
                    else if (j<monthDayLastIndex)
                    {
                       System.out.print("\t");
                    }
                }

                  
                else if(dayFirst>1)
                {
                 if(dayFirst<=31)
                 {
                    if(dayFirst==31)
                    {
                     monthDayLastIndex=j;
                    }   
                    
                     System.out.print(dayFirst+"\t");
                     dayFirst++;
                    
                 }
               }
            }
              System.out.println("\n");
             
          };
            break;
            case 5:

            System.out.println("____________________________________________________"+"\n\t\t    "+month[monthIndex]+"\n____________________________________________________");
            for(int dayIndex=0;dayIndex<7;dayIndex++)
            {
              System.out.print(day[dayIndex]+"\t");
            }
            System.out.println();
          for(int i=0;i<6;i++)
          {
            for(int j=0;j<7;j++)
            {

                if(dayFirst==1)
                {
                    if(j==monthDayLastIndex)//day[monthDayLastIndex]=>'day[5]=Tursday'
                    {
                        System.out.print(dayFirst+"\t");
                        dayFirst++;
                        
                    }
                    else if (j<monthDayLastIndex)
                    {
                       System.out.print("\t");
                    }
                }

                  
                else if(dayFirst>1)
                {
                 if(dayFirst<=31)
                 {
                    if(dayFirst==31)
                    {
                     monthDayLastIndex=j;
                    }   
                    
                     System.out.print(dayFirst+"\t");
                     dayFirst++;
                    
                 }
               }
            }
              System.out.println("\n");
             
          };
            break;
            case 6:

            System.out.println("____________________________________________________"+"\n\t\t    "+month[monthIndex]+"\n____________________________________________________");
            for(int dayIndex=0;dayIndex<7;dayIndex++)
            {
              System.out.print(day[dayIndex]+"\t");
            }
            System.out.println();
          for(int i=0;i<6;i++)
          {
            for(int j=0;j<7;j++)
            {

                if(dayFirst==1)
                {
                    if(j==monthDayLastIndex)//day[monthDayLastIndex]=>'day[6]=Friday'
                    {
                        System.out.print(dayFirst+"\t");
                        dayFirst++;
                        
                    }
                    else if (j<monthDayLastIndex)
                    {
                       System.out.print("\t");
                    }
                }

                  
                else if(dayFirst>1)
                {
                 if(dayFirst<=31)
                 {
                    if(dayFirst==31)
                    {
                     monthDayLastIndex=j;
                    }   
                    
                     System.out.print(dayFirst+"\t");
                     dayFirst++;
                    
                 }
               }
            }
              System.out.println("\n");
             
          };
            break;
        }
    }    
    


      //taeein 5 mah dovom sal bad az shahrivar ke 30 rouz hastand.
      for(int monthIndex=5;monthIndex<10;monthIndex++)
      {
        dayFirst=1;
        monthDayLastIndex=monthDayLastIndex+1;


        if(monthDayLastIndex>=7)
        {
            monthDayLastIndex=0;
        }
              
        //taeein avalin rouze mah.
        switch(monthDayLastIndex)
         {
            case 0:
            System.out.println("____________________________________________________"+"\n\t\t    "+month[monthIndex]+"\n____________________________________________________");
            for(int dayIndex=0;dayIndex<7;dayIndex++)
            {
              System.out.print(day[dayIndex]+"\t");
            }
            System.out.println();
           for(int i=0;i<6;i++)
           {
            for(int j=0;j<7;j++)
            {

                if(dayFirst==1)
                {
                    if(j==monthDayLastIndex)//day[monthDayLastIndex]=>'day[0]=Saturday'
                    {
                        System.out.print(dayFirst+"\t");
                        dayFirst++;
                        
                    }
                    else if (j<monthDayLastIndex)
                    {
                       System.out.print("\t");
                    }
                }

                  
                else if(dayFirst>1)
                {
                 if(dayFirst<=30)
                 {
                    if(dayFirst==30)
                    {
                     monthDayLastIndex=j;
                    }   
                    
                     System.out.print(dayFirst+"\t");
                     dayFirst++;
                    
                 }
               }
            }
              System.out.println("\n");
             
           };
            break;
             
            case 1:

            System.out.println("____________________________________________________"+"\n\t\t    "+month[monthIndex]+"\n____________________________________________________");
            for(int dayIndex=0;dayIndex<7;dayIndex++)
            {
              System.out.print(day[dayIndex]+"\t");
            }
            System.out.println();
           for(int i=0;i<6;i++)
           {
            for(int j=0;j<7;j++)
            {

                if(dayFirst==1)
                {
                    if(j==monthDayLastIndex)//day[monthDayLastIndex]=>'day[1]=sunday'
                    {
                        System.out.print(dayFirst+"\t");
                        dayFirst++;
                        
                    }
                    else if (j<monthDayLastIndex)
                    {
                       System.out.print("\t");
                    }
                }

                  
                else if(dayFirst>1)
                {
                 if(dayFirst<=30)
                 {
                    if(dayFirst==30)
                    {
                     monthDayLastIndex=j;
                    }   
                    
                     System.out.print(dayFirst+"\t");
                     dayFirst++;
                    
                 }
               }
            }
              System.out.println("\n");
             
           };
            break;
            case 2:

            System.out.println("____________________________________________________"+"\n\t\t    "+month[monthIndex]+"\n____________________________________________________");
            for(int dayIndex=0;dayIndex<7;dayIndex++)
            {
              System.out.print(day[dayIndex]+"\t");
            }
            System.out.println();
           for(int i=0;i<6;i++)
           {
            for(int j=0;j<7;j++)
            {

                if(dayFirst==1)
                {
                    if(j==monthDayLastIndex)//day[monthDayLastIndex]=>'day[2]=Monday'
                    {
                        System.out.print(dayFirst+"\t");
                        dayFirst++;
                        
                    }
                    else if (j<monthDayLastIndex)
                    {
                       System.out.print("\t");
                    }
                }

                  
                else if(dayFirst>1)
                {
                 if(dayFirst<=30)
                 {
                    if(dayFirst==30)
                    {
                     monthDayLastIndex=j;
                    }   
                    
                     System.out.print(dayFirst+"\t");
                     dayFirst++;
                    
                 }
               }
            }
              System.out.println("\n");
             
           };
            break;
            case 3:

            System.out.println("____________________________________________________"+"\n\t\t    "+month[monthIndex]+"\n____________________________________________________");
            for(int dayIndex=0;dayIndex<7;dayIndex++)
            {
              System.out.print(day[dayIndex]+"\t");
            }
            System.out.println();
           for(int i=0;i<6;i++)
           {
            for(int j=0;j<7;j++)
            {

                if(dayFirst==1)
                {
                    if(j==monthDayLastIndex)//day[monthDayLastIndex]=>'day[3]=Tusday'
                    {
                        System.out.print(dayFirst+"\t");
                        dayFirst++;
                        
                    }
                    else if (j<monthDayLastIndex)
                    {
                       System.out.print("\t");
                    }
                }

                  
                else if(dayFirst>1)
                {
                 if(dayFirst<=30)
                 {
                    if(dayFirst==30)
                    {
                     monthDayLastIndex=j;
                    }   
                    
                     System.out.print(dayFirst+"\t");
                     dayFirst++;
                    
                 }
               }
            }
              System.out.println("\n");
             
           };
            break;
            case 4:
            System.out.println("____________________________________________________"+"\n\t\t    "+month[monthIndex]+"\n____________________________________________________");
            for(int dayIndex=0;dayIndex<7;dayIndex++)
            {
              System.out.print(day[dayIndex]+"\t");
            }
            System.out.println();
           for(int i=0;i<6;i++)
           {
            for(int j=0;j<7;j++)
            {

                if(dayFirst==1)
                {
                    if(j==monthDayLastIndex)//day[monthDayLastIndex]=>'day[4]=wednesday'
                    {
                        System.out.print(dayFirst+"\t");
                        dayFirst++;
                        
                    }
                    else if (j<monthDayLastIndex)
                    {
                       System.out.print("\t");
                    }
                }

                  
                else if(dayFirst>1)
                {
                 if(dayFirst<=30)
                 {
                    if(dayFirst==30)
                    {
                     monthDayLastIndex=j;
                    }   
                    
                     System.out.print(dayFirst+"\t");
                     dayFirst++;
                    
                 }
               }
            }
              System.out.println("\n");
             
           };
            break;
            case 5:

            System.out.println("____________________________________________________"+"\n\t\t    "+month[monthIndex]+"\n____________________________________________________");
            for(int dayIndex=0;dayIndex<7;dayIndex++)
            {
              System.out.print(day[dayIndex]+"\t");
            }
            System.out.println();
           for(int i=0;i<6;i++)
           {
            for(int j=0;j<7;j++)
            {

                if(dayFirst==1)
                {
                    if(j==monthDayLastIndex)//day[monthDayLastIndex]=>'day[5]=Tursday'
                    {
                        System.out.print(dayFirst+"\t");
                        dayFirst++;
                        
                    }
                    else if (j<monthDayLastIndex)
                    {
                       System.out.print("\t");
                    }
                }

                  
                else if(dayFirst>1)
                {
                 if(dayFirst<=30)
                 {
                    if(dayFirst==30)
                    {
                     monthDayLastIndex=j;
                    }   
                    
                     System.out.print(dayFirst+"\t");
                     dayFirst++;
                    
                 }
               }
            }
              System.out.println("\n");
             
           };
            break;
            case 6:

            System.out.println("____________________________________________________"+"\n\t\t    "+month[monthIndex]+"\n____________________________________________________");
            for(int dayIndex=0;dayIndex<7;dayIndex++)
            {
              System.out.print(day[dayIndex]+"\t");
            }
            System.out.println();
           for(int i=0;i<6;i++)
           {
             for(int j=0;j<7;j++)
             {

                if(dayFirst==1)
                {
                    if(j==monthDayLastIndex)//day[monthDayLastIndex]=>'day[6]=Friday'
                    {
                        System.out.print(dayFirst+"\t");
                        dayFirst++;
                        
                    }
                    else if (j<monthDayLastIndex)
                    {
                       System.out.print("\t");
                    }
                }

                  
                else if(dayFirst>1)
                {
                 if(dayFirst<=30)
                 {
                    if(dayFirst==30)
                    {
                     monthDayLastIndex=j;
                    }   
                    
                     System.out.print(dayFirst+"\t");
                     dayFirst++;
                    
                 }
               }
             }
              System.out.println("\n");
             
           };
             break;
           }
    }
    
    //esfand.
      dayFirst=1;
      monthDayLastIndex=monthDayLastIndex+1;
      if(monthDayLastIndex>=7)
      {
        monthDayLastIndex=0;
      }
      
     //taeein tedad rouz haye esfand ba tavajoh be inke sal kabseh ast ya kheyr.
     //sal kabiseh ast.
    if(kabiseh==1)
    {
       

      switch(monthDayLastIndex)
         {
            case 0:
            System.out.println("____________________________________________________"+"\n\t\t    "+month[10]+"\n____________________________________________________");
            for(int dayIndex=0;dayIndex<7;dayIndex++)
            {
              System.out.print(day[dayIndex]+"\t");
            }
            System.out.println();
           for(int i=0;i<6;i++)
           {
            for(int j=0;j<7;j++)
            {

                if(dayFirst==1)
                {
                    if(j==monthDayLastIndex)//day[monthDayLastIndex]=>'day[0]=Saturday'
                    {
                        System.out.print(dayFirst+"\t");
                        dayFirst++;
                        
                    }
                    else if (j<monthDayLastIndex)
                    {
                       System.out.print("\t");
                    }
                }

                  
                else if(dayFirst>1)
                {
                 if(dayFirst<=29)
                 {
                    if(dayFirst==29)
                    {
                     monthDayLastIndex=j;
                    }   
                    
                     System.out.print(dayFirst+"\t");
                     dayFirst++;
                    
                 }
               }
            }
              System.out.println("\n");
             
           };
            break;
             
            case 1:

            System.out.println("____________________________________________________"+"\n\t\t    "+month[10]+"\n____________________________________________________");
            for(int dayIndex=0;dayIndex<7;dayIndex++)
            {
              System.out.print(day[dayIndex]+"\t");
            }
            System.out.println();
           for(int i=0;i<6;i++)
           {
            for(int j=0;j<7;j++)
            {

                if(dayFirst==1)
                {
                    if(j==monthDayLastIndex)//day[monthDayLastIndex]=>'day[1]=sunday'
                    {
                        System.out.print(dayFirst+"\t");
                        dayFirst++;
                        
                    }
                    else if (j<monthDayLastIndex)
                    {
                       System.out.print("\t");
                    }
                }

                  
                else if(dayFirst>1)
                {
                 if(dayFirst<=29)
                 {
                    if(dayFirst==29)
                    {
                     monthDayLastIndex=j;
                    }   
                    
                     System.out.print(dayFirst+"\t");
                     dayFirst++;
                    
                 }
               }
            }
              System.out.println("\n");
             
           };
            break;
            case 2:

            System.out.println("____________________________________________________"+"\n\t\t    "+month[10]+"\n____________________________________________________");
            for(int dayIndex=0;dayIndex<7;dayIndex++)
            {
              System.out.print(day[dayIndex]+"\t");
            }
            System.out.println();
           for(int i=0;i<6;i++)
           {
            for(int j=0;j<7;j++)
            {

                if(dayFirst==1)
                {
                    if(j==monthDayLastIndex)//day[monthDayLastIndex]=>'day[2]=Monday'
                    {
                        System.out.print(dayFirst+"\t");
                        dayFirst++;
                        
                    }
                    else if (j<monthDayLastIndex)
                    {
                       System.out.print("\t");
                    }
                }

                  
                else if(dayFirst>1)
                {
                 if(dayFirst<=29)
                 {
                    if(dayFirst==29)
                    {
                     monthDayLastIndex=j;
                    }   
                    
                     System.out.print(dayFirst+"\t");
                     dayFirst++;
                    
                 }
               }
            }
              System.out.println("\n");
             
           };
            break;
            case 3:

            System.out.println("____________________________________________________"+"\n\t\t    "+month[10]+"\n____________________________________________________");
            for(int dayIndex=0;dayIndex<7;dayIndex++)
            {
              System.out.print(day[dayIndex]+"\t");
            }
            System.out.println();
           for(int i=0;i<6;i++)
           {
            for(int j=0;j<7;j++)
            {

                if(dayFirst==1)
                {
                    if(j==monthDayLastIndex)//day[monthDayLastIndex]=>'day[3]=Tusday'
                    {
                        System.out.print(dayFirst+"\t");
                        dayFirst++;
                        
                    }
                    else if (j<monthDayLastIndex)
                    {
                       System.out.print("\t");
                    }
                }

                  
                else if(dayFirst>1)
                {
                 if(dayFirst<=29)
                 {
                    if(dayFirst==29)
                    {
                     monthDayLastIndex=j;
                    }   
                    
                     System.out.print(dayFirst+"\t");
                     dayFirst++;
                    
                 }
               }
            }
              System.out.println("\n");
             
           };
            break;
            case 4:
            System.out.println("____________________________________________________"+"\n\t\t    "+month[10]+"\n____________________________________________________");
            for(int dayIndex=0;dayIndex<7;dayIndex++)
            {
              System.out.print(day[dayIndex]+"\t");
            }
            System.out.println();
           for(int i=0;i<6;i++)
           {
            for(int j=0;j<7;j++)
            {

                if(dayFirst==1)
                {
                    if(j==monthDayLastIndex)//day[monthDayLastIndex]=>'day[4]=wednesday'
                    {
                        System.out.print(dayFirst+"\t");
                        dayFirst++;
                        
                    }
                    else if (j<monthDayLastIndex)
                    {
                       System.out.print("\t");
                    }
                }

                  
                else if(dayFirst>1)
                {
                 if(dayFirst<=29)
                 {
                    if(dayFirst==29)
                    {
                     monthDayLastIndex=j;
                    }   
                    
                     System.out.print(dayFirst+"\t");
                     dayFirst++;
                    
                 }
               }
            }
              System.out.println("\n");
             
           };
            break;
            case 5:

            System.out.println("____________________________________________________"+"\n\t\t    "+month[10]+"\n____________________________________________________");
            for(int dayIndex=0;dayIndex<7;dayIndex++)
            {
              System.out.print(day[dayIndex]+"\t");
            }
            System.out.println();
           for(int i=0;i<6;i++)
           {
            for(int j=0;j<7;j++)
            {

                if(dayFirst==1)
                {
                    if(j==monthDayLastIndex)//day[monthDayLastIndex]=>'day[5]=Tursday'
                    {
                        System.out.print(dayFirst+"\t");
                        dayFirst++;
                        
                    }
                    else if (j<monthDayLastIndex)
                    {
                       System.out.print("\t");
                    }
                }

                  
                else if(dayFirst>1)
                {
                 if(dayFirst<=29)
                 {
                    if(dayFirst==29)
                    {
                     monthDayLastIndex=j;
                    }   
                    
                     System.out.print(dayFirst+"\t");
                     dayFirst++;
                    
                 }
               }
            }
              System.out.println("\n");
             
           };
            break;
            case 6:

            System.out.println("____________________________________________________"+"\n\t\t    "+month[10]+"\n____________________________________________________");
            for(int dayIndex=0;dayIndex<7;dayIndex++)
            {
              System.out.print(day[dayIndex]+"\t");
            }
            System.out.println();
           for(int i=0;i<6;i++)
           {
             for(int j=0;j<7;j++)
             {

                if(dayFirst==1)
                {
                    if(j==monthDayLastIndex)//day[monthDayLastIndex]=>'day[6]=Friday'
                    {
                        System.out.print(dayFirst+"\t");
                        dayFirst++;
                        
                    }
                    else if (j<monthDayLastIndex)
                    {
                       System.out.print("\t");
                    }
                }

                  
                else if(dayFirst>1)
                {
                 if(dayFirst<=29)
                 {
                    if(dayFirst==29)
                    {
                     monthDayLastIndex=j;
                    }   
                    
                     System.out.print(dayFirst+"\t");
                     dayFirst++;
                    
                 }
               }
             }
              System.out.println("\n");
             
           };
             break;
           }
    } 

    //sal kabiseh nist.

    else
    {
      switch(monthDayLastIndex)
         {
            case 0:
            System.out.println("____________________________________________________"+"\n\t\t    "+month[10]+"\n____________________________________________________");
            for(int dayIndex=0;dayIndex<7;dayIndex++)
            {
              System.out.print(day[dayIndex]+"\t");
            }
            System.out.println();
           for(int i=0;i<6;i++)
           {
            for(int j=0;j<7;j++)
            {

                if(dayFirst==1)
                {
                    if(j==monthDayLastIndex)//day[monthDayLastIndex]=>'day[0]=Saturday'
                    {
                        System.out.print(dayFirst+"\t");
                        dayFirst++;
                        
                    }
                    else if (j<monthDayLastIndex)
                    {
                       System.out.print("\t");
                    }
                }

                  
                else if(dayFirst>1)
                {
                 if(dayFirst<=30)
                 {
                    if(dayFirst==30)
                    {
                     monthDayLastIndex=j;
                    }   
                    
                     System.out.print(dayFirst+"\t");
                     dayFirst++;
                    
                 }
               }
            }
              System.out.println("\n");
             
           };
            break;
             
            case 1:

            System.out.println("____________________________________________________"+"\n\t\t    "+month[10]+"\n____________________________________________________");
            for(int dayIndex=0;dayIndex<7;dayIndex++)
            {
              System.out.print(day[dayIndex]+"\t");
            }
            System.out.println();
           for(int i=0;i<6;i++)
           {
            for(int j=0;j<7;j++)
            {

                if(dayFirst==1)
                {
                    if(j==monthDayLastIndex)//day[monthDayLastIndex]=>'day[1]=sunday'
                    {
                        System.out.print(dayFirst+"\t");
                        dayFirst++;
                        
                    }
                    else if (j<monthDayLastIndex)
                    {
                       System.out.print("\t");
                    }
                }

                  
                else if(dayFirst>1)
                {
                 if(dayFirst<=30)
                 {
                    if(dayFirst==30)
                    {
                     monthDayLastIndex=j;
                    }   
                    
                     System.out.print(dayFirst+"\t");
                     dayFirst++;
                    
                 }
               }
            }
              System.out.println("\n");
             
           };
            break;
            case 2:

            System.out.println("____________________________________________________"+"\n\t\t    "+month[10]+"\n____________________________________________________");
            for(int dayIndex=0;dayIndex<7;dayIndex++)
            {
              System.out.print(day[dayIndex]+"\t");
            }
            System.out.println();
           for(int i=0;i<6;i++)
           {
            for(int j=0;j<7;j++)
            {

                if(dayFirst==1)
                {
                    if(j==monthDayLastIndex)//day[monthDayLastIndex]=>'day[2]=Monday'
                    {
                        System.out.print(dayFirst+"\t");
                        dayFirst++;
                        
                    }
                    else if (j<monthDayLastIndex)
                    {
                       System.out.print("\t");
                    }
                }

                  
                else if(dayFirst>1)
                {
                 if(dayFirst<=30)
                 {
                    if(dayFirst==30)
                    {
                     monthDayLastIndex=j;
                    }   
                    
                     System.out.print(dayFirst+"\t");
                     dayFirst++;
                    
                 }
               }
            }
              System.out.println("\n");
             
           };
            break;
            case 3:

            System.out.println("____________________________________________________"+"\n\t\t    "+month[10]+"\n____________________________________________________");
            for(int dayIndex=0;dayIndex<7;dayIndex++)
            {
              System.out.print(day[dayIndex]+"\t");
            }
            System.out.println();
           for(int i=0;i<6;i++)
           {
            for(int j=0;j<7;j++)
            {

                if(dayFirst==1)
                {
                    if(j==monthDayLastIndex)//day[monthDayLastIndex]=>'day[3]=Tusday'
                    {
                        System.out.print(dayFirst+"\t");
                        dayFirst++;
                        
                    }
                    else if (j<monthDayLastIndex)
                    {
                       System.out.print("\t");
                    }
                }

                  
                else if(dayFirst>1)
                {
                 if(dayFirst<=30)
                 {
                    if(dayFirst==30)
                    {
                     monthDayLastIndex=j;
                    }   
                    
                     System.out.print(dayFirst+"\t");
                     dayFirst++;
                    
                 }
               }
            }
              System.out.println("\n");
             
           };
            break;
            case 4:
            System.out.println("____________________________________________________"+"\n\t\t    "+month[10]+"\n____________________________________________________");
            for(int dayIndex=0;dayIndex<7;dayIndex++)
            {
              System.out.print(day[dayIndex]+"\t");
            }
            System.out.println();
           for(int i=0;i<6;i++)
           {
            for(int j=0;j<7;j++)
            {

                if(dayFirst==1)
                {
                    if(j==monthDayLastIndex)//day[monthDayLastIndex]=>'day[4]=wednesday'
                    {
                        System.out.print(dayFirst+"\t");
                        dayFirst++;
                        
                    }
                    else if (j<monthDayLastIndex)
                    {
                       System.out.print("\t");
                    }
                }

                  
                else if(dayFirst>1)
                {
                 if(dayFirst<=30)
                 {
                    if(dayFirst==30)
                    {
                     monthDayLastIndex=j;
                    }   
                    
                     System.out.print(dayFirst+"\t");
                     dayFirst++;
                    
                 }
               }
            }
              System.out.println("\n");
             
           };
            break;
            case 5:

            System.out.println("____________________________________________________"+"\n\t\t    "+month[10]+"\n____________________________________________________");
            for(int dayIndex=0;dayIndex<7;dayIndex++)
            {
              System.out.print(day[dayIndex]+"\t");
            }
            System.out.println();
           for(int i=0;i<6;i++)
           {
            for(int j=0;j<7;j++)
            {

                if(dayFirst==1)
                {
                    if(j==monthDayLastIndex)//day[monthDayLastIndex]=>'day[5]=Tursday'
                    {
                        System.out.print(dayFirst+"\t");
                        dayFirst++;
                        
                    }
                    else if (j<monthDayLastIndex)
                    {
                       System.out.print("\t");
                    }
                }

                  
                else if(dayFirst>1)
                {
                 if(dayFirst<=30)
                 {
                    if(dayFirst==30)
                    {
                     monthDayLastIndex=j;
                    }   
                    
                     System.out.print(dayFirst+"\t");
                     dayFirst++;
                    
                 }
               }
            }
              System.out.println("\n");
             
           };
            break;
            case 6:

            System.out.println("____________________________________________________"+"\n\t\t    "+month[10]+"\n____________________________________________________");
            for(int dayIndex=0;dayIndex<7;dayIndex++)
            {
              System.out.print(day[dayIndex]+"\t");
            }
            System.out.println();
           for(int i=0;i<6;i++)
           {
             for(int j=0;j<7;j++)
             {

                if(dayFirst==1)
                {
                    if(j==monthDayLastIndex)//day[monthDayLastIndex]=>'day[6]=Friday'
                    {
                        System.out.print(dayFirst+"\t");
                        dayFirst++;
                        
                    }
                    else if (j<monthDayLastIndex)
                    {
                       System.out.print("\t");
                    }
                }

                  
                else if(dayFirst>1)
                {
                 if(dayFirst<=30)
                 {
                    if(dayFirst==30)
                    {
                     monthDayLastIndex=j;
                    }   
                    
                     System.out.print(dayFirst+"\t");
                     dayFirst++;
                    
                 }
               }
             }
              System.out.println("\n");
             
           };
             break;
           }
    }   
    }
  
} 

