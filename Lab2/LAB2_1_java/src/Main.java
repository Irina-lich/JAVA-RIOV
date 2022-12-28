public class Main {
    public static void main(String[] args) {
        Student student = new Student("Sergey", "Musienko", "but1901", 4.8);
        Aspirant aspirant = new Aspirant("Ilya", "Sidorov", "but1901", 4, "cars");
        Student un = new Aspirant("Andrey", "Kuznetcov", "but2001", 5, "airplane");
        Student[] students = { student, aspirant, un };

        for (Student s : students)
            System.out.println(s.getScholarship());
    }
}