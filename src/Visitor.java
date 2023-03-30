public class Visitor extends Human{
    private String visitorID;
    private String reasonForVisit;
    private String dateOfVisit;

    public Visitor(String name, int age, String securityNumber, String address, String phoneNumber, String visitorID, String reasonForVisit, String dateOfVisit) {
        super(name, age, securityNumber, address, phoneNumber);
        this.visitorID = visitorID;
        this.reasonForVisit = reasonForVisit;
        this.dateOfVisit = dateOfVisit;
    }

    public String getVisitorID() {
        return visitorID;
    }

    public void setVisitorID(String visitorID) {
        this.visitorID = visitorID;
    }

    public String getReasonForVisit() {
        return reasonForVisit;
    }

    public void setReasonForVisit(String reasonForVisit) {
        this.reasonForVisit = reasonForVisit;
    }

    public String getDateOfVisit() {
        return dateOfVisit;
    }

    public void setDateOfVisit(String dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
    }
}
