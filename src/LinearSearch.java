import java.util.Scanner;
class LinearSearch
{
    public static void main(String args[])
    {
        int i, num, item ;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        num = sc.nextInt();
       int array[] = new int[num];
        System.out.println("Enter " + num + " integers");

        for (i = 0; i < num; i++)
            array[i] = sc.nextInt();

        System.out.println("Enter the search value:");
        item = sc.nextInt();

        for (i = 0; i < num; i++)
        {
            if (array[i] == item)
            {
                System.out.println(item+" is present at location "+(i+1));

                break;
            }
        }
        if (i == num)
            System.out.println(item + " doesn't exist in array.");
    }
}