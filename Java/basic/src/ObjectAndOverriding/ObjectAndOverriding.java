package ObjectAndOverriding;

public class ObjectAndOverriding{
    String name;
    String number;
    int birthYear;
    
    public static void main(String[] args){
        ObjectAndOverriding s1 = new ObjectAndOverriding();
        s1.name = "홍길동";
        s1.number = "1234";
        s1.birthYear = 1995;

        ObjectAndOverriding s2 = new ObjectAndOverriding();
        s2.name = "홍길동";
        s2.number = "1234";
        s2.birthYear = 1995;

        if(s1.equals(s2))
            System.out.println("s1 == s2");
        else
            System.out.println("s1 != s2");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1);
    }
}