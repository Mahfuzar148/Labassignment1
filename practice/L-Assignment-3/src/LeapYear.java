public class LeapYear {
    public int y;

    public LeapYear(int y) {
        this.y = y;
    }

    public boolean getLeapYear()
    {
        if(y%400==0||(y%100!=0&&y%4==0))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
