/*---------------------------------------------------------*|
|                Created by Tannre Overly - 2018            |
|-----------------------------------------------------------|
|   WARNING -   WARNING -   WARNING -   WARNING -   WARNING |
|-----------------------------------------------------------|
|   It is highly recommended that you attempt to solve your |
| problems before using work provided here in order to      |
| actually learn from your mistakes. Try to use this only to|
| review or compare your own work.                          |
|_______________________Good_Luck___________________________|*/

public class Point
{
    private int x;
    private int y;
    
    public Point(int xCoord, int yCoord)
    {
        x = xCoord;
        y = yCoord;
    }
    
    public void move(int dx, int dy)
    {
        x += dx;
        y += dy;
    }
    
    public String toString()
    {
        return x + ", " + y;
    }
}