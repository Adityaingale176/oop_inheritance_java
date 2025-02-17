package pl_java.exercise_1.part_2;

import pl_java.exercise_1.part_0.QuestionType;
import java.util.List;

public class DropDownQuestion extends Question{

    /*
    * Attributes
    */

    private String dropDownAnswer;
    private List<String> dropDownOptions;


    /*
    * Constructors
    */
    public DropDownQuestion(String questionText, List<String> choiceOptions) {
        setQuestionType(QuestionType.DROPDOWN);
        setQuestionText(questionText);
        setDropDownOptions(choiceOptions);
    }


    /*
    * Getters
    */

    public String getDropDownAnswer() {
        return dropDownAnswer;
    }

    public List<String> getDropDownOptions() {
        return dropDownOptions;
    }


    /*
    * Setters
    */
    public void setDropDownAnswer(String dropDownAnswer) {
        // Perform Input Validations
        /*
        * 
        */
        this.dropDownAnswer = dropDownAnswer;
    }


    private void setDropDownOptions(List<String> dropDownOptions) {
        // Perform Input Validations
        /*
        * 
        */

        this.dropDownOptions = dropDownOptions;
    }

}