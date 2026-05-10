abstract class Report {
    abstract void generateReport();
}

class PDFReport extends Report {
    void generateReport() {
        System.out.println("PDF Report Generated");
    }
}

class ExcelReport extends Report {
    void generateReport() {
        System.out.println("Excel Report Generated");
    }
}

class Main {
    public static void main(String[] args) {
        Report r1 = new PDFReport();
        r1.generateReport();

        Report r2 = new ExcelReport();
        r2.generateReport();
    }
}