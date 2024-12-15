public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());

        for (int i = 1040; i <= 1103; i++) {
            System.out.println((char) i + " - " + i);

            if ((char) i == 'Е') {
                System.out.println((char) 1025 + " - " + 1025);
            } else if ((char) i == 'е') {
                System.out.println((char) 1105 + " - " + 1105);
            }
        }
    }
}
