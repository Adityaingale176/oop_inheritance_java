
package pl_java.exercise_1.part_2;

import pl_java.exercise_1.part_0.QuestionType;

public class Question {
    String questionText;
    QuestionType questionType;

    public String getQuestionText() {
        return questionText;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        // Perform Input Validations
        /*
         * 
         */

        this.questionType = questionType;
    }

    public void setQuestionText(String questionText) {
        // Perform Input Validations
        /*
         * 
         */
        
        this.questionText = questionText;
    }
}