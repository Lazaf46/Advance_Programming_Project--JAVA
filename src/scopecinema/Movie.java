
package scopecinema;

import java.util.Scanner;

public class Movie {
    //I used Static here for class level
    static int choiceMovie;
    static int choiceTime;
    //Scanner is used to get the input what users type and it saves in the variable "scan"
    static Scanner scan = new Scanner(System.in);
    //I used array to store multiple values in same data type
    static String [] movieList = {"", "1)Vikram", "2)Cobra", "3)KGF", "4)Avatar", "5)Kaithi"};
    static String[] movieTime = {"", "1)10.00", "2)14.30", "3)18.00", "4)22.00"};
    static String[] ticketType = {"", "1) Adult over 13 Full Ticket = Rs:600 ", "2) Child 12 or less Half Ticket = Rs:400"};
    
    //This method will get the name what users type
    public static void getName(){
        String name;
        System.out.println("Enter Your Name: ");
        name = scan.nextLine();
        System.out.println("");
        System.out.println("WELCOME "+name);
        //Im calling the getMovie method
        getMovie(); 
    }
    
    //This method is to asks the customer what movie the're willing to watch
    public static void getMovie(){
        System.out.println("Select the movie from your list: ");
        //for loop is to list the movie from the movieList
        for(int i=0; i<movieList.length; i++){
            System.out.println(movieList[i]);   
        }
        choiceMovie = scan.nextInt();
        //calling the getTime method
        getTime();
    }
    
    ///This method is to asks the customer what time the're willing to watch
    public static void getTime(){
        System.out.println("Please Select the time you wish to watch");
        //This for loop is to list the time from the movieTime
            for(int x=0; x<movieTime.length; x++){
                System.out.println(movieTime[x]);
            } 
             choiceTime = scan.nextInt();
        //I catch the customer selected movie and time from the variable and i just proint here
        System.out.println("Your Selected Movie and Time to watch");
        System.out.println("Movie = "+ movieList [choiceMovie].substring(2,movieList[choiceMovie].length()));
        System.out.println("Time = "+movieTime[choiceTime].substring(2,movieTime[choiceTime].length()));
        //calling the getSeat method
        getSeat();
    }
    
    //i used this method to get the seats quantity and print the amount to pay
    public static void getSeat(){
        //local variable used within this method
        //this is get the number of seats that customer needs
        int n;
        //i need this variable to calculate the total amount
        int amount = 0;
        
        System.out.println("How many seats you want, Please Select");
        n = scan.nextInt();
      //Array is to get the No of seats customer needs because i need to calculate the noOfSeats*ticketType 
        int array[] = new int[n];
        
        
        System.out.println("What type of ticket you need, Please Select");
        //This for loop is to list the ticketType
        for(int i=0; i<ticketType.length; i++){
           System.out.println(ticketType[i]);
        }
        int i = 0;
        //I used array here when customer needs more than 1 ticket
        array[i] = scan.nextInt();
       //if condition to calculate two types of ticketType
        if(array[i]==1){
            amount = n*600; //noOfTicket*Adult ticket cost
            System.out.println("Total Amount to Pay :"+ amount );
            System.out.println("Please Select your bank");
        }
       
        else if(array[i]==2){
            amount = n*400; //noOfTicket*Child ticket cost
            System.out.println("Total Amount to pay :"+amount);
            System.out.println("Please Select your bank");
        }
        
        //This is an extra method i created While loop to select their prefered bank and to typethe correct total amount and pay
        int bank=1;
        while(bank==1){
            System.out.println("1) Sampath Bank");
            System.out.println("2) Commercial Bank");
            System.out.println("3) BOC Bank");
            System.out.println("4) Seylon Bank");
            int bnk = scan.nextInt();
            switch(bnk){
                case 1:
                    System.out.println("Welcome to Sampath Bank");
                    break;
                case 2:
                    System.out.println("Welcome to Commercial Bank");
                    break;
                case 3:
                    System.out.println("Welcome to BOC Bank");
                    break;
                case 4:
                    System.out.println("Welcome to Seylon Bank");
                    break;
            }
            break;
        }
        
        System.out.println("Enter the amount to pay :");
        int amountpay = scan.nextInt();
        if(amountpay == amount){
            System.out.println("Your payment is successful");
            System.out.println("Your seat has been successfully booked");
            System.out.println("Thank you !!!");
        }
        else{
            System.out.println("Enter valid amount to pay");
            System.out.println("Your payment is failure please try again !");
        }
        
        }
}
