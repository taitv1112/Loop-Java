public class showDraw {
    public static void main(String[] args) {
        rectangular();
        System.out.println("");

        triangleBot();

        System.out.println("");

        triangleTop();
    }

    public static void rectangular() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void triangleBot() {
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void triangleTop() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
