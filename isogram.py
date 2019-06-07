n=input().split()
for i in n:
  m=set(i)
  if len(n)==len(m):
    print("Yes")
  else:
    print("No")
