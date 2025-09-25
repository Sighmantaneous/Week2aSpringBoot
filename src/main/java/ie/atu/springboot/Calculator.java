package ie.atu.springboot;

public class Calculator {


    private String operation;
    private double result;

    public Calculator(String operation, double result) {
        this.operation= operation;
        this.result = result;
    }
    public Calculator(String Operation){
        this.operation= Operation;
    }

    public String getOperation() {
        return operation;
    }

    public double getResult() {
        return result;
    }
}

