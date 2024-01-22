class Test {

    public int add(int a, int b) {
        int result = a + b;
        return result;
    }

    public int add(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }

    public String add(String a) {
        String b = "Biswajit";
        return b;
    }
}

    class Calc {
        public void show(int a){
            System.out.println("int :"+a);
        }
        public void show(byte a){
            System.out.println("byte :"+a);
        }
        public void show(short a){
            System.out.println("short :"+a);
        }
        // public void show(long a){
        //     System.out.println("long :"+a);
        // }
        // public void show(float a){
        //     System.out.println("float :"+a);
        // }
        // public void show(double a){
        //     System.out.println("double :"+a);
        // }
        public void show(char a){
            System.out.println("char :"+a);
        }

    }

public class MethodOverloadingeg {

    public static void main(String[] args) {
      Test obj = new Test();
         /* int result = obj.add(5, 6);
        int result1 = obj.add(5, 6, 7);
        String result2 = obj.add("");
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);*/

        Calc ob=new Calc();
        ob.show(5);


    }
}