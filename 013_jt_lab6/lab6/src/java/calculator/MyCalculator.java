/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author user1
 */
public class MyCalculator {
    private String opList[]={"+","-","*","/"};
    private int op1,op2;
    private String opr;
    private long result;
    public MyCalculator(){
    }
    
    public int getOp1() {
        return op1;
    }

    public int getOp2() {
        return op2;
    }

    public String getOpr() {
        return opr;
    }

    public long getResult() {
        try{
        switch(opr){
            case("+"):
                    result=op1+op2;
                    break;
            case("-"):
                    result=op1-op2;
                    break;
            case("*"):
                    result=op1*op2;
                    break;
            case("/"):
                    break;
        }
        }    
        catch(ArithmeticException e){
                result=-999;       
        }
        return result;
    }

    public String[] getOpList() {
        return opList;
    }

    public void setOpList(String[] opList) {
        this.opList = opList;
    }

    public void setOp1(int op1) {
        this.op1 = op1;
    }

    public void setOp2(int op2) {
        this.op2 = op2;
    }

    public void setOpr(String opr) {
        this.opr = opr;
    }

    public void setResult(long result) {
        this.result = result;
    }
    
}
