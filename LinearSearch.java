public class LinearSearch{
public static void main(String[]args)
{
int[] numbers={10,20,l3,23,56};
int target=23;
boolean found=false;
for(int i=0;i<numbers.length;i++)
{
if(numbers[i]==target)
{
System.out.pritln("element"+target+"found at index"+i);
found=true;
break;
}
}
if(!found){
System.out.println("element"+target+"not found in the array");
}
}
}