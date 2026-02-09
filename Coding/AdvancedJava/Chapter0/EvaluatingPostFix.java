import java.util.Stack;

public class EvaluatingPostFix {
    private String pexpr;
    private double result;

    public EvaluatingPostFix(String expr){
        this.pexpr = expr;
        this.result = 0.0;
    }

    public void evaluate(){
        String terms[] = pexpr.split("\\s");
        Stack<Double> stk = new Stack<Double>();
        for(String t:terms){
            if(isOperator(t)){
                double y = stk.pop();
                double x = stk.pop();
                stk.push(operation(x, y, t));
            }
            else{
                stk.push(Double.parseDouble(t));
            }
        } 
        result = stk.pop(); //pop out the last element to get the final result.
    }

    private boolean isOperator(String str){
        String op = "/*+-%";
        return (op.indexOf(str) > -1);
    }

    public double operation(double x, double y, String op){
        switch(op){
            case "/":
                return x / y;
            case "*":
                return x * y;
            case "+":
                return x + y;
            case "-":
                return x - y;
            case "%":
                return x % y;
            default:
                return 0.0;
        }
    }

    @Override
    public String toString(){
        return "Result: " + result;
    }
}
