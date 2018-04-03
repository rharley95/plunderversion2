/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesgame.model;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author rominapainter
 */
public class RiddleScene extends RegularScene{
    
    private double riddleType;
    private String fail;
    private String answer;
    private String riddle;

    public RiddleScene(double riddleType, String fail, String answer, String riddle) {
        this.riddleType = riddleType;
        this.fail = fail;
        this.answer = answer;
        this.riddle = riddle;
    }
    

    public RiddleScene() {
    }

    /**
     *
     * @param riddleType
     * @param fail
     * @param answer
     * @param riddle
     * @param description
     * @param symbol
     * @param blocked
     */
    public RiddleScene(double riddleType, String fail, String answer, String riddle, String description, String symbol, String blocked) {
        super(description, symbol, blocked);
        this.riddleType = riddleType;
        this.fail = fail;
        this.answer = answer;
        this.riddle = riddle;
    }

    public RiddleScene(String double_riddleType_String_fail_String_answ) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
 

    public double getRiddleType() {
        return riddleType;
    }

    public void setRiddleType(double riddleType) {
        this.riddleType = riddleType;
    }

    public String getFail() {
        return fail;
    }

    public void setFail(String fail) {
        this.fail = fail;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getRiddle() {
        return riddle;
    }

    public void setRiddle(String riddle) {
        this.riddle = riddle;
    }

    
    
    
    @Override
    public String toString() {
        return "riddleScene{" + "riddleType=" + riddleType + ", fail=" + fail + ", answer=" + answer + ", riddle=" + riddle + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.riddleType) ^ (Double.doubleToLongBits(this.riddleType) >>> 32));
        hash = 47 * hash + Objects.hashCode(this.fail);
        hash = 47 * hash + Objects.hashCode(this.answer);
        hash = 47 * hash + Objects.hashCode(this.riddle);
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
        final RiddleScene other = (RiddleScene) obj;
        if (Double.doubleToLongBits(this.riddleType) != Double.doubleToLongBits(other.riddleType)) {
            return false;
        }
        if (!Objects.equals(this.fail, other.fail)) {
            return false;
        }
        if (!Objects.equals(this.answer, other.answer)) {
            return false;
        }
        if (!Objects.equals(this.riddle, other.riddle)) {
            return false;
        }
        return true;
    }
    
    
    
    

    
}
