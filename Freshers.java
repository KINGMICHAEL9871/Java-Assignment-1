public class Freshers extends underGraduate{
    public static void main(String[] args) {
        Freshers fresher = new Freshers();
        postGraduate post = new postGraduate();
        underGraduate under = new underGraduate();

        System.out.println(post instanceof Students );
        System.out.println(under instanceof Students);
        System.out.println(fresher instanceof Students);
    }
}