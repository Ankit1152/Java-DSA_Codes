import java.util.*;

public class StackQuestions {
     // Q Push at the bottom of the stack     O(n)
     public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){           // Stack agr empty hai toh apne data ko directly push kr dena hai 
            s.push(data);
            return;
        }
        int top = s.pop();         // Nahi toh Uper jate jate top ko store kraii
        pushAtBottom(s, data);     // phir Next level k liye call
        s.push(top);               // phir wapas aate hue push krde wapas se apne top ko apne stack k ander
    }



    // Q Reverse a string using Stack
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int i = 0;

        while(i<str.length()){
            s.push(str.charAt(i));
            i++;
        }

        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char ch = s.pop();
            result.append(ch);
        }

        return result.toString();
    }


    
    // Q Reverse a Stack 
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){        // empty stack is already reversed
            return;
        }
        int top = s.pop();     // Uper jate jate hum top ko nikalte jaenge
        reverseStack(s);       // Phir next level k liye call krenege
        pushAtBottom(s, top);  // Neeche aate aate apne stack me push krtey rhenge apne top ko
                               // but is bar push at bottom krenge 
    }

    public static void printStack(Stack <Integer> s){
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        // pushAtBottom(s, 4);
        // while (!s.isEmpty()) {
        //     System.out.println(s.pop());
        // }

        // String str = "HelloWorld";
        // System.out.println(reverseString(str));

        reverseStack(s);
        printStack(s);

    }
}
