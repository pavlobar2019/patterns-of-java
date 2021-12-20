package interpreter;

public class OrReview implements Review{

    private Review rev1 = null;
    private Review rev2 = null;

    public OrReview(Review rev1, Review rev2) {
        this.rev1 = rev1;
        this.rev2 = rev2;
    }

    @Override
    public boolean explain(String context) {
        return rev1.explain(context) || rev2.explain(context);
    }
}


