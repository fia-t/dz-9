public class Man extends Person{
    private Woman partner;

    public Man(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }
    public Woman getPartner() {
        return partner;
    }

    public void setPartner(Woman partner) {
        this.partner = partner;
    }

    public boolean isRetired() {
        return getAge() >= 65;
    }

    public void registerPartnership(Woman woman) {
        woman.setLastName(getLastName());
        setPartner(woman);
    }

    public void deregisterPartnership(boolean returnToPreviousLastName) {
        if (partner != null && returnToPreviousLastName) {
            partner.setLastName(partner.getPreviousLastName());
            setPartner(null);
        }
    }
}
