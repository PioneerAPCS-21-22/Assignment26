public class StringExplorer
{
    public static void main(String[] args)
    {
        String sample = "The quick brown fox jumped over the lazy dog.";
        String part = sample.substring(3, 20);

        //  Demonstrate the trim method.
        String trimmed = part.trim();
        System.out.println ("part: " + "\"" + part + "\"");
        System.out.println ("part.trim() = " + "\"" + trimmed + "\"");
        System.out.println ("After trim(), part = " + "\"" + part +  "\"");

        //  Demonstrate the toLowerCase method.
        String lowerCase = sample.toLowerCase();
        System.out.println ("sample = " + "\"" + sample + "\"");
        System.out.println ("sample.toLowerCase() = " + "\"" + lowerCase + "\"");
        System.out.println ("After toLowerCase(), sample = " + "\"" + sample + "\"");

        // Demonstrate the indexOf method
        int index = part.indexOf("o");
        System.out.println ("part.indexOf(\"o\"): " + index);

        // Read the description of indexOf(String str, int fromIndex). 
        // Add lines below that illustrate how this version of indexOf 
        // differs from the one with one parameter.
        int secIndex = part.indexOf("o", index + 1);
        System.out.println ("part.indexOf(\"o\", 10): " + secIndex);



    }
}
