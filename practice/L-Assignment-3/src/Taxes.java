public class Taxes {
    public int income;
    public String condition;

    public Taxes(int income,String condition) {
        this.income = income;
        this.condition = condition;
    }
    public int t;
    public void countTaxes()
    {
        if(income < 8000 && condition.equals("single"))
        {
            t = (income*10)/100;
        }
        else if(income >= 8000 &&income<32000&& condition.equals("single"))
        {
            t = 800 + (income*15)/100;
        }
        else if(income >= 32000 && condition.equals("couple"))
        {
            t = 4400 + (income*25)/100;
        }
        else  if(income < 16000 && condition.equals("couple"))
        {
            t = (income * 10)/100;
        }
        else if(income>=16000 && income<64000&&condition.equals("couple"))
        {
            t = 1600 + (income*15)/100;
        }
        else if(income>=64000 && condition.equals("couple"))
        {
            t = 8800+(income *25)/100;
        }

    }
    public int getTaxes()
    {
        return t;
    }

}
