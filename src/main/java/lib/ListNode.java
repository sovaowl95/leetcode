package lib;

public class ListNode {
  public int val;
  public ListNode next;

  public ListNode() {
  }

  public ListNode(int val) {
    this.val = val;
  }

  public ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  public String toFlat() {
    final StringBuilder stringBuilder = new StringBuilder();

    var temp = this;
    while (temp != null) {
      if (stringBuilder.length() != 0) {
        stringBuilder.append("_");
      }
      stringBuilder.append(temp.val);
      temp = temp.next;
    }

    return stringBuilder.toString();
  }
}
