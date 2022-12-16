import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<T> implements List {


    private int sizeArray = 3;
    private int listSize = 0;

    private Object[] myArrayList = new Object[sizeArray];


    private Object[] arrcopy(Object[] arrFrom, Object[] arrTo) {
        for (int i = 0; i < arrFrom.length - 1; i++) {
            arrTo[i] = arrFrom[i];
        }
        return arrTo;
    }


    @Override
    public boolean add(Object ell) {
        if (listSize == sizeArray - 1) {
            try {
                sizeArray = 2 * sizeArray;
            } catch (OutOfMemoryError e) {
                System.out.println("Error");
            }

            Object[] temporaryArray = new Object[sizeArray];
            temporaryArray = arrcopy(myArrayList, temporaryArray);
            myArrayList = temporaryArray;

        }
        myArrayList[listSize] = ell;
        listSize++;
        System.out.println(sizeArray);
        return true;
    }

    @Override
    public int indexOf(Object obj) {

        for (int i = 0; i < myArrayList.length - 1; i++) {
            if (myArrayList[i].equals(obj)) {
                return i;
            }
        }
        return -1;

    }


    public int size() {
        return listSize;
    }

    @Override
    public Object remove(int index) {

        for (int i = index; i < listSize; i++) {
            myArrayList[i] = myArrayList[i + 1];
        }
        myArrayList[listSize] = null;
        listSize--;

        if (sizeArray / listSize > 2) {
            sizeArray = sizeArray / 2 - sizeArray % 2;
            Object[] temporaryArray = new Object[sizeArray];
            for (int i = 0; i < sizeArray; i++) {
                temporaryArray[i] = myArrayList[i];
            }
            myArrayList = temporaryArray;

        }
        System.out.println(myArrayList.length);
        return myArrayList;
    }


    @Override
    public boolean isEmpty() {
        return (listSize == 0);
    }

    @Override
    public void clear() {
        for (int i = 0; i < listSize; i++) {
            myArrayList[i] = null;
        }
        listSize = 0;

    }


    @Override
    public Object get(int index) {
        return (T) myArrayList[index];
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < listSize; i++) {
            if (myArrayList[i].equals(o)) {
                return true;
            }

        }
        return false;
    }

    @Override
    public int lastIndexOf(Object o) {
        int lastIndex = -1;
        for (int i = 0; i < listSize; i++) {
            if (myArrayList[i].equals(o)) {
                lastIndex = i;
            }

        }
        return lastIndex;
    }


    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }


    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }


    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }


    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }


}
