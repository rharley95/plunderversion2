/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesgame.model;

import java.util.Objects;
import java.io.Serializable;
/**
 *
 * @author madug
 */
public class Question implements Serializable{
    
    private String questions;
    private String answer;
    private QuestionScene questionscene;

    public Question() {
    }
    
    

    public String getQuestion() {
        return questions;
    }

    public void setQuestions(String question) {
        this.questions = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.questions);
        hash = 61 * hash + Objects.hashCode(this.answer);
        hash = 61 * hash + Objects.hashCode(this.questionscene);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Question other = (Question) obj;
        if (!Objects.equals(this.questions, other.questions)) {
            return false;
        }
        if (!Objects.equals(this.answer, other.answer)) {
            return false;
        }
        if (!Objects.equals(this.questionscene, other.questionscene)) {
            return false;
        }
        return true;
    }

   

    @Override
    public String toString() {
        return "Question{" + "question=" + questions + ", answer=" + answer + '}';
    }
    
    
}
