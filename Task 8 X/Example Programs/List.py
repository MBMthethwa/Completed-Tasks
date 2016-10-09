demolist = ["life", 42, "the universe", 6, "and", 9]
print "demolist = ",demolist
demolist.append("everything")
print "after 'everything' was appended demolist is now:"
print demolist
print "len(demolist) =", len(demolist)
print "demolist.index(42) =", demolist.index(42)
print "demolist[1] =", demolist[1]

c = 0
while c < len(demolist):
    print "demolist[", c, "] =", demolist[c]
    c = c + 1

del demolist[2]
print "After 'the universe' was removed demolist is now:"
print demolist
if "life" in demolist:
    print "'life' was found in demolist"
else:
    print "'life' was not found in demolist"

if "amoeba" in demolist:
    print "'amoeba' was found in demolist"

if "amoeba" not in demolist:
    print "'amoeba' was not found in demolist"

demolist.sort()
print "The sorted demolist is", demolist