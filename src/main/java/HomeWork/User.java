import java.util.Scanner;

public class CountingProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user's name
        System.out.print("Enter your name: ");
        String name = Work with scanner, find out the username.nextLine();

        // Greet the user
        System.out.println("Hi " + name + ", how high do you want to count?");

        // Get the count limit from the user
        System.out.print("Enter the count limit: ");
        int countLimit = scanner.nextInt();

        // Output numbers from 1 up to the count limit
        for (int i = 1; i <= countLimit; i++) {
            System.out.println(i);
        }

        // Close the scanner
        scanner.close();
    }
}

/*
 * boolean: хранит значение true или false

1
2
boolean isActive = false;
boolean isAlive = true;
byte: хранит целое число от -128 до 127 и занимает 1 байт

1
2
byte a = 3;
byte b = 8;
short: хранит целое число от -32768 до 32767 и занимает 2 байта

1
2
short a = 3;
short b = 8;
int: хранит целое число от -2147483648 до 2147483647 и занимает 4 байта

1
2
int a = 4;
int b = 9;
long: хранит целое число от –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807 и занимает 8 байт

1
2
long a = 5;
long b = 10;
double: хранит число с плавающей точкой от ±4.9*10-324 до ±1.7976931348623157*10308 и занимает 8 байт

1
2
double x = 8.5;
double y = 2.7;
В качестве разделителя целой и дробной части в дробных литералах используется точка.

float: хранит число с плавающей точкой от -3.4*1038 до 3.4*1038 и занимает 4 байта

1
2
float x = 8.5F;
float y = 2.7F;
char: хранит одиночный символ в кодировке UTF-16 и занимает 2 байта, поэтому диапазон хранимых значений от 0 до 65535
 */