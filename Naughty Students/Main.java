n=int(input())
h=[]
for i in range(n):
  h.append(str(input()))
h.sort()
g=set(h)
f=sorted(g)
j=[]
for i in f:
  print(i,(h.count(i)))
  