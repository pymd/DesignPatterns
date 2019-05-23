package chainOfResponsibilityPattern;

public class Numbers {
    private int number1;
    private int number2;

    private String calcuationWanted;

    public Numbers(int newNumber1, int newNumber2, String calcuationWanted){
        number1 = newNumber1;
        number2 = newNumber2;
        this.calcuationWanted = calcuationWanted;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public String getCalcuationWanted(){
        return calcuationWanted;
    }

}
