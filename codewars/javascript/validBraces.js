function validBraces(braces) {
  if (braces.length === 0) return true;

  let parenthesisStack = [];

  for (let i = 0; i < braces.length; i++) {
    if (
      (braces[i] === ")" || braces[i] === "]" || braces[i] === "}") &&
      parenthesisStack.length === 0
    ) {
      return false;
    } else if (
      (braces[i] === ")" &&
        parenthesisStack[parenthesisStack.length - 1] === "(") ||
      (braces[i] === "]" &&
        parenthesisStack[parenthesisStack.length - 1] === "[") ||
      (braces[i] === "}" &&
        parenthesisStack[parenthesisStack.length - 1] === "{")
    ) {
      parenthesisStack.pop();
    } else {
      parenthesisStack.push(braces[i]);
    }
  }
  return parenthesisStack.length === 0;
}
