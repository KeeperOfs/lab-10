class Exc1 {
    static void nSize(){
        try{
            throw new NegativeArraySizeException();
        }
        catch(NegativeArraySizeException e){
            System.out.println("Исключение в методе nSize(): " + e);
        }

    }
    static void exc(int arg){
        int a = arg;
        System.out.println("a = " + a);
        int d = 10 / a;
        int c[] = {1};
        c[44] = 12;
    }

    public static void main (String[] args) {
        Exc1.nSize();
        try {
            Exc1.exc(0);// Exc1.exc(1);
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Исключение: " + e);
        }
    }
}