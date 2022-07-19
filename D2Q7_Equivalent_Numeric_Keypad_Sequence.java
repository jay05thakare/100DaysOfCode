class D2Q7_Equivalent_Numeric_Keypad_Sequence{

  public static String keypadSequence(String str) {
    String sequence = "";

    String keypad[] = { "2", "22", "222",
                        "3", "33", "333",
                        "4", "44", "444",
                        "5", "55", "555",
                        "6", "66", "666",
                        "7", "77", "777", "7777",
                        "8", "88", "888",
                        "9", "99", "999","9999"};

    for(int i = 0; i<str.length(); i++){
      if(str.charAt(i) == ' '){
        sequence += "0";
      }else{
        sequence += keypad[str.charAt(i) - 'a'];
      }
    }

    return sequence;
  }
  public static void main(String[] args) {
    String str = "jay thakare";

    System.out.println(keypadSequence(str));
  }
}