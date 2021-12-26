def kClosest(points, k):
    points.sort(key=lambda k: k[0]**2 + k[1]**2)
    return points[:k]
