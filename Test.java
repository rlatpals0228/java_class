public class Test {
    
    // both input & output
    public int sum(int a, int b){
        return a+b;
    }

    // only output(return)
    public String say() {
        return "Hi";
    }

    // only input No output(return)
    public void sum2(int a, int b){
        System.out.println(a + " and " + b + " SUM :" + (a+b));
    }

    // no input no output(return)
    public void say2() {
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        // int a = 3;
        // int b = 4;

        Test myTest = new Test();
        // int c = myTest.sum(a,b);
        // System.out.println(args);

        // myTest.sum2(3,4);
        // System.out.println(a);
        myTest.say2();
    }   
}
