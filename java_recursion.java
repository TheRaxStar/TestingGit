import java.util.*;
public class java_recursion
{

static int fibo(int a)
{
if(a<2){return a;}
return a*fibo(a-1);
}

public static void main(String as[])
{
int t=5;
System.out.println(fibo(t));
}
}
