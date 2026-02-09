public class TestEvaluatePostfix {
    public static void main(String[] args) {
        String expr = "20 12 30 + * 5 /";
        EvaluatingPostFix ob = new EvaluatingPostFix(expr);
        ob.evaluate();
        System.out.println("\n"+ob);

        System.out.println((11.5%5.5));
    }
}
