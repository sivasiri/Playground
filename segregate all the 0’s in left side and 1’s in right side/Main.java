n=int(input())
m=list(map(int,input().split()))
z=[]
o=[]
for i in range(n):
  if m[i]==0:
    z.append(m[i])
  elif m[i]==1:
    o.append(m[i])
s=z+o
for j in range(len(s)):
	print(s[j],end='')
  