class Abc
{
int a;
static int b;
void get(int p)
{
p=a;
b++;
}
void disp()
{
System.out.println("a="+a);
System.out.println("b="+b);
}
static void show()
{
System.out.println("a=+a");
System.out.println("b="+b);
}
public static void main(String k[])
{
Abc a1;
a1=new Abc();
Abc a2;
a2=new Abc();
Abc a3;
a3=new Abc();
a1.get(10);
a1.disp();
a2.get(20);
a1.disp();
a2.disp();
a3.get(30);
a1.disp();
a2.disp();
a3.disp();
show();
Abc.show();
}
}

