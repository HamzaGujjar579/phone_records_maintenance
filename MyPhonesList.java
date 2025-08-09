import java.util.Scanner;

public class MyPhonesList{

 public static void main(String[] args) {

  Scanner read = new Scanner (System.in);

  int size = 0;

  String spare="";

  System.out.print("give the no of rows: " );

  int row = read.nextInt();

  while(row<5){

   System.out.print("give the no of rows again : " );

   row = read.nextInt();

  }//while

  String [][] mobiles = new String[row][3];
  
  int no=-1;

  while (no!=0){

    System.out.println();
    System.out.println("-------------------------------------------------------------------");
    System.out.println("Press 0 to Exit ");
    System.out.println("Press 1 to add a new phone");
    System.out.println("Press 2 to search by title");
    System.out.println("Press 3 to Search by Price");
    System.out.println("Press 4 to sort by Storage Size");
    System.out.println("Press 5 to Sort by Price");
    System.out.println("Press 6 to display most expensive phone ");
    System.out.println("Press 7 to Display All Phones");
    System.out.println("-------------------------------------------------------------------");

    System.out.print("Enter your choice : ");
    no =read.nextInt();

    while(no>7){
      System.out.print("Enter your choice again: ");
      no =read.nextInt();
}//while

for(int z=0;z<=0;z++){
  spare =read.nextLine();
  

}//for
if(no==1){

  boolean result =add(mobiles,size);

  if(result){


    for(int i =size;i<row;i++){

      for(int j =0;j<mobiles[i].length;j++){

        System.out.print("value of string array : ");
        mobiles[i][j]=read.nextLine();
      }
      size++;

      break;


    }



      }//if

      else{
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("u cannt add any more phone ");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

      }//else

      }//if

      else if (no == 2){

       if(mobiles[0][0] == null){

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("please add phones first in your list ");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
      }
      else{

        System.out.print("enter model u want to search :");

        String key = read.nextLine();
        int index = searchByTitle(mobiles,size,key); 

        if (index != -1){

          System.out.print("yes ,your required mobile is found on row : " + index);
          System.out.println();
          for(int c =0;c<3;c++){
            System.out.print(mobiles[index][c] + "\t");


                  }//for
                  
            }//if

            else{

              System.out.print("Your required model cannt be found" );

      }//else

    }//else

      }//else if

      else if (no == 3){

       if(mobiles[0][0] == null){

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("please add phones first in your list ");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
      }
      else{

        System.out.print("enter price u want to search :");

        String key = read.nextLine();
        int index = searchByPrice(mobiles,size,key); 

        if (index != -1){

          System.out.print("yes ,your required mobile is found on row : " + index);
          System.out.println();

          for(int c =0;c<3;c++){
            System.out.print(mobiles[index][c] + "\t");


          }

            }//if

            else{

              System.out.print("Your required model cannt be found" );

      }//else

    }//else

      }//else if

      else if (no ==4){

        sortByStorage(mobiles,size);

        System.out.print("title\t\t" +"storage\t\t" + "price\t");
        System.out.println();

        for(int a=0;a<size;a++){
          for(int b =0;b<mobiles[0].length;b++){


            System.out.print(mobiles[a][b]+ "\t\t");
          }
          System.out.println();

        }
            }//else if 

            else if (no ==5){

              sortByPrice(mobiles,size);

              System.out.print("title\t\t" +"storage\t\t" + "price\t");
              System.out.println();

              for(int s=0;s<size;s++){
                for(int p =0;p<mobiles[0].length;p++){


                  System.out.print(mobiles[s][p]+ "\t\t");
                }
                System.out.println();

              }
            }//else if 

            else if (no ==6){

              showMostExpensive(mobiles,size);

            }//else if 
            
            else if (no ==7){

              displayAllPhones(mobiles,size);
             }// else if 
}//sentinal loop 

 }//while

 static boolean add(String[][] mobiles, int currentSize){
   boolean result =false;
   if(mobiles.length!=currentSize){

     result =true;
   }
   return result;

 }// add method

 public static int searchByTitle(String [][] mobiles,int currentSize,String key){




  for(int j = 0; j<currentSize;j++){

    if(mobiles[j][0].equals(key)){

     return j;

   }

      }//for



      return -1;
      
}//searchbytitle()

static int searchByPrice(String[][] mobiles, int currentSize, 

  String key){



  for(int j = 0; j<currentSize;j++){

    if(mobiles[j][2].equals(key)){

     return j;

   }

      }//for



      return -1;
      
}//searchByPrice()

static void sortByStorage(String[][] mobiles, int currentSize){


  int a=0, b=0,k=0;
  String n ="";

  if(mobiles[0][0] == null){

    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    System.out.println("please add phones first in your list ");
    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
  }
  else{

    for(a =0;a<currentSize-1;a++){
     k=a;
     for(b=a+1;b<currentSize;b++){


      if((Integer.parseInt(mobiles[b][1]))>(Integer.parseInt((mobiles[k][1])))){

       k=b;


     }


   }

   for(int f =0;f<3;f++){

    n=mobiles[k][f];
    mobiles[k][f] = mobiles[a][f];
    mobiles[a][f] = n;

  }
  
}

}//else

}//sortByStorage()

static void sortByPrice(String[][] mobiles, int currentSize){


  int a=0, b=0,k=0;
  String n ="";

  if(mobiles[0][0] == null){

    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    System.out.println("please add phones first in your list ");
    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
  }
  else{

    for(a =0;a<currentSize-1;a++){
     k=a;
     for(b=a+1;b<currentSize;b++){


      if((Integer.parseInt(mobiles[b][2]))<(Integer.parseInt((mobiles[k][2])))){

       k=b;


     }


   }

   for(int f =0;f<3;f++){

    n=mobiles[k][f];
    mobiles[k][f] = mobiles[a][f];
    mobiles[a][f] = n;

  }
  
}

}//else

}//sortByPrice()



static void showMostExpensive(String[][] mobiles, int currentSize){
  int a=0,b=0,k=0;
  String n ="";
  if(mobiles[0][0] == null){

    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    System.out.println("please add phones first in your list ");
    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
  }
  else{
   for(a =0;a<currentSize-1;a++){


     k=a;
     for(b=a+1;b<currentSize;b++){

       if((Integer.parseInt(mobiles[b][2]))>(Integer.parseInt((mobiles[k][2])))){


         k=b;

       }

     }


     


     for(int f =0;f<3;f++){

      n=mobiles[k][f];
      mobiles[k][f] = mobiles[a][f];
      mobiles[a][f] = n;
      
    }
    }//for
    for (int m = 0;m<3 ;m++ ) {

      System.out.print(mobiles[0][m] + "\t");

    }

}//else


}//showMostExpensive()

static void displayAllPhones(String[][] mobiles, int currentSize){

 if(mobiles[0][0] == null){

  System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
  System.out.println("please add phones first in your list ");
  System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
}
else{
  System.out.print("title\t\t" +"storage\t\t" + "price\t");
  System.out.println();

  for(int a=0;a<currentSize;a++){
    for(int b =0;b<3;b++){


      System.out.print(mobiles[a][b]+ "\t\t");

        }// internal for

        System.out.println();
        
  }//external for

}//else

 }// displayAllPhones()

 }//class
