public class FibonachiCount {

    public static void main(String[] args) {
        int F1 = 0;
        int Fn = 1;
        int F;

        for (int i = 0; i < 10; i++) {
            F = F1 + Fn;
            F1 = Fn;
            Fn = F;
            System.out.print(F + ", ");
        }
    }
}
