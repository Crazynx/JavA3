package src.main.oefening1;

import java.time.LocalDate;
import java.time.Period;

class Persoon {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;


    public void setFirstName(String firstName) { this.firstName = firstName; } // set first name
    public void setLastName(String lastName) { this.lastName = lastName; } // set last name
    public void setDateOfBirth(int yearOfBirth, int monthOfBirth, int dayOfBirth) { // set date of birth
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
    }

    public int getAgeInDays() { // return age in days
        LocalDate currentDate = LocalDate.now(); // get current date
        Period ageInYears = Period.between(this.dateOfBirth, currentDate); // get period birthdate and current date
        return (int) (ageInYears.toTotalMonths() * (365.25 / 12)); // get total months and multiply by average amount of days per month
    }
}