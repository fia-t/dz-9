public class Woman extends Person{
    private Man partner;
    private String previousLastName;

    public Woman(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public Man getPartner() {
        return partner;
    }

    public void setPartner(Man partner) {
        this.partner = partner;
    }

    public boolean isRetired() {
        return getAge() >= 60;
    }

    public void registerPartnership(Man man) {
        setPreviousLastName(getLastName());
        setLastName(man.getLastName());
        man.setPartner(this);
    }

    public void setPreviousLastName(String lastName) {
        this.previousLastName = lastName;
    }

    public void deregisterPartnership(boolean returnToPreviousLastName) {
        if (getPartner() != null && returnToPreviousLastName) {
            setLastName(this.previousLastName);
            partner.setPartner(null);
            setPartner(null);
        }else{
            setLastName(this.previousLastName);
        }
    }

}
