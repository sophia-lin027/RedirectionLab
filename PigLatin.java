public class PigLatin {
  public static void main(String[] args) {
    System.out.println(pigLatinSimple("mock"));
    System.out.println(pigLatinSimple("pie"));
    System.out.println(pigLatinSimple("david"));
    System.out.println(pigLatinSimple("aaron"));
  }

  public static String pigLatinSimple(String s) {
    String l = s.toLowerCase();
    String[] vowels = new String[] {"a", "e", "i", "o", "u"};
    for (int i = 0; i < vowels.length; i++) {
      if (l.substring(0, 1).equals(vowels[i])) {
        return l + "ay";
      }
    }
    return l.substring(1, l.length()) + l.substring(0, 1) + "ay";
  }
}
