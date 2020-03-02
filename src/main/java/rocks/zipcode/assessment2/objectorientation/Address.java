package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 */
public class Address {
    String line1;
    String line2;
    String city;
    String state;
    String zipcode;

    public Address() {
        line1 = "";
        line2 = "";
        city = "";
        state = "";
        zipcode = "";
    }

    /**
     * @param addressLine1 - first address line
     * @param addressLine2 - second address line
     * @param city - city of location
     * @param state - state of city
     * @param zipcode - zipcode of region
     */
    public Address(String addressLine1, String addressLine2, String city, String state, String zipcode)
    {
        line1 = addressLine1;
        line2 = addressLine2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String getAddressLine1() {
        return line1;
    }

    public void setAddressLine1(String addressLine1) { line1 = addressLine1;
    }

    public String getAddressLine2() {
        return line2;
    }

    public void setAddressLine2(String addressLine2) { line2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public boolean equals(Object o) {
        if(o != null && (o instanceof Address))
        {
            Address other = (Address)o;

            if(this.line1.equals(other.getAddressLine1()) &&
               this.line2.equals(other.getAddressLine2()) &&
               this.city.equals(other.getCity()) &&
               this.state.equals(other.getState()) &&
               this.zipcode.equals(other.getZipcode()))
            {
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        return String.format("Address{addressLine1='%s', addressLine2='%s', city='%s', state='%s', zipcode='%s'}",
                line1, line2, city, state, zipcode);
    }
}
