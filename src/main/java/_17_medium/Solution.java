package _17_medium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Solution {
  public List<String> letterCombinations(String digits) {
    String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    if(digits.isEmpty()){
      return List.of();
    }

    List<StringBuilder> list = new ArrayList<>();
    list.add(new StringBuilder());

    for(int i =0; i < digits.length(); i++){
      char c = digits.charAt(i);
      String letters = mapping[c - '0'];
      int length = letters.length();

      List<StringBuilder> newList = new ArrayList<>(list.size() * length);
      for (StringBuilder sb : list) {
        for (int j = 0; j < length; j++) {
          var newSb = new StringBuilder(sb);
          newSb.append(letters.charAt(j));
          newList.add(newSb);
        }
      }

      list = newList;
    }


    List<String> result = new ArrayList<>(list.size());
    for(StringBuilder sb : list){
      result.add(sb.toString());
    }

    return result;
  }
}