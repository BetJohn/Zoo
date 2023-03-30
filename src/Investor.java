import java.util.List;

public class Investor extends Human{
    private String investorID;
    private String investmentType;
    private double investmentAmount;

    public Investor(String name, int age, String securityNumber, String address, String phoneNumber, String investorID, String investmentType, double investmentAmount) {
        super(name, age, securityNumber, address, phoneNumber);
        this.investorID = investorID;
        this.investmentType = investmentType;
        this.investmentAmount = investmentAmount;
    }

    public String getInvestorID() {
        return investorID;
    }

    public void setInvestorID(String investorID) {
        this.investorID = investorID;
    }

    public String getInvestmentType() {
        return investmentType;
    }

    public void setInvestmentType(String investmentType) {
        this.investmentType = investmentType;
    }

    public double getInvestmentAmount() {
        return investmentAmount;
    }

    public void setInvestmentAmount(double investmentAmount) {
        this.investmentAmount = investmentAmount;
    }
    public static boolean login(String securityNumber, String investorID, List<Investor> investors){

        for (Investor investor : investors) {
            if (investor.getSecurityNumber().equals(securityNumber) && investor.getInvestorID().equals(investorID)) {
                return true;
            }
        }
        return false;
    }
}
