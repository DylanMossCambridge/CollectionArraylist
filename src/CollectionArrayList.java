import java.util.AbstractList;

public class CollectionArrayList<T> extends AbstractList<T> {

    public static void main(String[] args) {
        CollectionArrayList<Integer> arr = new CollectionArrayList<>();
        arr.put(5,10);
        arr.put(10,3);
        arr.put(3,5);
        arr.put(1,16);

        System.out.printf("Third item: %d\n", arr.get(3));
        System.out.printf("Sixteenth item: %d\n", arr.get(16));

        System.out.printf("Size of array: %d\n", arr.size());

        System.out.println("\nPrint array: ");
        arr.print();
    }


    //*--------------------*/

    Object[] array = new Object[1];

    public void put(T item, int index){
        while(index > array.length - 1) {
            increaseArraySize();
        }
        array[index] = item;
    }

    public void increaseArraySize(){
        Object[] newArray = new Object[array.length * 2];

        for(int i=0; i<array.length; i++){
            newArray[i] = array[i];
        }

        array = newArray;
    }

    @Override
    public T get(int index) {
        if(index < array.length){
            return (T) array[index];
        } else {
            return null;
        }
    }

    @Override
    public int size() {
        return array.length;
    }

    public void print(){
        for(Object element : array){
            System.out.println(element);
        }
    }
}
