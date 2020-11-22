/** Created by James Buettner on Wednesday, November 18, 2020 for CSC 422. */

public interface ImmutableListInterface {
    public int get(int index);
    public ImmutableListInterface concat(ImmutableListInterface list);
    public int size();
    @Override
    public String toString();
}

