package Chapter16.exercise20;

/*
Write a method called shift that rearranges the elements of a list of integers by moving to the end of the list all values
that are in odd-numbered positions and otherwise preserving list order. For example, suppose that a variable list
stores the values [10, 31, 42, 23, 44, 75, 86]. The call of list.shift(); should rearrange the list to store
[10, 42, 44, 86, 31, 23, 75]. It doesn’t matter whether the value itself is odd or even; what matters is
whether the value appears in an odd index (index 1, 3, 5, etc.). Also notice that the original order of the list is otherwise
preserved. You may not construct any new nodes nor use any auxiliary data structures to solve this problem. You
also may not change any data fields of the nodes; you must solve this problem by rearranging the links of the list.
 */
public class Exercise20 {
    private ListNode front;

    public void reverse()
    {
        ListNode current = this.front;
        ListNode prev = null;
        ListNode next;

        while (current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        this.front = prev;
    }

    public Exercise20()
    {
        this.front = null;
    }

    public void add(int value)
    {
        if(this.front == null)
            this.front = new ListNode(value);
        else
        {
            ListNode current = this.front;

            while (current.next != null)
            {
                current = current.next;
            }

            current.next = new ListNode(value);
        }
    }

    @Override
    public String toString()
    {
        if (this.front == null)
        {
            return "[]";
        }
        else
        {
            String result = "[" + front.getData();
            ListNode current = this.front.next;

            while (current != null)
            {
                result += ", " + current.getData();
                current = current.next;
            }
            result += "]";
            return result;
        }
    }
}
