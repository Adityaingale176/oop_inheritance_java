package pl_java.exercise_1.part_2;

import pl_java.exercise_1.part_0.QuestionType;

​​public class ShortAnswerQuestion extends Question{
    /*
    * Attributes
    */
    private String shortAnswer;


    /*
    * Constructors
    */
    public ShortAnswerQuestion(String questionText) {
        setQuestionType(QuestionType.SHORT_ANSWER);
        setQuestionText(questionText);
    }

    /*
    * Getters
    */

    public String getShortAnswer() {
        return shortAnswer;
    }



    /*
    * Setters
    */
    public void setShortAnswer(String shortAnswer) {
        // Perform Input Validations
        /*
        * 
        */
        this.shortAnswer = shortAnswer;
    }

}