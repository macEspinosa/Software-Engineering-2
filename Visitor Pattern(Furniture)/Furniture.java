public interface Furniture {
    double accept(ShippingVisitor visitor);
    String getDescription();
}