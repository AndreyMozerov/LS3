package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;

import java.util.Calendar;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {
    CalendarComponent calendarComponent= new CalendarComponent();
    private final String TITLE_TEXT="Student Registration Form";
    private SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userNumberInput = $("#userNumber"),
            userEmailInput = $("#userEmail");

    public void openPage(){
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text(TITLE_TEXT));
    }

    public void setFirstName(String value){
        firstNameInput.setValue(value);
    }

    public void setLastName(String value){
        lastNameInput.setValue(value);
    }

    public void setUserNumber(String value){
        userNumberInput.setValue(value);
    }

    public void setUserEmail(String value){
        userEmailInput.setValue(value);
    }

    public void setGender(String value){
        $("#genterWrapper").$(byText(value)).click();
    }
    public void setBirthDate(String day, String month, String year){

        $("#dateOfBirthInput").click();
        calendarComponent.setDate(day, month, year);
    }
}

