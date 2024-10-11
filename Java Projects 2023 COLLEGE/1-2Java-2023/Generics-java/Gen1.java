public class Gen1<T, T2> {
    private T data1;
    private T2 data2;

    public void setValue(T dt1, T2 dt2) {
        data1 = dt1;
        data2 = dt2;
    }

    public T getT1Value() {
        return data1;
    }

    public T2 getT2Value() {
        return data2;
    }
}
