public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "Hello";
        
        // Using equals() method for content comparison
        boolean areEqual = str1.equals(str2);
        boolean areEqual2 = str1.equals(str3);

        System.out.println("str1 equals str2: " + areEqual);
        System.out.println("str1 equals str3: " + areEqual2);
        
        // Using == for reference comparison
        boolean areSameReference = str1 == str3;
        
        System.out.println("str1 and str3 are the same reference: " + areSameReference);
    }
}
