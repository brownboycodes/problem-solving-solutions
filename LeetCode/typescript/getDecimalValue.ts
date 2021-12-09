function getDecimalValue(head: ListNode | null): number {
  let bin = "";
  while (head !== null) {
    bin = bin + head.val.toString();
    head = head.next;
  }
  return parseInt(bin, 2);
}
