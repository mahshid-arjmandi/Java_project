/*
modal sazi safhe 8*8 chess torike dar hameye khaneh haye un character '*' gharar dara.
inke dar khaneh a,b shatranj  mohreh Elephant gharar dara.
gharar dadn e 'f' be jaye mohre haei ke dar tir ras in mohreh Fil hastand.
*/
import java.util.Scanner;
public class chess
 {
    public static void main(String args[])
    {
       Scanner data=new Scanner(System.in);
       int a,b;
       char [][]chess=new char[8][8];

       //chess[a][b]=>mogheeiyate mohreh elephant dar safheh chess.

       System.out.print("Please,enter a and b:");
       a=data.nextInt();
       b=data.nextInt();

      //ijad matrix 8*8.

       for(int i=0;i<8;i++)
       {
        for(int j=0;j<8;j++)
        {
          chess[i][j]='*';
        }
       }
     
     /* peyda kardan mohreh haei ke dar tirras  mohreh chess[a][b] gharar darand.
       chess[a][b]=>mogheeiyate mohreh elephant dar safheh chess.
     */
      //bar asas ghanoun elephant faghat be sourat e movarab dar ghotr e safhe harekat mikonad.
     //dar har satr faghat yek khaneh made nazar ast ke dar un character f gharar migirad.
     //mohreh haei ke samte chap_bala  elephant gharar darand.
     int columnNumber=b-1;
     for(int rowNumber=a-1;rowNumber>=0;rowNumber--)
      {
         if(columnNumber<8 && columnNumber>=0)
         {
           chess[rowNumber][columnNumber]='f'; 
           columnNumber--;
         }
         else
         {
            break;
         }      
      }
      //dar har satr faghat yek khaneh made nazar ast ke dar un character f gharar migirad.
      //mohreh haei ke samte chap_paeein e elephant gharar darand.
      columnNumber=b-1;
      for(int rowNumber=a+1;rowNumber<8;rowNumber++)
      {
         if(columnNumber<8 && columnNumber>=0)
         {
           chess[rowNumber][columnNumber]='f'; 
           columnNumber--;
         }
         else
         {
            break;
         }      
      }
 
      //mohreh haei ke samte rast_bala  elephant gharar  darand.
      columnNumber=b+1;
      for(int rowNumber=a-1;rowNumber>=0;rowNumber--)
      {
           if(columnNumber<8 && columnNumber>=1)
           {
           chess[rowNumber][columnNumber]='f'; 
           columnNumber++;
           }
          else 
          {
           break;
          }      
      }

      ////mohreh haei ke samte rast_paeein  elephant gharar gerefteh and.
      columnNumber=b+1;
      for(int rowNumber=a+1;rowNumber<8;rowNumber++)
      {
         if(columnNumber<8 && columnNumber>=1)
         {
          chess[rowNumber][columnNumber]='f';
          columnNumber++;
         }
         else
         {
            break;
         }               
      }
      
     //namayeshe safhe chess.
     for(int rowNumber=0;rowNumber<8;rowNumber++)
     {
        for(int columnNum=0;columnNum<8;columnNum++)
        {
            if(rowNumber==a && columnNum==b)
            {
               chess[rowNumber][columnNum]='e';
            }
            System.out.print(chess[rowNumber][columnNum]+"\t");
        }
        System.out.println("\n");
     }


    }
}

//===================================

 /*modal sazi safhe 8*8 chess torike dar hameye khaneh haye un character star  gharar dara.
ba farz inke dar khaneh a,b shatranj  mohreh Minister(vazir) gharar dara.
gharar dadn e 'f' be jaye mohre haei ke dar tir ras  mohreh Minister hastand.
 */
import java.util.Scanner;
public class chess{
    public static void main(String args[])
    {
       Scanner data=new Scanner(System.in);
       int a,b;
       char [][]chess=new char[8][8];

       //chess[a][b]=>mogheeiyate mohreh elephant dar safheh chess.

       System.out.print("Please,enter a and b:");
       a=data.nextInt();
       b=data.nextInt();

      //ijad matrix 8*8.

       for(int i=0;i<8;i++)
       {
        for(int j=0;j<8;j++)
        {
          chess[i][j]='*';
        }
       }
     //bar asas ghanoun harekate Minister tarkibi az harekat mohreh haye rokh va elephant mibashad.
     /* peyda kardan mohreh haei ke dar tirras  mohreh chess[a][b] gharar darand.
       chess[a][b]=>mogheeiyate mohreh Minister dar safheh chess.
       gharar dadn e 'f' be jay e mohreh hayei  dar tir ras Minister.
       mohreh Rokh faghat dar arz va sotoun ei ke dar un gharar gerefteh ast harekat mikonad.
       mohreh Elephant faghat be sourat e movarab dar ghotr e safhe harekat mikonad.
       gharar dadn e 'f' be jay e mohreh hayei  dar tir ras Minister.
     */
     //moshakhas kardan mohreh haei ke be hamrah e mohreh Minister dar yek column gharar gerefteh and.  
     for(int rowNumber=0;rowNumber<8;rowNumber++)
     {
        if(rowNumber!=a)chess[rowNumber][b]='f';
     }
     
    //gharar dadn e 'f' be jay e mohreh haye dar tir ras Minister.
    //moshakhas kardan mohreh haei ke be hamrah e mohreh Minister dar yek row gharar gerefteh and.  
     for(int columnNumber=0;columnNumber<8;columnNumber++)
     {
        if(b!=columnNumber)chess[a][columnNumber]='f';
     }
      
     //dar har satr faghat yek khaneh made nazar ast ke dar un character 'f' gharar migirad
     //mohreh haei ke samte chap_bala  Minister gharar darand.
     int columnNumber=b-1;
     for(int rowNumber=a-1;rowNumber>=0;rowNumber--)
      {
         if(columnNumber<8 && columnNumber>=0)
         {
           chess[rowNumber][columnNumber]='f'; 
           columnNumber--;
         }
         else
         {
            break;
         }      
      }
      //dar har satr faghat yek khaneh made nazar ast ke dar un character 'f' gharar migirad.
      //mohreh haei ke samte chap_paeein  Minister gharar darand.
      columnNumber=b-1;
      for(int rowNumber=a+1;rowNumber<8;rowNumber++)
      {
         if(columnNumber<8 && columnNumber>=0)
         {
           chess[rowNumber][columnNumber]='f'; 
           columnNumber--;
         }
         else
         {
            break;
         }      
      }
 
      //mohreh haei ke samte rast_bala  Minister gharar  darand.
      columnNumber=b+1;
      for(int rowNumber=a-1;rowNumber>=0;rowNumber--)
      {
           if(columnNumber<8 && columnNumber>=1)
           {
           chess[rowNumber][columnNumber]='f'; 
           columnNumber++;
           }
          else 
          {
           break;
          }      
      }

      ////mohreh haei ke samte rast_paeein Minister gharar gerefteh and.
      columnNumber=b+1;
      for(int rowNumber=a+1;rowNumber<8;rowNumber++)
      {
         if(columnNumber<8 && columnNumber>=1)
         {
          chess[rowNumber][columnNumber]='f';
          columnNumber++;
         }
         else
         {
            break;
         }               
      }
     
     
      
     //namayeshe safhe chess.
     for(int rowNumber=0;rowNumber<8;rowNumber++)
     {
        for(int columnNum=0;columnNum<8;columnNum++)
        {
            if(rowNumber==a && columnNum==b)
            {
               chess[rowNumber][columnNum]='V';
            }
            System.out.print(chess[rowNumber][columnNum]+"\t");
        }
        System.out.println("\n");
     }

    }
}