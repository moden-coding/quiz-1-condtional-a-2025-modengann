import java.util.*;
/**
 *  Basic task (up to B+ level):
 *    - Ask the user for a whole number n.
 *    - Print whether n is EVEN or ODD.
 *
 *  Moderate task (up to A level): 
 *    - Ask for a second whole number called max (a positive number).
 *    - If max <= 0, print an error message and skip the percentage.
 *    - If max is greater than 0, compute what percent n is of max as a DECIMAL calculation.
 *      * Example: if n = 37 and max = 90, print: "37 is 41.11111111111111% of 90"
 *    
 *
 *  Challenge task (up to A+ level):
 *    - If max < 0 or max > 100, print "Wrong number!".
 *    - Otherwise:
 *        * Using your decimal percentage from above, decide:
 *          - If n is within ±5% of HALF of max (i.e., |percent - 50| <= 5),
 *            print "Almost halfway!".
 *          - Else if percent < 50, print "Below halfway."
 *          - Else print "Above halfway."
 * 
 *     Example 1 - below halfway:
 *       Inputs: n = 37, max = 90
 *       Percent = 41.11% (more than 5 below 50)
 *       Output: Below halfway.
 * 
 *     Example 2 - almost halfway: 
 *       Inputs: n = 48, max = 100
 *       Percent = 48.00% (within 5 of 50)
 *       Output: Almost halfway!
 * 
 *     Example 3: 
 *       Inputs: n = 70, max = 120
 *       Percent = 58.33% (more than 5 above 50)
 *       Output: Above halfway.
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        
    }
}