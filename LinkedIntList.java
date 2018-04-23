package Chapter16.exercise20;

public class LinkedIntList
{
    /*
        Write a method called reverse that reverses the order of the elements in the list. (This is very challenging!) For
        example, if the variable list initially stores the values [1, 8, 19, 4, 17], the call of list.reverse();
        should change the list to store [17, 4, 19, 8, 1].
    */

    private ListNode front;

    //  Exercise 20 ////////////////////////////////////////////////////////
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
    ////////////////////////////////////////////////////////

    public LinkedIntList()
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
