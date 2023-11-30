package GenericPractice;

public class GenericMain {
    public static void main(String[] args)
    {
        Triples <String, String, Integer> firstTriples = new Triples("Apples","Oranges", 123);
        System.out.println(firstTriples);
        Triples <String, Integer, Integer> secondTriples = new Triples("Apples",456, 123);

        try
        {
            Triples.swapFirstAndSecond(firstTriples);
            Triples.swapFirstAndSecond(secondTriples);
        }catch (ClassCastException e)
        {
            System.out.println(e);
        }
    }
}
