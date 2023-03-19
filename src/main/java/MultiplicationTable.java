
/**The printf() method in Java is used to format the output of a string or numerical value. It allows you to
// control the appearance of the output by specifying the format of the data you want to print, including the width
// of the field, the precision, the alignment, and other properties.
//
//One advantage of using printf() over println() or print() methods is that it provides more control over the
// formatting of the output. You can use format specifiers, such as %d for integers, %f for floating-point numbers,
// %s for strings, %t for date and time values, and others, to specify how the data should be printed. You can
// also use flags, such as - for left justification, + for showing the sign, 0 for padding with zeros, and others,
// to further customize the output.
//
//Another advantage of using printf() is that it can help to make your code more readable and maintainable, especially
// if you need to print complex output with multiple values and formatting options. By using format specifiers and
// flags, you can separate the data from the formatting, which can make it easier to modify the output later on.
//
//In summary, the printf() method provides a flexible and powerful way to format the output of your Java program,
// and is often used in situations where precise control over the appearance of the output is required
*/
public class MultiplicationTable {
    public static void main(String[] args) {
        // set the size of the table
        int size = 10;

        // print the header row
        System.out.print("  ");
        for (int i = 1; i <= size; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        // print the table
        for (int i = 1; i <= size; i++) {
            System.out.printf("%2d", i);
            for (int j = 1; j <= size; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}


