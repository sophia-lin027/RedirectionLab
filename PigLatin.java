public class PigLatin {
  public static void main(String[] args) {
    // System.out.println(pigLatinSimple("mock"));
    // System.out.println(pigLatinSimple("pie"));
    // System.out.println(pigLatinSimple("david"));
    // System.out.println(pigLatinSimple("aaron"));

    System.out.println(pigLatin("the"));
    System.out.println(pigLatin("check"));
    System.out.println(pigLatin("skee"));
    System.out.println(pigLatin("emu"));
    System.out.println(pigLatin("grade"));
    System.out.println(pigLatin("a"));
  }

  public static String pigLatinSimple(String s) {
    String l = s.toLowerCase();
    String[] vowels = new String[] {"a", "e", "i", "o", "u"};
    for (int i = 0; i < vowels.length; i++) {
      if (l.substring(0, 1).equals(vowels[i])) {
        return l + "hay";
      }
    }
    return l.substring(1, l.length()) + l.substring(0, 1) + "ay";
  }

  public static String pigLatin(String s) {
    String l = s.toLowerCase();
    String[] vowels = new String[] {"a", "e", "i", "o", "u"};
    String[] digraphs = new String[]  {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};

    String sec = "";
    if (l.length() > 1) {
      sec = l.substring(0, 2);
    }
    else {
      sec = l;
    }

    for (int i = 0; i < digraphs.length; i++) {
      if (sec.equals(digraphs[i])) {
        return l.substring(2, l.length()) + sec + "ay";
      }
    }
    return pigLatinSimple(l);
  }
}
