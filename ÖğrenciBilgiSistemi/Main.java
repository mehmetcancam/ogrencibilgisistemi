package ÖğrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca" , "TRH", "05546451172");
        Teacher t2  = new Teacher("Ayse Hoca","MAT","123124324");
        Teacher t3 = new Teacher("Oktay Hoca","FZK","12312");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Course mat = new Course("Matematik","102","MAT");
        mat.addTeacher(t2);

        Course fizik = new Course("Fizik","103","FZK");
        fizik.addTeacher(t3);



        Student s1 = new Student("Ali Samed","123","4",tarih,mat,fizik);
        s1.addBulkExamNote(20,232,50);
        s1.isPass();

    }
}
