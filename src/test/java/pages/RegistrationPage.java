package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;
import pages.components.RegistrationResultsModal;

import java.io.File;
import java.util.Calendar;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage<userAddress> {
    CalendarComponent calendarComponent= new CalendarComponent();
    RegistrationResultsModal registrationResultsModal = new RegistrationResultsModal();
    private final String TITLE_TEXT="Student Registration Form";
    private SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userNumberInput = $("#userNumber"),
            userEmailInput = $("#userEmail"),
            userBirthDay = $("#dateOfBirthInput");



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
        $("#genterWrapper").
                $(byText(value)).click();
    }
    public void setBirthDate(String day, String month, String year){
        userBirthDay.click();
        calendarComponent.setDate(day, month, year);
    }

    public void setHobbies(String value){
        $("#hobbiesWrapper").$(byText(value)).click();
    }

    public void setSubjects(String value){
        $("#subjectsInput").
                setValue("Maths").pressEnter();
    }

    public void setJpg(String value){
        $("#uploadPicture").uploadFile(new File("src/test/resources/img/2.png"));
    }

    public void setAddress(String value){

        $("#currentAddress").setValue(value);
    }

    public void setState(String value){

        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
    }

    public void setCity(String value){

        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();
    }

    public void setSubmit(){

        $("#submit").click();
    }

    public void setVerifyModalAppears(){

        registrationResultsModal.verifyModalAppears();
    }

    public void setVerifyResult(String key, String value){

        registrationResultsModal.verifyResult(key, value);
    }
}

