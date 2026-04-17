public class SpreadsheetDocument implements Document {
    private String type;
    private String name;
    private int rows;
    private int columns;

    public SpreadsheetDocument(String name, int rows, int columns) {
        this.type = "Spreadsheet";
        this.name = name;
        this.rows = rows;
        this.columns = columns;
        System.out.println("Creating a Spreadsheet Document prototype.");
    }

    @Override
    public SpreadsheetDocument clone() {
        return new SpreadsheetDocument(this.name, this.rows, this.columns);
    }

    public void open() {
        System.out.println("Opening Spreadsheet Document: " + name + " (" + rows + " rows, " + columns + " columns)");
        System.out.println("Type: " + type + ", Name: " + name + ", Rows: " + rows + ", Columns: " + columns);
        System.out.println();
    }
}