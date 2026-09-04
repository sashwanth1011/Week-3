class Student {
    // Instance fields
    String name;
    double attendance;

    // Static fields shared across all instances
    static String collegeName = "SRM Institute of Science and Technology";
    static int studentCount = 0;

    public Student(String name, double attendance) {
        this.name = name;
        this.attendance = attendance;
        studentCount++; // Increment static counter on each instantiation
    }

    // Static method accessing only static context
    public static void printCollegeInfo() {
        System.out.println(collegeName);
        System.out.println("Students created: " + studentCount);
    }

    public static void main(String[] args) {
        // Instantiate two Student objects
        Student s1 = new Student("Ravi", 85.5);
        Student s2 = new Student("Anitha", 92.0);

        // Call static method via Class Name directly
        Student.printCollegeInfo();
    }
}