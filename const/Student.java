class Student {
    String name;
    int age;
    String gender;

    public Student() {
        name = "not specified";
        age = 0;
        gender = "not specified";
    }

    public Student(String n) {
        name = n;
        age = 0;
        gender = "not specified";
    }
    public Student(String n, int a) {
        name = n;
        age = a;
        gender = "not specified";
    }
    public Student(String n, int a, String g) {
        name = n;
        age = a;
        gender = g;
    }
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender);
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Nayak");
        Student s3 = new Student("manu", 25);
        Student s4 = new Student("chikkanna", 25, "Male");
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
        s4.displayInfo();
    }
}
