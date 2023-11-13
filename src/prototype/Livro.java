package prototype;

public class Livro extends Produto {
    private int pageCount;

    public Livro(String name, int pageCount) {
        super(name);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
