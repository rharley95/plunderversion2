/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesgame.model;

import java.io.Serializable;
import java.util.Objects;

public class QuestionScene implements Serializable{
    
    private String noToAnswer;
    private double bonus;
    private Question[] questions;

    public QuestionScene() {
    }

    public Question[] getQuestions() {
        return questions;
    }

    public void setQuestions(Question[] questions) {
        this.questions = questions;
    }

    
    
    public String getNoToAnswer() {
        return noToAnswer;
    }

    public void setNoToAnswer(String noToAnswer) {
        this.noToAnswer = noToAnswer;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.noToAnswer);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.bonus) ^ (Double.doubleToLongBits(this.bonus) >>> 32));
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
        final QuestionScene other = (QuestionScene) obj;
        if (Double.doubleToLongBits(this.bonus) != Double.doubleToLongBits(other.bonus)) {
            return false;
        }
        return Objects.equals(this.noToAnswer, other.noToAnswer);
    }

    @Override
    public String toString() {
        return "questionScene{" + "noToAnswer=" + noToAnswer + ", bonus=" + bonus + '}';
    }
    
    
    
}
