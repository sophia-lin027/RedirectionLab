public class PigLatin {
  public static void main(String[] args) {
    // System.out.println(pigLatinSimple("mock"));
    // System.out.println(pigLatinSimple("pie"));
    // System.out.println(pigLatinSimple("david"));
    // System.out.println(pigLatinSimple("aaron"));

    // System.out.println(pigLatin("the"));
    // System.out.println(pigLatin("check"));
    // System.out.println(pigLatin("skee"));
    // System.out.println(pigLatin("emu"));
    // System.out.println(pigLatin("grade"));
    // System.out.println(pigLatin("a"));

    System.out.println(pigLatinBest("*emu"));
    System.out.println(pigLatinBest("4chan"));
    System.out.println(pigLatinBest("fish"));
    System.out.println(pigLatinBest("fish!"));
    System.out.println(pigLatinBest("the."));
    System.out.println(pigLatinBest("cat!"));
    System.out.println(pigLatinBest("amazing?"));
    System.out.println(pigLatinBest("apple%"));
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
    String[] digraphs = new String[] {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};

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

  public static String pigLatinBest(String s) {
    String l = s.toLowerCase();
    String[] letters = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    String[] numbers = new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    int count = 0;

    boolean isLetter = false;
    boolean isNumber = false;

    for (int i = 0; i < letters.length; i++) {
      if (l.substring(0, 1).equals(letters[i])) {
        count++;
      }
    }

    if (count == 0) {
      return l;
    }

    for (int i = 0; i < numbers.length; i++) {
      if (l.substring(l.length() - 1).equals(numbers[i])) {
        isNumber = true;
      }
    }

    for (int i = 0; i < letters.length; i++) {
      if (l.substring(l.length() - 1).equals(letters[i])) {
        isLetter = true;
      }
    }

    if ((isNumber == true) || (isLetter == true)) {
      return pigLatin(l);
    }

    return pigLatin(l.substring(0, l.length() - 1)) + (l.substring(l.length() - 1));
  }
}
