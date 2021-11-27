num sum(List<num> arr) {
  if (arr.isEmpty) return 0;
  return arr.fold(0, (previous, current) => previous + current);
}
