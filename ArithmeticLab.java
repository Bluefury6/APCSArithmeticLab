public class ArithmeticLab {
    public static void main(String[] args) throws Exception {
        System.out.println("Here are the basic types of math:");
        Calc calc = new Calc();

        System.out.println(calc.add());
        System.out.println(calc.subtract());
        System.out.println(calc.multiply());
        System.out.println(calc.divide());
        System.out.println(calc.modulus());
        System.out.println(calc.rounding());
    }
}
