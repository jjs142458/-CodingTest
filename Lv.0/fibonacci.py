# no
import time
def fibonacci(n):
  if (n <= 1):
    return 1

  return fibonacci(n - 1) + fibonacci(n - 2)


print("""
start = time.time()
print(fibonacci(41))
end = time.time()

print(f"{end - start:.5f} sec")\n
""")

start = time.time()
print(fibonacci(41))
end = time.time()

print(f"{end - start:.5f} sec")