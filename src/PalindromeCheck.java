import java.util.*;
public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println("Nhập vào một chuỗi để check :");
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        s=s.toUpperCase();
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        char[] arr = s.toCharArray();
        for(int i =0;i<arr.length;i++)
        {
            stack.push(arr[i]);
            queue.add(arr[i]);
        }
        int count=-1;
        for(int i =0;i<arr.length;i++)
        {
            if(stack.pop()==queue.remove())
            {
                count++;
            }
        }
        if(count==arr.length-1)
            System.out.println("Chuỗi là chuỗi palindrome");
        else
            System.out.println("Chuỗi không phải là palindrome");
    }
}