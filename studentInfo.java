public class studentInfo {
    
public static void main (String[] args){
    
    javaLearning S1 = new javaLearning();
    javaLearning S2 = new javaLearning()
    ;javaLearning S3 = new javaLearning();
    S1.name = "Saied";
    S1.Class = "Nine";
    S1.birthday = 27;
    S1.result = 4.5;
    S2.name = "Karim";
    S2.Class = "Eight";
    S2.birthday = 17;
    S2.result = 4.5;
    S1.showInfo();
    S2.showInfo();
    S1.showSub();
    S2.showSub();
    javaLearning.myStaticMethod();

    Student stinf = new Student();
    System.out.println("Name : " + stinf.fname);
    System.out.println("Age : " + stinf.age);
    System.out.println("Graduation Year : " + stinf.graduationYear);
    stinf.study();
}

}

