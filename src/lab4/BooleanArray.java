package lab4;

public class BooleanArray implements FlagsSet {
    private final boolean[] values = new boolean[SIZE];

    @Override
    public boolean get(int index) {
        checkIndex(index);
        return values[index];
    }

    @Override
    public void set(int index) {
        checkIndex(index);
        values[index] = true;
    }

    @Override
    public void set(int index, boolean value) {
        checkIndex(index);
        values[index] = value;
    }

    @Override
    public void clear(int index) {
        checkIndex(index);
        values[index] = false;
    }

    @Override
    public void flip(int index) {
        checkIndex(index);
        values[index] = !values[index];
    }

    private void checkIndex(int index) {
        if(index < 0 || index >= SIZE)
            throw new IllegalArgumentException("Значение индекса выходит за пределы 'SIZE'");
    }

    @Override
    public int count() {
        int res = 0;
        for (boolean value : values) {
            if (value)
                res++;
        }
        return res;
    }

    @Override
    public String toString() {
        char[] ac = new char[SIZE];
        for (int i = 0; i < values.length; i++) {
            boolean value = values[i];
            ac[i] = value ? '1' : '0';
        }
        return new String(ac);
    }
}
