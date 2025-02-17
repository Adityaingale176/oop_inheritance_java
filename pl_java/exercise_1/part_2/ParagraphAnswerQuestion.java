package pl_java.exercise_1.part_2;

import pl_java.exercise_1.part_0.QuestionType;

public class ParagraphAnswerQuestion extends Question{
    /*
    * Attributes
    */
  
    private String paragraphAnswer;


    /*
    * Constructors
    */
    public ParagraphAnswerQuestion(String questionText) {
        setQuestionType(QuestionType.PARAGRAPH_ANSWER);
        setQuestionText(questionText);
    }

    /*
    * Getters
    */

    public String getParagraphAnswer() {
        return paragraphAnswer;
    }

    /*
    * Setters
    */
    public void setParagraphAnswer(String paragraphAnswer) {
        // Perform Input Validations
        /*
        * 
        */
        this.paragraphAnswer = paragraphAnswer;
    }


}