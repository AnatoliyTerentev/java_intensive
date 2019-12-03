public class Main {

    public static void main(String[] args) {

        int a = 10;
        double b = 1.2;
        float c = 123.456f;
        short d = 123;
        byte e  = 100;
        long f = 1233213243;
        char g = 111;
        //System.out.println(a + " | " + b + " | " + c + " | "+ d + " | " + e + " | " + f + " | " + g );

        float divide = (float)(10/3);
        //System.out.println(divide);

        byte[] bytes = new byte[5];
        bytes[1] = 10;
        bytes[2] = 20;
        bytes[3] = 30;
        for (int i=0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        int i = 0;
        while (i < bytes.length){
            System.out.println(bytes[i]);
            i++;
        }
        //System.out.println(bytes.length);
        //System.out.println(bytes[4]);
    }
}