public interface ShippingVisitor {
    double visitChair(Chair chair);
    double visitTable(Table table);
    double visitSofa(Sofa sofa);
}