import java.util.*;
public class threebythree
{
    
    public threebythree()
    { 
        Scanner in=new Scanner(System.in);
        char a[][]=new char[3][3];
        int n=1,i,j,k,l;int x,y;int t;
       
        String name0,name1;
        System.out.println("");
        System.out.println("###############PLAY TIC TAC TOW###############");
        do{
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
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
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
             {
                System.out.print(a[i][j]);
                if(a[i][j]=='\0')
                System.out.print(" ");
                if(j!=2)
                System.out.print("|");
                }
            System.out.print("\n");
            if(i!=2)
             {
                 for(k=0;k<3;k++)
                 System.out.print("_ ");
                }
            System.out.print("\n");
        }
        for(l=1;l<10;l++)
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
               
               System.out.println("enter 1 to confirm enter 0 to re enter position of x");
               t=in.nextInt();
               if(t==1)
               a[x][y]='x';
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
               
               System.out.println("enter 1 to confirm enter 0 to re enter position of o");
               t=in.nextInt();
               if(t==1)
               a[x][y]='o';
              }
              
            }while(t!=1);
          }
          for(i=0;i<3;i++)
           {
            for(j=0;j<3;j++)
             {
                System.out.print(a[i][j]);
                if(a[i][j]=='\0')
                System.out.print(" ");
                if(j!=2)
                System.out.print("|");
                }
            System.out.print("\n");
            if(i!=2)
             {
                 for(k=0;k<3;k++)
                 System.out.print("_ ");
                }
            System.out.print("\n");
           } 
          for(i=0;i<3;i++)
           {
           if((a[0][i]=='x')&&(a[1][i]=='x')&&(a[2][i]=='x'))
           {
             System.out.println("                   "+name0+" WON");
             l=11;
            }
            }    
          for(i=0;i<3;i++)
           {
           if((a[i][0]=='x')&&(a[i][1]=='x')&&(a[i][2]=='x'))
            {
             System.out.println("                   "+name0+" WON");
             l=11;
            }
           }
          if((a[0][0]=='x')&&(a[1][1]=='x')&&(a[2][2]=='x'))
           {
           System.out.println("                   "+name0+" WON");
           l=11;
           }
          if((a[0][2]=='x')&&(a[1][1]=='x')&&(a[2][0]=='x'))
           {
           System.out.println("                   "+name0+" WON");
           l=11;
           }
          for(i=0;i<3;i++)
           {
           if((a[0][i]=='o')&&(a[1][i]=='o')&&(a[2][i]=='o'))
            { 
               System.out.println("                   "+name1+" WON");
               l=11;
            }
           }
          for(i=0;i<3;i++)
           {
           if((a[i][0]=='o')&&(a[i][1]=='o')&&(a[i][2]=='o'))
             {
                 System.out.println("                   "+name1+" WON");
                 l=11;
             }
           }
          if((a[0][0]=='o')&&(a[1][1]=='o')&&(a[2][2]=='o'))
            {
           System.out.println("                   "+name1+" WON");
           l=11;
            }
          if((a[0][2]=='o')&&(a[1][1]=='o')&&(a[2][0]=='o'))
           {
           System.out.println("                   "+name1+" WON");
           l=11;
           }
        }
        if(l==10)
        System.out.println("                     DRAW MATCH                    ");
        System.out.println("");
        System.out.println("");
        System.out.println("enter 1 to play again or enter 0 to quit ");
        n=in.nextInt();
        }while(n!=0);
    }
}
