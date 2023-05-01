public class class2 {
    int id;
    String name;
    void insertRecod(int id,String name ) {
        this.id =id ;
        this.name= name ;

    }
    void displayInformation() {
        System.out.println(id +"" + name);
    }
    public static void main(String args  []) {
    class2 s1 = new class2();
    class2 s2 = new class2();
    s1.insertRecod(1, "trường");
    s2.insertRecod( 2 , "java");
    s1.displayInformation();
    s2.displayInformation();

    }
}
