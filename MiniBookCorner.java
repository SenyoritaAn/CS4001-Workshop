
/**
 * Write a description of class scena here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
    public class MiniBookCorner
{
    public static void main(String[] args)
    {
    
        String[] categories = {"Fiction", "Nepali"};

        String[][] titles = new String[2][1];
        double[][] prices = new double[2][1];

       
        titles[0][0] = "Asahamati - 5";
        prices[0][0] = 750.0;

        titles[1][0] = "Muna Madan";
        prices[1][0] = 500.0;

        
        for (int i = 0; i < categories.length; i++)
        {
            System.out.println("Category: " + categories[i]);

            for (int j = 0; j < 1; j++)
            {
                System.out.println("Title: " + titles[i][j]);
                System.out.println("Price: " + String.format("%.2f", prices[i][j]));
            }

            System.out.println(); 
        }
    }
}
