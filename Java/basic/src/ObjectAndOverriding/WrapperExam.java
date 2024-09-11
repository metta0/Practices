package ObjectAndOverriding;

public class WrapperExam {

    public static void main(String[] args) {
        int i = 5;
        
        //오토 박싱
        Integer i2 = new Integer(5);
        Integer i3 = 5;

        //오토 언박싱
        Integer i4 = i2.intValue();
        int i5 = i3;
        
        System.out.println(i5);
    }
    
}
