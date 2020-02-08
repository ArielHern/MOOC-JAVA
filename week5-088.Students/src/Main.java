
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner read = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();

        while (true) {
            System.out.print("name: ");
            String name = read.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("StudentNumber: ");
            String studentNum = read.nextLine();

            list.add(new Student(name, studentNum));
        }
        System.out.println("");
        for (Student student : list) {
            System.out.println(student);
        }
        System.out.println("");
        System.out.print("Give search term: ");
        String nameToFind = read.nextLine();
        
        System.out.println("Result:");
        for(Student student:list){
            if(student.getName().contains(nameToFind)){
                System.out.println(student);
            }
        }

    }
}
