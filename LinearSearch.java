public class MyClass
// # insert sort in decreasing order
{
  public static void main(String args[])
  {
    int [] a = new int[] {31,41,59,26,41,58};
    int key = 26;

    for(int j=0;j<a.length;j++)
    {
      if(a[j]==key)
      {
       System.out.println(j);
       return;
      }
    }
  }
}