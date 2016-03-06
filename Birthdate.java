import java.util.*;
import static javax.swing.JOptionPane.*;


public class Birthdate
{

   public int month, day, year;
   public static void main(String[]args)
   {
      new Birthdate();//call app constructor
   
   }
   
   
   public Birthdate()// app constructor
      {
      GregorianCalendar birthdate, today;
      birthdate = obtainBirthdate();
      showMessageDialog(null, birthdate.toString());
      
   
      }
   
   public GregorianCalendar obtainBirthdate()
         {
            String dateString;
            dateString = readValidBirthdate();
            scanMonthDayYear(dateString);
            return new GregorianCalendar(year, month, day);
            
            
         }
         
    public String readValidBirthdate()
    {
         String prompt;
         prompt = "Enter your birthdate (e.g. 12/02/1990)"; 
         return showInputDialog(prompt);
    }
    
    public void scanMonthDayYear(String s)
    {
      Scanner scan = new Scanner(s);
      scan.useDelimiter("/");
      month = scan.nextInt();
      day = scan.nextInt();
      year = scan.nextInt(); 
    
    }
    
    public void display()
    {
      showMessageDialog( " your birthdate is ");
    }
   
 }