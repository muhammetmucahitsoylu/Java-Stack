public class StackXApp {
    public static void main(String[] args) {


        StackX stack = new StackX(5);

        stack.push('U');
        stack.push('C');
        stack.push('S');
        stack.push('r');
        stack.push('p');
        stack.push('l');
        stack.push('ğ');

        while (!stack.isEmpty()) {
            System.out.println(stack.pop() + "");
        }

        stack.clear();
        System.out.println("Stack: "+ stack.isEmpty());

        stack.push('U');
        stack.push('C');
        stack.push('S');

        System.out.println("Stack peek:"+stack.peek());

        while (!stack.isEmpty()) {
            System.out.println(stack.pop() + "");
        }




    }
}
