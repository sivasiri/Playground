n=int(input())
m=list(map(int,input().split()))
p=int(input())
if p<n:
	print(m[p-1])
else:
  print('No node found')