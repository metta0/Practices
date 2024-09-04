package Inheritance;
public class InheritanceMain {

    public static void main(String[] args) {
        Input name = new Input("1234-1111", "Matthew");

        // System.out.println(name.getId());
        // System.out.println(name.getValue());
        // System.out.println(name.getTitle());

        Input age = new Input("1234-2222", 34);
        System.out.println(age.getId());
        System.out.println(age.getValue());
        System.out.println(age.getTitle());
        System.out.println(age.toString());
    }
}
