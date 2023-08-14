import java.util.Scanner;
public class complex {
    int real;
    int imaginary;
    public complex(){
        real=0;
        imaginary=0;
    }
    complex(int real,int imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    void setReal(int real){
        this.real=real;
    }
    void setImaginary(int imaginary){
        this.imaginary=imaginary;
    }
    int getReal(){
        return real;
    }
    int getImaginary(){
        return imaginary;
    }
    void multiply(complex c1,complex c2){
         int real1=c1.real*c2.real;
         int real2=c1.imaginary*c2.imaginary;
         int real=real1-real2;
         int imaginary1=c1.real*c2.imaginary;
         int imaginary2=c1.imaginary*c2.real;
         int imaginary=imaginary1+imaginary2;
         System.out.printf("The complex number after multiplication is :");
         System.out.println(real+"+"+imaginary+"i");
    }
    void display(){
        if (imaginary>0) {
            System.out.println(real+" + "+imaginary+"i");
        }
        else{
            System.out.println(real+" + "+imaginary+"i");
        }
    }
    public static void main(String[] args) {
        System.out.println("Please enter the value of n1,n2,n3 and n4: ");
        Scanner sc=new Scanner(System.in);
        // For first complex number:
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        // For second complex number:
        int n3=sc.nextInt();
        int n4=sc.nextInt();
        complex c1=new complex(n1,n2);
        complex c2=new complex(n3,n4);
        complex d=new complex();
        System.out.println("The first complexnumber is:");
        c1.display();
        System.out.println("The second complexnumber is:");
        c2.display();
        d.multiply(c1, c2);
        sc.close();
    }
}
