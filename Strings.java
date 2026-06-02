public class Strings {
    public static void main(String[] args) {
  
        String name = "Raghavi";
        String course = "Java Programming";
        System.out.println("Hello " + name + ", Welcome to " + course + "!");
        
      // Escape Sequences
        System.out.println("New Line:\nThis is the next line.");
        System.out.println("Tab:\tJava");
        System.out.println("Double Quote: \"Java\"");
        System.out.println("Backslash: \\");
        System.out.println("Single Quote: \'A\'");

        // String Methods
        System.out.println("\nString Methods:");
        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("Character at index 2: " + name.charAt(2));
        System.out.println("Substring (0 to 4): " + name.substring(0, 4));
        System.out.println("Index of 'a': " + name.indexOf('a'));

        String text = "   Java Programming   ";
        System.out.println("Trimmed String: '" + text.trim() + "'");

        String replaced = course.replace("Java", "Advanced Java");
        System.out.println("Replace: " + replaced);

        String s1 = "Java";
        String s2 = "Java";
        String s3 = "Python";

        System.out.println("Equals: " + s1.equals(s2));
        System.out.println("Equals Ignore Case: " + s1.equalsIgnoreCase("java"));

        // Concatenation using concat()
        String result = s1.concat(" Language");
        System.out.println("Using concat(): " + result);
    }
}
