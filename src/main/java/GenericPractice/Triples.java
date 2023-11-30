package GenericPractice;

public class Triples <T1, T2, T3> implements Comparable<Triples<T1, T2, T3>> {
    private T1 first;
    private T2 second;
    private T3 third;

    public Triples(T1 p_first, T2 p_second, T3 p_third)
    {
        this.first = p_first;
        this.second = p_second;
        this.third = p_third;
    }

    public T1 getFirst()
    {
        return this.first;
    }
    public T2 getSecond()
    {
        return this.second;
    }
    public T3 getThird()
    {
        return this.third;
    }

    public String toString()
    {
        return this.first.getClass().getName() + " : " + this.first.toString() + " , " +
                this.second.getClass().getName() + " : " + this.second.toString() + " , " +
                this.third.getClass().getName() + " : " + this.third.toString() + " , ";
    }

    public static <T1, T2, T3> Triples<T2, T1, T3>  swapFirstAndSecond(Triples<T1, T2, T3> triple) throws ClassCastException
    {
        T1 l_first = triple.getFirst();
        T2 l_second = triple.getSecond();

        if(l_first.getClass() == l_second.getClass())
            return new Triples<>(l_second, l_first, triple.getThird());
        else {
            throw new ClassCastException("Class does not match");
        }
    }

    @Override
    public int compareTo(Triples<T1, T2, T3> o) {
        return 0;
    }
}