def narcissistic(value):
    # Code away
    value = str(value)
    digits = len(value)
    sum = 0
    for v in value:
        sum += pow(int(v), digits)
    return sum == int(value)
