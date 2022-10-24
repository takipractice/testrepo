public class GitHubRepoTesting {

    public static void main(String[] args) {
        int a = 4;
        int b = 8;
        System.out.println("a = " + a + " b = " + b);

        int c = a;
        a = b;
        b = c;
        System.out.println("a = " + a + " b = " + b);

    }
}
