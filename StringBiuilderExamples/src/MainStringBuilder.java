public class MainStringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("String One ");
        System.out.println(stringBuilder);

        stringBuilder.append("String two");
        System.out.println(stringBuilder);
        System.out.println("The string length: " + stringBuilder.length());
        System.out.println("The string capacity: " + stringBuilder.capacity());

        stringBuilder.delete(0, 11);
        System.out.println(stringBuilder);

    }
}
