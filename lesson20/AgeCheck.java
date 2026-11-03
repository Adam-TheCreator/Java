// Written by Claude

class AgeException extends Exception {
    AgeException(String message) {
        super(message);
    }
}

int checkAge(int age) throws AgeException {
    if (age < 0 || age > 120) {
        throw new AgeException("Age must be between 0 and 120.");
    }
    return age;
}

void main() {
    while (true) {
        String answer = IO.readln("How old are you? ");

        try {
            int age = checkAge(Integer.parseInt(answer.trim()));
            IO.println("Got it, you are " + age + ".");
            break;
        } catch (NumberFormatException e) {
            IO.println("That is not a whole number.");
        } catch (AgeException e) {
            IO.println(e.getMessage());
        }
    }
}
