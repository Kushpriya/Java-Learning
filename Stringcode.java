public class Stringcode {
    public static void main(String[] args) {
        //this will create on the string pool
        String  name = "Priya";
        name = name + " Singh";
        System.out.println(name);

        //this will create  the new instance of the string.
        String name2=new String("Hello");
        System.out.println(name2);

        //Data overwrite on the heap memory
        StringBuffer name3 = new StringBuffer("Priya");
        name3.append(" Kushwaha");
        System.out.println(name3);
    }
}
