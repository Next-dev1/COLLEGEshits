public class Gen<T> {
    private T data;

    public void setValue(T dt) {
        data = dt;
    }

    public T getValue() {
        return data;
    }

    public void showType() {
        System.out.println("Type of T is " + data.getClass().getName());
    }
}
