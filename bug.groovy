```groovy
def calculate(a, b) {
  if (a == null || b == null) {
    return 0 // Handle null values
  }
  return a + b
}

println calculate(5, 3) // Output: 8
println calculate(null, 3) // Output: 0
```