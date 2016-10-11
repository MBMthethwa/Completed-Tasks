
public class Student {

    String name;
    int age;
    char gender;
    int[] grades;

    public Student(String name, int age, char gender, int[] grades) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.grades = grades;
    }

    public void compute_average() {
        double sum = 0;
        for (int element : grades) {
            sum += element;
        }
        System.out.println("Average for student " + name + " is " + (sum / grades.length));
    }

    public static void main(String[] args) {
        Student philani = new Student("Philani Sithole", 20, 'M', new int[]{64, 65});
        Student sarah = new Student("Sarah Jones", 19, 'F', new int[]{82, 58});
		
		philani.compute_average();
        sarah.compute_average();
    }

}
