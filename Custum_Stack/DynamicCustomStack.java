package Custum_Stack;

public class DynamicCustomStack extends CustumSTack {

    public DynamicCustomStack() {
        super();
    }

    public DynamicCustomStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int item) {
        // TODO Auto-generated method stub

        if (this.isFull()) {
            int[] temp = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }
        return super.push(item);
    }
}
