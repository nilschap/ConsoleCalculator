package ch.bbw;

public class Calculator {
    public int summe(int summand1,int summand2){
        return summand1+summand2;
    }

    public int subtraktion(int value1, int value2){
        return value1-value2;
    }

    public int division(int value1,int value2){
        return value1/value2;
    }

    //Aufgabe sichbarkeit
    protected int protectedsumme(int value1, int value2){
        return value1+value2;
    }

    /*package protected int packageprotectedsummme(int value1,int value2){
        return  value1+value2;
    }*/

    public int publicsubtraktion(int value1, int value2){
        return value1-value2;
    }


    //Äquivalenzklassen summe
    public int summetwopositiv(int value1, int value2){
        return value1+value2;
    }



}
