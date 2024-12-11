class Company01 {
    String name="manu";
    String location="Bengalore";
    String state="Karnataka";
}

class Companydetails {
    String name="wipro";
    String location="bengalore";
}

class Book {
    String name="kannada";
    String author="villiam";
    int price=123;
}

class student{
    String name="nayak";
    String location="tumkur";
    int rollno=25;
}

class Company02{
    public static void main(String[] args) {
        Company01 c1 = new Company01();
        Companydetails c2 = new Companydetails();
        Book b1 = new Book();
        student s1 = new student();
        System.out.println("this is about company");
        System.out.println(c1.name);
        System.out.println(c1.location);
        System.out.println(c1.state);
        System.out.println("this is about companyDetails");
        System.out.println(c2.name);
        System.out.println(c2.location);
        System.out.println("this is about Book Details");
        System.out.println(b1.name);
        System.out.println(b1.author);
        System.out.println(b1.price);
        System.out.println("this is about Student details");
        System.out.println("student name=" + s1.name);
        System.out.println("student location =" + s1.location);
        System.out.println("student rollno=" + s1.rollno);

    }
}
