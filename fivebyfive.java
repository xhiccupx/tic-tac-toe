import java.util.*;
public class fivebyfive
{
    
    public fivebyfive()
    { 
       Scanner in=new Scanner(System.in);
        char a[][]=new char[5][5];
        int n=1,i,j,k,l;int x,y;int t;
        String name0,name1;
        System.out.println("");
        System.out.println("###############PLAY TIC TAC TOW###############");
        do{
        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
             {
                 a[i][j]='\0';
                }
        }
        System.out.println("enter name of player 1");
        name0=in.next();
        System.out.println("enter name of player 2");
        name1=in.next();
        System.out.println("player 1 enter x");
        System.out.println("player 2 enter o");
        System.out.println("lets start");
        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
             {
                System.out.print(a[i][j]);
                if(a[i][j]=='\0')
                System.out.print(" ");
                if(j!=4)
                System.out.print("|");
                }
            System.out.print("\n");
            if(i!=4)
             {
                 for(k=0;k<5;k++)
                 System.out.print("_ ");
                }
            System.out.print("\n");
        }
        for(l=1;l<26;l++)
        {
         if(l%2!=0)
         {   
             do
             {
             System.out.println(name0+"'s turn");
             System.out.println("enter postion of x");
             System.out.println("enter row number");
             x=in.nextInt();
             System.out.println("enter column number");
             y=in.nextInt();
             if((a[x][y]=='o')||(a[x][y]=='x'))
              {
              System.out.println("this position is already occupied");
              System.out.println("re enter position of x");
              t=0;
              }
             else
              {
               a[x][y]='x';
               System.out.println("enter 1 to confirm enter 0 to re enter position of x");
               t=in.nextInt();
              }
              
            }while(t!=1);
          }
         if(l%2==0)
         {   
             do
             {
             System.out.println(name1+"'s turn");
             System.out.println("enter postion of o");
             System.out.println("enter row number");
             x=in.nextInt();
             System.out.println("enter column number");
             y=in.nextInt();
             if((a[x][y]=='o')||(a[x][y]=='x'))
              {
              System.out.println("this position is already occupied");    
              System.out.println("re enter position of o");
              t=0;
              }
             else
              {
               a[x][y]='o';
               System.out.println("enter 1 to confirm enter 0 to re enter position of o");
               t=in.nextInt();
              }
              
            }while(t!=1);
          }
         for(i=0;i<5;i++)
          {
            for(j=0;j<5;j++)
             {
                System.out.print(a[i][j]);
                if(a[i][j]=='\0')
                System.out.print(" ");
                if(j!=4)
                System.out.print("|");
                }
            System.out.print("\n");
            if(i!=4)
             {
                 for(k=0;k<5;k++)
                 System.out.print("_ ");
                }
            System.out.print("\n");
          }
          for(i=0;i<3;i++)
           {
           if((a[0][i]=='x')&&(a[1][i]=='x')&&(a[2][i]=='x')&&(a[3][i]=='x'))
           {
             System.out.println("                   "+name0+" WON");
             l=27;
            }
            }    
          for(i=0;i<3;i++)
           {
           if((a[1][i]=='x')&&(a[2][i]=='x')&&(a[3][i]=='x')&&(a[4][i]=='x'))
           {
             System.out.println("                   "+name0+" WON");
             l=27;
            }
            }      
          for(i=0;i<3;i++)
           {
           if((a[i][0]=='x')&&(a[i][1]=='x')&&(a[i][2]=='x')&&(a[i][3]=='x'))
            {
             System.out.println("                   "+name0+" WON");
             l=27;
            }
           }
          for(i=0;i<3;i++)
           {
           if((a[i][1]=='x')&&(a[i][2]=='x')&&(a[i][3]=='x')&&(a[i][4]=='x'))
            {
             System.out.println("                   "+name0+" WON");
             l=27;
            }
           } 
          if((a[0][0]=='x')&&(a[1][1]=='x')&&(a[2][2]=='x')&&(a[3][3]=='x'))
           {
           System.out.println("                   "+name0+" WON");
           l=27;
           }
          if((a[1][1]=='x')&&(a[2][2]=='x')&&(a[3][3]=='x')&&(a[4][4]=='x'))
           {
           System.out.println("                   "+name0+" WON");
           l=27;
           } 
          if((a[0][4]=='x')&&(a[1][3]=='x')&&(a[2][2]=='x')&&(a[3][1]=='x'))
           {
           System.out.println("                   "+name0+" WON");
           l=27;
           }
          if((a[1][3]=='x')&&(a[2][2]=='x')&&(a[3][1]=='x')&&(a[4][0]=='x'))
           {
           System.out.println("                   "+name0+" WON");
           l=27;
           } 
           for(i=0;i<3;i++)
           {
           if((a[0][i]=='o')&&(a[1][i]=='o')&&(a[2][i]=='o')&&(a[3][i]=='o'))
           {
             System.out.println("                   "+name1+" WON");
             l=27;
            }
            }    
          for(i=0;i<3;i++)
           {
           if((a[1][i]=='o')&&(a[2][i]=='o')&&(a[3][i]=='o')&&(a[4][i]=='o'))
           {
             System.out.println("                   "+name1+" WON");
             l=27;
            }
            }      
          for(i=0;i<3;i++)
           {
           if((a[i][0]=='o')&&(a[i][1]=='o')&&(a[i][2]=='o')&&(a[i][3]=='o'))
            {
             System.out.println("                   "+name1+" WON");
             l=27;
            }
           }
          for(i=0;i<3;i++)
           {
           if((a[i][1]=='o')&&(a[i][2]=='o')&&(a[i][3]=='o')&&(a[i][4]=='o'))
            {
             System.out.println("                   "+name1+" WON");
             l=27;
            }
           } 
          if((a[0][0]=='o')&&(a[1][1]=='o')&&(a[2][2]=='o')&&(a[3][3]=='o'))
           {
           System.out.println("                   "+name1+" WON");
           l=27;
           }
          if((a[1][1]=='o')&&(a[2][2]=='o')&&(a[3][3]=='o')&&(a[4][4]=='o'))
           {
           System.out.println("                   "+name1+" WON");
           l=27;
           } 
          if((a[0][4]=='o')&&(a[1][3]=='o')&&(a[2][2]=='o')&&(a[3][1]=='o'))
           {
           System.out.println("                   "+name1+" WON");
           l=27;
           }
          if((a[1][3]=='o')&&(a[2][2]=='o')&&(a[3][1]=='o')&&(a[4][0]=='o'))
           {
           System.out.println("                   "+name1+" WON");
           l=27;
           } 
        }
        if(l==26)
        System.out.println("                     DRAW MATCH                    ");
        System.out.println("");
        System.out.println("");
        System.out.println("enter 1 to play again or enter 0 to quit ");
        n=in.nextInt();
        }while(n!=0);
    }


}
