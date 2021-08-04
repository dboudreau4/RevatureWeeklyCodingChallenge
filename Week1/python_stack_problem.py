def fizz_buzz(number: int)->str:
    if number % 15 == 0:
        return "FizzBuzz"
    elif number % 3 == 0:
        return "Fizz"
    elif number % 5 == 0:
        return "Buzz"
    else:
        return str(number)

print(f"Multiple of 3: {fizz_buzz(3)}")
print(f"Mutiple of 5: {fizz_buzz(5)}")
print(f"Multiple of 15: {fizz_buzz(15)}")
print(f"Mutiple of neither: {fizz_buzz(4)}")