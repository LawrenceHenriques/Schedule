/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedule;

/**
 *
 * @author 20166
 */
public class Schedule {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String firstName ="Lawrence";
        String lastName = "Henriques";
        int gradYear = 2020;
        
        System.out.println("My name is " + firstName + " " + lastName + " and I'll graduate in " + gradYear);
        
        String course1 = "American History Accelerated";
        String course2 = "Honors Computer Science";
        String course3 = "Chemistry Accelerated";
        String course4 = "English Accelerated";
        String course5 = "Intro to Band";
        String course6 = "Algebra 2 Accelerated";
        
        String teacher1 = "Mr. Benitez";
        String teacher2 = "Mr. Larrubia";
        String teacher3 = "Mrs. Reynaldo";
        String teacher4 = "Mr. Chacon";
        String teacher5 = "Mr. Cooper";
        String teacher6 = "Mrs. Acevedo";
        
        System.out.println("+-------------------------------------------------------------------+");
        System.out.println("| 1 |              " + course1 + "|       " + teacher1 + "  |");
        System.out.println("| 2 |              " + course2 + "     |       " + teacher2 + " |");
        System.out.println("| 3 |              " + course3 + "       |       " + teacher3 + "|");
        System.out.println("| 4 |              " + course4 + "         |       " + teacher4 + "   |");
        System.out.println("| 5 |              " + course5 + "               |       " + teacher5 + "   |");
        System.out.println("| 6 |              " + course6 + "       |       " + teacher6 + " |");
        System.out.println("+-------------------------------------------------------------------+");
        
    }
    
}
