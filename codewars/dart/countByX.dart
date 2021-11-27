List<int> countBy(int x, int n) {
  return List<int>.generate(n, (i) => (i + 1) * x);
}
