package ie.atu.springboot;

public class Calculator {


    private String operation;
    private String result;

    public Calculator(String operation, String result) {
        this.operation= operation;
        this.result = result;
    }

    public String getOperation() {
        return operation;
    }

    public String getResult() {
        return result;
    }
}

