public class ProcessedDocument {
    public static void main(String[] args) {
        // Create registry
        DocumentRegistry registry = new DocumentRegistry();
        
        // Create prototypes (constructor messages print here)
        PdfDocument pdfPrototype = new PdfDocument("template.pdf", "Unknown", 0);
        TextDocument textPrototype = new TextDocument("template.txt", "UTF-8", 0);
        SpreadsheetDocument spreadsheetPrototype = new SpreadsheetDocument("template.xlsx", 0, 0);
        
        System.out.println();
        
        // Register prototypes
        registry.registerPrototype("PDF", pdfPrototype);
        registry.registerPrototype("Text", textPrototype);
        registry.registerPrototype("Spreadsheet", spreadsheetPrototype);
        
        // Create documents by cloning and customizing
        PdfDocument pdfDoc1 = new PdfDocument("annual_report_2024.pdf", "Acme Corp", 150);
        pdfDoc1.open();
        
        TextDocument textDoc = new TextDocument("meeting_notes.txt", "UTF-8", 250);
        textDoc.open();
        
        SpreadsheetDocument sheetDoc = new SpreadsheetDocument("sales_data_q1.xlsx", 1000, 20);
        sheetDoc.open();
        
        PdfDocument pdfDoc2 = new PdfDocument("summary_report.pdf", "Acme Corp", 30);
        pdfDoc2.open();
    }
}