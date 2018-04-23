package Chapter16.exercise20;

public class main
{
    public static void main(String[] args)
    {
        LinkedIntList list = new LinkedIntList();
        list.add(1);
        list.add(8);
        list.add(19);
        list.add(4);
        list.add(17);

        list.reverse();
        System.out.println(list);
    }
}
