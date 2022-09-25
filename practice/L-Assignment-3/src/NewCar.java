public class NewCar {
    public int newCarPrice;
    public int milePy;
    public int gasPrice;
    public int efficiency;
    public int reValue;

    public NewCar(int newCarPrice,int milePy, int gasPrice,int efficiency,int reValue) {
        this.newCarPrice = newCarPrice;
        this.milePy =  milePy;
        this.gasPrice = gasPrice;
        this.efficiency =  efficiency;
        this.reValue = reValue;
    }
    public int tgp;
    public void totalGasPrice()
    {
        tgp= 5*((milePy*gasPrice)/efficiency);

    }
    public int tc;
    public void totalCost()
    {
        tc = newCarPrice+tgp;
    }
    public int getSpentMoney()
    {
        return tc-reValue;
    }

}
