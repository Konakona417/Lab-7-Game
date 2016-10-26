public class Book implements GameThing, Readable, Openable{
public boolean isOpen = false;
public String getName()
     {
           return "A dusty old book";
     }
     public String getDescription()
     {
         if (isOpen)
         {  
    	return "This book appears to be old and dusty. It's also quite heavy. It is currently open.";
         }
         else
         {
        return "This book appears to be old and dusty. It's also quite heavy. It is currently closed.";
         }
     }
     public void read()
 	{
    	 if (isOpen)
    		 {
    		 System.out.println("The book is filled with lots of illegible symbols and hieroglyphs.");
    		 }
    	 else
    	 {
    		 System.out.println("I can't read closed books!"); 
    	 }
 	}
     public void open()
     {
    	 if (!(isOpen)){
    		 System.out.println("I slowly open the creaky old book.");
    		 isOpen = true;}
    	 else
    	 {
    		 System.out.println("The book is already open!");
    	 }
     }
    public void close()
    {
    	if (isOpen){
   		 System.out.println("I carefully close the book.");
   		 isOpen = false;}
   	 else
   	 {
   		 System.out.println("The book is already closed!");
   	 }
    }
}