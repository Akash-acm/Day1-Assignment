package assignments;

public class Fact {
int i,f=1,n;
public void factCalculate(int n)
{
for(i=1;i<=n;i++)
{
f=f*i;
}
System.out.println(f);
}



public static void main(String[] args) {
// TODO Auto-generated method stub

Fact c=new Fact();
c.factCalculate(5);



}
}