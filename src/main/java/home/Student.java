package home;

import java.util.LinkedHashMap;

public class Student {
    private String firstName;
    private String lastName;
    private String country;

    private LinkedHashMap<String, String> countryOptions;  // first - key, second - value

    public Student() {
        // populate country options: used ISO country code
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("BR", "Brazil");
        countryOptions.put("FR", "France");
        countryOptions.put("DE", "German");
        countryOptions.put("IN", "India");
        countryOptions.put("US", "USA");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) { // on submit, Spring will call setCountry
        this.country = country;
    }

    public LinkedHashMap<String, String> getCountryOptions() { // when form is loaded, Spring will call student.getCountryOptions()
        return countryOptions;
    }
}
