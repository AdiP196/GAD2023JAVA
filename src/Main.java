
public class Main {
    static void copyArrayExample() {
        char[] copyFrom = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        char[] copyTo = new char[7];
        System.arraycopy(copyFrom,2,copyTo,0,7);
        System.out.println(new String(copyTo));
    }
    static void compareString() {
        String firstString = new String("FirstString");
        String secondString = new String("SecondString");

        if(firstString.equals(secondString)){
            System.out.println("True");
        }else System.out.println("False");
    }
    public static void main(String[] args) {
            //copyArrayExample();
            //byte a1 = 12;
            //byte a2 = 56;
            //byte a3 =(byte) (a1+ a2);
            //System.out.println(a3);

            compareString();
        }
    }
