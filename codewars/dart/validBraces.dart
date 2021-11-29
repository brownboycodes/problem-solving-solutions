bool validBraces(String braces) {
  if (braces.isEmpty) return true;

  List<String> parenthesisStack = [];

  for (int i = 0; i < braces.length; i++) {
    if ((braces[i] == ')' || braces[i] == ']' || braces[i] == '}') &&
        parenthesisStack.isEmpty) {
      return false;
    } else if ((braces[i] == ')' && parenthesisStack.last == '(') ||
        (braces[i] == ']' && parenthesisStack.last == '[') ||
        (braces[i] == '}' && parenthesisStack.last == '{')) {
      parenthesisStack.removeLast();
    } else {
      parenthesisStack.add(braces[i]);
    }
  }
  return parenthesisStack.isEmpty;
}
