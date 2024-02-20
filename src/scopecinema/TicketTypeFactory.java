
package scopecinema;


public class TicketTypeFactory {
    
    public static Ticket getInstance(String type){
        //Give the ticket rates according to the ticket type
        if("adult".equalsIgnoreCase(type)){
            return new Adult();
        }
        else if("Child".equalsIgnoreCase(type)){
            return new Child();
        }
        return null;
    }
        
        
     /*   Ticket ticket = null;
        switch(type){
            case "one":
                ticket = new Adult();
                break;
                
            case "two":
                ticket = new Child();
                
            default:
                System.out.println("No match");
        }
        return ticket;
     
    }*/
}
